package net.gecko95.oresmod.entity.custom.projectiles;

import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Iterator;

public class IceBombProjectileEntity extends ThrownItemEntity {
    private int explosionRadius = 1;
    public IceBombProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    public IceBombProjectileEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.ICE_BOMB_PROJECTILE, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.ICE_BOMB;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        Iterator<BlockPos> blockPosToChange =
                BlockPos.iterateOutwards(this.getBlockPos(),
                        (explosionRadius), 1, (explosionRadius)).iterator();
        for (Iterator<BlockPos> it = blockPosToChange; it.hasNext(); ) {
            BlockPos position = it.next();
            if(this.getWorld().getBlockState(position).isAir() ||
                    this.getWorld().getBlockState(position).isOf(Blocks.TALL_GRASS) ||
                    this.getWorld().getBlockState(position).isOf(Blocks.GRASS)) {
                if(this.random.nextFloat() > 0.6f) {
                    this.getWorld().setBlockState(position, Blocks.PACKED_ICE.getDefaultState());
                } else if(this.random.nextFloat() > 0.1f) {
                    this.getWorld().setBlockState(position, Blocks.BLUE_ICE.getDefaultState());
                }
            }
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

