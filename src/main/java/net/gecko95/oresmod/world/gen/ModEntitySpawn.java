package net.gecko95.oresmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.world.biome.ModBiomes;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawn {
    public static void addEntitySpawn(){
        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                SpawnGroup.MONSTER, ModEntities.JUNGLE_SPIDER,25,1,3);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS, BiomeKeys.END_MIDLANDS, BiomeKeys.END_HIGHLANDS),
                SpawnGroup.MONSTER, ModEntities.ENDER_SPIDER,5,1,3);

        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.SPAWNS_SNOW_FOXES),
                SpawnGroup.MONSTER, ModEntities.FROSTBITEN,25,1,3);

        SpawnRestriction.register(ModEntities.JUNGLE_SPIDER, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING, HostileEntity::canSpawnIgnoreLightLevel);

        SpawnRestriction.register(ModEntities.ENDER_SPIDER, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING, HostileEntity::canSpawnIgnoreLightLevel);

        SpawnRestriction.register(ModEntities.FROSTBITEN, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING, HostileEntity::canSpawnInDark);
    }
}
