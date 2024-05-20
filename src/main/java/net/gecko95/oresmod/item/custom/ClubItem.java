package net.gecko95.oresmod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ClubItem extends MiningToolItem {
    private static final Formatting APPLY_FORMATTING = Formatting.GRAY;
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Formatting DESDESCRIPTION_FORMATTING = Formatting.RED;
    private static final Text APPLY_TEXT = Text.literal("Applies to the Mob").formatted(APPLY_FORMATTING);
    private static final Text EFFECT_TEXT = Text.literal("Wither (00:01)").formatted(DESDESCRIPTION_FORMATTING);
    private static final Text ON_HIT = Text.literal("On Hit").formatted(TITLE_FORMATTING);

    public ClubItem(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.AXE_MINEABLE, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER,100,0),attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(ON_HIT);
        tooltip.add(EFFECT_TEXT);
        tooltip.add(APPLY_TEXT);
        super.appendTooltip(stack, world, tooltip, context);
    }
}
