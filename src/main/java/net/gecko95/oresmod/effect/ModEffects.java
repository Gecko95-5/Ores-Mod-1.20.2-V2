package net.gecko95.oresmod.effect;

import net.gecko95.oresmod.OresMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static StatusEffect FROSTBITE = new FrostbiteEffect(StatusEffectCategory.HARMFUL,0x24f1c6)
            .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.2f,
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    public static StatusEffect HEAT_STROKE = new HeatStrokeEffect(StatusEffectCategory.HARMFUL,0xd88925)
            .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "22653B89-116E-49DC-9B6B-9971489B5BE5", -2.0,
                    EntityAttributeModifier.Operation.ADDITION);
    public static StatusEffect FATAL_POISON = new FatalPoisonEffect(StatusEffectCategory.HARMFUL,0x3fd11b)
            .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "55FCED67-E92A-486E-9800-B47F202C4386", -0.4f,
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    public static StatusEffect VOID_SICKNESS = new VoidSicknessEffect(StatusEffectCategory.HARMFUL,0x000000)
            .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", -2.0,
                    EntityAttributeModifier.Operation.ADDITION);
    public static StatusEffect DECREASE_HEALTH = new ModStatusEffect(StatusEffectCategory.HARMFUL,0x671960).addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC",-2.0,
            EntityAttributeModifier.Operation.ADDITION);
}
