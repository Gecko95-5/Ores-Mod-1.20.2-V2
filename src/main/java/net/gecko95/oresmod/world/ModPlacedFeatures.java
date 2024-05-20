package net.gecko95.oresmod.world;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SALT_ORE_PLACED_KEY = registerKey("salt_ore_placed");
    public static final RegistryKey<PlacedFeature> FROSITE_ORE_PLACED_KEY = registerKey("frosite_ore_placed");
    public static final RegistryKey<PlacedFeature> FROSITE_ORE_ICY_PLACED_KEY = registerKey("frosite_ore_icy_placed");
    public static final RegistryKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final RegistryKey<PlacedFeature> ALUMINUM_ORE_SMALL_PLACED_KEY = registerKey("aluminum_ore_small_placed");
    public static final RegistryKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final RegistryKey<PlacedFeature> NICKEL_ORE_CHUNKS_PLACED_KEY = registerKey("nickel_ore_chunks_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");
    public static final RegistryKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final RegistryKey<PlacedFeature> BEDROCK_ORE_PLACED_KEY = registerKey("bedrock_ore_placed");
    public static final RegistryKey<PlacedFeature> SUSPICIOUS_WHITE_SAND_PLACED_KEY = registerKey("suspicious_white_sand_placed");
    public static final RegistryKey<PlacedFeature> TERRACOTTA_GOLD_ORE_PLACED_KEY = registerKey("terracotta_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> GRAVEL_COAL_ORE_PLACED_KEY = registerKey("gravel_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIPSTONE_COPPER_ORE_PLACED_KEY = registerKey("dripstone_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> TUFF_IRON_ORE_PLACED_KEY = registerKey("tuff_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> CLAY_LAPIS_ORE_PLACED_KEY = registerKey("clay_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> SCULK_DIAMOND_ORE_PLACED_KEY = registerKey("sculk_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> SANNITE_ORE_PLACED_KEY = registerKey("sannite_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_SANNITE_ORE_PLACED_KEY = registerKey("red_sannite_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_COAL_ORE_PLACED_KEY = registerKey("cobblestone_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_IRON_ORE_PLACED_KEY = registerKey("cobblestone_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_COPPER_ORE_PLACED_KEY = registerKey("cobblestone_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_GOLD_ORE_PLACED_KEY = registerKey("cobblestone_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_REDSTONE_ORE_PLACED_KEY = registerKey("cobblestone_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_LAPIS_ORE_PLACED_KEY = registerKey("cobblestone_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_DIAMOND_ORE_PLACED_KEY = registerKey("cobblestone_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_EMERALD_ORE_PLACED_KEY = registerKey("cobblestone_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_ALUMINUM_ORE_PLACED_KEY = registerKey("cobblestone_aluminum_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_NICKEL_ORE_PLACED_KEY = registerKey("cobblestone_nickel_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_TITANIUM_ORE_PLACED_KEY = registerKey("cobblestone_titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_QUARTZ_ORE_PLACED_KEY = registerKey("cobblestone_quartz_ore_placed");
    public static final RegistryKey<PlacedFeature> INFESTED_COBBLESTONE_PLACED_KEY = registerKey("infested_cobblestone_placed");
    public static final RegistryKey<PlacedFeature> QUARRY_MARBLE_ORE_PLACED_KEY = registerKey("quarry_marble_ore_placed");
    public static final RegistryKey<PlacedFeature> QUARRY_GRANITE_ORE_PLACED_KEY = registerKey("quarry_granite_ore_placed");
    public static final RegistryKey<PlacedFeature> QUARRY_DIORITE_ORE_PLACED_KEY = registerKey("quarry_diorite_ore_placed");
    public static final RegistryKey<PlacedFeature> QUARRY_ANDESITE_ORE_PLACED_KEY = registerKey("quarry_andesite_ore_placed");
    public static final RegistryKey<PlacedFeature> QUARRY_DIRT_ORE_PLACED_KEY = registerKey("quarry_dirt_ore_placed");
    public static final RegistryKey<PlacedFeature> QUARRY_GRAVEL_ORE_PLACED_KEY = registerKey("quarry_gravel_ore_placed");
    public static final RegistryKey<PlacedFeature> QUARRY_BLACKSTONE_ORE_PLACED_KEY = registerKey("quarry_blackstone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> END_ITE_ORE_PLACED_KEY = registerKey("end_ite_ore_placed");

    public static final RegistryKey<PlacedFeature> STONEBARK_PLACED_KEY = registerKey("stonebark_placed");

    public static final RegistryKey<PlacedFeature> LEAFITE_ORE_TREE_PLACED_KEY = registerKey("leafite_ore_tree_placed");
    public static final RegistryKey<PlacedFeature> LEAFITE_TREE_PLACED_KEY = registerKey("leafite_tree_placed");
    public static final RegistryKey<PlacedFeature> BIG_LEAFITE_TREE_PLACED_KEY = registerKey("big_leafite_tree_placed");
    public static final RegistryKey<PlacedFeature> BIG_LEAFITE_ORE_TREE_PLACED_KEY = registerKey("big_leafite_ore_tree_placed");

    public static void boostrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));

        register(context, FROSITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FROSITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(81), YOffset.fixed(223))));

        register(context, FROSITE_ORE_ICY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FROSITE_ORE_ICY_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(29), YOffset.fixed(108))));

        register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALUMINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));

        register(context, ALUMINUM_ORE_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALUMINUM_ORE_SMALL_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(72))));

        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

        register(context, NICKEL_ORE_CHUNKS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_CHUNKS_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-2))));

        register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(3), YOffset.fixed(30))));

        register(context, COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(7), YOffset.fixed(113))));

        register(context, BEDROCK_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BEDROCK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-60))));

        register(context, SUSPICIOUS_WHITE_SAND_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SUSPICIOUS_WHITE_SAND_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(54), YOffset.fixed(88))));

        register(context, TERRACOTTA_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TERRACOTTA_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(42), YOffset.fixed(117))));

        register(context, GRAVEL_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRAVEL_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192))));

        register(context, DRIPSTONE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DRIPSTONE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

        register(context, TUFF_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUFF_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));

        register(context, CLAY_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CLAY_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(32))));

        register(context, SCULK_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SCULK_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4))));

        register(context, SANNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SANNITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(13), YOffset.fixed(134))));

        register(context, RED_SANNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_SANNITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(13), YOffset.fixed(152))));

        register(context, COBBLESTONE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(30,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_IRON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_COPPER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_GOLD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_REDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_LAPIS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_EMERALD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_ALUMINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_ALUMINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_NICKEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_NICKEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, COBBLESTONE_QUARTZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBBLESTONE_QUARTZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, INFESTED_COBBLESTONE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.INFESTED_COBBLESTONE_KEY),
                ModOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(174))));

        register(context, QUARRY_MARBLE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARRY_MARBLE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, QUARRY_GRANITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARRY_GRANITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, QUARRY_DIORITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARRY_DIORITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, QUARRY_ANDESITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARRY_ANDESITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, QUARRY_DIRT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARRY_DIRT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, QUARRY_GRAVEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARRY_GRAVEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, QUARRY_BLACKSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARRY_BLACKSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(174))));

        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(174))));

        register(context, END_ITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_ITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(174))));


        register(context, STONEBARK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STONEBARK_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2,0.1f,2),
                        ModBlocks.STONEBARK_SAPLING));

        register(context, LEAFITE_ORE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEAFITE_ORE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1,0.1f,1),
                        ModBlocks.LEAFITE_SAPLING));

        register(context, LEAFITE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEAFITE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1,0.1f,2),
                        ModBlocks.LEAFITE_SAPLING));

        register(context, BIG_LEAFITE_ORE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BIG_LEAFITE_ORE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1,0.1f,0),
                        ModBlocks.LEAFITE_SAPLING));

        register(context, BIG_LEAFITE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BIG_LEAFITE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1,0.1f,1),
                        ModBlocks.LEAFITE_SAPLING));
    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(OresMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
