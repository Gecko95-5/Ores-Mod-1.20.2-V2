package net.gecko95.oresmod.world.biome;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> QUARRY_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(OresMod.MOD_ID, "quarry"));
    public static final RegistryKey<Biome> WHITE_DUNES_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(OresMod.MOD_ID, "white_dunes"));
    public static final RegistryKey<Biome> BLACK_SAND_BEACH = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(OresMod.MOD_ID, "black_sand_beach"));
    public static void boostrap(Registerable<Biome> context) {
        context.register(QUARRY_BIOME, qurrayBiome(context));
        context.register(WHITE_DUNES_BIOME, whiteduneBiome(context));
        context.register(BLACK_SAND_BEACH, blacksandBiome(context));
    }


    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome qurrayBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SILVERFISH, 95, 2, 5));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.SILVERPEDE, 75, 1, 3));

        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addEmeraldOre(biomeBuilder);
        DefaultBiomeFeatures.addInfestedStone(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_PLAINS);
        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x13f3c4)
                        .waterFogColor(0x13f3c4)
                        .skyColor(0x13f3c4)
                        .grassColor(0x61b663)
                        .foliageColor(0x61b663)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }
    public static Biome whiteduneBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addDesertMobs(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addDefaultDisks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(biomeBuilder);
        DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);
        DefaultBiomeFeatures.addDesertDeadBushes(biomeBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDesertVegetation(biomeBuilder);
        DefaultBiomeFeatures.addDesertFeatures(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.0f)
                .temperature(2.0f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3F76E4)
                        .waterFogColor(0x3F76E4)
                        .skyColor(0x6EB1FF)
                        .grassColor(0xBFB755)
                        .foliageColor(0xAEA42A)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }
    public static Biome blacksandBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.TURTLE, 5, 2, 5));
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addDefaultDisks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(biomeBuilder);
        DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.8f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3F76E4)
                        .waterFogColor(0x3F76E4)
                        .skyColor(0x78A7FF)
                        .grassColor(0x91BD59)
                        .foliageColor(0x77AB2F)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }
}