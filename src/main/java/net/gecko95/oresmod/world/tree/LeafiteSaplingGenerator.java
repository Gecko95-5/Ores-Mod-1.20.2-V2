package net.gecko95.oresmod.world.tree;

import net.gecko95.oresmod.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class LeafiteSaplingGenerator extends LargeTreeSaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.LEAFITE_TREE_KEY;
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return ModConfiguredFeatures.BIG_LEAFITE_TREE_KEY;
    }
}
