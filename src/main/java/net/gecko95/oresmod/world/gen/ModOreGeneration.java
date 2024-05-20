package net.gecko95.oresmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko95.oresmod.world.ModPlacedFeatures;
import net.gecko95.oresmod.world.biome.ModBiomes;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;


public class ModOreGeneration {
    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SALT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FROSITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.SPAWNS_SNOW_FOXES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FROSITE_ORE_ICY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ALUMINUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ALUMINUM_ORE_SMALL_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NICKEL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NICKEL_ORE_CHUNKS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TITANIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUNGSTEN_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBALT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BEDROCK_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WHITE_DUNES_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SUSPICIOUS_WHITE_SAND_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TERRACOTTA_GOLD_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRAVEL_COAL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DRIPSTONE_COPPER_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TUFF_IRON_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CLAY_LAPIS_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SCULK_DIAMOND_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SANNITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RED_SANNITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_COAL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_COPPER_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_IRON_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_GOLD_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_REDSTONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_LAPIS_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_DIAMOND_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_EMERALD_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_ALUMINUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_NICKEL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_TITANIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBBLESTONE_QUARTZ_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.INFESTED_COBBLESTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARRY_MARBLE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARRY_ANDESITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARRY_DIORITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARRY_GRANITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARRY_DIRT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARRY_GRAVEL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.QUARRY_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARRY_BLACKSTONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS, BiomeKeys.END_MIDLANDS,
                        BiomeKeys.END_HIGHLANDS, BiomeKeys.SMALL_END_ISLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLATINUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS, BiomeKeys.END_MIDLANDS,
                        BiomeKeys.END_HIGHLANDS, BiomeKeys.SMALL_END_ISLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_ITE_ORE_PLACED_KEY);
    }
}
