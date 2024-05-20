package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.entity.custom.projectiles.IceBombProjectileEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

public class IceBombItem extends Item {
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.RED;
    private static final Text RECHARGE_TEXT = Text.literal("Recharge (00:05)").formatted(DESCRIPTION_FORMATTING);
    public IceBombItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        user.getItemCooldownManager().set(this, 100);
        if (!world.isClient) {
            IceBombProjectileEntity iceBombProjectileEntity = new IceBombProjectileEntity(user, world);
            iceBombProjectileEntity.setItem(itemStack);
            iceBombProjectileEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 0.6f, 0.5f);
            world.spawnEntity(iceBombProjectileEntity);
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
        super.appendTooltip(stack, world, tooltip, context);
    }
}
