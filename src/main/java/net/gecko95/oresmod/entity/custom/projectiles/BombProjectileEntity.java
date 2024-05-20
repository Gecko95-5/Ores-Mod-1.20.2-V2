package net.gecko95.oresmod.entity.custom.projectiles;

import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class BombProjectileEntity extends ThrownItemEntity {
    public BombProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    public BombProjectileEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.BOMB_PROJECTILE, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.BOMB;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }
    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().createExplosion((Entity)this, this.getX(), this.getY(), this.getZ(), 1.5f, false, World.ExplosionSourceType.MOB);
            this.discard();
        }
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
            livingEntity = (LivingEntity) entity2;
            bl = entity.damage(this.getDamageSources().explosion(this, livingEntity), 7.0f);
            if (bl) {
                if (entity.isAlive()) {
                    this.applyDamageEffects(livingEntity, entity);
                }
            }
        }
    }
}

