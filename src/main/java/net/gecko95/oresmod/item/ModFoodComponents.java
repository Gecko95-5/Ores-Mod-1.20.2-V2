package net.gecko95.oresmod.item;

import net.gecko95.oresmod.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAW_FLESH = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.1f).meat().build();
    public static final FoodComponent COOKED_FLESH = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).meat().build();
    public static final FoodComponent NICKEL_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent NICKEL_BEETROOT = new FoodComponent.Builder().hunger(8).saturationModifier(0.2f).build();
    public static final FoodComponent STEEL_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 3), 1.0f).alwaysEdible().build();
    public static final FoodComponent STEEL_BEETROOT = new FoodComponent.Builder().hunger(8).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 0.5f).build();
    public static final FoodComponent RUSTED_STEEL_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent RUSTED_STEEL_BEETROOT = new FoodComponent.Builder().hunger(8).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 0), 1.0f).build();
    public static final FoodComponent FROZEN_FLESH = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(ModEffects.FROSTBITE, 600, 0), 0.8f).meat().build();
}
