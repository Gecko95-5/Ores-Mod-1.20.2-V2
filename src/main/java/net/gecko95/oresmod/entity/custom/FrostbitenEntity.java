package net.gecko95.oresmod.entity.custom;

import net.gecko95.oresmod.effect.ModEffects;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Difficulty;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;

public class FrostbitenEntity extends ZombieEntity {
    public FrostbitenEntity(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder createFrostbitenAttributes(){
        return ZombieEntity.createZombieAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 16.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,2)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,0.5);
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean bl = super.tryAttack(target);
        if (bl && this.getMainHandStack().isEmpty() && target instanceof LivingEntity) {
            float f = this.getWorld().getLocalDifficulty(this.getBlockPos()).getLocalDifficulty();
            ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(ModEffects.FROSTBITE, 450 * (int)f), this);
        }
        return bl;
    }

    @Override
    protected ItemStack getSkull() {
        return ItemStack.EMPTY;
    }
    @Override
    protected void initEquipment(Random random, LocalDifficulty localDifficulty) {
        super.initEquipment(random, localDifficulty);
        float f = random.nextFloat();
        float f2 = this.getWorld().getDifficulty() == Difficulty.HARD ? 0.05f : 0.01f;
        if (f < f2) {
            int i = random.nextInt(3);
            if (i == 0) {
                this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(ModItems.FROSITE_SWORD));
            } else {
                this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(ModItems.FROSITE_SHOVEL));
            }
        }
    }
    @Override
    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        if (effect.getEffectType() == ModEffects.FROSTBITE) {
            return false;
        }
        return super.canHaveStatusEffect(effect);
    }
}
