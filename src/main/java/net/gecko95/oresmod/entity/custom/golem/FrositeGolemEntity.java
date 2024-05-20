package net.gecko95.oresmod.entity.custom.golem;

import net.gecko95.oresmod.effect.ModEffects;
import net.gecko95.oresmod.entity.behavior.golems.FrositeGolemAttackGoal;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class FrositeGolemEntity extends HostileEntity {
    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(FrositeGolemEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    public final AnimationState idleAnimtionState = new AnimationState();
    private int idleAnimtionTimeout = 0;
    public final AnimationState attackAnimtionState = new AnimationState();
    public int attackAnimtionTimeout = 0;
    public FrositeGolemEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    private void setupAnimationStates(){
        if (this.idleAnimtionTimeout <= 0) {
            this.idleAnimtionTimeout = this.random.nextInt(40) + 80;
            this.idleAnimtionState.start(this.age);
        } else {
            --this.idleAnimtionTimeout;
        }
        if (this.isAttacking() && attackAnimtionTimeout <= 0){
            attackAnimtionTimeout = 20;
            attackAnimtionState.start(this.age);
        }else {
         --this.attackAnimtionTimeout;
        }
        if (!this.isAttacking()){
            attackAnimtionState.stop();
        }
    }
    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()){
            setupAnimationStates();
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new FrositeGolemAttackGoal(this, 1.0, true));
        this.goalSelector.add(2, new WanderAroundGoal(this,1.0));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this).setGroupRevenge());
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, BlazeEntity.class, true));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }
    public static DefaultAttributeContainer.Builder createFrositeGolemAttributes(){
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,50.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,5.0)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.5)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
    }
    public void setAttacking(boolean attacking){
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    @Override
    protected int getNextAirUnderwater(int air) {
        return air;
    }
    private float getAttackDamage() {
        return (float)this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
    }

    @Override
    public boolean tryAttack(Entity target) {
        this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_ATTACK_SOUND);
        float f = this.getAttackDamage();
        float g = (int)f > 0 ? f / 2.0f + (float)this.random.nextInt((int)f) : f;
        boolean bl = target.damage(this.getDamageSources().mobAttack(this), g);
        if (bl) {
            double d;
            if (target instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)target;
                d = livingEntity.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE);
                if (target instanceof LivingEntity) {
                    int i = 1;
                    if (this.getWorld().getDifficulty() == Difficulty.NORMAL) {
                        i = 2;
                    } else if (this.getWorld().getDifficulty() == Difficulty.HARD) {
                        i = 4;
                    }
                    ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, i * 100, 0), this);
                }
            } else {
                d = 0.0;
            }
            double d2 = d;
            double e = Math.max(0.0, 1.0 - d2);
            target.setVelocity(target.getVelocity().add(0.0, (double)0.2f * e, 0.0));
            this.applyDamageEffects(this, target);
        }
        this.playSound(SoundEvents.ENTITY_IRON_GOLEM_ATTACK, 1.0f, 1.0f);
        return bl;
    }

    @Override
    public void tickMovement() {
        super.tickMovement();
        if (!this.getWorld().isClient) {
            if (this.getWorld().getBiome(this.getBlockPos()).isIn(BiomeTags.SNOW_GOLEM_MELTS)) {
                this.damage(this.getDamageSources().onFire(), 1.0f);
            }
            if (this.getWorld().getBiome(this.getBlockPos()).isIn(BiomeTags.SPAWNS_COLD_VARIANT_FROGS)) {
                this.heal(1.0f);
            }
        }
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_IRON_GOLEM_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_IRON_GOLEM_DEATH;
    }
    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_IRON_GOLEM_STEP, 1.0f, 1.0f);
    }

    @Override
    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        if (effect.getEffectType() == ModEffects.FROSTBITE) {
            return false;
        }
        return super.canHaveStatusEffect(effect);
    }
}
