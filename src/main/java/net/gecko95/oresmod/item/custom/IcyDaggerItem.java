package net.gecko95.oresmod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IcyDaggerItem extends CarverItem{
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Formatting DESDESCRIPTION_FORMATTING = Formatting.RED;
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Text EFFECT_TEXT = Text.literal("Speed II (00:30)").formatted(DESCRIPTION_FORMATTING);
    private static final Text DESEFFECT_TEXT = Text.literal("Weakness (01:00)").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text DESEFFECT_EXPLAIN_TEXT = Text.literal("-4 Attack Damage").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text EFFECT_EXPLAIN_TEXT = Text.literal("+40% Speed").formatted(DESCRIPTION_FORMATTING);
    private static final Text WHEN_APPLIED = Text.literal("When Applied").formatted(TITLE_FORMATTING);
    private static final Text ON_USE = Text.literal("On Use").formatted(TITLE_FORMATTING);
    public IcyDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,1200,0));
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(ON_USE);
        tooltip.add(EFFECT_TEXT);
        tooltip.add(DESEFFECT_TEXT);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(WHEN_APPLIED);
        tooltip.add(ScreenTexts.space().append(EFFECT_EXPLAIN_TEXT));
        tooltip.add(ScreenTexts.space().append(DESEFFECT_EXPLAIN_TEXT));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
