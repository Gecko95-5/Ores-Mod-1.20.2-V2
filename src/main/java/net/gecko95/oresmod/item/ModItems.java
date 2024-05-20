package net.gecko95.oresmod.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.entity.ModBoats;
import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item POWDERED_SALT = registerItem("powdered_salt", new Item(new FabricItemSettings()));
    public static final Item RAW_SALT = registerItem("raw_salt", new Item(new FabricItemSettings()));

    public static final Item RAW_FLESH = registerItem("raw_flesh",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_FLESH)));
    public static final Item COOKED_FLESH = registerItem("cooked_flesh",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_FLESH)));

    public static final Item FROSITE = registerItem("frosite", new Item(new FabricItemSettings()));

    public static final Item FROSITE_PICKAXE = registerItem("frosite_pickaxe",
            new PickaxeItem(ModToolMaterial.FROSITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item FROSITE_SWORD = registerItem("frosite_sword",
            new FrositeSwordItem(ModToolMaterial.FROSITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item FROSITE_AXE = registerItem("frosite_axe",
            new AxeItem(ModToolMaterial.FROSITE, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item FROSITE_SHOVEL = registerItem("frosite_shovel",
            new ShovelItem(ModToolMaterial.FROSITE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item FROSITE_HOE = registerItem("frosite_hoe",
            new HoeItem(ModToolMaterial.FROSITE, -2, -1.0f, new FabricItemSettings()));

    public static final Item FROSITE_HELMET = registerItem("frosite_helmet",
            new ArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item FROSITE_CHESTPLATE = registerItem("frosite_chestplate",
            new ModArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item FROSITE_LEGGINGS = registerItem("frosite_leggings",
            new ArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item FROSITE_BOOTS = registerItem("frosite_boots",
            new ArmorItem(ModArmorMaterials.FROSITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", new Item(new FabricItemSettings()));

    public static final Item ALUMINUM_PICKAXE = registerItem("aluminum_pickaxe",
            new PickaxeItem(ModToolMaterial.ALUMINUM, 1, -2.6f, new FabricItemSettings()));
    public static final Item ALUMINUM_SWORD = registerItem("aluminum_sword",
            new SwordItem(ModToolMaterial.ALUMINUM, 3, -2.2f, new FabricItemSettings()));
    public static final Item ALUMINUM_AXE = registerItem("aluminum_axe",
            new AxeItem(ModToolMaterial.ALUMINUM, 6.0f, -2.9f, new FabricItemSettings()));
    public static final Item ALUMINUM_SHOVEL = registerItem("aluminum_shovel",
            new ShovelItem(ModToolMaterial.ALUMINUM, 1.5f, -2.8f, new FabricItemSettings()));
    public static final Item ALUMINUM_HOE = registerItem("aluminum_hoe",
            new HoeItem(ModToolMaterial.ALUMINUM, -1, -0.8f, new FabricItemSettings()));
    public static final Item FLINT_AND_ALUMINUM = registerItem("flint_and_aluminum",
            new FlintAndSteelItem(new FabricItemSettings().maxDamage(32)));

    public static final Item ALUMINUM_HELMET = registerItem("aluminum_helmet",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ALUMINUM_CHESTPLATE = registerItem("aluminum_chestplate",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ALUMINUM_LEGGINGS = registerItem("aluminum_leggings",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ALUMINUM_BOOTS = registerItem("aluminum_boots",
            new ArmorItem(ModArmorMaterials.ALUMINUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new FabricItemSettings()));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(new FabricItemSettings()));

    public static final Item NICKEL_APPLE = registerItem("nickel_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.NICKEL_APPLE)));
    public static final Item NICKEL_BEETROOT = registerItem("nickel_beetroot",
            new Item(new FabricItemSettings().food(ModFoodComponents.NICKEL_BEETROOT)));

    public static final Item NICKEL_SWORD = registerItem("nickel_sword",
            new SwordItem(ModToolMaterial.NICKEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item NICKEL_PICKAXE = registerItem("nickel_pickaxe",
            new PickaxeItem(ModToolMaterial.NICKEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item NICKEL_AXE = registerItem("nickel_axe",
            new AxeItem(ModToolMaterial.NICKEL, 6.0f, -3.0f, new FabricItemSettings()));
    public static final Item NICKEL_SHOVEL = registerItem("nickel_shovel",
            new ShovelItem(ModToolMaterial.NICKEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item NICKEL_HOE = registerItem("nickel_hoe",
            new HoeItem(ModToolMaterial.NICKEL, -2, -0.8f, new FabricItemSettings()));

    public static final Item NICKEL_HELMET = registerItem("nickel_helmet",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item NICKEL_CHESTPLATE = registerItem("nickel_chestplate",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item NICKEL_LEGGINGS = registerItem("nickel_leggings",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item NICKEL_BOOTS = registerItem("nickel_boots",
            new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.2f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.6f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 7.0f, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER, -1, -2.0f, new FabricItemSettings()));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item IRON_BALL = registerItem("iron_ball", new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND_ALUMINUM = registerItem("steel_compound_aluminum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKEL = registerItem("steel_compound_nickel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPER = registerItem("steel_compound_copper",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND_ALUCKEL = registerItem("steel_compound_aluckel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_ALUPPER = registerItem("steel_compound_alupper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKINUM = registerItem("steel_compound_nickinum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKOPPER = registerItem("steel_compound_nickopper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPINUM = registerItem("steel_compound_coppinum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPEL = registerItem("steel_compound_coppel",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND_ALUNICKOPPER = registerItem("steel_compound_alunickopper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_ALUPPEREL = registerItem("steel_compound_alupperel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKINUPPER = registerItem("steel_compound_nickinupper",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_NICKOPPINUM = registerItem("steel_compound_nickoppinum",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPINUCKEL = registerItem("steel_compound_coppinuckel",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_COMPOUND_COPPELUNUM = registerItem("steel_compound_coppelinum",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_COMPOUND = registerItem("steel_compound", new Item(new FabricItemSettings()));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_UPGRADE_SMITHING_TEMPLATE = registerItem("steel_upgrade_smithing_template",
            new SteelUpgradeTemplateItem(new FabricItemSettings()));

    public static final Item STEEL_APPLE = registerItem("steel_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEEL_APPLE)));
    public static final Item STEEL_BEETROOT = registerItem("steel_beetroot",
            new Item(new FabricItemSettings().food(ModFoodComponents.STEEL_BEETROOT)));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, -3, 0.0f, new FabricItemSettings()));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item RUSTED_STEEL_APPLE = registerItem("rusted_steel_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.RUSTED_STEEL_APPLE)));
    public static final Item RUSTED_STEEL_BEETROOT = registerItem("rusted_steel_beetroot",
            new Item(new FabricItemSettings().food(ModFoodComponents.RUSTED_STEEL_BEETROOT)));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterial.TITANIUM, 3, -2.4f, new FabricItemSettings()));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterial.TITANIUM, 1, -2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterial.TITANIUM, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterial.TITANIUM, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterial.TITANIUM, -3, 0.0f, new FabricItemSettings()));

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item(new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new FabricItemSettings().fireproof()));

    public static final Item TUNGSTEN_HELMET = registerItem("tungsten_helmet",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_CHESTPLATE = registerItem("tungsten_chestplate",
            new ModArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_LEGGINGS = registerItem("tungsten_leggings",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_BOOTS = registerItem("tungsten_boots",
            new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item TUNGSTEN_SWORD = registerItem("tungsten_sword",
            new SwordItem(ModToolMaterial.TUNGSTEN, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe",
            new PickaxeItem(ModToolMaterial.TUNGSTEN, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe",
            new AxeItem(ModToolMaterial.TUNGSTEN, 5.0f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_SHOVEL = registerItem("tungsten_shovel",
            new ShovelItem(ModToolMaterial.TUNGSTEN, 1.5f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TUNGSTEN_HOE = registerItem("tungsten_hoe",
            new HoeItem(ModToolMaterial.TUNGSTEN, -1, 0.0f, new FabricItemSettings().fireproof()));

    public static final Item TITANIUM_ALLOY_INGOT = registerItem("titanium_alloy_ingot", new Item(new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_SCRAP = registerItem("titanium_alloy_scrap", new Item(new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE = registerItem("titanium_alloy_upgrade_smithing_template",
            new TitaniumAlloyUpgradeTemplateItem(new FabricItemSettings()));

    public static final Item TITANIUM_ALLOY_SWORD = registerItem("titanium_alloy_sword",
            new SwordItem(ModToolMaterial.TITANIUM_ALLOY, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_PICKAXE = registerItem("titanium_alloy_pickaxe",
            new PickaxeItem(ModToolMaterial.TITANIUM_ALLOY, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_AXE = registerItem("titanium_alloy_axe",
            new AxeItem(ModToolMaterial.TITANIUM_ALLOY, 5.0f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_SHOVEL = registerItem("titanium_alloy_shovel",
            new ShovelItem(ModToolMaterial.TITANIUM_ALLOY, 1.5f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_HOE = registerItem("titanium_alloy_hoe",
            new HoeItem(ModToolMaterial.TITANIUM_ALLOY, -4, 0.0f, new FabricItemSettings().fireproof()));

    public static final Item TITANIUM_ALLOY_HELMET = registerItem("titanium_alloy_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_CHESTPLATE = registerItem("titanium_alloy_chestplate",
            new ModArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_LEGGINGS = registerItem("titanium_alloy_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_ALLOY_BOOTS = registerItem("titanium_alloy_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));
    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget", new Item(new FabricItemSettings()));

    public static final Item COBALT_SWORD = registerItem("cobalt_sword",
            new SwordItem(ModToolMaterial.COBALT, 3, -2.4f, new FabricItemSettings()));
    public static final Item COBALT_PICKAXE = registerItem("cobalt_pickaxe",
            new PickaxeItem(ModToolMaterial.COBALT, 1, -2.8f, new FabricItemSettings()));
    public static final Item COBALT_AXE = registerItem("cobalt_axe",
            new AxeItem(ModToolMaterial.COBALT, 5.0f, -3.1f, new FabricItemSettings()));
    public static final Item COBALT_SHOVEL = registerItem("cobalt_shovel",
            new ShovelItem(ModToolMaterial.COBALT, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item COBALT_HOE = registerItem("cobalt_hoe",
            new HoeItem(ModToolMaterial.COBALT, -1, -1.0f, new FabricItemSettings()));

    public static final Item COBALT_HELMET = registerItem("cobalt_helmet",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots",
            new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BEDROCK_SHARD = registerItem("bedrock_shard", new Item(new FabricItemSettings()));

    public static final Item BEDROCK_SWORD = registerItem("bedrock_sword",
            new SwordItem(ModToolMaterial.BEDROCK, 3, -3.2f, new FabricItemSettings()));
    public static final Item BEDROCK_PICKAXE = registerItem("bedrock_pickaxe",
            new PickaxeItem(ModToolMaterial.BEDROCK, 1, -3.6f, new FabricItemSettings()));
    public static final Item BEDROCK_AXE = registerItem("bedrock_axe",
            new AxeItem(ModToolMaterial.BEDROCK, 5.0f, -3.8f, new FabricItemSettings()));
    public static final Item BEDROCK_SHOVEL = registerItem("bedrock_shovel",
            new ShovelItem(ModToolMaterial.BEDROCK, 1.5f, -3.8f, new FabricItemSettings()));
    public static final Item BEDROCK_HOE = registerItem("bedrock_hoe",
            new HoeItem(ModToolMaterial.BEDROCK, -5, -2.0f, new FabricItemSettings()));

    public static final Item BEDROCK_HELMET = registerItem("bedrock_helmet",
            new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BEDROCK_CHESTPLATE = registerItem("bedrock_chestplate",
            new DoubleModArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BEDROCK_LEGGINGS = registerItem("bedrock_leggings",
            new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BEDROCK_BOOTS = registerItem("bedrock_boots",
            new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item FLINT_SWORD = registerItem("flint_sword",
            new SwordItem(ModToolMaterial.FLINT, 3, -1.6f, new FabricItemSettings()));
    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new PickaxeItem(ModToolMaterial.FLINT, 1, -2.0f, new FabricItemSettings()));
    public static final Item FLINT_AXE = registerItem("flint_axe",
            new AxeItem(ModToolMaterial.FLINT, 5.5f, -2.4f, new FabricItemSettings()));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterial.FLINT, 1.5f, -2.2f, new FabricItemSettings()));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new HoeItem(ModToolMaterial.FLINT, 0, -2.0f, new FabricItemSettings()));

    public static final Item CLAY_HELMET = registerItem("clay_helmet",
            new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CLAY_CHESTPLATE = registerItem("clay_chestplate",
            new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CLAY_LEGGINGS = registerItem("clay_leggings",
            new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CLAY_BOOTS = registerItem("clay_boots",
            new ArmorItem(ModArmorMaterials.CLAY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TERRACOTTA_HELMET = registerItem("terracotta_helmet",
            new ArmorItem(ModArmorMaterials.TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TERRACOTTA_CHESTPLATE = registerItem("terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TERRACOTTA_LEGGINGS = registerItem("terracotta_leggings",
            new ArmorItem(ModArmorMaterials.TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TERRACOTTA_BOOTS = registerItem("terracotta_boots",
            new ArmorItem(ModArmorMaterials.TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BLACK_TERRACOTTA_HELMET = registerItem("black_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.BLACK_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLACK_TERRACOTTA_CHESTPLATE = registerItem("black_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.BLACK_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLACK_TERRACOTTA_LEGGINGS = registerItem("black_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.BLACK_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLACK_TERRACOTTA_BOOTS = registerItem("black_terracotta_boots",
            new ArmorItem(ModArmorMaterials.BLACK_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BLUE_TERRACOTTA_HELMET = registerItem("blue_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.BLUE_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLUE_TERRACOTTA_CHESTPLATE = registerItem("blue_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.BLUE_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLUE_TERRACOTTA_LEGGINGS = registerItem("blue_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.BLUE_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLUE_TERRACOTTA_BOOTS = registerItem("blue_terracotta_boots",
            new ArmorItem(ModArmorMaterials.BLUE_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BROWN_TERRACOTTA_HELMET = registerItem("brown_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.BROWN_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BROWN_TERRACOTTA_CHESTPLATE = registerItem("brown_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.BROWN_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BROWN_TERRACOTTA_LEGGINGS = registerItem("brown_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.BROWN_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BROWN_TERRACOTTA_BOOTS = registerItem("brown_terracotta_boots",
            new ArmorItem(ModArmorMaterials.BROWN_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item CYAN_TERRACOTTA_HELMET = registerItem("cyan_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.CYAN_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CYAN_TERRACOTTA_CHESTPLATE = registerItem("cyan_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.CYAN_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CYAN_TERRACOTTA_LEGGINGS = registerItem("cyan_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.CYAN_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CYAN_TERRACOTTA_BOOTS = registerItem("cyan_terracotta_boots",
            new ArmorItem(ModArmorMaterials.CYAN_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GRAY_TERRACOTTA_HELMET = registerItem("gray_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.GRAY_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GRAY_TERRACOTTA_CHESTPLATE = registerItem("gray_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.GRAY_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GRAY_TERRACOTTA_LEGGINGS = registerItem("gray_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.GRAY_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GRAY_TERRACOTTA_BOOTS = registerItem("gray_terracotta_boots",
            new ArmorItem(ModArmorMaterials.GRAY_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GREEN_TERRACOTTA_HELMET = registerItem("green_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.GREEN_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GREEN_TERRACOTTA_CHESTPLATE = registerItem("green_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.GREEN_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GREEN_TERRACOTTA_LEGGINGS = registerItem("green_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.GREEN_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GREEN_TERRACOTTA_BOOTS = registerItem("green_terracotta_boots",
            new ArmorItem(ModArmorMaterials.GREEN_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item LIGHT_BLUE_TERRACOTTA_HELMET = registerItem("light_blue_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.LIGHT_BLUE_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_TERRACOTTA_CHESTPLATE = registerItem("light_blue_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.LIGHT_BLUE_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_TERRACOTTA_LEGGINGS = registerItem("light_blue_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.LIGHT_BLUE_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LIGHT_BLUE_TERRACOTTA_BOOTS = registerItem("light_blue_terracotta_boots",
            new ArmorItem(ModArmorMaterials.LIGHT_BLUE_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item LIGHT_GRAY_TERRACOTTA_HELMET = registerItem("light_gray_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.LIGHT_GRAY_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_TERRACOTTA_CHESTPLATE = registerItem("light_gray_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.LIGHT_GRAY_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_TERRACOTTA_LEGGINGS = registerItem("light_gray_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.LIGHT_GRAY_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LIGHT_GRAY_TERRACOTTA_BOOTS = registerItem("light_gray_terracotta_boots",
            new ArmorItem(ModArmorMaterials.LIGHT_GRAY_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item LIME_TERRACOTTA_HELMET = registerItem("lime_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.LIME_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LIME_TERRACOTTA_CHESTPLATE = registerItem("lime_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.LIME_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LIME_TERRACOTTA_LEGGINGS = registerItem("lime_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.LIME_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LIME_TERRACOTTA_BOOTS = registerItem("lime_terracotta_boots",
            new ArmorItem(ModArmorMaterials.LIME_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item MAGENTA_TERRACOTTA_HELMET = registerItem("magenta_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.MAGENTA_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MAGENTA_TERRACOTTA_CHESTPLATE = registerItem("magenta_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.MAGENTA_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item MAGENTA_TERRACOTTA_LEGGINGS = registerItem("magenta_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.MAGENTA_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item MAGENTA_TERRACOTTA_BOOTS = registerItem("magenta_terracotta_boots",
            new ArmorItem(ModArmorMaterials.MAGENTA_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ORANGE_TERRACOTTA_HELMET = registerItem("orange_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.ORANGE_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ORANGE_TERRACOTTA_CHESTPLATE = registerItem("orange_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.ORANGE_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ORANGE_TERRACOTTA_LEGGINGS = registerItem("orange_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.ORANGE_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ORANGE_TERRACOTTA_BOOTS = registerItem("orange_terracotta_boots",
            new ArmorItem(ModArmorMaterials.ORANGE_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item PINK_TERRACOTTA_HELMET = registerItem("pink_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.PINK_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PINK_TERRACOTTA_CHESTPLATE = registerItem("pink_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.PINK_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PINK_TERRACOTTA_LEGGINGS = registerItem("pink_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.PINK_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PINK_TERRACOTTA_BOOTS = registerItem("pink_terracotta_boots",
            new ArmorItem(ModArmorMaterials.PINK_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item PURPLE_TERRACOTTA_HELMET = registerItem("purple_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.PURPLE_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PURPLE_TERRACOTTA_CHESTPLATE = registerItem("purple_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.PURPLE_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PURPLE_TERRACOTTA_LEGGINGS = registerItem("purple_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.PURPLE_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PURPLE_TERRACOTTA_BOOTS = registerItem("purple_terracotta_boots",
            new ArmorItem(ModArmorMaterials.PURPLE_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item RED_TERRACOTTA_HELMET = registerItem("red_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.RED_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RED_TERRACOTTA_CHESTPLATE = registerItem("red_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.RED_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RED_TERRACOTTA_LEGGINGS = registerItem("red_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.RED_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RED_TERRACOTTA_BOOTS = registerItem("red_terracotta_boots",
            new ArmorItem(ModArmorMaterials.RED_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WHITE_TERRACOTTA_HELMET = registerItem("white_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.WHITE_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WHITE_TERRACOTTA_CHESTPLATE = registerItem("white_terracotta_chestplate",
            new ArmorItem(ModArmorMaterials.WHITE_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item WHITE_TERRACOTTA_LEGGINGS = registerItem("white_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.WHITE_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item WHITE_TERRACOTTA_BOOTS = registerItem("white_terracotta_boots",
            new ArmorItem(ModArmorMaterials.WHITE_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item YELLOW_TERRACOTTA_HELMET = registerItem("yellow_terracotta_helmet",
            new ArmorItem(ModArmorMaterials.YELLOW_TERRACOTTA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item YELLOW_TERRACOTTA_CHESTPLATE = registerItem("yellow_terracotta_chestplate",
            new ModArmorItem(ModArmorMaterials.YELLOW_TERRACOTTA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item YELLOW_TERRACOTTA_LEGGINGS = registerItem("yellow_terracotta_leggings",
            new ArmorItem(ModArmorMaterials.YELLOW_TERRACOTTA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item YELLOW_TERRACOTTA_BOOTS = registerItem("yellow_terracotta_boots",
            new ArmorItem(ModArmorMaterials.YELLOW_TERRACOTTA, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item SANDITE = registerItem("sandite", new Item(new FabricItemSettings()));

    public static final Item SANDITE_PICKAXE = registerItem("sandite_pickaxe",
            new PickaxeItem(ModToolMaterial.SANDITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item SANDITE_SWORD = registerItem("sandite_sword",
            new SanditeSwordItem(ModToolMaterial.SANDITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item SANDITE_AXE = registerItem("sandite_axe",
            new AxeItem(ModToolMaterial.SANDITE, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item SANDITE_SHOVEL = registerItem("sandite_shovel",
            new ShovelItem(ModToolMaterial.SANDITE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item SANDITE_HOE = registerItem("sandite_hoe",
            new HoeItem(ModToolMaterial.SANDITE, -3, -1.0f, new FabricItemSettings()));
    public static final Item SANDITE_HELMET = registerItem("sandite_helmet",
            new ArmorItem(ModArmorMaterials.SANDITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SANDITE_CHESTPLATE = registerItem("sandite_chestplate",
            new ModArmorItem(ModArmorMaterials.SANDITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SANDITE_LEGGINGS = registerItem("sandite_leggings",
            new ArmorItem(ModArmorMaterials.SANDITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SANDITE_BOOTS = registerItem("sandite_boots",
            new ArmorItem(ModArmorMaterials.SANDITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item LEAFITE = registerItem("leafite", new Item(new FabricItemSettings()));

    public static final Item LEAFITE_PICKAXE = registerItem("leafite_pickaxe",
            new PickaxeItem(ModToolMaterial.LEAFITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item LEAFITE_SWORD = registerItem("leafite_sword",
            new LeafiteSwordItem(ModToolMaterial.LEAFITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item LEAFITE_AXE = registerItem("leafite_axe",
            new AxeItem(ModToolMaterial.LEAFITE, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item LEAFITE_SHOVEL = registerItem("leafite_shovel",
            new ShovelItem(ModToolMaterial.LEAFITE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item LEAFITE_HOE = registerItem("leafite_hoe",
            new HoeItem(ModToolMaterial.LEAFITE, -1, -1.0f, new FabricItemSettings()));

    public static final Item LEAFITE_HELMET = registerItem("leafite_helmet",
            new ArmorItem(ModArmorMaterials.LEAFITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LEAFITE_CHESTPLATE = registerItem("leafite_chestplate",
            new ModArmorItem(ModArmorMaterials.LEAFITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LEAFITE_LEGGINGS = registerItem("leafite_leggings",
            new ArmorItem(ModArmorMaterials.LEAFITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LEAFITE_BOOTS = registerItem("leafite_boots",
            new ArmorItem(ModArmorMaterials.LEAFITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item END_ITE = registerItem("end_ite", new Item(new FabricItemSettings()));

    public static final Item END_ITE_PICKAXE = registerItem("end_ite_pickaxe",
            new PickaxeItem(ModToolMaterial.END_ITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item END_ITE_SWORD = registerItem("end_ite_sword",
            new EndIteSwordItem(ModToolMaterial.END_ITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item END_ITE_AXE = registerItem("end_ite_axe",
            new AxeItem(ModToolMaterial.END_ITE, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item END_ITE_SHOVEL = registerItem("end_ite_shovel",
            new ShovelItem(ModToolMaterial.END_ITE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item END_ITE_HOE = registerItem("end_ite_hoe",
            new HoeItem(ModToolMaterial.END_ITE, -4, -1.0f, new FabricItemSettings()));

    public static final Item END_ITE_HELMET = registerItem("end_ite_helmet",
            new ArmorItem(ModArmorMaterials.END_ITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item END_ITE_CHESTPLATE = registerItem("end_ite_chestplate",
            new ModArmorItem(ModArmorMaterials.END_ITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item END_ITE_LEGGINGS = registerItem("end_ite_leggings",
            new ArmorItem(ModArmorMaterials.END_ITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item END_ITE_BOOTS = registerItem("end_ite_boots",
            new ArmorItem(ModArmorMaterials.END_ITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SILVER_SCALE = registerItem("silver_scale", new Item(new FabricItemSettings()));

    public static final Item SPIKED_CLUB = registerItem("spiked_club",
            new ClubItem(ModToolMaterial.CLUB, 0, -3.6f, new FabricItemSettings()));

    public static final Item SILVER_MANDIBLE = registerItem("silver_mandible",
            new Item(new FabricItemSettings().maxCount(2).rarity(Rarity.UNCOMMON)));
    public static final Item MANDIBLE_HATCHET = registerItem("mandible_hatchet",
            new MandibleAxeItem(ModToolMaterial.MANDIBLE_HATCHET, 0, -2.2f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SILVER_CARVER = registerItem("silver_carver",
            new CarverItem(ModToolMaterial.SILVER_DAGGER, 0, -1.8f, new FabricItemSettings()));
    public static final Item ICY_DAGGER = registerItem("icy_dagger",
            new IcyDaggerItem(ModToolMaterial.ICY_DAGGER, 0, -1.8f, new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item PLATINUM_CLUSTER = registerItem("platinum_cluster", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_SCRAP = registerItem("platinum_scrap", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()));

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterial.PLATINUM, 3, -2.4f, new FabricItemSettings()));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterial.PLATINUM, 1, -2.8f, new FabricItemSettings()));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterial.PLATINUM, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterial.PLATINUM, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new HoeItem(ModToolMaterial.PLATINUM, -3, 0.0f, new FabricItemSettings()));

    public static final Item PLATINUM_MULTI_TOOL = registerItem("platinum_multi_tool",
            new MultiToolItem(ModToolMaterial.PLATINUM, 1, -2.8f, new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ICE_CHUNK = registerItem("ice_chunk", new IceChunkItem(new FabricItemSettings().maxCount(16)));

    public static final Item BOMB = registerItem("bomb", new BombItem(new FabricItemSettings().maxCount(16)));
    public static final Item ICE_BOMB = registerItem("ice_bomb", new IceBombItem(new FabricItemSettings().maxCount(16)));

    public static final Item FROZEN_FLESH = registerItem("frozen_flesh",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_FLESH)));
    public static final Item SILVERPEDE_SPAWN_EGG = registerItem("silverpede_spawn_egg",
            new SpawnEggItem(ModEntities.SILVERPEDE, 0xc0c0c0,0x868686, new FabricItemSettings()));
    public static final Item JUNGLE_SPIDER_SPAWN_EGG = registerItem("jungle_spider_spawn_egg",
            new SpawnEggItem(ModEntities.JUNGLE_SPIDER, 0x3c5436,0x930c0c, new FabricItemSettings()));
    public static final Item ENDER_SPIDER_SPAWN_EGG = registerItem("ender_spider_spawn_egg",
            new SpawnEggItem(ModEntities.ENDER_SPIDER, 0x302733,0x8200a0, new FabricItemSettings()));
    public static final Item FROSITE_GOLEM_SPAWN_EGG = registerItem("frosite_golem_spawn_egg",
            new SpawnEggItem(ModEntities.FROSITE_GOLEM, 0x85adf8,0x91a3c5, new FabricItemSettings()));
    public static final Item FROSTBITEN_SPAWN_EGG = registerItem("frostbiten_spawn_egg",
            new SpawnEggItem(ModEntities.FROSTBITEN, 0x2d6849,0x839dc9, new FabricItemSettings()));
    public static final Item ICE_CUBE_SPAWN_EGG = registerItem("ice_cube_spawn_egg",
            new SpawnEggItem(ModEntities.ICE_CUBE, 0x6ca3fd,0x5682ca, new FabricItemSettings()));

    public static final Item COPPER_HANDLE = registerItem("copper_handle", new Item(new FabricItemSettings()));
    public static final Item COBALT_HANDLE = registerItem("cobalt_handle", new Item(new FabricItemSettings()));
    public static final Item COPPER_DRIVE = registerItem("copper_drive", new Item(new FabricItemSettings()));
    public static final Item POWER_DRIVE = registerItem("power_drive", new Item(new FabricItemSettings()));
    public static final Item DUEL_POWER_DRIVE = registerItem("duel_power_drive", new Item(new FabricItemSettings()));
    public static final Item HANDLED_POWER_DRIVE = registerItem("handled_power_drive",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item DUEL_HANDLED_POWER_DRIVE = registerItem("duel_handled_power_drive",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_DRILL = registerItem("iron_drill",
            new DrillItem(ModToolMaterial.POWER_IRON, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item IRON_CHAINSAW = registerItem("iron_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_IRON, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item DIAMOND_DRILL = registerItem("diamond_drill",
            new DrillItem(ModToolMaterial.POWER_DIAMOND, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item DIAMOND_CHAINSAW = registerItem("diamond_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_DIAMOND, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item GOLDEN_DRILL = registerItem("golden_drill",
            new DrillItem(ModToolMaterial.POWER_GOLD, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item GOLDEN_CHAINSAW = registerItem("golden_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_GOLD, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item FROSITE_DRILL = registerItem("frosite_drill",
            new DrillItem(ModToolMaterial.POWER_FROSITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item FROSITE_CHAINSAW = registerItem("frosite_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_FROSITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ALUMINUM_DRILL = registerItem("aluminum_drill",
            new DrillItem(ModToolMaterial.POWER_ALUMINUM, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ALUMINUM_CHAINSAW = registerItem("aluminum_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_ALUMINUM, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item NICKEL_DRILL = registerItem("nickel_drill",
            new DrillItem(ModToolMaterial.POWER_NICKEL, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item NICKEL_CHAINSAW = registerItem("nickel_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_NICKEL, 0, -2.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COPPER_DRILL = registerItem("copper_drill",
            new DrillItem(ModToolMaterial.POWER_COPPER, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COPPER_CHAINSAW = registerItem("copper_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_COPPER, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COBALT_DRILL = registerItem("cobalt_drill",
            new DrillItem(ModToolMaterial.POWER_COBALT, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COBALT_CHAINSAW = registerItem("cobalt_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_COBALT, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item STEEL_DRILL = registerItem("steel_drill",
            new DrillItem(ModToolMaterial.POWER_STEEL, 0, -2.8f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item STEEL_CHAINSAW = registerItem("steel_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_STEEL, 0, -2.8f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NETHERITE_DRILL = registerItem("netherite_drill",
            new DrillItem(ModToolMaterial.POWER_NETHERITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NETHERITE_CHAINSAW = registerItem("netherite_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_NETHERITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TUNGSTEN_DRILL = registerItem("tungsten_drill",
            new DrillItem(ModToolMaterial.POWER_TUNGSTEN, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TUNGSTEN_CHAINSAW = registerItem("tungsten_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_TUNGSTEN, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TITANIUM_DRILL = registerItem("titanium_drill",
            new DrillItem(ModToolMaterial.POWER_TITANIUM, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TITANIUM_CHAINSAW = registerItem("titanium_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_TITANIUM, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item TITANIUM_ALLOY_DRILL = registerItem("titanium_alloy_drill",
            new DrillItem(ModToolMaterial.POWER_TITANIUM_ALLOY, 0, -2.8f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TITANIUM_ALLOY_CHAINSAW = registerItem("titanium_alloy_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_TITANIUM_ALLOY, 0, -2.8f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SANDITE_DRILL = registerItem("sandite_drill",
            new DrillItem(ModToolMaterial.POWER_SANDITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SANDITE_CHAINSAW = registerItem("sandite_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_SANDITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item LEAFITE_DRILL = registerItem("leafite_drill",
            new DrillItem(ModToolMaterial.POWER_LEAFITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item LEAFITE_CHAINSAW = registerItem("leafite_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_LEAFITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item END_ITE_DRILL = registerItem("end_ite_drill",
            new DrillItem(ModToolMaterial.POWER_END_ITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item END_ITE_CHAINSAW = registerItem("end_ite_chainsaw",
            new ChainsawItem(ModToolMaterial.POWER_END_ITE, 0, -2.8f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    public static final Item STONEBARK_SIGN = registerItem("stonebark_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_STONEBARK_SIGN, ModBlocks.WALL_STONEBARK_SIGN));
    public static final Item STONEBARK_HANGING_SIGN = registerItem("stonebark_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_STONEBARK_SIGN, ModBlocks.WALL_HANGING_STONEBARK_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item DEEPBARK_SIGN = registerItem("deepbark_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_DEEPBARK_SIGN, ModBlocks.WALL_DEEPBARK_SIGN));
    public static final Item DEEPBARK_HANGING_SIGN = registerItem("deepbark_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_DEEPBARK_SIGN, ModBlocks.WALL_HANGING_DEEPBARK_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item LEAFITE_SIGN = registerItem("leafite_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_LEAFITE_SIGN, ModBlocks.WALL_LEAFITE_SIGN));
    public static final Item LEAFITE_HANGING_SIGN = registerItem("leafite_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_LEAFITE_SIGN, ModBlocks.WALL_HANGING_LEAFITE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item LEAFITE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.LEAFITE_BOAT_ID, ModBoats.LEAFITE_BOAT_KEY,false);
    public static final Item LEAFITE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.LEAFITE_CHEST_BOAT_ID, ModBoats.LEAFITE_BOAT_KEY,true);

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(OresMod.MOD_ID, name),item);
    }
    public static void registerModItems(){
        OresMod.LOGGER.info("Registering Mod Items for " + OresMod.MOD_ID);
    }
}
