package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.entity.custom.projectiles.IceProjectileEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IceChunkItem extends Item {
    private static final Formatting APPLY_FORMATTING = Formatting.GRAY;
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Formatting DESDESCRIPTION_FORMATTING = Formatting.RED;
    private static final Text APPLY_TEXT = Text.literal("Applies to the Mob").formatted(APPLY_FORMATTING);
    private static final Text DESEFFECT_TEXT = Text.literal("Slowness (00:10)").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text DESEFFECT_EXPLAIN_TEXT = Text.literal("-15% Speed").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text WHEN_APPLIED = Text.literal("When Applied").formatted(TITLE_FORMATTING);
    private static final Text ON_HIT = Text.literal("On Hit").formatted(TITLE_FORMATTING);
    private static final Text RECHARGE_TEXT = Text.literal("Recharge (00:01)").formatted(DESDESCRIPTION_FORMATTING);
    public IceChunkItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        user.getItemCooldownManager().set(this, 20);
        if (!world.isClient) {
            IceProjectileEntity iceProjectileEntity = new IceProjectileEntity(user, world);
            iceProjectileEntity.setItem(itemStack);
            iceProjectileEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 1.5f, 1.0f);
            world.spawnEntity(iceProjectileEntity);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(RECHARGE_TEXT);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(ON_HIT);
        tooltip.add(DESEFFECT_TEXT);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(WHEN_APPLIED);
        tooltip.add(ScreenTexts.space().append(DESEFFECT_EXPLAIN_TEXT));
        tooltip.add(APPLY_TEXT);
        super.appendTooltip(stack, world, tooltip, context);
    }
}
