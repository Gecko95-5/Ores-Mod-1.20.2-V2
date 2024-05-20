package net.gecko95.oresmod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SanditeSwordItem extends SwordItem {
    private static final Formatting APPLY_FORMATTING = Formatting.GRAY;
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Formatting DESDESCRIPTION_FORMATTING = Formatting.RED;
    private static final Text APPLY_TEXT = Text.literal("Applies to the Mob").formatted(APPLY_FORMATTING);
    private static final Text DESEFFECT_TEXT = Text.literal("Weakness (00:20)").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text DESEFFECT_EXPLAIN_TEXT = Text.literal("-4 Attack Damage").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text WHEN_APPLIED = Text.literal("When Applied").formatted(TITLE_FORMATTING);
    private static final Text ON_HIT = Text.literal("On Hit").formatted(TITLE_FORMATTING);
    public SanditeSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,400,0),attacker);
        return super.postHit(stack, target, attacker);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(ON_HIT);
        tooltip.add(DESEFFECT_TEXT);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(WHEN_APPLIED);
        tooltip.add(ScreenTexts.space().append(DESEFFECT_EXPLAIN_TEXT));
        tooltip.add(APPLY_TEXT);
        super.appendTooltip(stack, world, tooltip, context);
    }
}
