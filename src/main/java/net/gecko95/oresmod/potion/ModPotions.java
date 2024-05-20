package net.gecko95.oresmod.potion;


import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.effect.ModEffects;
import net.gecko95.oresmod.item.ModItems;
import net.gecko95.oresmod.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
//This code come form the More Potions Mod Source Code
public class ModPotions {
public static Potion FROSTBITE_POTION, STRONG_FROSTBITE_POTION, LONGER_FROSTBITE_POTION;
public static Potion HEAT_STROKE_POTION, STRONG_HEAT_STROKE_POTION, LONGER_HEAT_STROKE_POTION;
public static Potion FATAL_POISON_POTION, STRONG_FATAL_POISON_POTION, LONGER_FATAL_POISON_POTION;
public static Potion VOID_SICKNESS_POTION, STRONG_VOID_SICKNESS_POTION, LONGER_VOID_SICKNESS_POTION;

    private static Potion registerPotion(String name, Potion potion){
        return Registry.register(Registries.POTION, new Identifier(OresMod.MOD_ID, name), potion);
    }
    public static void registerPotions(){
        FROSTBITE_POTION = registerPotion("frostbite_potion", new Potion(new StatusEffectInstance(ModEffects.FROSTBITE,432,0)));
        STRONG_FROSTBITE_POTION = registerPotion("strong_frostbite_potion", new Potion(new StatusEffectInstance(ModEffects.FROSTBITE,225,1)));
        LONGER_FROSTBITE_POTION = registerPotion("long_frostbite_potion", new Potion(new StatusEffectInstance(ModEffects.FROSTBITE,900,0)));

        HEAT_STROKE_POTION = registerPotion("heat_stroke_potion", new Potion(new StatusEffectInstance(ModEffects.HEAT_STROKE,432,0)));
        STRONG_HEAT_STROKE_POTION = registerPotion("strong_heat_stroke_potion", new Potion(new StatusEffectInstance(ModEffects.HEAT_STROKE,225,1)));
        LONGER_HEAT_STROKE_POTION = registerPotion("long_heat_stroke_potion", new Potion(new StatusEffectInstance(ModEffects.HEAT_STROKE,900,0)));

        FATAL_POISON_POTION = registerPotion("fatal_poison_potion", new Potion(new StatusEffectInstance(ModEffects.FATAL_POISON,432,0)));
        STRONG_FATAL_POISON_POTION = registerPotion("strong_fatal_poison_potion", new Potion(new StatusEffectInstance(ModEffects.FATAL_POISON,225,1)));
        LONGER_FATAL_POISON_POTION = registerPotion("long_fatal_poison_potion", new Potion(new StatusEffectInstance(ModEffects.FATAL_POISON,900,0)));

        VOID_SICKNESS_POTION = registerPotion("void_sickness_potion", new Potion(new StatusEffectInstance(ModEffects.VOID_SICKNESS,432,0)));
        STRONG_VOID_SICKNESS_POTION = registerPotion("strong_void_sickness_potion", new Potion(new StatusEffectInstance(ModEffects.VOID_SICKNESS,225,1)));
        LONGER_VOID_SICKNESS_POTION = registerPotion("long_void_sickness_potion", new Potion(new StatusEffectInstance(ModEffects.VOID_SICKNESS,900,0)));

        registerPotionRecipes();
    }
    private static void registerPotionRecipes(){
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.SLOWNESS, Items.BLUE_ICE,ModPotions.FROSTBITE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.FROSTBITE_POTION, Items.REDSTONE,ModPotions.LONGER_FROSTBITE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.FROSTBITE_POTION, ModItems.FROSITE,ModPotions.STRONG_FROSTBITE_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.WEAKNESS, Items.RED_SAND,ModPotions.HEAT_STROKE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HEAT_STROKE_POTION, Items.REDSTONE,ModPotions.LONGER_HEAT_STROKE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HEAT_STROKE_POTION, ModItems.SANDITE,ModPotions.STRONG_HEAT_STROKE_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, ModBlocks.LEAFITE_LEAVES.asItem(),ModPotions.FATAL_POISON_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.FATAL_POISON_POTION, Items.REDSTONE,ModPotions.LONGER_FATAL_POISON_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.FATAL_POISON_POTION, ModItems.LEAFITE,ModPotions.STRONG_FATAL_POISON_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.HARMING, ModBlocks.VOID_STONE.asItem(),ModPotions.VOID_SICKNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VOID_SICKNESS_POTION, Items.REDSTONE,ModPotions.LONGER_VOID_SICKNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VOID_SICKNESS_POTION, ModItems.END_ITE,ModPotions.STRONG_VOID_SICKNESS_POTION);
    }
}
