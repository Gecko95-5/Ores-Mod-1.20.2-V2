package net.gecko95.oresmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class IceCubeEntity extends HostileEntity {
    public IceCubeEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    @Override
    protected void initGoals() {
        this.goalSelector.add(4, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(6, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this).setGroupRevenge());
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }
    public static DefaultAttributeContainer.Builder createIceCubeAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,8.0)
                .add(EntityAttributes.GENERIC_ARMOR,1.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.6)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 16);
    }
    @Override
    public void tickMovement() {
        super.tickMovement();
        if (!this.getWorld().isClient) {
            if (this.getWorld().getBiome(this.getBlockPos()).isIn(BiomeTags.SNOW_GOLEM_MELTS)) {
                this.damage(this.getDamageSources().onFire(), 1.0f);
            }
        }
    }
    @Override
    protected int getNextAirUnderwater(int air) {
        return air;
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.BLOCK_GLASS_BREAK;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_GLASS_BREAK;
    }

}
