package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MultiToolItem extends MiningToolItem {
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Text SPLASH_TEXT = Text.literal("The Ultimate Tool").formatted(TITLE_FORMATTING);
    public MultiToolItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.MULTI_TOOL_MINEABLE, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(SPLASH_TEXT);
        super.appendTooltip(stack, world, tooltip, context);
    }
}