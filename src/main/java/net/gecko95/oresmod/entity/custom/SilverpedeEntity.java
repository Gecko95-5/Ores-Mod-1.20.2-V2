package net.gecko95.oresmod.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Difficulty;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SilverpedeEntity extends HostileEntity {

    public final AnimationState idleAnimtionState = new AnimationState();
    private int idleAnimtionTimeout = 0;


    public SilverpedeEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    private void setupAnimationStates(){
        if (this.idleAnimtionTimeout <= 0) {
            this.idleAnimtionTimeout = this.random.nextInt(40) + 80;
            this.idleAnimtionState.start(this.age);
        } else {
            --this.idleAnimtionTimeout;
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
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(3, new PounceAtTargetGoal(this, 0.4f));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(6, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this).setGroupRevenge());
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    public static DefaultAttributeContainer.Builder createSilverpedeAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,24.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0);
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SILVERFISH_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SILVERFISH_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SILVERFISH_DEATH;
    }
    @Override
    public EntityGroup getGroup() {
        return EntityGroup.ARTHROPOD;
    }
    @Override
    @Nullable
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        if (entityData == null) {
            entityData = new SilverpedeEntity.SilverpedeData();
            if (world.getDifficulty() == Difficulty.EASY && random.nextFloat() < 0.1f * difficulty.getClampedLocalDifficulty()) {
                ((SilverpedeEntity.SilverpedeData)entityData).setEffect(random);
            }
            if (world.getDifficulty() == Difficulty.NORMAL && random.nextFloat() < 0.5f * difficulty.getClampedLocalDifficulty()) {
                ((SilverpedeEntity.SilverpedeData)entityData).setEffect(random);
            }
            if (world.getDifficulty() == Difficulty.HARD && random.nextFloat() < 0.9f * difficulty.getClampedLocalDifficulty()) {
                ((SilverpedeEntity.SilverpedeData)entityData).setEffect(random);
            }
        }
        if (entityData instanceof SilverpedeEntity.SilverpedeData) {
            SilverpedeEntity.SilverpedeData silverpedeData = (SilverpedeEntity.SilverpedeData)entityData;
            StatusEffect statusEffect = silverpedeData.effect;
            if (statusEffect != null) {
                this.addStatusEffect(new StatusEffectInstance(statusEffect, -1));
            }
        }
        return entityData;
        }
        public static class SilverpedeData
                implements EntityData {
            @Nullable
            public StatusEffect effect;

            public void setEffect(Random random) {
                int i = random.nextInt(5);
                if (i <= 1) {
                    this.effect = StatusEffects.SPEED;
                } else if (i == 2) {
                    this.effect = StatusEffects.WEAKNESS;
                } else if (i == 3) {
                    this.effect = StatusEffects.REGENERATION;
                } else if (i == 4) {
                    this.effect = StatusEffects.RESISTANCE;
                }
            }
        }
}
