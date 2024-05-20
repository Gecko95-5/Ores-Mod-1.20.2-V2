package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;


public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> FROSITE_SMELTABLES = List.of(ModBlocks.FROSITE_ORE, ModBlocks.ICE_FROSITE_ORE);

    private static final List<ItemConvertible> ALUMINUM_SMELTABLES = List.of(ModItems.RAW_ALUMINUM,ModBlocks.ALUMINUM_ORE,
            ModBlocks.DEEPSLATE_ALUMINUM_ORE,ModBlocks.COBBLESTONE_ALUMINUM_ORE);
    private static final List<ItemConvertible> ALUMINUM_NUGGET_SMELTABLES = List.of(ModItems.ALUMINUM_SWORD,
            ModItems.ALUMINUM_PICKAXE, ModItems.ALUMINUM_AXE,ModItems.ALUMINUM_SHOVEL, ModItems.ALUMINUM_HOE,
            ModItems.ALUMINUM_HELMET,ModItems.ALUMINUM_CHESTPLATE, ModItems.ALUMINUM_LEGGINGS, ModItems.ALUMINUM_BOOTS);

    private static final List<ItemConvertible> NICKEL_SMELTABLES = List.of(ModItems.RAW_NICKEL,ModBlocks.NICKEL_ORE,
            ModBlocks.DEEPSLATE_NICKEL_ORE, ModBlocks.COBBLESTONE_NICKEL_ORE);
    private static final List<ItemConvertible> NICKEL_NUGGET_SMELTABLES = List.of(ModItems.NICKEL_SWORD,
            ModItems.NICKEL_PICKAXE, ModItems.NICKEL_AXE,ModItems.NICKEL_SHOVEL, ModItems.NICKEL_HOE,
            ModItems.NICKEL_HELMET,ModItems.NICKEL_CHESTPLATE, ModItems.NICKEL_LEGGINGS, ModItems.NICKEL_BOOTS);

    private static final List<ItemConvertible> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM,ModBlocks.DEEPSLATE_TITANIUM_ORE,
            ModBlocks.COBBLESTONE_TITANIUM_ORE);

    private static final List<ItemConvertible> TUNGSTEN_SMELTABLES = List.of(ModBlocks.NETHER_TUNGSTEN_ORE);

    private static final List<ItemConvertible> COBALT_SMELTABLES = List.of(ModBlocks.NETHER_COBALT_ORE);

    private static final List<ItemConvertible> COAL_SMELTABLES = List.of(ModBlocks.COBBLESTONE_COAL_ORE,ModBlocks.GRAVEL_COAL_ORE);

    private static final List<ItemConvertible> IRON_SMELTABLES = List.of(ModBlocks.COBBLESTONE_IRON_ORE, ModBlocks.TUFF_IRON_ORE);

    private static final List<ItemConvertible> COPPER_SMELTABLES = List.of(ModBlocks.COBBLESTONE_COPPER_ORE, ModBlocks.DRIPSTONE_COPPER_ORE);

    private static final List<ItemConvertible> GOLD_SMELTABLES = List.of(ModBlocks.COBBLESTONE_GOLD_ORE, ModBlocks.TERRACOTTA_GOLD_ORE);

    private static final List<ItemConvertible> REDSTONE_SMELTABLES = List.of(ModBlocks.COBBLESTONE_REDSTONE_ORE);

    private static final List<ItemConvertible> LAPIS_SMELTABLES = List.of(ModBlocks.COBBLESTONE_LAPIS_ORE,ModBlocks.CLAY_LAPIS_ORE);

    private static final List<ItemConvertible> DIAMOND_SMELTABLES = List.of(ModBlocks.COBBLESTONE_DIAMOND_ORE, ModBlocks.SCULK_DIAMOND_ORE);

    private static final List<ItemConvertible> EMERALD_SMELTABLES = List.of(ModBlocks.COBBLESTONE_EMERALD_ORE);

    private static final List<ItemConvertible> QUARTZ_SMELTABLES = List.of(ModBlocks.COBBLESTONE_QUARTZ_ORE);

    private static final List<ItemConvertible> SANNITE_SMELTABLES = List.of(ModBlocks.SANDITE_ORE, ModBlocks.SANDSTONE_SANDITE_ORE,ModBlocks.RED_SANDSTONE_SANDITE_ORE);

    private static final List<ItemConvertible> PLATINUM_SMELTABLES = List.of(ModItems.PLATINUM_CLUSTER,ModBlocks.PLATINUM_ORE,
            ModBlocks.PLATINUM_CLUSTER_ORE);
    private static final List<ItemConvertible> END_ITE_SMELTABLES = List.of(ModBlocks.END_ITE_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, FROSITE_SMELTABLES, RecipeCategory.MISC, ModItems.FROSITE,
                0.7f, 200, "frosite");
        offerBlasting(exporter, FROSITE_SMELTABLES, RecipeCategory.MISC, ModItems.FROSITE,
                0.7f, 100, "frosite");

        offerSmelting(exporter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT,
                0.7f, 200, "aluminum");
        offerBlasting(exporter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT,
                0.7f, 100, "aluminum");

        offerSmelting(exporter, ALUMINUM_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET,
                0.7f, 200, "aluminum_nugget");
        offerBlasting(exporter, ALUMINUM_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET,
                0.7f, 100, "aluminum_nugget");

        offerSmelting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT,
                0.7f, 200, "nickel");
        offerBlasting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT,
                0.7f, 100, "nickel");

        offerSmelting(exporter, NICKEL_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_NUGGET,
                0.7f, 200, "nickel_nugget");
        offerBlasting(exporter, NICKEL_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_NUGGET,
                0.7f, 100, "nickel_nugget");

        offerSmelting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 400, "titanium");
        offerBlasting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 200, "titanium");

        offerSmelting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                0.7f, 200, "tungsten");
        offerBlasting(exporter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                0.7f, 100, "tungsten");

        offerSmelting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT,
                0.7f, 200, "cobalt");
        offerBlasting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT,
                0.7f, 100, "cobalt");

        offerSmelting(exporter, SANNITE_SMELTABLES, RecipeCategory.MISC, ModItems.SANDITE,
                0.7f, 200, "sannite");
        offerBlasting(exporter, SANNITE_SMELTABLES, RecipeCategory.MISC, ModItems.SANDITE,
                0.7f, 100, "sannite");

        offerSmelting(exporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL,
                0.7f, 200, "coal");
        offerBlasting(exporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL,
                0.7f, 100, "coal");

        offerSmelting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "iron");
        offerBlasting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "iron");

        offerSmelting(exporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 200, "copper");
        offerBlasting(exporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 100, "copper");

        offerSmelting(exporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT,
                0.7f, 200, "gold");
        offerBlasting(exporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT,
                0.7f, 100, "gold");

        offerSmelting(exporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 200, "redstone");
        offerBlasting(exporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 100, "redstone");

        offerSmelting(exporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.7f, 200, "lapis_lazuli");
        offerBlasting(exporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.7f, 100, "lapis_lazuli");

        offerSmelting(exporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND,
                0.7f, 200, "diamond");
        offerBlasting(exporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND,
                0.7f, 100, "diamond");

        offerSmelting(exporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD,
                0.7f, 200, "emerald");
        offerBlasting(exporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD,
                0.7f, 100, "emerald");

        offerSmelting(exporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ,
                0.7f, 200, "quartz");
        offerBlasting(exporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ,
                0.7f, 100, "quartz");

        offerSmelting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_SCRAP,
                0.7f, 400, "platinum");
        offerBlasting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_SCRAP,
                0.7f, 200, "platinum");

        offerSmelting(exporter, END_ITE_SMELTABLES, RecipeCategory.MISC, ModItems.END_ITE,
                0.7f, 200, "end_ite");
        offerBlasting(exporter, END_ITE_SMELTABLES, RecipeCategory.MISC, ModItems.END_ITE,
                0.7f, 100, "end_ite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.POWDERED_SALT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWDERED_SALT,20)
                .input(ModBlocks.SALT_ORE)
                .criterion(hasItem(ModBlocks.SALT_ORE), conditionsFromItem(ModBlocks.SALT_ORE))
                .offerTo(exporter, new Identifier("powered_salt_from_salt_ore"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWDERED_SALT,4)
                .input(ModItems.RAW_SALT)
                .criterion(hasItem(ModItems.RAW_SALT), conditionsFromItem(ModItems.RAW_SALT))
                .offerTo(exporter, new Identifier("powered_salt_from_raw_salt"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.WHITE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_white_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_GRAY_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_light_gray_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GRAY_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_gray_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLACK_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_black_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BROWN_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_brown_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.RED_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_red_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.ORANGE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_orange_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.YELLOW_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_yellow_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIME_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_lime_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GREEN_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_green_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.CYAN_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_cyan_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_BLUE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_light_blue_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLUE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_blue_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PURPLE_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_purple_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.MAGENTA_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_magenta_terracotta"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.TERRACOTTA,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PINK_TERRACOTTA)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                .offerTo(exporter, new Identifier("terracotta_from_pink_terracotta"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.WHITE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.WHITE_STAINED_GLASS), conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_white_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_light_gray_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GRAY_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GRAY_STAINED_GLASS), conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_gray_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLACK_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLACK_STAINED_GLASS), conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_black_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BROWN_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BROWN_STAINED_GLASS), conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_brown_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.RED_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.RED_STAINED_GLASS), conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_red_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.ORANGE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_orange_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.YELLOW_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_yellow_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIME_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIME_STAINED_GLASS), conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_lime_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GREEN_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GREEN_STAINED_GLASS), conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_green_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.CYAN_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.CYAN_STAINED_GLASS), conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_cyan_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_light_blue_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLUE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS), conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_blue_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PURPLE_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_purple_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.MAGENTA_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_magenta_stained_glass"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PINK_STAINED_GLASS)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PINK_STAINED_GLASS), conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter, new Identifier("glass_from_pink_stained_glass"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.WHITE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.WHITE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.WHITE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_white_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_light_gray_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GRAY_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GRAY_STAINED_GLASS_PANE), conditionsFromItem(Blocks.GRAY_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_gray_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLACK_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLACK_STAINED_GLASS_PANE), conditionsFromItem(Blocks.BLACK_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_black_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BROWN_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BROWN_STAINED_GLASS_PANE), conditionsFromItem(Blocks.BROWN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_brown_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.RED_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.RED_STAINED_GLASS_PANE), conditionsFromItem(Blocks.RED_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_red_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.ORANGE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_orange_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.YELLOW_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS_PANE), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_yellow_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIME_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIME_STAINED_GLASS_PANE), conditionsFromItem(Blocks.LIME_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_lime_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.GREEN_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.GREEN_STAINED_GLASS_PANE), conditionsFromItem(Blocks.GREEN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_green_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.CYAN_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.CYAN_STAINED_GLASS_PANE), conditionsFromItem(Blocks.CYAN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_cyan_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_light_blue_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.BLUE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.BLUE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_blue_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PURPLE_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS_PANE), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_purple_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.MAGENTA_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS_PANE), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_magenta_stained_glass_pane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.GLASS_PANE,1)
                .input(ModItems.POWDERED_SALT)
                .input(Blocks.PINK_STAINED_GLASS_PANE)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Blocks.PINK_STAINED_GLASS_PANE), conditionsFromItem(Blocks.PINK_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("glass_pane_from_pink_stained_glass_pane"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_FLESH,1)
                .input(ModItems.POWDERED_SALT)
                .input(Items.ROTTEN_FLESH)
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter, new Identifier("raw_flesh_from_rotten_flesh"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.RAW_FLESH), RecipeCategory.FOOD, ModItems.COOKED_FLESH, 0.35f, 200)
                .criterion(hasItem(ModItems.RAW_FLESH), conditionsFromItem(ModItems.RAW_FLESH))
                .offerTo(exporter, new Identifier("cooked_flesh_from_smelting"));
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems
                        (ModItems.RAW_FLESH), RecipeCategory.FOOD, ModItems.COOKED_FLESH, 0.35f, 100)
                .criterion(hasItem(ModItems.RAW_FLESH), conditionsFromItem(ModItems.RAW_FLESH))
                .offerTo(exporter, new Identifier("cooked_flesh_from_smoking"));
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems
                        (ModItems.RAW_FLESH), RecipeCategory.FOOD, ModItems.COOKED_FLESH, 0.35f, 600)
                .criterion(hasItem(ModItems.RAW_FLESH), conditionsFromItem(ModItems.RAW_FLESH))
                .offerTo(exporter, new Identifier("cooked_flesh_from_campfire_cooking"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.FROSITE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.BLUE_ICE,1)
                .pattern(" F ")
                .pattern("FIF")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('I', Blocks.ICE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Blocks.ICE), conditionsFromItem(Blocks.ICE))
                .offerTo(exporter, new Identifier("blue_ice_from_ice_with_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.BLUE_ICE,4)
                .pattern(" F ")
                .pattern("FIF")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('I', Blocks.PACKED_ICE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Blocks.PACKED_ICE), conditionsFromItem(Blocks.PACKED_ICE))
                .offerTo(exporter, new Identifier("blue_ice_from_packed_with_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.BLUE_ICE,8)
                .pattern(" F ")
                .pattern("FIF")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('I', Blocks.BLUE_ICE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Blocks.BLUE_ICE), conditionsFromItem(Blocks.BLUE_ICE))
                .offerTo(exporter, new Identifier("blue_ice_from_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICKS,4)
                .pattern("IF")
                .pattern("FI")
                .input('F', ModBlocks.FROSITE_BLOCK)
                .input('I', ModItems.FROSITE)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("frosite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICKS, ModBlocks.FROSITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILES,4)
                .pattern("FF")
                .pattern("FF")
                .input('F', ModBlocks.FROSITE_BLOCK)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .offerTo(exporter, new Identifier("frosite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILES, ModBlocks.FROSITE_BLOCK);

        createStairsRecipe(ModBlocks.FROSITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.FROSITE_BRICKS))
                .criterion(hasItem(ModBlocks.FROSITE_BRICKS),conditionsFromItem(ModBlocks.FROSITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROSITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_STAIRS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_STAIRS, ModBlocks.FROSITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_BRICK_WALL, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_BRICK_WALL, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_BRICK_WALL, ModBlocks.FROSITE_BRICKS);

        createStairsRecipe(ModBlocks.FROSITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.FROSITE_TILES))
                .criterion(hasItem(ModBlocks.FROSITE_TILES),conditionsFromItem(ModBlocks.FROSITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROSITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_STAIRS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_STAIRS, ModBlocks.FROSITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_SLAB, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_SLAB, ModBlocks.FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROSITE_TILE_SLAB, ModBlocks.FROSITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_TILE_WALL, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_TILE_WALL, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.FROSITE_TILE_WALL, ModBlocks.FROSITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FROSITE,4)
                .pattern("BBB")
                .pattern("BFB")
                .pattern("BBB")
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("chiseled_frosite"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FROSITE,18)
                .input(ModBlocks.CHISELED_FROSITE)
                .criterion(hasItem(ModBlocks.CHISELED_FROSITE), conditionsFromItem(ModBlocks.CHISELED_FROSITE))
                .offerTo(exporter, new Identifier("frosite_from_chiseled_frosite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_SWORD)
                .pattern("F")
                .pattern("F")
                .pattern("S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_PICKAXE)
                .pattern("FFF")
                .pattern(" S ")
                .pattern(" S ")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_AXE)
                .pattern("FF")
                .pattern("FS")
                .pattern(" S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_SHOVEL)
                .pattern("F")
                .pattern("S")
                .pattern("S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_HOE)
                .pattern("FF")
                .pattern(" S")
                .pattern(" S")
                .input('F', ModItems.FROSITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("frosite_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CIC")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("copper_handle"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_DRIVE)
                .pattern("CIC")
                .pattern("IRI")
                .pattern("CIC")
                .input('C', Items.COPPER_INGOT)
                .input('I', Items.IRON_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("copper_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWER_DRIVE)
                .pattern(" I ")
                .pattern("ICI")
                .pattern(" I ")
                .input('C', ModItems.COPPER_DRIVE)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("power_drive"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HANDLED_POWER_DRIVE)
                .input(ModItems.POWER_DRIVE)
                .input(ModItems.COPPER_HANDLE)
                .criterion(hasItem(ModItems.POWER_DRIVE), conditionsFromItem(ModItems.POWER_DRIVE))
                .criterion(hasItem(ModItems.COPPER_HANDLE), conditionsFromItem(ModItems.COPPER_HANDLE))
                .offerTo(exporter, new Identifier("handled_power_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.IRON_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("iron_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.IRON_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("iron_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_DRILL)
                .pattern(" D ")
                .pattern("DBP")
                .pattern(" D ")
                .input('D', Items.DIAMOND)
                .input('B', Items.DIAMOND_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("diamond_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_CHAINSAW)
                .pattern("  P")
                .pattern("DDB")
                .input('D', Items.DIAMOND)
                .input('B', Items.DIAMOND_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("diamond_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_DRILL)
                .pattern(" G ")
                .pattern("GBP")
                .pattern(" G ")
                .input('G', Items.GOLD_INGOT)
                .input('B', Items.GOLD_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("golden_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_CHAINSAW)
                .pattern("  P")
                .pattern("GGB")
                .input('G', Items.GOLD_INGOT)
                .input('B', Items.GOLD_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("golden_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_DRILL)
                .pattern(" F ")
                .pattern("FBP")
                .pattern(" F ")
                .input('F', ModItems.FROSITE)
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("frosite_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FROSITE_CHAINSAW)
                .pattern("  P")
                .pattern("FFB")
                .input('F', ModItems.FROSITE)
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("frosite_chainsaw"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ALUMINUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ALUMINUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(ModItems.ALUMINUM_NUGGET), conditionsFromItem(ModItems.ALUMINUM_NUGGET))
                .offerTo(exporter, new Identifier("aluminum_ingot_from_aluminum_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET,9)
                .input(ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_nugget_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_SWORD)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_PICKAXE)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_AXE)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_SHOVEL)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_HOE)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("aluminum_hoe"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLINT_AND_ALUMINUM)
                .input(ModItems.ALUMINUM_INGOT)
                .input(Items.FLINT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier("flint_and_aluminum"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINUM_BOOTS)
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ALUMINUM_DOOR,3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ALUMINUM_TRAPDOOR)
                .pattern("AA")
                .pattern("AA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ALUMINUM_BARS,16)
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_bars"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.ACTIVATOR_RAIL,6)
                .pattern("ASA")
                .pattern("ARA")
                .pattern("ASA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .input('R', Items.REDSTONE_TORCH)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                .offerTo(exporter, new Identifier("activator_rail_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Blocks.ANVIL)
                .pattern("BBB")
                .pattern(" A ")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('B', ModBlocks.ALUMINUM_BLOCK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .offerTo(exporter, new Identifier("anvil_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Blocks.BLAST_FURNACE)
                .pattern("AAA")
                .pattern("AFA")
                .pattern("SSS")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('F', Blocks.FURNACE)
                .input('S', Blocks.SMOOTH_STONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.FURNACE), conditionsFromItem(Blocks.FURNACE))
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter, new Identifier("blast_furnace_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.BUCKET)
                .pattern("A A")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("bucket_from_aluminum_ingot"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Blocks.CAULDRON)
                .pattern("A A")
                .pattern("A A")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("cauldron_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Blocks.CHAIN)
                .pattern("N")
                .pattern("A")
                .pattern("N")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('N', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .offerTo(exporter, new Identifier("chain_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.COMPASS)
                .pattern(" A ")
                .pattern("ARA")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("compass_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CROSSBOW)
                .pattern("SAS")
                .pattern("THT")
                .pattern(" S ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .input('T', Items.STRING)
                .input('H', Items.TRIPWIRE_HOOK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
                .offerTo(exporter, new Identifier("crossbow_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.DETECTOR_RAIL,6)
                .pattern("A A")
                .pattern("ASA")
                .pattern("ARA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Blocks.STONE_PRESSURE_PLATE)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.STONE_PRESSURE_PLATE), conditionsFromItem(Blocks.STONE_PRESSURE_PLATE))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("detector_rail_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.HOPPER)
                .pattern("A A")
                .pattern("ACA")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('C', Blocks.CHEST)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST))
                .offerTo(exporter, new Identifier("hopper_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.MINECART)
                .pattern("A A")
                .pattern("AAA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("minecart_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.RAIL,16)
                .pattern("A A")
                .pattern("ASA")
                .pattern("A A")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("rail_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.SHEARS)
                .pattern(" A")
                .pattern("A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("shears_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.STONECUTTER)
                .pattern(" A ")
                .pattern("SSS")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('S', Blocks.STONE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter, new Identifier("stonecutter_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CAC")
                .input('C', Items.COPPER_INGOT)
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("copper_handle_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_DRIVE)
                .pattern("CAC")
                .pattern("ARA")
                .pattern("CAC")
                .input('C', Items.COPPER_INGOT)
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("copper_drive_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POWER_DRIVE)
                .pattern(" A ")
                .pattern("ACA")
                .pattern(" A ")
                .input('C', ModItems.COPPER_DRIVE)
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("power_drive_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_DRILL)
                .pattern(" A ")
                .pattern("ABP")
                .pattern(" A ")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('B', ModBlocks.ALUMINUM_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("aluminum_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINUM_CHAINSAW)
                .pattern("  P")
                .pattern("AAB")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('B', ModBlocks.ALUMINUM_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("aluminum_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.LANTERN)
                .pattern("AAA")
                .pattern("ATA")
                .pattern("AAA")
                .input('T', Items.TORCH)
                .input('A', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("lantern_from_aluminum_nugget"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.SOUL_LANTERN)
                .pattern("AAA")
                .pattern("ATA")
                .pattern("AAA")
                .input('T', Items.SOUL_TORCH)
                .input('A', ModItems.ALUMINUM_NUGGET)
                .criterion(hasItem(Items.SOUL_TORCH), conditionsFromItem(Items.SOUL_TORCH))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("soul_lantern_from_aluminum_nugget"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ALUMINUM_PRESSURE_PLATE)
                .pattern("AA")
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("aluminum_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NICKEL_PRESSURE_PLATE)
                .pattern("NN")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_pressure_plate"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NICKEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.NICKEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_NICKEL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_NICKEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_INGOT)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_NUGGET)
                .criterion(hasItem(ModItems.NICKEL_NUGGET), conditionsFromItem(ModItems.NICKEL_NUGGET))
                .offerTo(exporter, new Identifier("nickel_ingot_from_nickel_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_NUGGET,9)
                .input(ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_nugget_from_nickel_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_APPLE)
                .pattern("NNN")
                .pattern("NAN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_INGOT)
                .input('A', Items.APPLE)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier("nickel_apple"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_BEETROOT)
                .pattern("NNN")
                .pattern("NBN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_NUGGET)
                .input('B', Items.BEETROOT)
                .criterion(hasItem(ModItems.NICKEL_NUGGET), conditionsFromItem(ModItems.NICKEL_NUGGET))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, new Identifier("nickel_beetroot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_SWORD)
                .pattern("N")
                .pattern("N")
                .pattern("S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_PICKAXE)
                .pattern("NNN")
                .pattern(" S ")
                .pattern(" S ")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_AXE)
                .pattern("NN")
                .pattern("NS")
                .pattern(" S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_SHOVEL)
                .pattern("N")
                .pattern("S")
                .pattern("S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_HOE)
                .pattern("NN")
                .pattern(" S")
                .pattern(" S")
                .input('N', ModItems.NICKEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("nickel_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("copper_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_HELMET)
                .pattern("NNN")
                .pattern("N N")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_CHESTPLATE)
                .pattern("N N")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_LEGGINGS)
                .pattern("NNN")
                .pattern("N N")
                .pattern("N N")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NICKEL_BOOTS)
                .pattern("N N")
                .pattern("N N")
                .input('N', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier("nickel_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("copper_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_DRILL)
                .pattern(" N ")
                .pattern("NBP")
                .pattern(" N ")
                .input('N', ModItems.NICKEL_INGOT)
                .input('B', ModBlocks.NICKEL_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(ModBlocks.NICKEL_BLOCK), conditionsFromItem(ModBlocks.NICKEL_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("nickel_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_CHAINSAW)
                .pattern("  P")
                .pattern("NNB")
                .input('N', ModItems.NICKEL_INGOT)
                .input('B', ModBlocks.NICKEL_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(ModBlocks.NICKEL_BLOCK), conditionsFromItem(ModBlocks.NICKEL_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("nickel_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_DRILL)
                .pattern(" C ")
                .pattern("CBP")
                .pattern(" C ")
                .input('C', Items.COPPER_INGOT)
                .input('B', Blocks.COPPER_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Blocks.COPPER_BLOCK), conditionsFromItem(Blocks.COPPER_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("copper_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_CHAINSAW)
                .pattern("  P")
                .pattern("CCB")
                .input('C', Items.COPPER_INGOT)
                .input('B', Blocks.COPPER_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Blocks.COPPER_BLOCK), conditionsFromItem(Blocks.COPPER_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("copper_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_BALL)
                .pattern(" I ")
                .pattern("I I")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("iron_ball"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUMINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.IRON_BALL)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.IRON_BALL), conditionsFromItem(ModItems.IRON_BALL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUMINUM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.IRON_BALL)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.IRON_BALL), conditionsFromItem(ModItems.IRON_BALL))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.IRON_BALL)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.IRON_BALL), conditionsFromItem(ModItems.IRON_BALL))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKEL)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKEL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKINUM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPER)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKEL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPINUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUCKEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUMINUM)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUMINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUMINUM))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUCKEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPER)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPER))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUMINUM)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUMINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUMINUM))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUPPER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKOPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKEL)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKEL))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKOPPER)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPELUNUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPEL)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPEL), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPEL))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPELUNUM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKOPPINUM)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKOPPER)
                .input('#', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKOPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKOPPER))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKOPPINUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUPPEREL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUPPER)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUPPER))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUPPEREL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_COPPINUCKEL)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPINUM)
                .input('#', ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPINUM))
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_COPPINUCKEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_ALUNICKOPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUCKEL)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUCKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUCKEL))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_ALUNICKOPPER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND_NICKINUPPER)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKINUM)
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKINUM))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COMPOUND_NICKINUPPER)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPELUNUM)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPELUNUM), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPELUNUM))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_coppelinum"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKOPPINUM)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKOPPINUM), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKOPPINUM))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_nickoppinum"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUPPEREL)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUPPEREL), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUPPEREL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_alupperel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_COPPINUCKEL)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_COPPINUCKEL), conditionsFromItem(ModItems.STEEL_COMPOUND_COPPINUCKEL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_coppinuckel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_ALUNICKOPPER)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_ALUNICKOPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_ALUNICKOPPER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_alunickopper"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COMPOUND)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', ModItems.STEEL_COMPOUND_NICKINUPPER)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_COMPOUND_NICKINUPPER), conditionsFromItem(ModItems.STEEL_COMPOUND_NICKINUPPER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("steel_compound_form_steel_compound_nickinupper"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_STEEL)
                .pattern("SSS")
                .pattern("SII")
                .pattern("II ")
                .input('S', ModItems.STEEL_COMPOUND)
                .input('I', Items.RAW_IRON)
                .criterion(hasItem(ModItems.STEEL_COMPOUND), conditionsFromItem(ModItems.STEEL_COMPOUND))
                .criterion(hasItem(Items.RAW_IRON), conditionsFromItem(Items.RAW_IRON))
                .offerTo(exporter, new Identifier("raw_steel_from_steel_compound"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.RAW_STEEL), RecipeCategory.MISC, ModItems.STEEL_INGOT,0.7f, 2000)
                .criterion(hasItem(ModItems.RAW_STEEL), conditionsFromItem(ModItems.RAW_STEEL))
                .offerTo(exporter, new Identifier("steel_ingot_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModItems.RAW_STEEL), RecipeCategory.MISC, ModItems.STEEL_INGOT,0.7f, 1000)
                .criterion(hasItem(ModItems.RAW_STEEL), conditionsFromItem(ModItems.RAW_STEEL))
                .offerTo(exporter, new Identifier("steel_ingot_from_blasting"));

        offerSmithingTemplateCopyingRecipe(exporter, ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE, Blocks.DEEPSLATE);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_STEEL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_STEEL_BLOCK);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.RAW_STEEL_BLOCK), RecipeCategory.MISC, ModBlocks.SMOOTH_STEEL_BLOCK,0.7f, 2000)
                .criterion(hasItem(ModBlocks.RAW_STEEL_BLOCK), conditionsFromItem(ModBlocks.RAW_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("smooth_steel_block_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModBlocks.RAW_STEEL_BLOCK), RecipeCategory.MISC, ModBlocks.SMOOTH_STEEL_BLOCK,0.7f, 1000)
                .criterion(hasItem(ModBlocks.RAW_STEEL_BLOCK), conditionsFromItem(ModBlocks.RAW_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("smooth_steel_block_from_blasting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.SMOOTH_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_STEEL_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("cut_steel"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL, ModBlocks.SMOOTH_STEEL_BLOCK);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STEEL_SLAB, ModBlocks.SMOOTH_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STEEL_SLAB, ModBlocks.SMOOTH_STEEL_BLOCK,2);

        createStairsRecipe(ModBlocks.CUT_STEEL_STAIRS, Ingredient.ofItems(ModBlocks.CUT_STEEL))
                .criterion(hasItem(ModBlocks.CUT_STEEL),conditionsFromItem(ModBlocks.CUT_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_STEEL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_STAIRS, ModBlocks.SMOOTH_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_STAIRS, ModBlocks.CUT_STEEL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_SLAB, ModBlocks.CUT_STEEL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_SLAB, ModBlocks.SMOOTH_STEEL_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_SLAB, ModBlocks.CUT_STEEL,2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_APPLE)
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .input('S', ModBlocks.STEEL_BLOCK)
                .input('A', Items.APPLE)
                .criterion(hasItem(ModBlocks.STEEL_BLOCK), conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier("steel_apple"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_BEETROOT)
                .pattern("SSS")
                .pattern("SBS")
                .pattern("SSS")
                .input('S', ModItems.STEEL_INGOT)
                .input('B', Items.BEETROOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, new Identifier("steel_beetroot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.SMOOTH_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_STEEL_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("steel_door_from_smooth_steel_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_TRAPDOOR)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_TRAPDOOR)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.SMOOTH_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.SMOOTH_STEEL_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("steel_trapdoor_from_smooth_steel_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STEEL_BARS,16)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_bars"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_PRESSURE_PLATE)
                .pattern("SS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier("steel_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STEEL_LAMP)
                .pattern("SBS")
                .pattern("BGB")
                .pattern("SBS")
                .input('S', ModItems.STEEL_INGOT)
                .input('B', ModBlocks.STEEL_BARS)
                .input('G', Blocks.GLOWSTONE)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModBlocks.STEEL_BARS), conditionsFromItem(ModBlocks.STEEL_BARS))
                .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(exporter, new Identifier("steel_lamp"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STEEL_LAMP)
                .pattern("SBS")
                .pattern("BGB")
                .pattern("SBS")
                .input('S', ModBlocks.SMOOTH_STEEL_BLOCK)
                .input('B', ModBlocks.STEEL_BARS)
                .input('G', Blocks.GLOWSTONE)
                .criterion(hasItem(ModBlocks.SMOOTH_STEEL_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_STEEL_BLOCK))
                .criterion(hasItem(ModBlocks.STEEL_BARS), conditionsFromItem(ModBlocks.STEEL_BARS))
                .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(exporter, new Identifier("steel_lamp_from_smooth_steel_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STONEBARK_LOG), conditionsFromItem(ModBlocks.STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stonebark_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STRIPPED_STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_STONEBARK_LOG), conditionsFromItem(ModBlocks.STRIPPED_STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stripped_stonebark_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STONEBARK_WOOD)
                .criterion(hasItem(ModBlocks.STONEBARK_WOOD), conditionsFromItem(ModBlocks.STONEBARK_WOOD))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stonebark_wood"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_PLANKS,4)
                .input(ModBlocks.STRIPPED_STONEBARK_WOOD)
                .criterion(hasItem(ModBlocks.STRIPPED_STONEBARK_WOOD), conditionsFromItem(ModBlocks.STRIPPED_STONEBARK_WOOD))
                .offerTo(exporter, new Identifier("stonebark_planks_from_stripped_stonebark_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STONEBARK_LOG), conditionsFromItem(ModBlocks.STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stonebark_wood"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_STONEBARK_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STRIPPED_STONEBARK_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_STONEBARK_LOG), conditionsFromItem(ModBlocks.STRIPPED_STONEBARK_LOG))
                .offerTo(exporter, new Identifier("stripped_stonebark_wood"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.DEEPSLATE_LOG), conditionsFromItem(ModBlocks.DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("deepslate_planks_from_deepslate_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.STRIPPED_DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_DEEPSLATE_LOG), conditionsFromItem(ModBlocks.STRIPPED_DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("deepslate_planks_from_stripped_deepslate_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.DEEPSLATE_WOOD)
                .criterion(hasItem(ModBlocks.DEEPSLATE_WOOD), conditionsFromItem(ModBlocks.DEEPSLATE_WOOD))
                .offerTo(exporter, new Identifier("deepslate_planks_from_deepslate_wood"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_PLANKS,4)
                .input(ModBlocks.STRIPPED_DEEPSLATE_WOOD)
                .criterion(hasItem(ModBlocks.STRIPPED_DEEPSLATE_WOOD), conditionsFromItem(ModBlocks.STRIPPED_DEEPSLATE_WOOD))
                .offerTo(exporter, new Identifier("deepslate_planks_from_stripped_deepslate_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.DEEPSLATE_LOG), conditionsFromItem(ModBlocks.DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("deepslate_wood"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DEEPSLATE_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STRIPPED_DEEPSLATE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_DEEPSLATE_LOG), conditionsFromItem(ModBlocks.STRIPPED_DEEPSLATE_LOG))
                .offerTo(exporter, new Identifier("stripped_deepslate_wood"));

        createStairsRecipe(ModBlocks.STONEBARK_STAIRS, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_STAIRS)));
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONEBARK_SLAB, ModBlocks.STONEBARK_PLANKS);
        createFenceRecipe(ModBlocks.STONEBARK_FENCE, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_FENCE)));
        createFenceGateRecipe(ModBlocks.STONEBARK_FENCE_GATE, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_FENCE_GATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_BUTTON)
                .input(ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_PRESSURE_PLATE)
                .pattern("SS")
                .input('S', ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_PRESSURE_PLATE)));

        createStairsRecipe(ModBlocks.DEEPBARK_STAIRS, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_STAIRS)));
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPBARK_SLAB, ModBlocks.DEEPSLATE_PLANKS);
        createFenceRecipe(ModBlocks.DEEPBARK_FENCE, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_FENCE)));
        createFenceGateRecipe(ModBlocks.DEEPBARK_FENCE_GATE, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_FENCE_GATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_BUTTON)
                .input(ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_PRESSURE_PLATE)
                .pattern("SS")
                .input('S', ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STONEBARK_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.STONEBARK_PLANKS)
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS), conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONEBARK_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPBARK_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.DEEPSLATE_PLANKS)
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS), conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPBARK_TRAPDOOR)));

        createSignRecipe(ModItems.STONEBARK_SIGN, Ingredient.ofItems(ModBlocks.STONEBARK_PLANKS))
                .criterion(hasItem(ModBlocks.STONEBARK_PLANKS),conditionsFromItem(ModBlocks.STONEBARK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONEBARK_SIGN)));

        createSignRecipe(ModItems.DEEPBARK_SIGN, Ingredient.ofItems(ModBlocks.DEEPSLATE_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPSLATE_PLANKS),conditionsFromItem(ModBlocks.DEEPSLATE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DEEPBARK_SIGN)));

        offerHangingSignRecipe(exporter, ModItems.STONEBARK_HANGING_SIGN, ModBlocks.STRIPPED_STONEBARK_WOOD);
        offerHangingSignRecipe(exporter, ModItems.DEEPBARK_HANGING_SIGN, ModBlocks.STRIPPED_DEEPSLATE_WOOD);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_TITANIUM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TITANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE)
                .pattern("TT")
                .pattern("TS")
                .pattern(" S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE)
                .pattern("TT")
                .pattern(" S")
                .pattern(" S")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("titanium_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_HELMET)
                .pattern("TTT")
                .pattern("T T")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_CHESTPLATE)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_LEGGINGS)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TITANIUM_BOOTS)
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_boots"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUNGSTEN_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TUNGSTEN_NUGGET)
                .criterion(hasItem(ModItems.TUNGSTEN_NUGGET), conditionsFromItem(ModItems.TUNGSTEN_NUGGET))
                .offerTo(exporter, new Identifier("tungsten_ingot_from_tungsten_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TUNGSTEN_NUGGET,9)
                .input(ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_nugget_from_tungsten_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_PICKAXE)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_AXE)
                .pattern("TT")
                .pattern("TS")
                .pattern(" S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SHOVEL)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_HOE)
                .pattern("TT")
                .pattern(" S")
                .pattern(" S")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("tungsten_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_HELMET)
                .pattern("TTT")
                .pattern("T T")
                .pattern(" T ")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_CHESTPLATE)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_LEGGINGS)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_BOOTS)
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(exporter, new Identifier("tungsten_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_ALLOY_SCRAP)
                .pattern(" N ")
                .pattern("NTN")
                .pattern(" N ")
                .input('N', ModItems.TUNGSTEN_NUGGET)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_NUGGET), conditionsFromItem(ModItems.TUNGSTEN_NUGGET))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_alloy_scrap"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_ALLOY_INGOT)
                .pattern("TTT")
                .pattern("TAA")
                .pattern("AA ")
                .input('T', ModItems.TITANIUM_ALLOY_SCRAP)
                .input('A', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_SCRAP), conditionsFromItem(ModItems.TITANIUM_ALLOY_SCRAP))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("titanium_alloy_ingot_from_titanium_alloy_scrap"));


        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TITANIUM_ALLOY_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_ALLOY_BLOCK);

        offerSmithingTemplateCopyingRecipe(exporter, ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE, Items.OBSIDIAN);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.OBSERVER)
                .pattern("CCC")
                .pattern("RRT")
                .pattern("CCC")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('C', Blocks.COBBLESTONE)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier("observer_from_titanium_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.COMPARATOR)
                .pattern(" R ")
                .pattern("RTR")
                .pattern("SSS")
                .input('T', ModItems.TITANIUM_INGOT)
                .input('S', Blocks.STONE)
                .input('R', Items.REDSTONE_TORCH)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                .offerTo(exporter, new Identifier("comparator_from_titanium_ingot"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COBALT_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBALT_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_INGOT)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COBALT_NUGGET)
                .criterion(hasItem(ModItems.COBALT_NUGGET), conditionsFromItem(ModItems.COBALT_NUGGET))
                .offerTo(exporter, new Identifier("cobalt_ingot_from_cobalt_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_NUGGET,9)
                .input(ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_nugget_from_cobalt_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_AXE)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_HOE)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', ModItems.COBALT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("cobalt_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("cobalt_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CIC")
                .input('C', ModItems.COBALT_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("cobalt_handle"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBALT_HANDLE)
                .pattern(" C ")
                .pattern("C C")
                .pattern("CIC")
                .input('C', ModItems.COBALT_INGOT)
                .input('I', ModItems.ALUMINUM_INGOT)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .offerTo(exporter, new Identifier("cobalt_handle_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUEL_POWER_DRIVE)
                .pattern("PIC")
                .pattern("III")
                .pattern("CIP")
                .input('C', ModItems.COPPER_DRIVE)
                .input('I', Items.IRON_INGOT)
                .input('P', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("duel_power_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUEL_POWER_DRIVE)
                .pattern("PIC")
                .pattern("III")
                .pattern("CIP")
                .input('C', ModItems.COPPER_DRIVE)
                .input('I', ModItems.ALUMINUM_INGOT)
                .input('P', Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.COPPER_DRIVE), conditionsFromItem(ModItems.COPPER_DRIVE))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier("duel_power_drive_from_aluminum_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUEL_HANDLED_POWER_DRIVE)
                .input(ModItems.DUEL_POWER_DRIVE)
                .input(ModItems.COBALT_HANDLE)
                .criterion(hasItem(ModItems.DUEL_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_POWER_DRIVE))
                .criterion(hasItem(ModItems.COBALT_HANDLE), conditionsFromItem(ModItems.COBALT_HANDLE))
                .offerTo(exporter, new Identifier("duel_handled_power_drive"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', Items.NETHERITE_SCRAP)
                .input('B', Items.NETHERITE_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("netherite_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', Items.NETHERITE_SCRAP)
                .input('B', Items.NETHERITE_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("netherite_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.STEEL_COMPOUND)
                .input('B', ModItems.STEEL_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.STEEL_COMPOUND), conditionsFromItem(ModItems.STEEL_COMPOUND))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("steel_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.STEEL_COMPOUND)
                .input('B', ModItems.STEEL_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.STEEL_COMPOUND), conditionsFromItem(ModItems.STEEL_COMPOUND))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("steel_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_ALLOY_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.TITANIUM_ALLOY_SCRAP)
                .input('B', ModItems.TITANIUM_ALLOY_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_SCRAP), conditionsFromItem(ModItems.TITANIUM_ALLOY_SCRAP))
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_INGOT), conditionsFromItem(ModItems.TITANIUM_ALLOY_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_alloy_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_ALLOY_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.TITANIUM_ALLOY_SCRAP)
                .input('B', ModItems.TITANIUM_ALLOY_INGOT)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_SCRAP), conditionsFromItem(ModItems.TITANIUM_ALLOY_SCRAP))
                .criterion(hasItem(ModItems.TITANIUM_ALLOY_INGOT), conditionsFromItem(ModItems.TITANIUM_ALLOY_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_alloy_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.COBALT_INGOT)
                .input('B', ModBlocks.COBALT_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(ModBlocks.COBALT_BLOCK), conditionsFromItem(ModBlocks.COBALT_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("cobalt_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.COBALT_INGOT)
                .input('B', ModBlocks.COBALT_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(ModBlocks.COBALT_BLOCK), conditionsFromItem(ModBlocks.COBALT_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("cobalt_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('B', ModBlocks.TUNGSTEN_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(ModBlocks.TUNGSTEN_BLOCK), conditionsFromItem(ModBlocks.TUNGSTEN_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("tungsten_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.TUNGSTEN_INGOT)
                .input('B', ModBlocks.TUNGSTEN_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .criterion(hasItem(ModBlocks.TUNGSTEN_BLOCK), conditionsFromItem(ModBlocks.TUNGSTEN_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("tungsten_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_DRILL)
                .pattern(" I ")
                .pattern("IBP")
                .pattern(" I ")
                .input('I', ModItems.TITANIUM_INGOT)
                .input('B', ModBlocks.TITANIUM_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(ModBlocks.TITANIUM_BLOCK), conditionsFromItem(ModBlocks.TITANIUM_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_CHAINSAW)
                .pattern("  P")
                .pattern("IIB")
                .input('I', ModItems.TITANIUM_INGOT)
                .input('B', ModBlocks.TITANIUM_BLOCK)
                .input('P', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(ModBlocks.TITANIUM_BLOCK), conditionsFromItem(ModBlocks.TITANIUM_BLOCK))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("titanium_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.WHITE_SAND)
                .criterion(hasItem(ModBlocks.WHITE_SAND), conditionsFromItem(ModBlocks.WHITE_SAND))
                .offerTo(exporter, new Identifier("white_sandstone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.WHITE_SANDSTONE)
                .criterion(hasItem(ModBlocks.WHITE_SANDSTONE), conditionsFromItem(ModBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier("cut_white_sandstone"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE, ModBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_WHITE_SANDSTONE, ModBlocks.WHITE_SANDSTONE);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE_SLAB, ModBlocks.CUT_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE_SLAB, ModBlocks.CUT_WHITE_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WHITE_SANDSTONE_SLAB, ModBlocks.WHITE_SANDSTONE,2);

        createStairsRecipe(ModBlocks.WHITE_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_SANDSTONE))
                .criterion(hasItem(ModBlocks.WHITE_SANDSTONE),conditionsFromItem(ModBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE_STAIRS, ModBlocks.WHITE_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE_SLAB, ModBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SANDSTONE_SLAB, ModBlocks.WHITE_SANDSTONE,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.WHITE_SANDSTONE_WALL, ModBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.WHITE_SANDSTONE_WALL, ModBlocks.WHITE_SANDSTONE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_WHITE_SANDSTONE, ModBlocks.WHITE_SANDSTONE_SLAB);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.WHITE_SANDSTONE), RecipeCategory.MISC, ModBlocks.SMOOTH_WHITE_SANDSTONE,0.7f, 200)
                .criterion(hasItem(ModBlocks.WHITE_SANDSTONE), conditionsFromItem(ModBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier("smooth_white_sandstone_from_smelting"));

        createStairsRecipe(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_WHITE_SANDSTONE))
                .criterion(hasItem(ModBlocks.SMOOTH_WHITE_SANDSTONE),conditionsFromItem(ModBlocks.SMOOTH_WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS, ModBlocks.SMOOTH_WHITE_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, ModBlocks.SMOOTH_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, ModBlocks.SMOOTH_WHITE_SANDSTONE,2);



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.BLACK_SAND)
                .criterion(hasItem(ModBlocks.BLACK_SAND), conditionsFromItem(ModBlocks.BLACK_SAND))
                .offerTo(exporter, new Identifier("black_sandstone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.BLACK_SANDSTONE)
                .criterion(hasItem(ModBlocks.BLACK_SANDSTONE), conditionsFromItem(ModBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier("cut_black_sandstone"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE, ModBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLACK_SANDSTONE, ModBlocks.BLACK_SANDSTONE);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE_SLAB, ModBlocks.CUT_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE_SLAB, ModBlocks.CUT_BLACK_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACK_SANDSTONE_SLAB, ModBlocks.BLACK_SANDSTONE,2);

        createStairsRecipe(ModBlocks.BLACK_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.BLACK_SANDSTONE))
                .criterion(hasItem(ModBlocks.BLACK_SANDSTONE),conditionsFromItem(ModBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE_STAIRS, ModBlocks.BLACK_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE_SLAB, ModBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SANDSTONE_SLAB, ModBlocks.BLACK_SANDSTONE,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLACK_SANDSTONE_WALL, ModBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLACK_SANDSTONE_WALL, ModBlocks.BLACK_SANDSTONE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLACK_SANDSTONE, ModBlocks.BLACK_SANDSTONE_SLAB);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModBlocks.BLACK_SANDSTONE), RecipeCategory.MISC, ModBlocks.SMOOTH_BLACK_SANDSTONE,0.7f, 200)
                .criterion(hasItem(ModBlocks.BLACK_SANDSTONE), conditionsFromItem(ModBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier("smooth_black_sandstone_from_smelting"));

        createStairsRecipe(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_BLACK_SANDSTONE))
                .criterion(hasItem(ModBlocks.SMOOTH_BLACK_SANDSTONE),conditionsFromItem(ModBlocks.SMOOTH_BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS, ModBlocks.SMOOTH_BLACK_SANDSTONE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, ModBlocks.SMOOTH_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, ModBlocks.SMOOTH_BLACK_SANDSTONE,2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.LAVA_TANK)
                .pattern("TGT")
                .pattern("GBG")
                .pattern("TGT")
                .input('T', ModBlocks.TUNGSTEN_BLOCK)
                .input('G', Items.GLASS)
                .input('B', Items.LAVA_BUCKET)
                .criterion(hasItem(ModBlocks.TUNGSTEN_BLOCK), conditionsFromItem(ModBlocks.TUNGSTEN_BLOCK))
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET))
                .offerTo(exporter, new Identifier("lava_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.WATER_TANK)
                .pattern("TGT")
                .pattern("GBG")
                .pattern("TGT")
                .input('T', ModBlocks.TUNGSTEN_BLOCK)
                .input('G', Items.GLASS)
                .input('B', Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.TUNGSTEN_BLOCK), conditionsFromItem(ModBlocks.TUNGSTEN_BLOCK))
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("water_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.MILK_TANK)
                .pattern("TGT")
                .pattern("GBG")
                .pattern("TGT")
                .input('T', ModBlocks.TUNGSTEN_BLOCK)
                .input('G', Items.GLASS)
                .input('B', Items.MILK_BUCKET)
                .criterion(hasItem(ModBlocks.TUNGSTEN_BLOCK), conditionsFromItem(ModBlocks.TUNGSTEN_BLOCK))
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter, new Identifier("milk_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.AWKWARD_WATER_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.NETHER_WART)
                .input('T', ModBlocks.WATER_TANK)
                .criterion(hasItem(Items.NETHER_WART), conditionsFromItem(Items.NETHER_WART))
                .criterion(hasItem(ModBlocks.WATER_TANK), conditionsFromItem(ModBlocks.WATER_TANK))
                .offerTo(exporter, new Identifier("awkward_water_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.HEALING_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.GLISTERING_MELON_SLICE)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.GLISTERING_MELON_SLICE), conditionsFromItem(Items.GLISTERING_MELON_SLICE))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("healing_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.FIRE_RESISTANCE_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.MAGMA_CREAM)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(Items.MAGMA_CREAM))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("fire_resistance_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.REGENERATION_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.GHAST_TEAR)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("regeneration_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.STRENGTH_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.BLAZE_POWDER)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.BLAZE_POWDER), conditionsFromItem(Items.BLAZE_POWDER))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("strength_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.SWIFTNESS_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.SUGAR)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("swiftness_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.NIGHT_VISION_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.GOLDEN_CARROT)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.GOLDEN_CARROT), conditionsFromItem(Items.GOLDEN_CARROT))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("night_vision_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.INVISIBILITY_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.FERMENTED_SPIDER_EYE)
                .input('T', ModBlocks.NIGHT_VISION_POTION_TANK)
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE), conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .criterion(hasItem(ModBlocks.NIGHT_VISION_POTION_TANK), conditionsFromItem(ModBlocks.NIGHT_VISION_POTION_TANK))
                .offerTo(exporter, new Identifier("invisibility_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.WATER_BREATHING_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.PUFFERFISH)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("water_breathing_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.LEAPING_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.RABBIT_FOOT)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.RABBIT_FOOT), conditionsFromItem(Items.RABBIT_FOOT))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("leaping_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.SLOW_FALLING_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.PHANTOM_MEMBRANE)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("slow_falling_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.POISON_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.SPIDER_EYE)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("poison_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.WEAKNESS_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.FERMENTED_SPIDER_EYE)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE), conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("weakness_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.HARMING_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.FERMENTED_SPIDER_EYE)
                .input('T', ModBlocks.HEALING_POTION_TANK)
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE), conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .criterion(hasItem(ModBlocks.HEALING_POTION_TANK), conditionsFromItem(ModBlocks.HEALING_POTION_TANK))
                .offerTo(exporter, new Identifier("harming_potion_tank_from_healing_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.HARMING_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.FERMENTED_SPIDER_EYE)
                .input('T', ModBlocks.POISON_POTION_TANK)
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE), conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .criterion(hasItem(ModBlocks.POISON_POTION_TANK), conditionsFromItem(ModBlocks.POISON_POTION_TANK))
                .offerTo(exporter, new Identifier("harming_potion_tank_from_poison_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.SLOWNESS_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.FERMENTED_SPIDER_EYE)
                .input('T', ModBlocks.SWIFTNESS_POTION_TANK)
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE), conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .criterion(hasItem(ModBlocks.SWIFTNESS_POTION_TANK), conditionsFromItem(ModBlocks.SWIFTNESS_POTION_TANK))
                .offerTo(exporter, new Identifier("slowness_potion_tank_from_swiftness_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.HARMING_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.FERMENTED_SPIDER_EYE)
                .input('T', ModBlocks.LEAPING_POTION_TANK)
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE), conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .criterion(hasItem(ModBlocks.LEAPING_POTION_TANK), conditionsFromItem(ModBlocks.LEAPING_POTION_TANK))
                .offerTo(exporter, new Identifier("slowness_potion_tank_from_leaping_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.TURTLE_MASTER_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.TURTLE_HELMET)
                .input('T', ModBlocks.AWKWARD_WATER_TANK)
                .criterion(hasItem(Items.TURTLE_HELMET), conditionsFromItem(Items.TURTLE_HELMET))
                .criterion(hasItem(ModBlocks.AWKWARD_WATER_TANK), conditionsFromItem(ModBlocks.AWKWARD_WATER_TANK))
                .offerTo(exporter, new Identifier("turtle_master_potion_tank"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BEDROCK_SHARD,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAKE_BEDROCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_SWORD)
                .pattern("B")
                .pattern("B")
                .pattern("S")
                .input('B', ModItems.BEDROCK_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("bedrock_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_PICKAXE)
                .pattern("BBB")
                .pattern(" S ")
                .pattern(" S ")
                .input('B', ModItems.BEDROCK_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("bedrock_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_AXE)
                .pattern("BB")
                .pattern("BS")
                .pattern(" S")
                .input('B', ModItems.BEDROCK_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("bedrock_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_SHOVEL)
                .pattern("B")
                .pattern("S")
                .pattern("S")
                .input('B', ModItems.BEDROCK_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("bedrock_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_HOE)
                .pattern("BB")
                .pattern(" S")
                .pattern(" S")
                .input('B', ModItems.BEDROCK_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("bedrock_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_HELMET)
                .pattern("BBB")
                .pattern("B B")
                .input('B', ModItems.BEDROCK_SHARD)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .offerTo(exporter, new Identifier("bedrock_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_CHESTPLATE)
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.BEDROCK_SHARD)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .offerTo(exporter, new Identifier("bedrock_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_LEGGINGS)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .input('B', ModItems.BEDROCK_SHARD)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .offerTo(exporter, new Identifier("bedrock_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_BOOTS)
                .pattern("B B")
                .pattern("B B")
                .input('B', ModItems.BEDROCK_SHARD)
                .criterion(hasItem(ModItems.BEDROCK_SHARD), conditionsFromItem(ModItems.BEDROCK_SHARD))
                .offerTo(exporter, new Identifier("bedrock_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK,4)
                .pattern("FF")
                .pattern("FF")
                .input('F', ModBlocks.FAKE_BEDROCK)
                .criterion(hasItem(ModBlocks.FAKE_BEDROCK), conditionsFromItem(ModBlocks.FAKE_BEDROCK))
                .offerTo(exporter, new Identifier("polished_bedrock"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK, ModBlocks.FAKE_BEDROCK);

        createStairsRecipe(ModBlocks.POLISHED_BEDROCK_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_BEDROCK))
                .criterion(hasItem(ModBlocks.POLISHED_BEDROCK),conditionsFromItem(ModBlocks.POLISHED_BEDROCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POLISHED_BEDROCK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_STAIRS, ModBlocks.FAKE_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_STAIRS, ModBlocks.POLISHED_BEDROCK);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_SLAB, ModBlocks.POLISHED_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_SLAB, ModBlocks.FAKE_BEDROCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_SLAB, ModBlocks.POLISHED_BEDROCK,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BEDROCK_WALL, ModBlocks.POLISHED_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BEDROCK_WALL, ModBlocks.FAKE_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BEDROCK_WALL, ModBlocks.POLISHED_BEDROCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS,4)
                .pattern("FF")
                .pattern("FF")
                .input('F', ModBlocks.POLISHED_BEDROCK)
                .criterion(hasItem(ModBlocks.POLISHED_BEDROCK), conditionsFromItem(ModBlocks.POLISHED_BEDROCK))
                .offerTo(exporter, new Identifier("polished_bedrock_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS, ModBlocks.FAKE_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS, ModBlocks.POLISHED_BEDROCK);

        createStairsRecipe(ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_BEDROCK_BRICKS))
                .criterion(hasItem(ModBlocks.POLISHED_BEDROCK_BRICKS),conditionsFromItem(ModBlocks.POLISHED_BEDROCK_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS, ModBlocks.FAKE_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS, ModBlocks.POLISHED_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS, ModBlocks.POLISHED_BEDROCK_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB, ModBlocks.POLISHED_BEDROCK_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB, ModBlocks.FAKE_BEDROCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB, ModBlocks.POLISHED_BEDROCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB, ModBlocks.POLISHED_BEDROCK_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BEDROCK_BRICKS_WALL, ModBlocks.POLISHED_BEDROCK_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BEDROCK_BRICKS_WALL, ModBlocks.FAKE_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BEDROCK_BRICKS_WALL, ModBlocks.POLISHED_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BEDROCK_BRICKS_WALL, ModBlocks.POLISHED_BEDROCK_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_BEDROCK, ModBlocks.POLISHED_BEDROCK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_BEDROCK, ModBlocks.FAKE_BEDROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_BEDROCK, ModBlocks.POLISHED_BEDROCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.FLINT_SWORD)
                .pattern(" F")
                .pattern("S ")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("flint_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_PICKAXE)
                .pattern("FS")
                .pattern("FF")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("flint_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_AXE)
                .pattern("FF")
                .pattern("FS")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("flint_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_SHOVEL)
                .pattern("F")
                .pattern("S")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("flint_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_HOE)
                .pattern("FF")
                .pattern(" S")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("flint_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FLINT_SPIKES)
                .pattern("FFF")
                .pattern("SSS")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("flint_spikes"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.IRON_SPIKES)
                .pattern("III")
                .pattern("BBB")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.IRON_BARS)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter, new Identifier("iron_spikes"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ALUMINUM_SPIKES)
                .pattern("AAA")
                .pattern("BBB")
                .input('A', ModItems.ALUMINUM_INGOT)
                .input('B', ModBlocks.ALUMINUM_BARS)
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModBlocks.ALUMINUM_BARS), conditionsFromItem(ModBlocks.ALUMINUM_BARS))
                .offerTo(exporter, new Identifier("aluminum_spikes"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STEEL_SPIKES)
                .pattern("SSS")
                .pattern("BBB")
                .input('S', ModItems.STEEL_INGOT)
                .input('B', ModBlocks.STEEL_BARS)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModBlocks.STEEL_BARS), conditionsFromItem(ModBlocks.STEEL_BARS))
                .offerTo(exporter, new Identifier("steel_spikes"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .input('A', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier("chainmail_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier("chainmail_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier("chainmail_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS)
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier("chainmail_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CLAY_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.CLAY_BALL)
                .criterion(hasItem(Items.CLAY_BALL), conditionsFromItem(Items.CLAY_BALL))
                .offerTo(exporter, new Identifier("clay_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CLAY_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.CLAY_BALL)
                .criterion(hasItem(Items.CLAY_BALL), conditionsFromItem(Items.CLAY_BALL))
                .offerTo(exporter, new Identifier("clay_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CLAY_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.CLAY_BALL)
                .criterion(hasItem(Items.CLAY_BALL), conditionsFromItem(Items.CLAY_BALL))
                .offerTo(exporter, new Identifier("clay_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CLAY_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.CLAY_BALL)
                .criterion(hasItem(Items.CLAY_BALL), conditionsFromItem(Items.CLAY_BALL))
                .offerTo(exporter, new Identifier("clay_boots"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.CLAY_HELMET), RecipeCategory.MISC, ModItems.TERRACOTTA_HELMET,0.7f, 250)
                .criterion(hasItem(ModItems.CLAY_HELMET), conditionsFromItem(ModItems.CLAY_HELMET))
                .offerTo(exporter, new Identifier("terracotta_helmet_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.CLAY_CHESTPLATE), RecipeCategory.MISC, ModItems.TERRACOTTA_CHESTPLATE,0.7f, 250)
                .criterion(hasItem(ModItems.CLAY_CHESTPLATE), conditionsFromItem(ModItems.CLAY_CHESTPLATE))
                .offerTo(exporter, new Identifier("terracotta_chestplate_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.CLAY_LEGGINGS), RecipeCategory.MISC, ModItems.TERRACOTTA_LEGGINGS,0.7f, 250)
                .criterion(hasItem(ModItems.CLAY_LEGGINGS), conditionsFromItem(ModItems.CLAY_LEGGINGS))
                .offerTo(exporter, new Identifier("terracotta_leggings_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.CLAY_BOOTS), RecipeCategory.MISC, ModItems.TERRACOTTA_BOOTS,0.7f, 250)
                .criterion(hasItem(ModItems.CLAY_BOOTS), conditionsFromItem(ModItems.CLAY_BOOTS))
                .offerTo(exporter, new Identifier("terracotta_boots_from_smelting"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier("black_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier("black_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier("black_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.BLACK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier("black_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLUE_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("blue_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLUE_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("blue_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLUE_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("blue_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLUE_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("blue_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BROWN_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier("brown_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BROWN_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier("brown_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BROWN_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier("brown_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BROWN_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.BROWN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier("brown_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier("cyan_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier("cyan_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier("cyan_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.CYAN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier("cyan_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRAY_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier("gray_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRAY_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier("gray_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRAY_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier("gray_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRAY_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier("gray_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("green_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("green_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("green_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.GREEN_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("green_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_BLUE_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier("light_blue_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_BLUE_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier("light_blue_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_BLUE_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier("light_blue_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_BLUE_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier("light_blue_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_GRAY_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier("light_gray_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_GRAY_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier("light_gray_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_GRAY_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier("light_gray_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_GRAY_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier("light_gray_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIME_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier("lime_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIME_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier("lime_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIME_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier("lime_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIME_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.LIME_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier("lime_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.MAGENTA_DYE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier("magenta_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.MAGENTA_DYE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier("magenta_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.MAGENTA_DYE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier("magenta_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.MAGENTA_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.MAGENTA_DYE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier("magenta_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier("orange_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier("orange_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier("orange_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.ORANGE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier("orange_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.PINK_DYE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier("pink_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.PINK_DYE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier("pink_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.PINK_DYE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier("pink_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.PINK_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.PINK_DYE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier("pink_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("purple_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("purple_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("purple_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.PURPLE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("purple_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier("red_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier("red_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier("red_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.RED_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier("red_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier("white_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier("white_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier("white_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.WHITE_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier("white_terracotta_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_TERRACOTTA_HELMET)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_HELMET)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_HELMET), conditionsFromItem(ModItems.TERRACOTTA_HELMET))
                .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier("yellow_terracotta_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_TERRACOTTA_CHESTPLATE)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_CHESTPLATE)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_CHESTPLATE), conditionsFromItem(ModItems.TERRACOTTA_CHESTPLATE))
                .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier("yellow_terracotta_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_TERRACOTTA_LEGGINGS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_LEGGINGS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_LEGGINGS), conditionsFromItem(ModItems.TERRACOTTA_LEGGINGS))
                .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier("yellow_terracotta_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_TERRACOTTA_BOOTS)
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .input('T', ModItems.TERRACOTTA_BOOTS)
                .input('D', Items.YELLOW_DYE)
                .criterion(hasItem(ModItems.TERRACOTTA_BOOTS), conditionsFromItem(ModItems.TERRACOTTA_BOOTS))
                .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier("yellow_terracotta_boots"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SANDITE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.SAND,8)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', Blocks.SAND)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Blocks.SAND), conditionsFromItem(Blocks.SAND))
                .offerTo(exporter, new Identifier("sand_from_sand_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.SAND,32)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', Blocks.SANDSTONE)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter, new Identifier("sand_from_sandstone_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.RED_SAND,8)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', Blocks.RED_SAND)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Blocks.RED_SAND), conditionsFromItem(Blocks.RED_SAND))
                .offerTo(exporter, new Identifier("red_sand_from_red_sand_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.RED_SAND,32)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', Blocks.RED_SANDSTONE)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter, new Identifier("red_sand_from_red_sandstone_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WHITE_SAND,8)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', ModBlocks.WHITE_SAND)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(ModBlocks.WHITE_SAND), conditionsFromItem(ModBlocks.WHITE_SAND))
                .offerTo(exporter, new Identifier("white_sand_from_white_sand_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WHITE_SAND,32)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', ModBlocks.WHITE_SANDSTONE)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(ModBlocks.WHITE_SANDSTONE), conditionsFromItem(ModBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, new Identifier("white_sand_from_white_sandstone_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLACK_SAND,8)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', ModBlocks.BLACK_SAND)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(ModBlocks.BLACK_SAND), conditionsFromItem(ModBlocks.BLACK_SAND))
                .offerTo(exporter, new Identifier("black_sand_from_black_sand_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLACK_SAND,32)
                .pattern(" S ")
                .pattern("SDS")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('D', ModBlocks.BLACK_SANDSTONE)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(ModBlocks.BLACK_SANDSTONE), conditionsFromItem(ModBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, new Identifier("black_sand_from_black_sandstone_with_sandite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BRICKS,4)
                .pattern("IS")
                .pattern("SI")
                .input('S', ModBlocks.SANDITE_BLOCK)
                .input('I', ModItems.SANDITE)
                .criterion(hasItem(ModBlocks.SANDITE_BLOCK), conditionsFromItem(ModBlocks.SANDITE_BLOCK))
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .offerTo(exporter, new Identifier("sandite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BRICKS, ModBlocks.SANDITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_TILES,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.SANDITE_BLOCK)
                .criterion(hasItem(ModBlocks.SANDITE_BLOCK), conditionsFromItem(ModBlocks.SANDITE_BLOCK))
                .offerTo(exporter, new Identifier("sandite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_TILES, ModBlocks.SANDITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SANDITE,4)
                .pattern("BBB")
                .pattern("BSB")
                .pattern("BBB")
                .input('B', ModBlocks.SANDITE_BLOCK)
                .input('S', ModItems.SANDITE)
                .criterion(hasItem(ModBlocks.SANDITE_BLOCK), conditionsFromItem(ModBlocks.SANDITE_BLOCK))
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .offerTo(exporter, new Identifier("chiseled_sandite"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SANDITE,18)
                .input(ModBlocks.CHISELED_SANDITE)
                .criterion(hasItem(ModBlocks.CHISELED_SANDITE), conditionsFromItem(ModBlocks.CHISELED_SANDITE))
                .offerTo(exporter, new Identifier("sandite_from_chiseled_sandite"));

        createStairsRecipe(ModBlocks.SANDITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.SANDITE_BRICKS))
                .criterion(hasItem(ModBlocks.SANDITE_BRICKS),conditionsFromItem(ModBlocks.SANDITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SANDITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BRICK_STAIRS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BRICK_STAIRS, ModBlocks.SANDITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BRICK_SLAB, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BRICK_SLAB, ModBlocks.SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_BRICK_SLAB, ModBlocks.SANDITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SANDITE_BRICK_WALL, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SANDITE_BRICK_WALL, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SANDITE_BRICK_WALL, ModBlocks.SANDITE_BRICKS);

        createStairsRecipe(ModBlocks.SANDITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.SANDITE_TILES))
                .criterion(hasItem(ModBlocks.SANDITE_TILES),conditionsFromItem(ModBlocks.SANDITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SANDITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_TILE_STAIRS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_TILE_STAIRS, ModBlocks.SANDITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_TILE_SLAB, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_TILE_SLAB, ModBlocks.SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDITE_TILE_SLAB, ModBlocks.SANDITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SANDITE_TILE_WALL, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SANDITE_TILE_WALL, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SANDITE_TILE_WALL, ModBlocks.SANDITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICKS,4)
                .pattern("PP")
                .pattern("PP")
                .input('P', Blocks.POLISHED_ANDESITE)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter, new Identifier("polished_andesite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

        createStairsRecipe(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_ANDESITE_BRICKS))
                .criterion(hasItem(ModBlocks.POLISHED_ANDESITE_BRICKS),conditionsFromItem(ModBlocks.POLISHED_ANDESITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, ModBlocks.POLISHED_ANDESITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, ModBlocks.POLISHED_ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, ModBlocks.POLISHED_ANDESITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, ModBlocks.POLISHED_ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, ModBlocks.POLISHED_ANDESITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICKS,4)
                .pattern("PP")
                .pattern("PP")
                .input('P', Blocks.POLISHED_DIORITE)
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter, new Identifier("polished_diorite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

        createStairsRecipe(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DIORITE_BRICKS))
                .criterion(hasItem(ModBlocks.POLISHED_DIORITE_BRICKS),conditionsFromItem(ModBlocks.POLISHED_DIORITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, ModBlocks.POLISHED_DIORITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, ModBlocks.POLISHED_DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, ModBlocks.POLISHED_DIORITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, ModBlocks.POLISHED_DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, ModBlocks.POLISHED_DIORITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICKS,4)
                .pattern("PP")
                .pattern("PP")
                .input('P', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter, new Identifier("polished_granite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

        createStairsRecipe(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.POLISHED_GRANITE_BRICKS),conditionsFromItem(ModBlocks.POLISHED_GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, ModBlocks.POLISHED_GRANITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, ModBlocks.POLISHED_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, ModBlocks.POLISHED_GRANITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, ModBlocks.POLISHED_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, ModBlocks.POLISHED_GRANITE_BRICKS);

        createStairsRecipe(ModBlocks.MARBLE_STAIRS, Ingredient.ofItems(ModBlocks.MARBLE))
                .criterion(hasItem(ModBlocks.MARBLE),conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MARBLE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_STAIRS, ModBlocks.MARBLE);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_MARBLE, ModBlocks.MARBLE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_MARBLE, ModBlocks.MARBLE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICKS,4)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.MARBLE)
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter, new Identifier("marble_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICKS, ModBlocks.MARBLE);

        createStairsRecipe(ModBlocks.MARBLE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.MARBLE_BRICKS))
                .criterion(hasItem(ModBlocks.MARBLE_BRICKS),conditionsFromItem(ModBlocks.MARBLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MARBLE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICK_STAIRS, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICK_STAIRS, ModBlocks.MARBLE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICK_SLAB, ModBlocks.MARBLE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICK_SLAB, ModBlocks.MARBLE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BRICK_SLAB, ModBlocks.MARBLE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_WALL, ModBlocks.MARBLE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_WALL, ModBlocks.MARBLE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_WALL, ModBlocks.MARBLE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GILDED_MARBLE)
                .pattern(" G ")
                .pattern("GMG")
                .pattern(" G ")
                .input('G', Items.GOLD_NUGGET)
                .input('M', ModBlocks.MARBLE)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                .offerTo(exporter, new Identifier("gilded_marble"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_MARBLE_BRICKS,4)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.GILDED_MARBLE)
                .criterion(hasItem(ModBlocks.GILDED_MARBLE), conditionsFromItem(ModBlocks.GILDED_MARBLE))
                .offerTo(exporter, new Identifier("gilded_marble_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_MARBLE_BRICKS, ModBlocks.GILDED_MARBLE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_SWORD)
                .pattern("D")
                .pattern("D")
                .pattern("S")
                .input('D', ModItems.SANDITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("sandite_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_PICKAXE)
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .input('D', ModItems.SANDITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("sandite_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_AXE)
                .pattern("DD")
                .pattern("DS")
                .pattern(" S")
                .input('D', ModItems.SANDITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("sandite_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_SHOVEL)
                .pattern("D")
                .pattern("S")
                .pattern("S")
                .input('D', ModItems.SANDITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("sandite_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_HOE)
                .pattern("DD")
                .pattern(" S")
                .pattern(" S")
                .input('D', ModItems.SANDITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("sandite_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_HELMET)
                .pattern("SLS")
                .pattern("S S")
                .input('S', ModItems.SANDITE)
                .input('L', Items.LEATHER)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier("sandite_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_CHESTPLATE)
                .pattern("L L")
                .pattern("LLL")
                .pattern("SSS")
                .input('S', ModItems.SANDITE)
                .input('L', Items.LEATHER)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier("sandite_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_LEGGINGS)
                .pattern("LLL")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SANDITE)
                .input('L', Items.LEATHER)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier("sandite_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_BOOTS)
                .pattern("S S")
                .pattern("L L")
                .input('S', ModItems.SANDITE)
                .input('L', Items.LEATHER)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier("sandite_boots"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SILVER_SCALE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_SCALES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_SCALE_CORE,4)
                .pattern("SBS")
                .pattern("BCB")
                .pattern("SBS")
                .input('S', ModItems.SILVER_SCALE)
                .input('B', Items.BLACKSTONE)
                .input('C', ModBlocks.SILVER_SCALE_CORE)
                .criterion(hasItem(ModItems.SILVER_SCALE), conditionsFromItem(ModItems.SILVER_SCALE))
                .criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .criterion(hasItem(ModBlocks.SILVER_SCALE_CORE), conditionsFromItem(ModBlocks.SILVER_SCALE_CORE))
                .offerTo(exporter, new Identifier("silver_scale_core_duplicate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_SCALE_FACE,2)
                .pattern("SAS")
                .pattern("ACA")
                .pattern("SAS")
                .input('S', ModItems.SILVER_SCALE)
                .input('A', Items.SOUL_SAND)
                .input('C', ModBlocks.SILVER_SCALE_FACE)
                .criterion(hasItem(ModItems.SILVER_SCALE), conditionsFromItem(ModItems.SILVER_SCALE))
                .criterion(hasItem(Items.SOUL_SAND), conditionsFromItem(Items.SOUL_SAND))
                .criterion(hasItem(ModBlocks.SILVER_SCALE_FACE), conditionsFromItem(ModBlocks.SILVER_SCALE_FACE))
                .offerTo(exporter, new Identifier("silver_scale_face_duplicate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SILVER_CROWN)
                .pattern("S S")
                .pattern("SSS")
                .pattern("TTT")
                .input('S', ModItems.SILVER_SCALE)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.SILVER_SCALE), conditionsFromItem(ModItems.SILVER_SCALE))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("silver_crown"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.FROSTBITE_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.BLUE_ICE)
                .input('T', ModBlocks.SLOWNESS_POTION_TANK)
                .criterion(hasItem(Items.BLUE_ICE), conditionsFromItem(Items.BLUE_ICE))
                .criterion(hasItem(ModBlocks.SLOWNESS_POTION_TANK), conditionsFromItem(ModBlocks.SLOWNESS_POTION_TANK))
                .offerTo(exporter, new Identifier("frostbite_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.HEAT_STROKE_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.RED_SAND)
                .input('T', ModBlocks.WEAKNESS_POTION_TANK)
                .criterion(hasItem(Items.RED_SAND), conditionsFromItem(Items.RED_SAND))
                .criterion(hasItem(ModBlocks.WEAKNESS_POTION_TANK), conditionsFromItem(ModBlocks.WEAKNESS_POTION_TANK))
                .offerTo(exporter, new Identifier("heat_stroke_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.FATAL_POISON_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.JUNGLE_LEAVES)
                .input('T', ModBlocks.POISON_POTION_TANK)
                .criterion(hasItem(Items.JUNGLE_LEAVES), conditionsFromItem(Items.JUNGLE_LEAVES))
                .criterion(hasItem(ModBlocks.POISON_POTION_TANK), conditionsFromItem(ModBlocks.POISON_POTION_TANK))
                .offerTo(exporter, new Identifier("fatal_poison_potion_tank"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, ModBlocks.VOID_SICKNESS_POTION_TANK)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" W ")
                .input('W', Items.END_CRYSTAL)
                .input('T', ModBlocks.HARMING_POTION_TANK)
                .criterion(hasItem(Items.END_CRYSTAL), conditionsFromItem(Items.END_CRYSTAL))
                .criterion(hasItem(ModBlocks.HARMING_POTION_TANK), conditionsFromItem(ModBlocks.HARMING_POTION_TANK))
                .offerTo(exporter, new Identifier("void_sickness_potion_tank"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.SILVER_SCALE), RecipeCategory.MISC, Items.IRON_NUGGET,0.7f, 200)
                .criterion(hasItem(ModItems.SILVER_SCALE), conditionsFromItem(ModItems.SILVER_SCALE))
                .offerTo(exporter, new Identifier("iron_nugget_from_smelting_silver_scale"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems
                        (ModItems.SILVER_SCALE), RecipeCategory.MISC, Items.IRON_NUGGET,0.7f, 100)
                .criterion(hasItem(ModItems.SILVER_SCALE), conditionsFromItem(ModItems.SILVER_SCALE))
                .offerTo(exporter, new Identifier("steel_ingot_from_blasting_silver_scale"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_SCALE,5)
                .input(ModItems.SILVER_MANDIBLE)
                .criterion(hasItem(ModItems.SILVER_MANDIBLE), conditionsFromItem(ModItems.SILVER_MANDIBLE))
                .offerTo(exporter, new Identifier("silver_scale_from_silver_mandible"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MANDIBLE_HATCHET)
                .pattern("MS ")
                .pattern("MSS")
                .pattern(" S ")
                .input('M', ModItems.SILVER_MANDIBLE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SILVER_MANDIBLE), conditionsFromItem(ModItems.SILVER_MANDIBLE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("mandible_hatchet"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK,1)
                .input(ModBlocks.SMOOTH_STEEL_BLOCK)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.SMOOTH_STEEL_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_STEEL_BLOCK))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_block_from_smooth_steel_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL,1)
                .input(ModBlocks.CUT_STEEL)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.CUT_STEEL), conditionsFromItem(ModBlocks.CUT_STEEL))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("lighty_rusted_cut_steel_from_cut_steel"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_BLOCK,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_steel_block_from_lighty_rusted_steel_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL,1)
                .input(ModBlocks.LIGHTY_RUSTED_CUT_STEEL)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_CUT_STEEL), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_CUT_STEEL))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_cut_steel_from_lighty_rusted_cut_steel"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_BLOCK,1)
                .input(ModBlocks.SMOOTH_STEEL_BLOCK)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(ModBlocks.SMOOTH_STEEL_BLOCK), conditionsFromItem(ModBlocks.SMOOTH_STEEL_BLOCK))
                .criterion(hasItem(Items.BLUE_ICE), conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier("rusted_steel_block_from_smooth_steel_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL,1)
                .input(ModBlocks.CUT_STEEL)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(ModBlocks.CUT_STEEL), conditionsFromItem(ModBlocks.CUT_STEEL))
                .criterion(hasItem(Items.BLUE_ICE), conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier("rusted_cut_steel_from_cut_steel"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK,1)
                .input(ModBlocks.RUSTED_STEEL_BLOCK)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.RUSTED_STEEL_BLOCK))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_block_from_rusted_steel_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL,1)
                .input(ModBlocks.RUSTED_CUT_STEEL)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.RUSTED_CUT_STEEL), conditionsFromItem(ModBlocks.RUSTED_CUT_STEEL))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("lighty_rusted_cut_steel_from_rusted_cut_steel"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STEEL_BLOCK,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("smooth_steel_block_from_lighty_rusted_steel_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL,1)
                .input(ModBlocks.LIGHTY_RUSTED_CUT_STEEL)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_CUT_STEEL), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_CUT_STEEL))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("cut_steel_from_lighty_rusted_cut_steel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("lighty_rusted_cut_steel"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL, ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.RUSTED_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.RUSTED_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("rusted_cut_steel"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL, ModBlocks.RUSTED_STEEL_BLOCK);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_SLAB, ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_SLAB, ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK,2);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_SLAB, ModBlocks.RUSTED_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_SLAB, ModBlocks.RUSTED_STEEL_BLOCK,2);

        createStairsRecipe(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS, Ingredient.ofItems(ModBlocks.LIGHTY_RUSTED_CUT_STEEL))
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_CUT_STEEL),conditionsFromItem(ModBlocks.LIGHTY_RUSTED_CUT_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS, ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB, ModBlocks.LIGHTY_RUSTED_CUT_STEEL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB, ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB, ModBlocks.LIGHTY_RUSTED_CUT_STEEL,2);

        createStairsRecipe(ModBlocks.RUSTED_CUT_STEEL_STAIRS, Ingredient.ofItems(ModBlocks.RUSTED_CUT_STEEL))
                .criterion(hasItem(ModBlocks.RUSTED_CUT_STEEL),conditionsFromItem(ModBlocks.RUSTED_CUT_STEEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUSTED_CUT_STEEL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL_STAIRS, ModBlocks.RUSTED_STEEL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL_STAIRS, ModBlocks.RUSTED_CUT_STEEL);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL_SLAB, ModBlocks.RUSTED_CUT_STEEL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL_SLAB, ModBlocks.RUSTED_STEEL_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_CUT_STEEL_SLAB, ModBlocks.RUSTED_CUT_STEEL,2);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_DOOR,1)
                .input(ModBlocks.STEEL_DOOR)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.STEEL_DOOR), conditionsFromItem(ModBlocks.STEEL_DOOR))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_door_from_steel_door"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR,1)
                .input(ModBlocks.STEEL_TRAPDOOR)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.STEEL_TRAPDOOR), conditionsFromItem(ModBlocks.STEEL_TRAPDOOR))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_trapdoor_from_steel_trapdoor"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_DOOR,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_steel_door_from_lighty_rusted_steel_door"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_TRAPDOOR,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_steel_trapdoor_from_lighty_rusted_steel_trapdoor"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_DOOR,1)
                .input(ModBlocks.STEEL_DOOR)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(ModBlocks.STEEL_DOOR), conditionsFromItem(ModBlocks.STEEL_DOOR))
                .criterion(hasItem(Items.BLUE_ICE), conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier("rusted_steel_door_from_steel_door"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_TRAPDOOR,1)
                .input(ModBlocks.STEEL_TRAPDOOR)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(ModBlocks.STEEL_TRAPDOOR), conditionsFromItem(ModBlocks.STEEL_TRAPDOOR))
                .criterion(hasItem(Items.BLUE_ICE), conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier("rusted_steel_trapdoor_from_steel_trapdoor"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_DOOR,1)
                .input(ModBlocks.RUSTED_STEEL_DOOR)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_DOOR), conditionsFromItem(ModBlocks.RUSTED_STEEL_DOOR))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_door_from_rusted_steel_door"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR,1)
                .input(ModBlocks.RUSTED_STEEL_TRAPDOOR)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_TRAPDOOR), conditionsFromItem(ModBlocks.RUSTED_STEEL_TRAPDOOR))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_trapdoor_from_rusted_steel_trapdoor"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_DOOR,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("steel_door_from_lighty_rusted_steel_door"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_TRAPDOOR,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("steel_trapdoor_from_lighty_rusted_steel_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHTY_RUSTED_STEEL_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_door_from_lighty_rusted_steel_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUSTED_STEEL_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.RUSTED_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.RUSTED_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("rusted_steel_door_from_rusted_steel_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_trapdoor_from_lighty_rusted_steel_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUSTED_STEEL_TRAPDOOR)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.RUSTED_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.RUSTED_STEEL_BLOCK))
                .offerTo(exporter, new Identifier("rusted_steel_trapdoor_from_rusted_steel_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_BARS,1)
                .input(ModBlocks.STEEL_BARS)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.STEEL_BARS), conditionsFromItem(ModBlocks.STEEL_BARS))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_bars_from_steel_bars"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_BARS,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_BARS)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BARS), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BARS))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_steel_bars_from_lighty_rusted_steel_bars"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_BARS,1)
                .input(ModBlocks.STEEL_BARS)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(ModBlocks.STEEL_BARS), conditionsFromItem(ModBlocks.STEEL_BARS))
                .criterion(hasItem(Items.BLUE_ICE), conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier("rusted_steel_bars_from_steel_bars"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_BARS,1)
                .input(ModBlocks.RUSTED_STEEL_BARS)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_BARS), conditionsFromItem(ModBlocks.RUSTED_STEEL_BARS))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_bars_from_rusted_steel_bars"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BARS,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_BARS)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BARS), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BARS))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("steel_bars_from_lighty_rusted_steel_bars"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHTY_RUSTED_STEEL_LAMP)
                .pattern("SBS")
                .pattern("BGB")
                .pattern("SBS")
                .input('S', ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .input('B', ModBlocks.LIGHTY_RUSTED_STEEL_BARS)
                .input('G', Blocks.GLOWSTONE)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK))
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_BARS), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_BARS))
                .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_lamp_from_lighty_rusted_steel_block"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.RUSTED_STEEL_LAMP)
                .pattern("SBS")
                .pattern("BGB")
                .pattern("SBS")
                .input('S', ModBlocks.RUSTED_STEEL_BLOCK)
                .input('B', ModBlocks.RUSTED_STEEL_BARS)
                .input('G', Blocks.GLOWSTONE)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_BLOCK), conditionsFromItem(ModBlocks.RUSTED_STEEL_BLOCK))
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_BARS), conditionsFromItem(ModBlocks.RUSTED_STEEL_BARS))
                .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(exporter, new Identifier("rusted_steel_lamp_from_rusted_steel_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_LAMP,1)
                .input(ModBlocks.STEEL_LAMP)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(ModBlocks.STEEL_LAMP), conditionsFromItem(ModBlocks.STEEL_LAMP))
                .criterion(hasItem(Items.BLUE_ICE), conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier("rusted_steel_lamp_from_steel_lamp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_LAMP,1)
                .input(ModBlocks.STEEL_LAMP)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.STEEL_LAMP), conditionsFromItem(ModBlocks.STEEL_LAMP))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_lamp_from_steel_lamp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTED_STEEL_LAMP,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_steel_lamp_from_lighty_rusted_steel_lamp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTY_RUSTED_STEEL_LAMP,1)
                .input(ModBlocks.RUSTED_STEEL_LAMP)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.RUSTED_STEEL_LAMP), conditionsFromItem(ModBlocks.RUSTED_STEEL_LAMP))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("lighty_rusted_steel_lamp_from_rusted_steel_lamp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_LAMP,1)
                .input(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP), conditionsFromItem(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("steel_lamp_from_lighty_rusted_steel_lamp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUSTED_STEEL_APPLE,1)
                .input(ModItems.STEEL_APPLE)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModItems.STEEL_APPLE), conditionsFromItem(ModItems.STEEL_APPLE))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_steel_apple_from_steel_apple"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUSTED_STEEL_BEETROOT,1)
                .input(ModItems.STEEL_BEETROOT)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(ModItems.STEEL_BEETROOT), conditionsFromItem(ModItems.STEEL_BEETROOT))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier("rusted_steel_beetroot_from_steel_beetroot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_APPLE,1)
                .input(ModItems.RUSTED_STEEL_APPLE)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModItems.RUSTED_STEEL_APPLE), conditionsFromItem(ModItems.RUSTED_STEEL_APPLE))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("steel_apple_from_rusted_steel_apple"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_BEETROOT,1)
                .input(ModItems.RUSTED_STEEL_BEETROOT)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModItems.RUSTED_STEEL_BEETROOT), conditionsFromItem(ModItems.RUSTED_STEEL_BEETROOT))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("steel_beetroot_from_rusted_steel_beetroot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_DRILL)
                .pattern(" S ")
                .pattern("SBP")
                .pattern(" S ")
                .input('S', ModItems.SANDITE)
                .input('B', ModBlocks.SANDITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(ModBlocks.SANDITE_BLOCK), conditionsFromItem(ModBlocks.SANDITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("sandite_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SANDITE_CHAINSAW)
                .pattern("  P")
                .pattern("SSB")
                .input('S', ModItems.SANDITE)
                .input('B', ModBlocks.SANDITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .criterion(hasItem(ModBlocks.SANDITE_BLOCK), conditionsFromItem(ModBlocks.SANDITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("sandite_chainsaw"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.LEAFITE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_PLANKS,4)
                .input(ModBlocks.LEAFITE_LOG)
                .criterion(hasItem(ModBlocks.LEAFITE_LOG), conditionsFromItem(ModBlocks.LEAFITE_LOG))
                .offerTo(exporter, new Identifier("leafite_planks_from_leafite_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_PLANKS,4)
                .input(ModBlocks.STRIPPED_LEAFITE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_LEAFITE_LOG), conditionsFromItem(ModBlocks.STRIPPED_LEAFITE_LOG))
                .offerTo(exporter, new Identifier("leafite_planks_from_stripped_leafite_log"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_PLANKS,4)
                .input(ModBlocks.LEAFITE_WOOD)
                .criterion(hasItem(ModBlocks.LEAFITE_WOOD), conditionsFromItem(ModBlocks.LEAFITE_WOOD))
                .offerTo(exporter, new Identifier("leafite_planks_from_leafite_wood"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_PLANKS,4)
                .input(ModBlocks.STRIPPED_LEAFITE_WOOD)
                .criterion(hasItem(ModBlocks.STRIPPED_LEAFITE_WOOD), conditionsFromItem(ModBlocks.STRIPPED_LEAFITE_WOOD))
                .offerTo(exporter, new Identifier("leafite_planks_from_stripped_leafite_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.LEAFITE_LOG)
                .criterion(hasItem(ModBlocks.LEAFITE_LOG), conditionsFromItem(ModBlocks.LEAFITE_LOG))
                .offerTo(exporter, new Identifier("leafite_wood"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_LEAFITE_WOOD)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.STRIPPED_LEAFITE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_LEAFITE_LOG), conditionsFromItem(ModBlocks.STRIPPED_LEAFITE_LOG))
                .offerTo(exporter, new Identifier("stripped_leafite_wood"));

        createStairsRecipe(ModBlocks.LEAFITE_PLANKS_STAIRS, Ingredient.ofItems(ModBlocks.LEAFITE_PLANKS))
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS),conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_PLANKS_STAIRS)));
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_PLANKS_SLAB, ModBlocks.LEAFITE_PLANKS);
        createFenceRecipe(ModBlocks.LEAFITE_PLANKS_FENCE, Ingredient.ofItems(ModBlocks.LEAFITE_PLANKS))
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS),conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_PLANKS_FENCE)));
        createFenceGateRecipe(ModBlocks.LEAFITE_PLANKS_FENCE_GATE, Ingredient.ofItems(ModBlocks.LEAFITE_PLANKS))
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS),conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_PLANKS_FENCE_GATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LEAFITE_PLANKS_BUTTON)
                .input(ModBlocks.LEAFITE_PLANKS)
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS), conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_PLANKS_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LEAFITE_PLANKS_PRESSURE_PLATE)
                .pattern("SS")
                .input('S', ModBlocks.LEAFITE_PLANKS)
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS), conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_PLANKS_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LEAFITE_DOOR,3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.LEAFITE_PLANKS)
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS), conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LEAFITE_TRAPDOOR)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.LEAFITE_PLANKS)
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS), conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_TRAPDOOR)));

        createSignRecipe(ModItems.LEAFITE_SIGN, Ingredient.ofItems(ModBlocks.LEAFITE_PLANKS))
                .criterion(hasItem(ModBlocks.LEAFITE_PLANKS),conditionsFromItem(ModBlocks.LEAFITE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEAFITE_SIGN)));

        offerHangingSignRecipe(exporter, ModItems.LEAFITE_HANGING_SIGN, ModBlocks.STRIPPED_LEAFITE_WOOD);

        offerBoatRecipe(exporter, ModItems.LEAFITE_BOAT, ModBlocks.LEAFITE_PLANKS);
        offerChestBoatRecipe(exporter, ModItems.LEAFITE_CHEST_BOAT, ModItems.LEAFITE_BOAT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BRICKS,4)
                .pattern("IL")
                .pattern("LI")
                .input('L', ModBlocks.LEAFITE_BLOCK)
                .input('I', ModItems.LEAFITE)
                .criterion(hasItem(ModBlocks.LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LEAFITE_BLOCK))
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .offerTo(exporter, new Identifier("leafite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BRICKS, ModBlocks.LEAFITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_TILES,4)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.LEAFITE_BLOCK)
                .criterion(hasItem(ModBlocks.LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LEAFITE_BLOCK))
                .offerTo(exporter, new Identifier("leafite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_TILES, ModBlocks.LEAFITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_LEAFITE,4)
                .pattern("BBB")
                .pattern("BLB")
                .pattern("BBB")
                .input('B', ModBlocks.LEAFITE_BLOCK)
                .input('L', ModItems.LEAFITE)
                .criterion(hasItem(ModBlocks.LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LEAFITE_BLOCK))
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .offerTo(exporter, new Identifier("chiseled_leafite"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEAFITE,18)
                .input(ModBlocks.CHISELED_LEAFITE)
                .criterion(hasItem(ModBlocks.CHISELED_LEAFITE), conditionsFromItem(ModBlocks.CHISELED_LEAFITE))
                .offerTo(exporter, new Identifier("leafite_from_chiseled_leafite"));

        createStairsRecipe(ModBlocks.LEAFITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LEAFITE_BRICKS))
                .criterion(hasItem(ModBlocks.LEAFITE_BRICKS),conditionsFromItem(ModBlocks.LEAFITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BRICK_STAIRS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BRICK_STAIRS, ModBlocks.LEAFITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BRICK_SLAB, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BRICK_SLAB, ModBlocks.LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_BRICK_SLAB, ModBlocks.LEAFITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LEAFITE_BRICK_WALL, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LEAFITE_BRICK_WALL, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LEAFITE_BRICK_WALL, ModBlocks.LEAFITE_BRICKS);

        createStairsRecipe(ModBlocks.LEAFITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.LEAFITE_TILES))
                .criterion(hasItem(ModBlocks.LEAFITE_TILES),conditionsFromItem(ModBlocks.LEAFITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LEAFITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_TILE_STAIRS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_TILE_STAIRS, ModBlocks.LEAFITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_TILE_SLAB, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_TILE_SLAB, ModBlocks.LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAFITE_TILE_SLAB, ModBlocks.LEAFITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LEAFITE_TILE_WALL, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LEAFITE_TILE_WALL, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LEAFITE_TILE_WALL, ModBlocks.LEAFITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAFITE_SWORD)
                .pattern("L")
                .pattern("L")
                .pattern("S")
                .input('L', ModItems.LEAFITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("leafite_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAFITE_PICKAXE)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .input('L', ModItems.LEAFITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("leafite_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAFITE_AXE)
                .pattern("LL")
                .pattern("LS")
                .pattern(" S")
                .input('L', ModItems.LEAFITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("leafite_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAFITE_SHOVEL)
                .pattern("L")
                .pattern("S")
                .pattern("S")
                .input('L', ModItems.LEAFITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("leafite_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAFITE_HOE)
                .pattern("LL")
                .pattern(" S")
                .pattern(" S")
                .input('L', ModItems.LEAFITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("leafite_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAFITE_DRILL)
                .pattern(" L ")
                .pattern("LBP")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('B', ModBlocks.LEAFITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(ModBlocks.LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LEAFITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("leafite_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAFITE_CHAINSAW)
                .pattern("  P")
                .pattern("LLB")
                .input('L', ModItems.LEAFITE)
                .input('B', ModBlocks.LEAFITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(ModBlocks.LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LEAFITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("leafite_chainsaw"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.OAK_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.OAK_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.OAK_SAPLING), conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter, new Identifier("oak_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.BIRCH_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.BIRCH_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.BIRCH_SAPLING), conditionsFromItem(Blocks.BIRCH_SAPLING))
                .offerTo(exporter, new Identifier("birch_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.SPRUCE_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.SPRUCE_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.SPRUCE_SAPLING), conditionsFromItem(Blocks.SPRUCE_SAPLING))
                .offerTo(exporter, new Identifier("spruce_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.JUNGLE_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.JUNGLE_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.JUNGLE_SAPLING), conditionsFromItem(Blocks.JUNGLE_SAPLING))
                .offerTo(exporter, new Identifier("jungle_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.ACACIA_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.ACACIA_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.ACACIA_SAPLING), conditionsFromItem(Blocks.ACACIA_SAPLING))
                .offerTo(exporter, new Identifier("acacia_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.DARK_OAK_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.DARK_OAK_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.DARK_OAK_SAPLING), conditionsFromItem(Blocks.DARK_OAK_SAPLING))
                .offerTo(exporter, new Identifier("dark_oak_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.MANGROVE_PROPAGULE,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.MANGROVE_PROPAGULE)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.MANGROVE_PROPAGULE), conditionsFromItem(Blocks.MANGROVE_PROPAGULE))
                .offerTo(exporter, new Identifier("mangrove_propagule_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.CHERRY_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', Blocks.CHERRY_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(Blocks.CHERRY_SAPLING), conditionsFromItem(Blocks.CHERRY_SAPLING))
                .offerTo(exporter, new Identifier("cherry_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONEBARK_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', ModBlocks.STONEBARK_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(ModBlocks.STONEBARK_SAPLING), conditionsFromItem(ModBlocks.STONEBARK_SAPLING))
                .offerTo(exporter, new Identifier("stonebark_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEPBARK_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', ModBlocks.DEEPBARK_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(ModBlocks.DEEPBARK_SAPLING), conditionsFromItem(ModBlocks.DEEPBARK_SAPLING))
                .offerTo(exporter, new Identifier("deepbark_sapling_from_leafite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LEAFITE_SAPLING,4)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .input('L', ModItems.LEAFITE)
                .input('S', ModBlocks.LEAFITE_SAPLING)
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .criterion(hasItem(ModBlocks.LEAFITE_SAPLING), conditionsFromItem(ModBlocks.LEAFITE_SAPLING))
                .offerTo(exporter, new Identifier("leafite_sapling_from_leafite"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PLATINUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATINUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_INGOT)
                .pattern("PPP")
                .pattern("PAA")
                .pattern("AA ")
                .input('P', ModItems.PLATINUM_SCRAP)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModItems.PLATINUM_SCRAP), conditionsFromItem(ModItems.PLATINUM_SCRAP))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("platinum_ingot_from_platinum_scrap"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE,4)
                .pattern("EA")
                .pattern("AE")
                .input('E', Items.END_STONE)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("void_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE_BRICKS,4)
                .pattern("VV")
                .pattern("VV")
                .input('V', ModBlocks.VOID_STONE)
                .criterion(hasItem(ModBlocks.VOID_STONE), conditionsFromItem(ModBlocks.VOID_STONE))
                .offerTo(exporter, new Identifier("void_stone_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE_BRICKS, ModBlocks.VOID_STONE);

        createStairsRecipe(ModBlocks.VOID_STONE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.VOID_STONE_BRICKS))
                .criterion(hasItem(ModBlocks.VOID_STONE_BRICKS),conditionsFromItem(ModBlocks.VOID_STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VOID_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE_BRICK_STAIRS, ModBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE_BRICK_STAIRS, ModBlocks.VOID_STONE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE_BRICK_SLAB, ModBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE_BRICK_SLAB, ModBlocks.VOID_STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOID_STONE_BRICK_SLAB, ModBlocks.VOID_STONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOID_STONE_BRICK_WALL, ModBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOID_STONE_BRICK_WALL, ModBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOID_STONE_BRICK_WALL, ModBlocks.VOID_STONE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PLATINUM_SWORD)
                .pattern("P")
                .pattern("P")
                .pattern("D")
                .input('P', ModItems.PLATINUM_INGOT)
                .input('D', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("platinum_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_PICKAXE)
                .pattern("PPP")
                .pattern(" C ")
                .pattern(" D ")
                .input('P', ModItems.PLATINUM_INGOT)
                .input('D', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("platinum_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_AXE)
                .pattern("PP")
                .pattern("PC")
                .pattern(" D")
                .input('P', ModItems.PLATINUM_INGOT)
                .input('D', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("platinum_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_SHOVEL)
                .pattern("P")
                .pattern("C")
                .pattern("D")
                .input('P', ModItems.PLATINUM_INGOT)
                .input('D', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("platinum_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_HOE)
                .pattern("PP")
                .pattern(" C")
                .pattern(" D")
                .input('P', ModItems.PLATINUM_INGOT)
                .input('D', ModItems.DUEL_HANDLED_POWER_DRIVE)
                .input('C', ModItems.COBALT_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .criterion(hasItem(ModItems.DUEL_HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.DUEL_HANDLED_POWER_DRIVE))
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, new Identifier("platinum_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_MULTI_TOOL)
                .pattern(" P ")
                .pattern("ACS")
                .pattern(" H ")
                .input('C', ModItems.COBALT_INGOT)
                .input('P', ModItems.PLATINUM_PICKAXE)
                .input('S', ModItems.PLATINUM_SHOVEL)
                .input('A', ModItems.PLATINUM_AXE)
                .input('H', ModItems.PLATINUM_HOE)
                .criterion(hasItem(ModItems.COBALT_INGOT), conditionsFromItem(ModItems.COBALT_INGOT))
                .criterion(hasItem(ModItems.PLATINUM_PICKAXE), conditionsFromItem(ModItems.PLATINUM_PICKAXE))
                .criterion(hasItem(ModItems.PLATINUM_SHOVEL), conditionsFromItem(ModItems.PLATINUM_SHOVEL))
                .criterion(hasItem(ModItems.PLATINUM_AXE), conditionsFromItem(ModItems.PLATINUM_AXE))
                .criterion(hasItem(ModItems.PLATINUM_HOE), conditionsFromItem(ModItems.PLATINUM_HOE))
                .offerTo(exporter, new Identifier("platinum_multi_tool"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PLATINUM_HELMET)
                .pattern("PPP")
                .pattern("P P")
                .input('P', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier("platinum_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PLATINUM_CHESTPLATE)
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier("platinum_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PLATINUM_LEGGINGS)
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier("platinum_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PLATINUM_BOOTS)
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier("platinum_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_SWORD)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .input('E', ModItems.END_ITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("end_ite_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_PICKAXE)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.END_ITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("end_ite_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_AXE)
                .pattern("EE")
                .pattern("ES")
                .pattern(" S")
                .input('E', ModItems.END_ITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("end_ite_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_SHOVEL)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .input('E', ModItems.END_ITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("end_ite_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_HOE)
                .pattern("EE")
                .pattern(" S")
                .pattern(" S")
                .input('E', ModItems.END_ITE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("end_ite_hoe"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.END_ITE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_HELMET)
                .pattern("ECE")
                .pattern("E E")
                .input('E', ModItems.END_ITE)
                .input('C', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.POPPED_CHORUS_FRUIT), conditionsFromItem(Items.POPPED_CHORUS_FRUIT))
                .offerTo(exporter, new Identifier("end_ite_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_CHESTPLATE)
                .pattern("C C")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.END_ITE)
                .input('C', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.POPPED_CHORUS_FRUIT), conditionsFromItem(Items.POPPED_CHORUS_FRUIT))
                .offerTo(exporter, new Identifier("end_ite_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_LEGGINGS)
                .pattern("CCC")
                .pattern("E E")
                .pattern("E E")
                .input('E', ModItems.END_ITE)
                .input('C', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.POPPED_CHORUS_FRUIT), conditionsFromItem(Items.POPPED_CHORUS_FRUIT))
                .offerTo(exporter, new Identifier("end_ite_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_BOOTS)
                .pattern("E E")
                .pattern("C C")
                .input('E', ModItems.END_ITE)
                .input('C', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.POPPED_CHORUS_FRUIT), conditionsFromItem(Items.POPPED_CHORUS_FRUIT))
                .offerTo(exporter, new Identifier("end_ite_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ENDER_PEARL,8)
                .pattern(" E ")
                .pattern("EPE")
                .pattern(" E ")
                .input('E', ModItems.END_ITE)
                .input('P', Items.ENDER_PEARL)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter, new Identifier("ender_pearl_from_ender_pearl_with_end_ite"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BRICKS,4)
                .pattern("IE")
                .pattern("EI")
                .input('E', ModBlocks.END_ITE_BLOCK)
                .input('I', ModItems.END_ITE)
                .criterion(hasItem(ModBlocks.END_ITE_BLOCK), conditionsFromItem(ModBlocks.END_ITE_BLOCK))
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .offerTo(exporter, new Identifier("end_ite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BRICKS, ModBlocks.END_ITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_TILES,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.END_ITE_BLOCK)
                .criterion(hasItem(ModBlocks.END_ITE_BLOCK), conditionsFromItem(ModBlocks.END_ITE_BLOCK))
                .offerTo(exporter, new Identifier("end_ite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_TILES, ModBlocks.END_ITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_END_ITE,4)
                .pattern("BBB")
                .pattern("BEB")
                .pattern("BBB")
                .input('B', ModBlocks.END_ITE_BLOCK)
                .input('E', ModItems.END_ITE)
                .criterion(hasItem(ModBlocks.END_ITE_BLOCK), conditionsFromItem(ModBlocks.END_ITE_BLOCK))
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .offerTo(exporter, new Identifier("chiseled_end_ite"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.END_ITE,18)
                .input(ModBlocks.CHISELED_END_ITE)
                .criterion(hasItem(ModBlocks.CHISELED_END_ITE), conditionsFromItem(ModBlocks.CHISELED_END_ITE))
                .offerTo(exporter, new Identifier("end_ite_from_chiseled_end_ite"));

        createStairsRecipe(ModBlocks.END_ITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.END_ITE_BRICKS))
                .criterion(hasItem(ModBlocks.END_ITE_BRICKS),conditionsFromItem(ModBlocks.END_ITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.END_ITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BRICK_STAIRS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BRICK_STAIRS, ModBlocks.END_ITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BRICK_SLAB, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BRICK_SLAB, ModBlocks.END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_BRICK_SLAB, ModBlocks.END_ITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.END_ITE_BRICK_WALL, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.END_ITE_BRICK_WALL, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.END_ITE_BRICK_WALL, ModBlocks.END_ITE_BRICKS);

        createStairsRecipe(ModBlocks.END_ITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.END_ITE_TILES))
                .criterion(hasItem(ModBlocks.END_ITE_TILES),conditionsFromItem(ModBlocks.END_ITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.END_ITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_TILE_STAIRS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_TILE_STAIRS, ModBlocks.END_ITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_TILE_SLAB, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_TILE_SLAB, ModBlocks.END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_ITE_TILE_SLAB, ModBlocks.END_ITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.END_ITE_TILE_WALL, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.END_ITE_TILE_WALL, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.END_ITE_TILE_WALL, ModBlocks.END_ITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('I', ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("light_frosite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BLOCK, ModBlocks.FROSITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.FROSITE_BLOCK)
                .input('I', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("darken_frosite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BLOCK, ModBlocks.FROSITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.SANDITE_BLOCK)
                .input('I', ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.SANDITE_BLOCK), conditionsFromItem(ModBlocks.SANDITE_BLOCK))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("light_sandite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BLOCK, ModBlocks.SANDITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.SANDITE_BLOCK)
                .input('I', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModBlocks.SANDITE_BLOCK), conditionsFromItem(ModBlocks.SANDITE_BLOCK))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("darken_sandite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BLOCK, ModBlocks.SANDITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.LEAFITE_BLOCK)
                .input('I', ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LEAFITE_BLOCK))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("light_leafite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BLOCK, ModBlocks.LEAFITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.LEAFITE_BLOCK)
                .input('I', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModBlocks.LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LEAFITE_BLOCK))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("darken_leafite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BLOCK, ModBlocks.LEAFITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.END_ITE_BLOCK)
                .input('I', ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.END_ITE_BLOCK), conditionsFromItem(ModBlocks.END_ITE_BLOCK))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier("light_end_ite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BLOCK, ModBlocks.END_ITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BLOCK,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.END_ITE_BLOCK)
                .input('I', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModBlocks.END_ITE_BLOCK), conditionsFromItem(ModBlocks.END_ITE_BLOCK))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("darken_end_ite_block"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BLOCK, ModBlocks.END_ITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.LIGHT_FROSITE_BLOCK)
                .input('I', ModItems.FROSITE)
                .criterion(hasItem(ModBlocks.LIGHT_FROSITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_FROSITE_BLOCK))
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("light_frosite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICKS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICKS, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICKS, ModBlocks.LIGHT_FROSITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.LIGHT_FROSITE_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHT_FROSITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_FROSITE_BLOCK))
                .offerTo(exporter, new Identifier("light_frosite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILES, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILES, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILES, ModBlocks.LIGHT_FROSITE_BLOCK);

        createStairsRecipe(ModBlocks.LIGHT_FROSITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_FROSITE_BRICKS))
                .criterion(hasItem(ModBlocks.LIGHT_FROSITE_BRICKS),conditionsFromItem(ModBlocks.LIGHT_FROSITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_FROSITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_STAIRS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_STAIRS, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_STAIRS, ModBlocks.LIGHT_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_STAIRS, ModBlocks.LIGHT_FROSITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_SLAB, ModBlocks.LIGHT_FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_SLAB, ModBlocks.LIGHT_FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_BRICK_SLAB, ModBlocks.LIGHT_FROSITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_BRICK_WALL, ModBlocks.LIGHT_FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_BRICK_WALL, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_BRICK_WALL, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_BRICK_WALL, ModBlocks.LIGHT_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_BRICK_WALL, ModBlocks.LIGHT_FROSITE_BRICKS);

        createStairsRecipe(ModBlocks.LIGHT_FROSITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_FROSITE_TILES))
                .criterion(hasItem(ModBlocks.LIGHT_FROSITE_TILES),conditionsFromItem(ModBlocks.LIGHT_FROSITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_FROSITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_STAIRS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_STAIRS, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_STAIRS, ModBlocks.LIGHT_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_STAIRS, ModBlocks.LIGHT_FROSITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_SLAB, ModBlocks.LIGHT_FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_SLAB, ModBlocks.FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_SLAB, ModBlocks.FROSITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_SLAB, ModBlocks.LIGHT_FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_FROSITE_TILE_SLAB, ModBlocks.LIGHT_FROSITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_TILE_WALL, ModBlocks.LIGHT_FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_TILE_WALL, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_TILE_WALL, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_TILE_WALL, ModBlocks.LIGHT_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_FROSITE_TILE_WALL, ModBlocks.LIGHT_FROSITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.DARKEN_FROSITE_BLOCK)
                .input('I', ModItems.FROSITE)
                .criterion(hasItem(ModBlocks.DARKEN_FROSITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_FROSITE_BLOCK))
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("darken_frosite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICKS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICKS, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICKS, ModBlocks.DARKEN_FROSITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.DARKEN_FROSITE_BLOCK)
                .criterion(hasItem(ModBlocks.DARKEN_FROSITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_FROSITE_BLOCK))
                .offerTo(exporter, new Identifier("darken_frosite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILES, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILES, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILES, ModBlocks.DARKEN_FROSITE_BLOCK);

        createStairsRecipe(ModBlocks.DARKEN_FROSITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_FROSITE_BRICKS))
                .criterion(hasItem(ModBlocks.DARKEN_FROSITE_BRICKS),conditionsFromItem(ModBlocks.DARKEN_FROSITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_FROSITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_STAIRS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_STAIRS, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_STAIRS, ModBlocks.DARKEN_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_STAIRS, ModBlocks.DARKEN_FROSITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_SLAB, ModBlocks.DARKEN_FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_SLAB, ModBlocks.FROSITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_SLAB, ModBlocks.DARKEN_FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_BRICK_SLAB, ModBlocks.DARKEN_FROSITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_BRICK_WALL, ModBlocks.DARKEN_FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_BRICK_WALL, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_BRICK_WALL, ModBlocks.FROSITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_BRICK_WALL, ModBlocks.DARKEN_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_BRICK_WALL, ModBlocks.DARKEN_FROSITE_BRICKS);

        createStairsRecipe(ModBlocks.DARKEN_FROSITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_FROSITE_TILES))
                .criterion(hasItem(ModBlocks.DARKEN_FROSITE_TILES),conditionsFromItem(ModBlocks.DARKEN_FROSITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_FROSITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_STAIRS, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_STAIRS, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_STAIRS, ModBlocks.DARKEN_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_STAIRS, ModBlocks.DARKEN_FROSITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_SLAB, ModBlocks.DARKEN_FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_SLAB, ModBlocks.FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_SLAB, ModBlocks.FROSITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_SLAB, ModBlocks.DARKEN_FROSITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_FROSITE_TILE_SLAB, ModBlocks.DARKEN_FROSITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_TILE_WALL, ModBlocks.DARKEN_FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_TILE_WALL, ModBlocks.FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_TILE_WALL, ModBlocks.FROSITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_TILE_WALL, ModBlocks.DARKEN_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_FROSITE_TILE_WALL, ModBlocks.DARKEN_FROSITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.LIGHT_SANDITE_BLOCK)
                .input('I', ModItems.SANDITE)
                .criterion(hasItem(ModBlocks.LIGHT_SANDITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_SANDITE_BLOCK))
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .offerTo(exporter, new Identifier("light_sandite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICKS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICKS, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICKS, ModBlocks.LIGHT_SANDITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.LIGHT_SANDITE_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHT_SANDITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_SANDITE_BLOCK))
                .offerTo(exporter, new Identifier("light_sandite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILES, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILES, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILES, ModBlocks.LIGHT_SANDITE_BLOCK);

        createStairsRecipe(ModBlocks.LIGHT_SANDITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_SANDITE_BRICKS))
                .criterion(hasItem(ModBlocks.LIGHT_SANDITE_BRICKS),conditionsFromItem(ModBlocks.LIGHT_SANDITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_SANDITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_STAIRS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_STAIRS, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_STAIRS, ModBlocks.LIGHT_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_STAIRS, ModBlocks.LIGHT_SANDITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_SLAB, ModBlocks.LIGHT_SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_SLAB, ModBlocks.SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_SLAB, ModBlocks.SANDITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_SLAB, ModBlocks.LIGHT_SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_BRICK_SLAB, ModBlocks.LIGHT_SANDITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_BRICK_WALL, ModBlocks.LIGHT_SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_BRICK_WALL, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_BRICK_WALL, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_BRICK_WALL, ModBlocks.LIGHT_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_BRICK_WALL, ModBlocks.LIGHT_SANDITE_BRICKS);

        createStairsRecipe(ModBlocks.LIGHT_SANDITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_SANDITE_TILES))
                .criterion(hasItem(ModBlocks.LIGHT_SANDITE_TILES),conditionsFromItem(ModBlocks.LIGHT_SANDITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_SANDITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_STAIRS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_STAIRS, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_STAIRS, ModBlocks.LIGHT_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_STAIRS, ModBlocks.LIGHT_SANDITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_SLAB, ModBlocks.LIGHT_SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_SLAB, ModBlocks.SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_SLAB, ModBlocks.SANDITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_SLAB, ModBlocks.LIGHT_SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_SANDITE_TILE_SLAB, ModBlocks.LIGHT_SANDITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_TILE_WALL, ModBlocks.LIGHT_SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_TILE_WALL, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_TILE_WALL, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_TILE_WALL, ModBlocks.LIGHT_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_SANDITE_TILE_WALL, ModBlocks.LIGHT_SANDITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.DARKEN_SANDITE_BLOCK)
                .input('I', ModItems.SANDITE)
                .criterion(hasItem(ModBlocks.DARKEN_SANDITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_SANDITE_BLOCK))
                .criterion(hasItem(ModItems.SANDITE), conditionsFromItem(ModItems.SANDITE))
                .offerTo(exporter, new Identifier("darken_sandite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICKS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICKS, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICKS, ModBlocks.DARKEN_SANDITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.DARKEN_SANDITE_BLOCK)
                .criterion(hasItem(ModBlocks.DARKEN_SANDITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_SANDITE_BLOCK))
                .offerTo(exporter, new Identifier("darken_sandite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILES, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILES, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILES, ModBlocks.DARKEN_SANDITE_BLOCK);

        createStairsRecipe(ModBlocks.DARKEN_SANDITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_SANDITE_BRICKS))
                .criterion(hasItem(ModBlocks.DARKEN_SANDITE_BRICKS),conditionsFromItem(ModBlocks.DARKEN_SANDITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_SANDITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_STAIRS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_STAIRS, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_STAIRS, ModBlocks.DARKEN_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_STAIRS, ModBlocks.DARKEN_SANDITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_SLAB, ModBlocks.DARKEN_SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_SLAB, ModBlocks.SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_SLAB, ModBlocks.SANDITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_SLAB, ModBlocks.DARKEN_SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_BRICK_SLAB, ModBlocks.DARKEN_SANDITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_BRICK_WALL, ModBlocks.DARKEN_SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_BRICK_WALL, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_BRICK_WALL, ModBlocks.SANDITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_BRICK_WALL, ModBlocks.DARKEN_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_BRICK_WALL, ModBlocks.DARKEN_SANDITE_BRICKS);

        createStairsRecipe(ModBlocks.DARKEN_SANDITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_SANDITE_TILES))
                .criterion(hasItem(ModBlocks.DARKEN_SANDITE_TILES),conditionsFromItem(ModBlocks.DARKEN_SANDITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_SANDITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_STAIRS, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_STAIRS, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_STAIRS, ModBlocks.DARKEN_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_STAIRS, ModBlocks.DARKEN_SANDITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_SLAB, ModBlocks.DARKEN_SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_SLAB, ModBlocks.SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_SLAB, ModBlocks.SANDITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_SLAB, ModBlocks.DARKEN_SANDITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_SANDITE_TILE_SLAB, ModBlocks.DARKEN_SANDITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_TILE_WALL, ModBlocks.DARKEN_SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_TILE_WALL, ModBlocks.SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_TILE_WALL, ModBlocks.SANDITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_TILE_WALL, ModBlocks.DARKEN_SANDITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_SANDITE_TILE_WALL, ModBlocks.DARKEN_SANDITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.LIGHT_LEAFITE_BLOCK)
                .input('I', ModItems.LEAFITE)
                .criterion(hasItem(ModBlocks.LIGHT_LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_LEAFITE_BLOCK))
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .offerTo(exporter, new Identifier("light_leafite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICKS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICKS, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICKS, ModBlocks.LIGHT_LEAFITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.LIGHT_LEAFITE_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHT_LEAFITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_LEAFITE_BLOCK))
                .offerTo(exporter, new Identifier("light_leafite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILES, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILES, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILES, ModBlocks.LIGHT_LEAFITE_BLOCK);

        createStairsRecipe(ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_LEAFITE_BRICKS))
                .criterion(hasItem(ModBlocks.LIGHT_LEAFITE_BRICKS),conditionsFromItem(ModBlocks.LIGHT_LEAFITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS, ModBlocks.LIGHT_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS, ModBlocks.LIGHT_LEAFITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_SLAB, ModBlocks.LIGHT_LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_SLAB, ModBlocks.LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_SLAB, ModBlocks.LEAFITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_SLAB, ModBlocks.LIGHT_LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_BRICK_SLAB, ModBlocks.LIGHT_LEAFITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_BRICK_WALL, ModBlocks.LIGHT_LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_BRICK_WALL, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_BRICK_WALL, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_BRICK_WALL, ModBlocks.LIGHT_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_BRICK_WALL, ModBlocks.LIGHT_LEAFITE_BRICKS);

        createStairsRecipe(ModBlocks.LIGHT_LEAFITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_LEAFITE_TILES))
                .criterion(hasItem(ModBlocks.LIGHT_LEAFITE_TILES),conditionsFromItem(ModBlocks.LIGHT_LEAFITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_LEAFITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_STAIRS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_STAIRS, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_STAIRS, ModBlocks.LIGHT_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_STAIRS, ModBlocks.LIGHT_LEAFITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_SLAB, ModBlocks.LIGHT_LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_SLAB, ModBlocks.LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_SLAB, ModBlocks.LEAFITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_SLAB, ModBlocks.LIGHT_LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_LEAFITE_TILE_SLAB, ModBlocks.LIGHT_LEAFITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_TILE_WALL, ModBlocks.LIGHT_LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_TILE_WALL, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_TILE_WALL, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_TILE_WALL, ModBlocks.LIGHT_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_LEAFITE_TILE_WALL, ModBlocks.LIGHT_LEAFITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.DARKEN_LEAFITE_BLOCK)
                .input('I', ModItems.LEAFITE)
                .criterion(hasItem(ModBlocks.DARKEN_LEAFITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_LEAFITE_BLOCK))
                .criterion(hasItem(ModItems.LEAFITE), conditionsFromItem(ModItems.LEAFITE))
                .offerTo(exporter, new Identifier("darken_leafite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICKS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICKS, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICKS, ModBlocks.DARKEN_LEAFITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.DARKEN_LEAFITE_BLOCK)
                .criterion(hasItem(ModBlocks.DARKEN_LEAFITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_LEAFITE_BLOCK))
                .offerTo(exporter, new Identifier("darken_leafite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILES, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILES, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILES, ModBlocks.DARKEN_LEAFITE_BLOCK);

        createStairsRecipe(ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_LEAFITE_BRICKS))
                .criterion(hasItem(ModBlocks.DARKEN_LEAFITE_BRICKS),conditionsFromItem(ModBlocks.DARKEN_LEAFITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS, ModBlocks.DARKEN_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS, ModBlocks.DARKEN_LEAFITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_SLAB, ModBlocks.DARKEN_LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_SLAB, ModBlocks.LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_SLAB, ModBlocks.LEAFITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_SLAB, ModBlocks.DARKEN_LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_BRICK_SLAB, ModBlocks.DARKEN_LEAFITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_BRICK_WALL, ModBlocks.DARKEN_LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_BRICK_WALL, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_BRICK_WALL, ModBlocks.LEAFITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_BRICK_WALL, ModBlocks.DARKEN_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_BRICK_WALL, ModBlocks.DARKEN_LEAFITE_BRICKS);

        createStairsRecipe(ModBlocks.DARKEN_LEAFITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_LEAFITE_TILES))
                .criterion(hasItem(ModBlocks.DARKEN_LEAFITE_TILES),conditionsFromItem(ModBlocks.DARKEN_LEAFITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_LEAFITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_STAIRS, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_STAIRS, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_STAIRS, ModBlocks.DARKEN_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_STAIRS, ModBlocks.DARKEN_LEAFITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_SLAB, ModBlocks.DARKEN_LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_SLAB, ModBlocks.LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_SLAB, ModBlocks.LEAFITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_SLAB, ModBlocks.DARKEN_LEAFITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_LEAFITE_TILE_SLAB, ModBlocks.DARKEN_LEAFITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_TILE_WALL, ModBlocks.DARKEN_LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_TILE_WALL, ModBlocks.LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_TILE_WALL, ModBlocks.LEAFITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_TILE_WALL, ModBlocks.DARKEN_LEAFITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_LEAFITE_TILE_WALL, ModBlocks.DARKEN_LEAFITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.LIGHT_END_ITE_BLOCK)
                .input('I', ModItems.END_ITE)
                .criterion(hasItem(ModBlocks.LIGHT_END_ITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_END_ITE_BLOCK))
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .offerTo(exporter, new Identifier("light_end_ite_bricks"));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICKS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICKS, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICKS, ModBlocks.LIGHT_END_ITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.LIGHT_END_ITE_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHT_END_ITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_END_ITE_BLOCK))
                .offerTo(exporter, new Identifier("light_end_ite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILES, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILES, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILES, ModBlocks.LIGHT_END_ITE_BLOCK);

        createStairsRecipe(ModBlocks.LIGHT_END_ITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_END_ITE_BRICKS))
                .criterion(hasItem(ModBlocks.LIGHT_END_ITE_BRICKS),conditionsFromItem(ModBlocks.LIGHT_END_ITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_END_ITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_STAIRS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_STAIRS, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_STAIRS, ModBlocks.LIGHT_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_STAIRS, ModBlocks.LIGHT_END_ITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_SLAB, ModBlocks.LIGHT_END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_SLAB, ModBlocks.END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_SLAB, ModBlocks.END_ITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_SLAB, ModBlocks.LIGHT_END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_BRICK_SLAB, ModBlocks.LIGHT_END_ITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_BRICK_WALL, ModBlocks.LIGHT_END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_BRICK_WALL, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_BRICK_WALL, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_BRICK_WALL, ModBlocks.LIGHT_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_BRICK_WALL, ModBlocks.LIGHT_END_ITE_BRICKS);

        createStairsRecipe(ModBlocks.LIGHT_END_ITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_END_ITE_TILES))
                .criterion(hasItem(ModBlocks.LIGHT_END_ITE_TILES),conditionsFromItem(ModBlocks.LIGHT_END_ITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_END_ITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_STAIRS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_STAIRS, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_STAIRS, ModBlocks.LIGHT_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_STAIRS, ModBlocks.LIGHT_END_ITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_SLAB, ModBlocks.LIGHT_END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_SLAB, ModBlocks.END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_SLAB, ModBlocks.END_ITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_SLAB, ModBlocks.LIGHT_END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_END_ITE_TILE_SLAB, ModBlocks.LIGHT_END_ITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_TILE_WALL, ModBlocks.LIGHT_END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_TILE_WALL, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_TILE_WALL, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_TILE_WALL, ModBlocks.LIGHT_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_END_ITE_TILE_WALL, ModBlocks.LIGHT_END_ITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICKS,4)
                .pattern("IB")
                .pattern("BI")
                .input('B', ModBlocks.DARKEN_END_ITE_BLOCK)
                .input('I', ModItems.END_ITE)
                .criterion(hasItem(ModBlocks.DARKEN_END_ITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_END_ITE_BLOCK))
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .offerTo(exporter, new Identifier("darken_end_ite_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICKS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICKS, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICKS, ModBlocks.DARKEN_END_ITE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILES,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModBlocks.DARKEN_END_ITE_BLOCK)
                .criterion(hasItem(ModBlocks.DARKEN_END_ITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_END_ITE_BLOCK))
                .offerTo(exporter, new Identifier("darken_end_ite_tiles"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILES, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILES, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILES, ModBlocks.DARKEN_END_ITE_BLOCK);

        createStairsRecipe(ModBlocks.DARKEN_END_ITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_END_ITE_BRICKS))
                .criterion(hasItem(ModBlocks.DARKEN_END_ITE_BRICKS),conditionsFromItem(ModBlocks.DARKEN_END_ITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_END_ITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_STAIRS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_STAIRS, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_STAIRS, ModBlocks.DARKEN_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_STAIRS, ModBlocks.DARKEN_END_ITE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_SLAB, ModBlocks.DARKEN_END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_SLAB, ModBlocks.END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_SLAB, ModBlocks.END_ITE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_SLAB, ModBlocks.DARKEN_END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_BRICK_SLAB, ModBlocks.DARKEN_END_ITE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_BRICK_WALL, ModBlocks.DARKEN_END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_BRICK_WALL, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_BRICK_WALL, ModBlocks.END_ITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_BRICK_WALL, ModBlocks.DARKEN_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_BRICK_WALL, ModBlocks.DARKEN_END_ITE_BRICKS);

        createStairsRecipe(ModBlocks.DARKEN_END_ITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.DARKEN_END_ITE_TILES))
                .criterion(hasItem(ModBlocks.DARKEN_END_ITE_TILES),conditionsFromItem(ModBlocks.DARKEN_END_ITE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_END_ITE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_STAIRS, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_STAIRS, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_STAIRS, ModBlocks.DARKEN_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_STAIRS, ModBlocks.DARKEN_END_ITE_TILES);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_SLAB, ModBlocks.DARKEN_END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_SLAB, ModBlocks.END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_SLAB, ModBlocks.END_ITE_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_SLAB, ModBlocks.DARKEN_END_ITE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_END_ITE_TILE_SLAB, ModBlocks.DARKEN_END_ITE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_TILE_WALL, ModBlocks.DARKEN_END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_TILE_WALL, ModBlocks.END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_TILE_WALL, ModBlocks.END_ITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_TILE_WALL, ModBlocks.DARKEN_END_ITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARKEN_END_ITE_TILE_WALL, ModBlocks.DARKEN_END_ITE_TILES);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.ICY_CROCUS)
                .criterion(hasItem(ModBlocks.ICY_CROCUS), conditionsFromItem(ModBlocks.ICY_CROCUS))
                .offerTo(exporter, new Identifier("light_blue_dye_from_icy_crocus"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems
                        (ModItems.FROZEN_FLESH), RecipeCategory.MISC, Items.ROTTEN_FLESH,0.35f, 200)
                .criterion(hasItem(ModItems.FROZEN_FLESH), conditionsFromItem(ModItems.FROZEN_FLESH))
                .offerTo(exporter, new Identifier("rotten_flesh_from_smelting"));
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems
                        (ModItems.FROZEN_FLESH), RecipeCategory.MISC, Items.ROTTEN_FLESH,0.35f, 100)
                .criterion(hasItem(ModItems.FROZEN_FLESH), conditionsFromItem(ModItems.FROZEN_FLESH))
                .offerTo(exporter, new Identifier("rotten_flesh_from_smoking"));
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems
                        (ModItems.FROZEN_FLESH), RecipeCategory.MISC, Items.ROTTEN_FLESH,0.35f, 600)
                .criterion(hasItem(ModItems.FROZEN_FLESH), conditionsFromItem(ModItems.FROZEN_FLESH))
                .offerTo(exporter, new Identifier("rotten_flesh_from_campfire_cooking"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICKS,4)
                .pattern("II")
                .pattern("II")
                .input('I', Items.PACKED_ICE)
                .criterion(hasItem(Items.PACKED_ICE), conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier("ice_bricks"));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICKS, Items.PACKED_ICE);

        createStairsRecipe(ModBlocks.ICE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.ICE_BRICKS))
                .criterion(hasItem(ModBlocks.ICE_BRICKS),conditionsFromItem(ModBlocks.ICE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICK_STAIRS, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICK_STAIRS, ModBlocks.ICE_BRICKS);
        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICK_SLAB, ModBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICK_SLAB, Items.PACKED_ICE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICK_SLAB, ModBlocks.ICE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ICE_BRICK_WALL, ModBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ICE_BRICK_WALL, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ICE_BRICK_WALL, ModBlocks.ICE_BRICKS);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_PILLAR, ModBlocks.ICE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_PILLAR, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_PILLAR, ModBlocks.ICE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REINFORCED_FROSITE_BLOCK)
                .pattern("TIT")
                .pattern("IFI")
                .pattern("TIT")
                .input('F', ModBlocks.FROSITE_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("reinforced_frosite_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REINFORCED_FROSITE_BLOCK)
                .pattern("TIT")
                .pattern("IFI")
                .pattern("TIT")
                .input('F', ModBlocks.FROSITE_BLOCK)
                .input('I', ModItems.ALUMINUM_INGOT)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("reinforced_frosite_block_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_REINFORCED_FROSITE_BLOCK)
                .pattern("TIT")
                .pattern("IFI")
                .pattern("TIT")
                .input('F', ModBlocks.LIGHT_FROSITE_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModBlocks.LIGHT_FROSITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_FROSITE_BLOCK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("light_reinforced_frosite_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_REINFORCED_FROSITE_BLOCK)
                .pattern("TIT")
                .pattern("IFI")
                .pattern("TIT")
                .input('F', ModBlocks.LIGHT_FROSITE_BLOCK)
                .input('I', ModItems.ALUMINUM_INGOT)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("light_reinforced_frosite_block_from_aluminum_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_REINFORCED_FROSITE_BLOCK)
                .pattern("TIT")
                .pattern("IFI")
                .pattern("TIT")
                .input('F', ModBlocks.DARKEN_FROSITE_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModBlocks.DARKEN_FROSITE_BLOCK), conditionsFromItem(ModBlocks.DARKEN_FROSITE_BLOCK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("darken_reinforced_frosite_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_REINFORCED_FROSITE_BLOCK)
                .pattern("TIT")
                .pattern("IFI")
                .pattern("TIT")
                .input('F', ModBlocks.DARKEN_FROSITE_BLOCK)
                .input('I', ModItems.ALUMINUM_INGOT)
                .input('T', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModBlocks.FROSITE_BLOCK), conditionsFromItem(ModBlocks.FROSITE_BLOCK))
                .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier("darken_reinforced_frosite_block_from_aluminum_ingot"));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_REINFORCED_FROSITE_BLOCK, ModBlocks.REINFORCED_FROSITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKEN_REINFORCED_FROSITE_BLOCK, ModBlocks.REINFORCED_FROSITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BOMB)
                .pattern(" IS")
                .pattern("IGI")
                .pattern(" I ")
                .input('G', Items.GUNPOWDER)
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STRING)
                .criterion(hasItem(Items.GUNPOWDER), conditionsFromItem(Items.GUNPOWDER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .offerTo(exporter, new Identifier("bomb"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ICE_BOMB)
                .pattern(" IF")
                .pattern("IBI")
                .pattern(" I ")
                .input('B', ModItems.BOMB)
                .input('I', ModItems.ICE_CHUNK)
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModItems.BOMB), conditionsFromItem(ModItems.BOMB))
                .criterion(hasItem(ModItems.ICE_CHUNK), conditionsFromItem(ModItems.ICE_CHUNK))
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier("ice_bomb"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.FROSITE_PRESSURE_PLATE)
                .pattern("FF")
                .input('F', ModItems.FROSITE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROSITE_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.FROSITE_BUTTON)
                .input(ModItems.FROSITE)
                .criterion(hasItem(ModItems.FROSITE), conditionsFromItem(ModItems.FROSITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FROSITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_FROSITE_PRESSURE_PLATE)
                .input(ModBlocks.FROSITE_PRESSURE_PLATE)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.FROSITE_PRESSURE_PLATE), conditionsFromItem(ModBlocks.FROSITE_PRESSURE_PLATE))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_FROSITE_PRESSURE_PLATE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_FROSITE_BUTTON)
                .input(ModBlocks.FROSITE_BUTTON)
                .input(ModItems.POWDERED_SALT)
                .criterion(hasItem(ModBlocks.FROSITE_BUTTON), conditionsFromItem(ModBlocks.FROSITE_BUTTON))
                .criterion(hasItem(ModItems.POWDERED_SALT), conditionsFromItem(ModItems.POWDERED_SALT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_FROSITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKEN_FROSITE_PRESSURE_PLATE)
                .input(ModBlocks.FROSITE_PRESSURE_PLATE)
                .input(Items.AMETHYST_SHARD)
                .criterion(hasItem(ModBlocks.FROSITE_PRESSURE_PLATE), conditionsFromItem(ModBlocks.FROSITE_PRESSURE_PLATE))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_FROSITE_PRESSURE_PLATE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKEN_FROSITE_BUTTON)
                .input(ModBlocks.FROSITE_BUTTON)
                .input(Items.AMETHYST_SHARD)
                .criterion(hasItem(ModBlocks.FROSITE_BUTTON), conditionsFromItem(ModBlocks.FROSITE_BUTTON))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARKEN_FROSITE_BUTTON)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ICE_CHUNK,
                RecipeCategory.BUILDING_BLOCKS, Items.PACKED_ICE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_CARVER)
                .input(ModItems.SILVER_SCALE)
                .input(ModItems.SILVER_SCALE)
                .input(Items.STICK)
                .criterion(hasItem(ModItems.SILVER_SCALE), conditionsFromItem(ModItems.SILVER_SCALE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("silver_carver"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEAFITE,2)
                .input(ModBlocks.LEAFITE_LEAVES_ORE)
                .criterion(hasItem(ModBlocks.LEAFITE_LEAVES_ORE), conditionsFromItem(ModBlocks.LEAFITE_LEAVES_ORE))
                .offerTo(exporter, new Identifier("leafite_from_leafite_ore"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_DRILL)
                .pattern(" E ")
                .pattern("EBP")
                .pattern(" E ")
                .input('E', ModItems.END_ITE)
                .input('B', ModBlocks.END_ITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(ModBlocks.END_ITE_BLOCK), conditionsFromItem(ModBlocks.END_ITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("end_ite_drill"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.END_ITE_CHAINSAW)
                .pattern("  P")
                .pattern("EEB")
                .input('E', ModItems.END_ITE)
                .input('B', ModBlocks.END_ITE_BLOCK)
                .input('P', ModItems.HANDLED_POWER_DRIVE)
                .criterion(hasItem(ModItems.END_ITE), conditionsFromItem(ModItems.END_ITE))
                .criterion(hasItem(ModBlocks.END_ITE_BLOCK), conditionsFromItem(ModBlocks.END_ITE_BLOCK))
                .criterion(hasItem(ModItems.HANDLED_POWER_DRIVE), conditionsFromItem(ModItems.HANDLED_POWER_DRIVE))
                .offerTo(exporter, new Identifier("end_ite_chainsaw"));
    }
}