package net.gecko95.oresmod.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    FROSITE(2, 156, 8.8f, 2.2f, 12,
            () -> Ingredient.ofItems(ModItems.FROSITE)),
    COPPER(1, 160, 7.0f, 1.0f, 10,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    NICKEL(1, 375, 4.5f, 2.5f, 7,
            () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),
    ALUMINUM(2, 190, 5.5f, 1.5f, 9,
            () -> Ingredient.ofItems(ModItems.ALUMINUM_INGOT)),
    STEEL (3, 1975, 9.3f, 3.9f, 10,
            () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    TITANIUM (2, 906, 6.5f, 3.5f, 3,
            () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    TUNGSTEN (2, 828, 4.8f, 1.0f, 25,
            () -> Ingredient.ofItems(ModItems.TUNGSTEN_INGOT)),
    TITANIUM_ALLOY (3, 1734, 5.7f, 4.5f, 14,
            () -> Ingredient.ofItems(ModItems.TITANIUM_ALLOY_INGOT)),
    COBALT (2, 578, 10.5f, 1.7f, 17,
            () -> Ingredient.ofItems(ModItems.COBALT_INGOT)),
    BEDROCK (1, 65, 0.5f, 5.0f, 1,
            () -> Ingredient.ofItems(ModItems.BEDROCK_SHARD)),
    FLINT (1, 29, 5.0f, 0.5f, 7,
            () -> Ingredient.ofItems(Items.FLINT)),
    SANDITE(2, 156, 7.7f, 3.3f, 12,
            () -> Ingredient.ofItems(ModItems.SANDITE)),
    LEAFITE(2, 156, 9.9f, 1.1f, 12,
            () -> Ingredient.ofItems(ModItems.LEAFITE)),
    END_ITE(2, 156, 6.6f, 4.4f, 12,
            () -> Ingredient.ofItems(ModItems.END_ITE)),
    PLATINUM (3, 1415, 11.5f, 3.0f, 8,
            () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),
    CLUB(0, 268, 0.0f, 2.0f, 2,
            () -> Ingredient.ofItems(ModItems.SILVER_SCALE)),
    ICY_DAGGER(0, 576, 2.0f, 4.0f, 15,
            () -> Ingredient.ofItems(ModItems.ICE_CHUNK)),
    SILVER_DAGGER(0, 720, 2.0f, 3.0f, 10,
            () -> Ingredient.ofItems(ModItems.SILVER_SCALE)),
    MANDIBLE_HATCHET(2, 1440, 5.0f, 4.5f, 10,
            () -> Ingredient.ofItems(ModItems.SILVER_SCALE)),
    POWER_IRON (2, 500, 12f, 1.0f, 7,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_DIAMOND (3, 3122, 16f, 1.5f, 5,
                        () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_GOLD (0, 64, 24f, 0.0f, 11,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_NETHERITE (4, 4062, 18f, 2.0f, 8,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_FROSITE (2, 312, 17.6f, 1.1f, 6,
                        () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_SANDITE (2, 312, 15.4f, 1.6f, 6,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_LEAFITE (2, 312, 19.8f, 0.5f, 6,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_END_ITE (2, 312, 13.2f, 2.2f, 6,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_COPPER(1, 320, 14.0f, 0.5f, 5,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_NICKEL(1, 750, 9.0f, 1.25f, 3,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_ALUMINUM (2, 380, 11.0f, 0.75f, 4,
                        () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_STEEL (3, 3950, 18.6f, 1.95f, 5,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_TITANIUM (2, 1812, 13.0f, 1.75f, 1,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_TUNGSTEN (2, 1656, 9.6f, 0.5f, 12,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_TITANIUM_ALLOY (3, 3468, 11.4f, 2.25f, 7,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_COBALT (2, 1156, 21.0f, 0.85f, 8,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
