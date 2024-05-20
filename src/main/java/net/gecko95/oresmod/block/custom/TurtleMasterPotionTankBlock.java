package net.gecko95.oresmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TurtleMasterPotionTankBlock extends Block {
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Formatting DESDESCRIPTION_FORMATTING = Formatting.RED;
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Text EFFECT_TEXT = Text.literal("Resistance III (00:20)").formatted(DESCRIPTION_FORMATTING);
    private static final Text DESEFFECT_TEXT = Text.literal("Slowness IV (00:20)").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text DESEFFECT_EXPLAIN_TEXT = Text.literal("-60% Speed").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text WHEN_APPLIED = Text.literal("When Applied").formatted(TITLE_FORMATTING);
    public TurtleMasterPotionTankBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,400,3));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,400,2));
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof LivingEntity livingEntity){
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,400,3));
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,400,2));
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(DESEFFECT_TEXT);
        tooltip.add(EFFECT_TEXT);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(WHEN_APPLIED);
        tooltip.add(ScreenTexts.space().append(DESEFFECT_EXPLAIN_TEXT));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
