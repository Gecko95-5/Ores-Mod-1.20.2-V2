package net.gecko95.oresmod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SteelUpgradeTemplateItem extends Item {
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text INGREDIENTS_TEXT = Text.translatable("tooltip.oresmod.modded_upgrade_smithing_template_1").formatted(TITLE_FORMATTING);
    private static final Text APPLIES_TO_TEXT = Text.translatable("tooltip.oresmod.modded_upgrade_smithing_template_2").formatted(TITLE_FORMATTING);
    private static final Text STEEL_UPGRADE_TEXT = Text.translatable("tooltip.oresmod.steel_upgrade_smithing_template_1").formatted(TITLE_FORMATTING);
    private static final Text STEEL_UPGRADE_APPLIES_TO_TEXT = Text.translatable("tooltip.oresmod.steel_upgrade_smithing_template_2").formatted(DESCRIPTION_FORMATTING);
    private static final Text STEEL_UPGRADE_INGREDIENTS_TEXT = Text.translatable("tooltip.oresmod.steel_upgrade_smithing_template_3").formatted(DESCRIPTION_FORMATTING);
    public SteelUpgradeTemplateItem(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(STEEL_UPGRADE_TEXT);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(APPLIES_TO_TEXT);
        tooltip.add(ScreenTexts.space().append(STEEL_UPGRADE_APPLIES_TO_TEXT));
        tooltip.add(INGREDIENTS_TEXT);
        tooltip.add(ScreenTexts.space().append(STEEL_UPGRADE_INGREDIENTS_TEXT));
    }
}
