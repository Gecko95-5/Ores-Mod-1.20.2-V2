package net.gecko95.oresmod.item;

import net.gecko95.oresmod.OresMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    FROSITE("frosite", 12, new int[] { 2, 4, 3, 2}, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.ofItems(ModItems.FROSITE)),
    SANDITE("sandite", 12, new int[] { 2, 3, 4, 2}, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.ofItems(ModItems.SANDITE)),
    LEAFITE("leafite", 12, new int[] { 3, 2, 3, 3}, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.ofItems(ModItems.LEAFITE)),
    END_ITE("end_ite", 12, new int[] { 2, 6, 1, 2}, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.ofItems(ModItems.END_ITE)),
    COPPER("copper", 10, new int[] { 3, 3, 3, 2}, 10,
            SoundEvents.BLOCK_COPPER_STEP, 1f, 0f, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    NICKEL("nickel", 16, new int[] { 1, 5, 4, 1}, 7,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0.1f, () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),
    ALUMINUM("aluminum", 12, new int[] { 3, 6, 5, 1}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.ofItems(ModItems.ALUMINUM_INGOT)),
    STEEL("steel", 35, new int[] { 3, 8, 6, 3}, 10,
    SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f, 0.2f, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    TITANIUM("titanium", 24, new int[] { 3, 6, 5, 2}, 3,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1f, 0.05f, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    TUNGSTEN("tungsten", 17, new int[] { 2, 6, 5, 1}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.ofItems(ModItems.TUNGSTEN_INGOT)),
    TITANIUM_ALLOY("titanium_alloy", 31, new int[] { 3, 8, 6, 3}, 14,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1f, 0.05f, () -> Ingredient.ofItems(ModItems.TITANIUM_ALLOY_INGOT)),
    COBALT("cobalt", 22, new int[] { 2, 6, 5, 3}, 17,
    SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0.1f, () -> Ingredient.ofItems(ModItems.COBALT_INGOT)),
    PLATINUM("platinum", 26, new int[] { 3, 8, 6, 3}, 8,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3f, 0.0f, () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),
    BEDROCK("bedrock", 2, new int[] { 3, 5, 5, 3}, 1,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0f, 0.5f, () -> Ingredient.ofItems(ModItems.BEDROCK_SHARD)),
    CLAY("clay", 7, new int[] { 1, 2, 2, 1}, 6,
    SoundEvents.BLOCK_GRAVEL_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.CLAY)),
    TERRACOTTA("terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.TERRACOTTA)),
    BLACK_TERRACOTTA("black_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.BLACK_TERRACOTTA)),
    BLUE_TERRACOTTA("blue_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.BLUE_TERRACOTTA)),
    BROWN_TERRACOTTA("brown_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.BROWN_TERRACOTTA)),
    CYAN_TERRACOTTA("cyan_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.CYAN_TERRACOTTA)),
    GRAY_TERRACOTTA("gray_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.GRAY_TERRACOTTA)),
    GREEN_TERRACOTTA("green_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.GREEN_TERRACOTTA)),
    LIGHT_BLUE_TERRACOTTA("light_blue_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.LIGHT_BLUE_TERRACOTTA)),
    LIGHT_GRAY_TERRACOTTA("light_gray_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.LIGHT_GRAY_TERRACOTTA)),
    LIME_TERRACOTTA("lime_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.LIME_TERRACOTTA)),
    MAGENTA_TERRACOTTA("magenta_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
            SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.MAGENTA_TERRACOTTA)),
    ORANGE_TERRACOTTA("orange_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.ORANGE_TERRACOTTA)),
    PINK_TERRACOTTA("pink_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.PINK_TERRACOTTA)),
    PURPLE_TERRACOTTA("purple_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.PURPLE_TERRACOTTA)),
    RED_TERRACOTTA("red_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.RED_TERRACOTTA)),
    WHITE_TERRACOTTA("white_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.WHITE_TERRACOTTA)),
    YELLOW_TERRACOTTA("yellow_terracotta", 12, new int[] { 2, 4, 4, 2}, 3,
    SoundEvents.BLOCK_DECORATED_POT_PLACE, 0f, 0f, () -> Ingredient.ofItems(Items.YELLOW_TERRACOTTA));

private final String name;
private final int durabilityMultiplier;
private final int[] protectionAmounts;
private final int enchantability;
private final SoundEvent equipSound;
private final float toughness;
private final float knockbackResistance;
private final Supplier<Ingredient> repairIngredient;

private static final  int[] BASE_DURABILITY = { 11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return OresMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
