package net.gecko95.oresmod.block.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class StonebarkSaplingBlock extends SaplingBlock {


    public StonebarkSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(ModTags.Blocks.STONEBARK_PLACEABLE);
    }
}
