package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.FROSITE_BLOCK);
        addDrop(ModBlocks.FROSITE_BRICKS);
        addDrop(ModBlocks.FROSITE_BRICK_STAIRS);
        addDrop(ModBlocks.FROSITE_BRICK_WALL);
        addDrop(ModBlocks.FROSITE_TILES);
        addDrop(ModBlocks.FROSITE_TILE_STAIRS);
        addDrop(ModBlocks.FROSITE_TILE_WALL);
        addDrop(ModBlocks.CHISELED_FROSITE);
        addDrop(ModBlocks.RAW_ALUMINUM_BLOCK);
        addDrop(ModBlocks.ALUMINUM_BLOCK);
        addDrop(ModBlocks.ALUMINUM_TRAPDOOR);
        addDrop(ModBlocks.ALUMINUM_BARS);
        addDrop(ModBlocks.ALUMINUM_PRESSURE_PLATE);
        addDrop(ModBlocks.RAW_NICKEL_BLOCK);
        addDrop(ModBlocks.NICKEL_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.RAW_STEEL_BLOCK);
        addDrop(ModBlocks.SMOOTH_STEEL_BLOCK);
        addDrop(ModBlocks.CUT_STEEL);
        addDrop(ModBlocks.CUT_STEEL_STAIRS);
        addDrop(ModBlocks.STEEL_TRAPDOOR);
        addDrop(ModBlocks.STEEL_BARS);
        addDrop(ModBlocks.STEEL_PRESSURE_PLATE);
        addDrop(ModBlocks.STEEL_LAMP);
        addDrop(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP);
        addDrop(ModBlocks.RUSTED_STEEL_LAMP);
        addDrop(ModBlocks.STONEBARK_LOG);
        addDrop(ModBlocks.STONEBARK_WOOD);
        addDrop(ModBlocks.STRIPPED_STONEBARK_LOG);
        addDrop(ModBlocks.STRIPPED_STONEBARK_WOOD);
        addDrop(ModBlocks.STONEBARK_PLANKS);
        addDrop(ModBlocks.DEEPSLATE_LOG);
        addDrop(ModBlocks.DEEPSLATE_WOOD);
        addDrop(ModBlocks.STRIPPED_DEEPSLATE_LOG);
        addDrop(ModBlocks.STRIPPED_DEEPSLATE_WOOD);
        addDrop(ModBlocks.DEEPSLATE_PLANKS);
        addDrop(ModBlocks.STONEBARK_STAIRS);
        addDrop(ModBlocks.STONEBARK_FENCE);
        addDrop(ModBlocks.STONEBARK_FENCE_GATE);
        addDrop(ModBlocks.STONEBARK_BUTTON);
        addDrop(ModBlocks.STONEBARK_PRESSURE_PLATE);
        addDrop(ModBlocks.STONEBARK_TRAPDOOR);
        addDrop(ModBlocks.DEEPBARK_STAIRS);
        addDrop(ModBlocks.DEEPBARK_FENCE);
        addDrop(ModBlocks.DEEPBARK_FENCE_GATE);
        addDrop(ModBlocks.DEEPBARK_BUTTON);
        addDrop(ModBlocks.DEEPBARK_PRESSURE_PLATE);
        addDrop(ModBlocks.NICKEL_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPBARK_TRAPDOOR);
        addDrop(ModBlocks.STONEBARK_SAPLING);
        addDrop(ModBlocks.DEEPBARK_SAPLING);
        addDrop(ModBlocks.LEAFITE_SAPLING);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.TUNGSTEN_BLOCK);
        addDrop(ModBlocks.TITANIUM_ALLOY_BLOCK);
        addDrop(ModBlocks.COBALT_BLOCK);
        addDrop(ModBlocks.WHITE_SAND);
        addDrop(ModBlocks.WHITE_SANDSTONE);
        addDrop(ModBlocks.WHITE_SANDSTONE_STAIRS);
        addDrop(ModBlocks.WHITE_SANDSTONE_WALL);
        addDrop(ModBlocks.CUT_WHITE_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_WHITE_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CHISELED_WHITE_SANDSTONE);
        addDrop(ModBlocks.BLACK_SAND);
        addDrop(ModBlocks.BLACK_SANDSTONE);
        addDrop(ModBlocks.BLACK_SANDSTONE_STAIRS);
        addDrop(ModBlocks.BLACK_SANDSTONE_WALL);
        addDrop(ModBlocks.CUT_BLACK_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_BLACK_SANDSTONE);
        addDrop(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CHISELED_BLACK_SANDSTONE);
        addDrop(ModBlocks.FAKE_BEDROCK);
        addDrop(ModBlocks.POLISHED_BEDROCK);
        addDrop(ModBlocks.POLISHED_BEDROCK_STAIRS);
        addDrop(ModBlocks.POLISHED_BEDROCK_WALL);
        addDrop(ModBlocks.POLISHED_BEDROCK_BRICKS);
        addDrop(ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS);
        addDrop(ModBlocks.POLISHED_BEDROCK_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_POLISHED_BEDROCK);
        addDrop(ModBlocks.SANDITE_BLOCK);
        addDrop(ModBlocks.SANDITE_BRICKS);
        addDrop(ModBlocks.SANDITE_BRICK_STAIRS);
        addDrop(ModBlocks.SANDITE_BRICK_WALL);
        addDrop(ModBlocks.SANDITE_TILES);
        addDrop(ModBlocks.SANDITE_TILE_STAIRS);
        addDrop(ModBlocks.SANDITE_TILE_WALL);
        addDrop(ModBlocks.CHISELED_SANDITE);
        addDrop(ModBlocks.FLINT_SPIKES);
        addDrop(ModBlocks.IRON_SPIKES);
        addDrop(ModBlocks.ALUMINUM_SPIKES);
        addDrop(ModBlocks.STEEL_SPIKES);
        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.MARBLE_STAIRS);
        addDrop(ModBlocks.MARBLE_WALL);
        addDrop(ModBlocks.MARBLE_BRICKS);
        addDrop(ModBlocks.MARBLE_BRICK_STAIRS);
        addDrop(ModBlocks.MARBLE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_MARBLE);
        addDrop(ModBlocks.GILDED_MARBLE);
        addDrop(ModBlocks.GILDED_MARBLE_BRICKS);
        addDrop(ModBlocks.POLISHED_ANDESITE_BRICKS);
        addDrop(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_ANDESITE_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_DIORITE_BRICKS);
        addDrop(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_DIORITE_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_BRICKS);
        addDrop(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_GRANITE_BRICK_WALL);
        addDrop(ModBlocks.SILVER_CROWN);
        addDrop(ModBlocks.SILVER_SCALES);
        addDrop(ModBlocks.SILVER_SCALE_CORE);
        addDrop(ModBlocks.SILVER_SCALE_FACE);
        addDrop(ModBlocks.ENDER_DRAGON_TROPHY);
        addDrop(ModBlocks.WITHER_TROPHY);
        addDrop(ModBlocks.ELDER_GUARDIAN_TROPHY);
        addDrop(ModBlocks.WARDEN_TROPHY);
        addDrop(ModBlocks.SILVERWYRM_TROPHY);
        addDrop(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK);
        addDrop(ModBlocks.LIGHTY_RUSTED_CUT_STEEL);
        addDrop(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS);
        addDrop(ModBlocks.RUSTED_STEEL_BLOCK);
        addDrop(ModBlocks.RUSTED_CUT_STEEL);
        addDrop(ModBlocks.RUSTED_CUT_STEEL_STAIRS);
        addDrop(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR);
        addDrop(ModBlocks.RUSTED_STEEL_TRAPDOOR);
        addDrop(ModBlocks.LIGHTY_RUSTED_STEEL_BARS);
        addDrop(ModBlocks.RUSTED_STEEL_BARS);
        addDrop(ModBlocks.LEAFITE_BLOCK);
        addDrop(ModBlocks.LEAFITE_BRICKS);
        addDrop(ModBlocks.LEAFITE_BRICK_STAIRS);
        addDrop(ModBlocks.LEAFITE_BRICK_WALL);
        addDrop(ModBlocks.LEAFITE_TILES);
        addDrop(ModBlocks.LEAFITE_TILE_STAIRS);
        addDrop(ModBlocks.LEAFITE_TILE_WALL);
        addDrop(ModBlocks.CHISELED_LEAFITE);
        addDrop(ModBlocks.LEAFITE_LOG);
        addDrop(ModBlocks.LEAFITE_WOOD);
        addDrop(ModBlocks.STRIPPED_LEAFITE_LOG);
        addDrop(ModBlocks.STRIPPED_LEAFITE_WOOD);
        addDrop(ModBlocks.LEAFITE_PLANKS);
        addDrop(ModBlocks.LEAFITE_PLANKS_STAIRS);
        addDrop(ModBlocks.LEAFITE_PLANKS_FENCE);
        addDrop(ModBlocks.LEAFITE_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.LEAFITE_PLANKS_BUTTON);
        addDrop(ModBlocks.LEAFITE_PLANKS_PRESSURE_PLATE);
        addDrop(ModBlocks.LEAFITE_TRAPDOOR);
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.VOID_STONE);
        addDrop(ModBlocks.VOID_STONE_BRICKS);
        addDrop(ModBlocks.VOID_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.VOID_STONE_BRICK_WALL);
        addDrop(ModBlocks.END_ITE_BLOCK);
        addDrop(ModBlocks.END_ITE_BRICKS);
        addDrop(ModBlocks.END_ITE_BRICK_STAIRS);
        addDrop(ModBlocks.END_ITE_BRICK_WALL);
        addDrop(ModBlocks.END_ITE_TILES);
        addDrop(ModBlocks.END_ITE_TILE_STAIRS);
        addDrop(ModBlocks.END_ITE_TILE_WALL);
        addDrop(ModBlocks.CHISELED_END_ITE);
        addDrop(ModBlocks.LIGHT_FROSITE_BLOCK);
        addDrop(ModBlocks.DARKEN_FROSITE_BLOCK);
        addDrop(ModBlocks.LIGHT_SANDITE_BLOCK);
        addDrop(ModBlocks.DARKEN_SANDITE_BLOCK);
        addDrop(ModBlocks.LIGHT_LEAFITE_BLOCK);
        addDrop(ModBlocks.DARKEN_LEAFITE_BLOCK);
        addDrop(ModBlocks.LIGHT_END_ITE_BLOCK);
        addDrop(ModBlocks.DARKEN_END_ITE_BLOCK);
        addDrop(ModBlocks.LIGHT_FROSITE_BRICKS);
        addDrop(ModBlocks.LIGHT_FROSITE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_FROSITE_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_FROSITE_TILES);
        addDrop(ModBlocks.LIGHT_FROSITE_TILE_STAIRS);
        addDrop(ModBlocks.LIGHT_FROSITE_TILE_WALL);
        addDrop(ModBlocks.DARKEN_FROSITE_BRICKS);
        addDrop(ModBlocks.DARKEN_FROSITE_BRICK_STAIRS);
        addDrop(ModBlocks.DARKEN_FROSITE_BRICK_WALL);
        addDrop(ModBlocks.DARKEN_FROSITE_TILES);
        addDrop(ModBlocks.DARKEN_FROSITE_TILE_STAIRS);
        addDrop(ModBlocks.DARKEN_FROSITE_TILE_WALL);
        addDrop(ModBlocks.LIGHT_SANDITE_BRICKS);
        addDrop(ModBlocks.LIGHT_SANDITE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_SANDITE_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_SANDITE_TILES);
        addDrop(ModBlocks.LIGHT_SANDITE_TILE_STAIRS);
        addDrop(ModBlocks.LIGHT_SANDITE_TILE_WALL);
        addDrop(ModBlocks.DARKEN_SANDITE_BRICKS);
        addDrop(ModBlocks.DARKEN_SANDITE_BRICK_STAIRS);
        addDrop(ModBlocks.DARKEN_SANDITE_BRICK_WALL);
        addDrop(ModBlocks.DARKEN_SANDITE_TILES);
        addDrop(ModBlocks.DARKEN_SANDITE_TILE_STAIRS);
        addDrop(ModBlocks.DARKEN_SANDITE_TILE_WALL);
        addDrop(ModBlocks.LIGHT_LEAFITE_BRICKS);
        addDrop(ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_LEAFITE_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_LEAFITE_TILES);
        addDrop(ModBlocks.LIGHT_LEAFITE_TILE_STAIRS);
        addDrop(ModBlocks.LIGHT_LEAFITE_TILE_WALL);
        addDrop(ModBlocks.DARKEN_LEAFITE_BRICKS);
        addDrop(ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS);
        addDrop(ModBlocks.DARKEN_LEAFITE_BRICK_WALL);
        addDrop(ModBlocks.DARKEN_LEAFITE_TILES);
        addDrop(ModBlocks.DARKEN_LEAFITE_TILE_STAIRS);
        addDrop(ModBlocks.DARKEN_LEAFITE_TILE_WALL);
        addDrop(ModBlocks.LIGHT_END_ITE_BRICKS);
        addDrop(ModBlocks.LIGHT_END_ITE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_END_ITE_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_END_ITE_TILES);
        addDrop(ModBlocks.LIGHT_END_ITE_TILE_STAIRS);
        addDrop(ModBlocks.LIGHT_END_ITE_TILE_WALL);
        addDrop(ModBlocks.DARKEN_END_ITE_BRICKS);
        addDrop(ModBlocks.DARKEN_END_ITE_BRICK_STAIRS);
        addDrop(ModBlocks.DARKEN_END_ITE_BRICK_WALL);
        addDrop(ModBlocks.DARKEN_END_ITE_TILES);
        addDrop(ModBlocks.DARKEN_END_ITE_TILE_STAIRS);
        addDrop(ModBlocks.DARKEN_END_ITE_TILE_WALL);
        addDrop(ModBlocks.ICY_CROCUS);
        addDrop(ModBlocks.ICE_BRICKS);
        addDrop(ModBlocks.ICE_PILLAR);
        addDrop(ModBlocks.ICE_BRICK_STAIRS);
        addDrop(ModBlocks.ICE_BRICK_WALL);
        addDrop(ModBlocks.FROSITE_BUTTON);
        addDrop(ModBlocks.FROSITE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_FROSITE_BUTTON);
        addDrop(ModBlocks.LIGHT_FROSITE_PRESSURE_PLATE);
        addDrop(ModBlocks.DARKEN_FROSITE_BUTTON);
        addDrop(ModBlocks.DARKEN_FROSITE_PRESSURE_PLATE);

        addDrop(ModBlocks.SALT_ORE,copperLikeOreDrops(ModBlocks.SALT_ORE, ModItems.RAW_SALT));

        addDrop(ModBlocks.CRACKED_BEDROCK,copperLikeOreDrops(ModBlocks.CRACKED_BEDROCK, ModItems.BEDROCK_SHARD));

        addDrop(ModBlocks.LAVA_TANK,tankBlockDrops(ModBlocks.LAVA_TANK));
        addDrop(ModBlocks.WATER_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.AWKWARD_WATER_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.HEALING_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.REGENERATION_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.FIRE_RESISTANCE_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.STRENGTH_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.SWIFTNESS_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.NIGHT_VISION_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.INVISIBILITY_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.WATER_BREATHING_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.LEAPING_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.SLOW_FALLING_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.POISON_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.WEAKNESS_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.HARMING_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.SLOWNESS_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.TURTLE_MASTER_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.FROSTBITE_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.HEAT_STROKE_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.FATAL_POISON_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.VOID_SICKNESS_POTION_TANK,tankBlockDrops(ModBlocks.WATER_TANK));
        addDrop(ModBlocks.MILK_TANK,tankBlockDrops(ModBlocks.MILK_TANK));

        addDropWithSilkTouch(ModBlocks.REINFORCED_FROSITE_BLOCK,ModBlocks.FROSITE_BLOCK);
        addDropWithSilkTouch(ModBlocks.LIGHT_REINFORCED_FROSITE_BLOCK,ModBlocks.LIGHT_FROSITE_BLOCK);
        addDropWithSilkTouch(ModBlocks.DARKEN_REINFORCED_FROSITE_BLOCK,ModBlocks.DARKEN_FROSITE_BLOCK);

        addDrop(ModBlocks.FROSITE_ORE,oreDrops(ModBlocks.FROSITE_ORE, ModItems.FROSITE));

        addDrop(ModBlocks.SANDITE_ORE,oreDrops(ModBlocks.SANDITE_ORE, ModItems.SANDITE));

        addDrop(ModBlocks.END_ITE_ORE,oreDrops(ModBlocks.END_ITE_ORE, ModItems.END_ITE));

        addDrop(ModBlocks.ALUMINUM_ORE,oreDrops(ModBlocks.ALUMINUM_ORE, ModItems.RAW_ALUMINUM));
        addDrop(ModBlocks.DEEPSLATE_ALUMINUM_ORE,oreDrops(ModBlocks.DEEPSLATE_ALUMINUM_ORE, ModItems.RAW_ALUMINUM));

        addDrop(ModBlocks.NICKEL_ORE,oreDrops(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL));
        addDrop(ModBlocks.DEEPSLATE_NICKEL_ORE,oreDrops(ModBlocks.DEEPSLATE_NICKEL_ORE, ModItems.RAW_NICKEL));

        addDrop(ModBlocks.ICE_FROSITE_ORE,specialOreDrops(ModBlocks.ICE_FROSITE_ORE, ModItems.FROSITE));
        addDrop(ModBlocks.SANDSTONE_SANDITE_ORE,specialOreDrops(ModBlocks.SANDSTONE_SANDITE_ORE, ModItems.SANDITE));
        addDrop(ModBlocks.RED_SANDSTONE_SANDITE_ORE,specialOreDrops(ModBlocks.RED_SANDSTONE_SANDITE_ORE, ModItems.SANDITE));

        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE,oreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM));

        addDrop(ModBlocks.TERRACOTTA_GOLD_ORE,oreDrops(ModBlocks.TERRACOTTA_GOLD_ORE, Items.RAW_GOLD));
        addDrop(ModBlocks.GRAVEL_COAL_ORE,oreDrops(ModBlocks.GRAVEL_COAL_ORE, Items.COAL));
        addDrop(ModBlocks.DRIPSTONE_COPPER_ORE,copperLikeOreDrops(ModBlocks.DRIPSTONE_COPPER_ORE, Items.RAW_COPPER));
        addDrop(ModBlocks.TUFF_IRON_ORE,oreDrops(ModBlocks.TUFF_IRON_ORE, Items.RAW_IRON));

        addDrop(ModBlocks.NETHER_TUNGSTEN_ORE,copperLikeOreDrops(ModBlocks.NETHER_TUNGSTEN_ORE, ModItems.TUNGSTEN_NUGGET));

        addDrop(ModBlocks.NETHER_COBALT_ORE,nuggetLikeOreDrops(ModBlocks.NETHER_COBALT_ORE, ModItems.COBALT_NUGGET));

        addDrop(ModBlocks.COBBLESTONE_COAL_ORE,oreDrops(ModBlocks.COBBLESTONE_COAL_ORE, Items.COAL));
        addDrop(ModBlocks.COBBLESTONE_IRON_ORE,oreDrops(ModBlocks.COBBLESTONE_IRON_ORE, Items.RAW_IRON));
        addDrop(ModBlocks.COBBLESTONE_COPPER_ORE,copperOreDrops(ModBlocks.COBBLESTONE_COPPER_ORE));
        addDrop(ModBlocks.COBBLESTONE_GOLD_ORE,oreDrops(ModBlocks.COBBLESTONE_GOLD_ORE, Items.RAW_GOLD));
        addDrop(ModBlocks.COBBLESTONE_LAPIS_ORE,lapisOreDrops(ModBlocks.COBBLESTONE_LAPIS_ORE));
        addDrop(ModBlocks.COBBLESTONE_REDSTONE_ORE,redstoneOreDrops(ModBlocks.COBBLESTONE_REDSTONE_ORE));
        addDrop(ModBlocks.COBBLESTONE_DIAMOND_ORE,oreDrops(ModBlocks.COBBLESTONE_DIAMOND_ORE, Items.DIAMOND));
        addDrop(ModBlocks.COBBLESTONE_EMERALD_ORE,oreDrops(ModBlocks.COBBLESTONE_EMERALD_ORE, Items.EMERALD));
        addDrop(ModBlocks.COBBLESTONE_QUARTZ_ORE,oreDrops(ModBlocks.COBBLESTONE_QUARTZ_ORE, Items.QUARTZ));

        addDrop(ModBlocks.COBBLESTONE_ALUMINUM_ORE,oreDrops(ModBlocks.COBBLESTONE_ALUMINUM_ORE, ModItems.RAW_ALUMINUM));
        addDrop(ModBlocks.COBBLESTONE_NICKEL_ORE,oreDrops(ModBlocks.COBBLESTONE_NICKEL_ORE, ModItems.RAW_NICKEL));
        addDrop(ModBlocks.COBBLESTONE_TITANIUM_ORE,oreDrops(ModBlocks.COBBLESTONE_TITANIUM_ORE, ModItems.RAW_TITANIUM));

        addDrop(ModBlocks.SCULK_DIAMOND_ORE,oreDrops(ModBlocks.SCULK_DIAMOND_ORE, Items.DIAMOND));
        addDrop(ModBlocks.CLAY_LAPIS_ORE,lapisOreDrops(ModBlocks.CLAY_LAPIS_ORE));

        addDrop(ModBlocks.SUSPICIOUS_WHITE_SAND,saltBlockDrops(ModBlocks.SUSPICIOUS_WHITE_SAND));

        addDrop(ModBlocks.PLATINUM_ORE,oreDrops(ModBlocks.PLATINUM_ORE, ModItems.PLATINUM_CLUSTER));
        addDrop(ModBlocks.PLATINUM_CLUSTER_ORE,clusterOreDrops(ModBlocks.PLATINUM_CLUSTER_ORE, ModItems.PLATINUM_CLUSTER));

        addDrop(ModBlocks.SALT_BLOCK,saltBlockDrops(ModBlocks.SALT_BLOCK));

        addDrop(ModBlocks.FROSITE_BRICK_SLAB, slabDrops(ModBlocks.FROSITE_BRICK_SLAB));
        addDrop(ModBlocks.FROSITE_TILE_SLAB, slabDrops(ModBlocks.FROSITE_TILE_SLAB));

        addDrop(ModBlocks.SMOOTH_STEEL_SLAB, slabDrops(ModBlocks.SMOOTH_STEEL_SLAB));
        addDrop(ModBlocks.CUT_STEEL_SLAB, slabDrops(ModBlocks.CUT_STEEL_SLAB));

        addDrop(ModBlocks.LIGHTY_RUSTED_STEEL_SLAB, slabDrops(ModBlocks.LIGHTY_RUSTED_STEEL_SLAB));
        addDrop(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB, slabDrops(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB));

        addDrop(ModBlocks.RUSTED_STEEL_SLAB, slabDrops(ModBlocks.RUSTED_STEEL_SLAB));
        addDrop(ModBlocks.RUSTED_CUT_STEEL_SLAB, slabDrops(ModBlocks.RUSTED_CUT_STEEL_SLAB));

        addDrop(ModBlocks.STONEBARK_SLAB, slabDrops(ModBlocks.STONEBARK_SLAB));
        addDrop(ModBlocks.DEEPBARK_SLAB, slabDrops(ModBlocks.DEEPBARK_SLAB));
        addDrop(ModBlocks.LEAFITE_PLANKS_SLAB, slabDrops(ModBlocks.LEAFITE_PLANKS_SLAB));

        addDrop(ModBlocks.WHITE_SANDSTONE_SLAB, slabDrops(ModBlocks.WHITE_SANDSTONE_SLAB));
        addDrop(ModBlocks.CUT_WHITE_SANDSTONE_SLAB, slabDrops(ModBlocks.CUT_WHITE_SANDSTONE_SLAB));
        addDrop(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, slabDrops(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB));

        addDrop(ModBlocks.BLACK_SANDSTONE_SLAB, slabDrops(ModBlocks.BLACK_SANDSTONE_SLAB));
        addDrop(ModBlocks.CUT_BLACK_SANDSTONE_SLAB, slabDrops(ModBlocks.CUT_BLACK_SANDSTONE_SLAB));
        addDrop(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, slabDrops(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB));

        addDrop(ModBlocks.POLISHED_BEDROCK_SLAB, slabDrops(ModBlocks.POLISHED_BEDROCK_SLAB));
        addDrop(ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB, slabDrops(ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB));

        addDrop(ModBlocks.SANDITE_BRICK_SLAB, slabDrops(ModBlocks.SANDITE_BRICK_SLAB));
        addDrop(ModBlocks.SANDITE_TILE_SLAB, slabDrops(ModBlocks.SANDITE_TILE_SLAB));

        addDrop(ModBlocks.LEAFITE_BRICK_SLAB, slabDrops(ModBlocks.LEAFITE_BRICK_SLAB));
        addDrop(ModBlocks.LEAFITE_TILE_SLAB, slabDrops(ModBlocks.LEAFITE_TILE_SLAB));

        addDrop(ModBlocks.MARBLE_SLAB, slabDrops(ModBlocks.MARBLE_SLAB));
        addDrop(ModBlocks.MARBLE_BRICK_SLAB, slabDrops(ModBlocks.MARBLE_BRICK_SLAB));

        addDrop(ModBlocks.END_ITE_BRICK_SLAB, slabDrops(ModBlocks.END_ITE_BRICK_SLAB));
        addDrop(ModBlocks.END_ITE_TILE_SLAB, slabDrops(ModBlocks.END_ITE_TILE_SLAB));

        addDrop(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB));
        addDrop(ModBlocks.POLISHED_DIORITE_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_DIORITE_BRICK_SLAB));
        addDrop(ModBlocks.POLISHED_GRANITE_BRICK_SLAB, slabDrops(ModBlocks.POLISHED_GRANITE_BRICK_SLAB));

        addDrop(ModBlocks.VOID_STONE_BRICK_SLAB, slabDrops(ModBlocks.VOID_STONE_BRICK_SLAB));

        addDrop(ModBlocks.LIGHT_FROSITE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_FROSITE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_FROSITE_TILE_SLAB, slabDrops(ModBlocks.LIGHT_FROSITE_TILE_SLAB));
        addDrop(ModBlocks.DARKEN_FROSITE_BRICK_SLAB, slabDrops(ModBlocks.DARKEN_FROSITE_BRICK_SLAB));
        addDrop(ModBlocks.DARKEN_FROSITE_TILE_SLAB, slabDrops(ModBlocks.DARKEN_FROSITE_TILE_SLAB));

        addDrop(ModBlocks.LIGHT_SANDITE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_SANDITE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_SANDITE_TILE_SLAB, slabDrops(ModBlocks.LIGHT_SANDITE_TILE_SLAB));
        addDrop(ModBlocks.DARKEN_SANDITE_BRICK_SLAB, slabDrops(ModBlocks.DARKEN_SANDITE_BRICK_SLAB));
        addDrop(ModBlocks.DARKEN_SANDITE_TILE_SLAB, slabDrops(ModBlocks.DARKEN_SANDITE_TILE_SLAB));

        addDrop(ModBlocks.LIGHT_LEAFITE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_LEAFITE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_LEAFITE_TILE_SLAB, slabDrops(ModBlocks.LIGHT_LEAFITE_TILE_SLAB));
        addDrop(ModBlocks.DARKEN_LEAFITE_BRICK_SLAB, slabDrops(ModBlocks.DARKEN_LEAFITE_BRICK_SLAB));
        addDrop(ModBlocks.DARKEN_LEAFITE_TILE_SLAB, slabDrops(ModBlocks.DARKEN_LEAFITE_TILE_SLAB));

        addDrop(ModBlocks.LIGHT_END_ITE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_END_ITE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_END_ITE_TILE_SLAB, slabDrops(ModBlocks.LIGHT_END_ITE_TILE_SLAB));
        addDrop(ModBlocks.DARKEN_END_ITE_BRICK_SLAB, slabDrops(ModBlocks.DARKEN_END_ITE_BRICK_SLAB));
        addDrop(ModBlocks.DARKEN_END_ITE_TILE_SLAB, slabDrops(ModBlocks.DARKEN_END_ITE_TILE_SLAB));

        addDrop(ModBlocks.ICE_BRICK_SLAB, slabDrops(ModBlocks.ICE_BRICK_SLAB));

        addDrop(ModBlocks.ALUMINUM_DOOR, doorDrops(ModBlocks.ALUMINUM_DOOR));
        addDrop(ModBlocks.STEEL_DOOR, doorDrops(ModBlocks.STEEL_DOOR));
        addDrop(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR, doorDrops(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR));
        addDrop(ModBlocks.RUSTED_STEEL_DOOR, doorDrops(ModBlocks.RUSTED_STEEL_DOOR));
        addDrop(ModBlocks.STONEBARK_DOOR, doorDrops(ModBlocks.STONEBARK_DOOR));
        addDrop(ModBlocks.DEEPBARK_DOOR, doorDrops(ModBlocks.DEEPBARK_DOOR));
        addDrop(ModBlocks.LEAFITE_DOOR, doorDrops(ModBlocks.DEEPBARK_DOOR));

        addDrop(ModBlocks.STONEBARK_LEAVES, leavesDrops(ModBlocks.STONEBARK_LEAVES, ModBlocks.STONEBARK_SAPLING, 0.025f));
        addDrop(ModBlocks.DEEPSLATE_LEAVES, leavesDrops(ModBlocks.DEEPSLATE_LEAVES, ModBlocks.DEEPBARK_SAPLING, 0.025f));

        addDrop(ModBlocks.LEAFITE_LEAVES, leavesDrops(ModBlocks.LEAFITE_LEAVES, ModBlocks.LEAFITE_SAPLING, 0.025f));

        addPottedPlantDrops(ModBlocks.POTTED_STONEBARK_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_DEEPBARK_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_LEAFITE_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_ICY_CROCUS);
    }
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
    public LootTable.Builder tankBlockDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                        ((LeafEntry.Builder)ItemEntry.builder(ModItems.TUNGSTEN_INGOT).apply(SetCountLootFunction.builder
                                (UniformLootNumberProvider.create(1.0f, 4.0f))))));
    }
    public LootTable.Builder nuggetLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(4.0f, 9.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder saltBlockDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                        ((LeafEntry.Builder)ItemEntry.builder(ModItems.POWDERED_SALT).apply(SetCountLootFunction.builder
                                (UniformLootNumberProvider.create(4.0f, 9.0f))))));
    }
    public LootTable.Builder specialOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 2.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));


    }
    public LootTable.Builder clusterOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 4.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));


    }
}
