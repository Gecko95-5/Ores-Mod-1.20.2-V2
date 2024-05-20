package net.gecko95.oresmod.entity.custom;

import net.gecko95.oresmod.effect.ModEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class EnderSpiderEntity extends SpiderEntity {
    public EnderSpiderEntity(EntityType<? extends SpiderEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder createEnderSpiderAttributes(){
        return SpiderEntity.createSpiderAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0);
    }

    @Override
    public boolean tryAttack(Entity target) {
        if (super.tryAttack(target)) {
            if (target instanceof LivingEntity) {
                int i = 0;
                if (this.getWorld().getDifficulty() == Difficulty.NORMAL) {
                    i = 10;
                } else if (this.getWorld().getDifficulty() == Difficulty.HARD) {
                    i = 20;
                }
                if (i > 0) {
                    ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(ModEffects.DECREASE_HEALTH, i * 10, 0), this);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean hurtByWater() {
        return true;
    }
}
