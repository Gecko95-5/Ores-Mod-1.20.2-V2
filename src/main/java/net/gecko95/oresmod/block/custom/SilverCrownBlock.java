package net.gecko95.oresmod.block.custom;

import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.entity.custom.SilverwyrmEntity;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.predicate.block.BlockStatePredicate;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

public class SilverCrownBlock extends HorizontalFacingBlock {
    @Nullable
    private BlockPattern silverwyrmPattern;
    private static final Predicate<BlockState> IS_SILVER_CROWN_PREDICATE = state -> state != null && (state.isOf(ModBlocks.SILVER_CROWN));

    private static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 4, 12);
    public SilverCrownBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.isOf(state.getBlock())) {
            return;
        }
        this.trySpawnEntity(world, pos);
    }
    private void trySpawnEntity(World world, BlockPos pos) {
        BlockPattern.Result result = this.getSilverwyrmPattern().searchAround(world, pos);
        if (result != null) {
            SilverwyrmEntity silverwyrmEntity = ModEntities.SILVERWYRM.create(world);
            if (silverwyrmEntity != null) {
                SilverCrownBlock.spawnEntity(world, result, silverwyrmEntity, result.translate(0, 4, 0).getBlockPos());
            }
        }
    }

    private static void spawnEntity(World world, BlockPattern.Result patternResult, Entity entity, BlockPos pos) {
        CarvedPumpkinBlock.breakPatternBlocks(world, patternResult);
        entity.refreshPositionAndAngles((double)pos.getX() + 0.5, (double)pos.getY() + 0.05, (double)pos.getZ() + 0.5, 0.0f, 0.0f);
        world.spawnEntity(entity);
        for (ServerPlayerEntity serverPlayerEntity : world.getNonSpectatingEntities(ServerPlayerEntity.class, entity.getBoundingBox().expand(5.0))) {
            Criteria.SUMMONED_ENTITY.trigger(serverPlayerEntity, entity);
        }
        CarvedPumpkinBlock.updatePatternBlocks(world, patternResult);
    }

    public static void breakPatternBlocks(World world, BlockPattern.Result patternResult) {
        for (int i = 0; i < patternResult.getWidth(); ++i) {
            for (int j = 0; j < patternResult.getHeight(); ++j) {
                CachedBlockPosition cachedBlockPosition = patternResult.translate(i, j, 0);
                world.setBlockState(cachedBlockPosition.getBlockPos(), Blocks.AIR.getDefaultState(), Block.NOTIFY_LISTENERS);
                world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, cachedBlockPosition.getBlockPos(), Block.getRawIdFromState(cachedBlockPosition.getBlockState()));
            }
        }
    }

    public static void updatePatternBlocks(World world, BlockPattern.Result patternResult) {
        for (int i = 0; i < patternResult.getWidth(); ++i) {
            for (int j = 0; j < patternResult.getHeight(); ++j) {
                CachedBlockPosition cachedBlockPosition = patternResult.translate(i, j, 0);
                world.updateNeighbors(cachedBlockPosition.getBlockPos(), Blocks.AIR);
            }
        }
    }

    private BlockPattern getSilverwyrmPattern() {
        if (this.silverwyrmPattern == null) {
            this.silverwyrmPattern = BlockPatternBuilder.start().aisle("^", ":", "#","#","!").where('^', CachedBlockPosition.matchesBlockState(IS_SILVER_CROWN_PREDICATE)).where('#', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(ModBlocks.SILVER_SCALE_CORE))).where(':', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(ModBlocks.SILVER_SCALE_FACE))).where('!', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(ModBlocks.SILVER_SCALES))).build();
        }
        return this.silverwyrmPattern;
    }
}
