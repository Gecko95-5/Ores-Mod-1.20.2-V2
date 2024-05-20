package net.gecko95.oresmod.world.gen;

import net.gecko95.oresmod.entity.ModEntities;

public class ModWorldGeneration {
    public static void generateModWorldGen(){
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
        ModEntitySpawn.addEntitySpawn();
    }
}
