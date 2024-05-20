package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;

public class DrillItem extends MiningToolItem {
    public DrillItem(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.DRILL_MINEABLE, settings);
    }
}
