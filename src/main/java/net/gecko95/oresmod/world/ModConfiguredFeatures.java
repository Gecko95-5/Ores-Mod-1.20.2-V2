package net.gecko95.oresmod.world;

import com.google.common.collect.ImmutableList;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunk.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SALT_ORE_KEY = registerKey("salt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FROSITE_ORE_KEY = registerKey("frosite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FROSITE_ORE_ICY_KEY = registerKey("frosite_ore_icy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_SMALL_KEY = registerKey("aluminum_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NICKEL_ORE_CHUNKS_KEY = registerKey("nickel_ore_chunks");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEDROCK_ORE_KEY = registerKey("bedrock_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUSPICIOUS_WHITE_SAND_KEY = registerKey("suspicious_white_sand");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TERRACOTTA_GOLD_ORE_KEY = registerKey("terracotta_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAVEL_COAL_ORE_KEY = registerKey("gravel_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRIPSTONE_COPPER_ORE_KEY = registerKey("dripstone_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_IRON_ORE_KEY = registerKey("tuff_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLAY_LAPIS_ORE_KEY = registerKey("clay_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SCULK_DIAMOND_ORE_KEY = registerKey("sculk_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SANNITE_ORE_KEY = registerKey("sannite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_SANNITE_ORE_KEY = registerKey("red_sannite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_COAL_ORE_KEY = registerKey("cobblestone_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_IRON_ORE_KEY = registerKey("cobblestone_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_COPPER_ORE_KEY = registerKey("cobblestone_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_GOLD_ORE_KEY = registerKey("cobblestone_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_REDSTONE_ORE_KEY = registerKey("cobblestone_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_LAPIS_ORE_KEY = registerKey("cobblestone_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_DIAMOND_ORE_KEY = registerKey("cobblestone_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_EMERALD_ORE_KEY = registerKey("cobblestone_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_ALUMINUM_ORE_KEY = registerKey("cobblestone_aluminum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_NICKEL_ORE_KEY = registerKey("cobblestone_nickel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_TITANIUM_ORE_KEY = registerKey("cobblestone_titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBBLESTONE_QUARTZ_ORE_KEY = registerKey("cobblestone_quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> INFESTED_COBBLESTONE_KEY = registerKey("infested_cobblestone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARRY_MARBLE_ORE_KEY = registerKey("quarry_marble_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARRY_GRANITE_ORE_KEY = registerKey("quarry_granite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARRY_DIORITE_ORE_KEY = registerKey("quarry_diorite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARRY_ANDESITE_ORE_KEY = registerKey("quarry_andsite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARRY_DIRT_ORE_KEY = registerKey("quarry_dirt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARRY_GRAVEL_ORE_KEY = registerKey("quarry_gravel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARRY_BLACKSTONE_ORE_KEY = registerKey("quarry_blackstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_ITE_ORE_KEY = registerKey("end_ite_ore");

    public static final  RegistryKey<ConfiguredFeature<?, ?>> STONEBARK_KEY = registerKey("stonebark");
    public static final  RegistryKey<ConfiguredFeature<?, ?>> DEEPBARK_KEY = registerKey("deepbark");
    public static final  RegistryKey<ConfiguredFeature<?, ?>> LEAFITE_ORE_TREE_KEY = registerKey("leafite_ore_tree");
    public static final  RegistryKey<ConfiguredFeature<?, ?>> LEAFITE_TREE_KEY = registerKey("leafite_tree");
    public static final  RegistryKey<ConfiguredFeature<?, ?>> BIG_LEAFITE_TREE_KEY = registerKey("big_leafite_tree");
    public static final  RegistryKey<ConfiguredFeature<?, ?>> BIG_LEAFITE_ORE_TREE_KEY = registerKey("big_leafite_ore_tree");

    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stoneReplacebles = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacebles = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacebles = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest packediceReplacebles = new BlockMatchRuleTest(Blocks.PACKED_ICE);
        RuleTest whitesandReplacebles = new BlockMatchRuleTest(ModBlocks.WHITE_SAND);
        RuleTest terracottaReplacebles = new BlockMatchRuleTest(Blocks.TERRACOTTA);
        RuleTest sandstoneReplacebles = new BlockMatchRuleTest(Blocks.SANDSTONE);
        RuleTest redsandstoneReplacebles = new BlockMatchRuleTest(Blocks.RED_SANDSTONE);
        RuleTest cobblestoneReplacebles = new BlockMatchRuleTest(Blocks.COBBLESTONE);
        RuleTest endstoneReplacebles = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldSaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.SALT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldFrositeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.FROSITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(packediceReplacebles, ModBlocks.ICE_FROSITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldFrositeOresIcy =
                List.of(OreFeatureConfig.createTarget(packediceReplacebles, ModBlocks.ICE_FROSITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAluminumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.ALUMINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_ALUMINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAluminumOresSmall =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.ALUMINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_ALUMINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNickelOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.NICKEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_NICKEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNickelOresChunks =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.NICKEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_NICKEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherTungstenOres =
                List.of(OreFeatureConfig.createTarget(netherReplacebles, ModBlocks.NETHER_TUNGSTEN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherCobaltOres =
                List.of(OreFeatureConfig.createTarget(netherReplacebles, ModBlocks.NETHER_COBALT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldBedrockOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.CRACKED_BEDROCK.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSuspiciousWhiteSand =
                List.of(OreFeatureConfig.createTarget(whitesandReplacebles, ModBlocks.SUSPICIOUS_WHITE_SAND.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTerracottaGoldOres =
                List.of(OreFeatureConfig.createTarget(terracottaReplacebles, ModBlocks.TERRACOTTA_GOLD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldGravelCoalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.GRAVEL_COAL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldDripstoneCopperOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.DRIPSTONE_COPPER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTuffIronOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.TUFF_IRON_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldClayLapisOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.CLAY_LAPIS_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSculkDiamondOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.SCULK_DIAMOND_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSanniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.SANDITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(sandstoneReplacebles, ModBlocks.SANDSTONE_SANDITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRedSanniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.SANDITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(redsandstoneReplacebles, ModBlocks.RED_SANDSTONE_SANDITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleCoalOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_COAL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleIronOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_IRON_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleCopperOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_COPPER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleGoldOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_GOLD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleRedstoneOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_REDSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleLapisOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_LAPIS_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleDiamondOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_DIAMOND_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleEmeraldOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_EMERALD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleAluminumOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_ALUMINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleNickelOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_NICKEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleTitaniumOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_TITANIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobbleQuartzOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.COBBLESTONE_QUARTZ_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldInfestedCobblestoneOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, Blocks.INFESTED_COBBLESTONE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldQuarryMarbleOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, ModBlocks.MARBLE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldQuarryGraniteOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, Blocks.GRANITE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldQuarryDioriteOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, Blocks.DIORITE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldQuarryAndesiteOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, Blocks.ANDESITE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldQuarryDirtOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, Blocks.DIRT.getDefaultState()));

        List<OreFeatureConfig.Target> overworldQuarryGravelOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, Blocks.GRAVEL.getDefaultState()));

        List<OreFeatureConfig.Target> overworldQuarryBlackstoneOres =
                List.of(OreFeatureConfig.createTarget(cobblestoneReplacebles, Blocks.BLACKSTONE.getDefaultState()));

        List<OreFeatureConfig.Target> endPlatinumOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplacebles, ModBlocks.PLATINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endEndIteOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplacebles, ModBlocks.END_ITE_ORE.getDefaultState()));


        register(context, SALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSaltOres, 12));

        register(context, FROSITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldFrositeOres, 4));

        register(context, FROSITE_ORE_ICY_KEY, Feature.ORE, new OreFeatureConfig(overworldFrositeOresIcy, 4));

        register(context, ALUMINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAluminumOres, 9));

        register(context, ALUMINUM_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldAluminumOresSmall, 4));

        register(context, NICKEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNickelOres, 5));

        register(context, NICKEL_ORE_CHUNKS_KEY, Feature.ORE, new OreFeatureConfig(overworldNickelOresChunks, 10));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 6));

        register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherTungstenOres, 7));

        register(context, COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCobaltOres, 9));

        register(context, BEDROCK_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBedrockOres, 4));

        register(context, SUSPICIOUS_WHITE_SAND_KEY, Feature.ORE, new OreFeatureConfig(overworldSuspiciousWhiteSand, 8));

        register(context, TERRACOTTA_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTerracottaGoldOres, 9));

        register(context, GRAVEL_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldGravelCoalOres, 8));

        register(context, DRIPSTONE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDripstoneCopperOres, 7));

        register(context, TUFF_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTuffIronOres, 4));

        register(context, CLAY_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldClayLapisOres, 7));

        register(context, SCULK_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSculkDiamondOres, 4));

        register(context, SANNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSanniteOres, 4));

        register(context, RED_SANNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRedSanniteOres, 4));

        register(context, COBBLESTONE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleCoalOres, 17));

        register(context, COBBLESTONE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleIronOres, 9));

        register(context, COBBLESTONE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleCopperOres, 10));

        register(context, COBBLESTONE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleGoldOres, 9));

        register(context, COBBLESTONE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleRedstoneOres, 8));

        register(context, COBBLESTONE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleLapisOres, 7));

        register(context, COBBLESTONE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleDiamondOres, 4));

        register(context, COBBLESTONE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleEmeraldOres, 3));

        register(context, COBBLESTONE_ALUMINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleAluminumOres, 9));

        register(context, COBBLESTONE_NICKEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleNickelOres, 10));

        register(context, COBBLESTONE_TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleTitaniumOres, 6));

        register(context, COBBLESTONE_QUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobbleQuartzOres, 14));

        register(context, INFESTED_COBBLESTONE_KEY, Feature.ORE, new OreFeatureConfig(overworldInfestedCobblestoneOres, 10));

        register(context, QUARRY_MARBLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuarryMarbleOres, 32));

        register(context, QUARRY_GRANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuarryGraniteOres, 64));

        register(context, QUARRY_ANDESITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuarryAndesiteOres, 64));

        register(context, QUARRY_DIORITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuarryDioriteOres, 64));

        register(context, QUARRY_DIRT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuarryDirtOres, 33));

        register(context, QUARRY_GRAVEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuarryGravelOres, 33));

        register(context, QUARRY_BLACKSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuarryBlackstoneOres, 33));

        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endPlatinumOres, 8));

        register(context, END_ITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endEndIteOres, 4));

        register(context, STONEBARK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.STONEBARK_LOG),
                new StraightTrunkPlacer(3,2,1),
                BlockStateProvider.of(ModBlocks.STONEBARK_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1)),

                new TwoLayersFeatureSize(1, 0, 2))
                .dirtProvider(BlockStateProvider.of(Blocks.COBBLESTONE)).forceDirt().build());


        register(context, DEEPBARK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DEEPSLATE_LOG),
                new ForkingTrunkPlacer(5,4,3),
                BlockStateProvider.of(ModBlocks.DEEPSLATE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1),2),

                new TwoLayersFeatureSize(1, 0, 2))
                .dirtProvider(BlockStateProvider.of(Blocks.COBBLED_DEEPSLATE)).forceDirt().build());

        register(context, LEAFITE_ORE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder
                (BlockStateProvider.of(ModBlocks.LEAFITE_LOG),
                        new StraightTrunkPlacer(6,2,0),
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.LEAFITE_LEAVES.getDefaultState(),5)
                                .add(ModBlocks.LEAFITE_LEAVES_ORE.getDefaultState(),1)),
                        new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0),2),

                        new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25f)))
                .build());

        register(context, LEAFITE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder
                (BlockStateProvider.of(ModBlocks.LEAFITE_LOG),
                        new StraightTrunkPlacer(6,2,0),
                        BlockStateProvider.of(ModBlocks.LEAFITE_LEAVES),
                        new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0),2),

                        new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25f)))
                .build());

        register(context, BIG_LEAFITE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder
                (BlockStateProvider.of(ModBlocks.LEAFITE_LOG),
                        new GiantTrunkPlacer(10,4,0),
                        BlockStateProvider.of(ModBlocks.LEAFITE_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(2),3),

                        new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25f)))
                .build());

        register(context, BIG_LEAFITE_ORE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder
                (BlockStateProvider.of(ModBlocks.LEAFITE_LOG),
                        new GiantTrunkPlacer(10,4,0),
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.LEAFITE_LEAVES.getDefaultState(),5)
                                .add(ModBlocks.LEAFITE_LEAVES_ORE.getDefaultState(),1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(2),3),

                        new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25f)))
                .build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(OresMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
