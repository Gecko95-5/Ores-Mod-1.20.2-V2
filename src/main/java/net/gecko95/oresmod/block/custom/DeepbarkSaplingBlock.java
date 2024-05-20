package net.gecko95.oresmod.block.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class DeepbarkSaplingBlock extends SaplingBlock {
    public DeepbarkSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(ModTags.Blocks.DEEPBARK_PLACEABLE);
    }
}
