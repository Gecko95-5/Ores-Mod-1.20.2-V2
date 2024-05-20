package net.gecko95.oresmod.entity.custom.projectiles;

import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class IceProjectileEntity extends ThrownItemEntity {
    public IceProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    public IceProjectileEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.ICE_PROJECTILE, livingEntity, world);
    }
    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? ParticleTypes.SNOWFLAKE : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack);
    }
    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            ParticleEffect particleEffect = this.getParticleParameters();
            for (int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }
    @Override
    protected Item getDefaultItem() {
        return ModItems.ICE_CHUNK;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        boolean bl;
        LivingEntity livingEntity;
        super.onEntityHit(entityHitResult);
        if (this.getWorld().isClient) {
            return;
        }
        Entity entity = entityHitResult.getEntity();
        Entity entity2 = this.getOwner();
        if (entity2 instanceof LivingEntity) {
            livingEntity = (LivingEntity)entity2;
            bl = entity.damage(this.getDamageSources().thrown(this, livingEntity), 2.0f);
            if (bl) {
                if (entity.isAlive()) {
                    this.applyDamageEffects(livingEntity, entity);
                }
            }
        }
        if (entity instanceof LivingEntity) {
            livingEntity = (LivingEntity)entity;
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0), this.getEffectCause());
        }
    }
    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }
}

