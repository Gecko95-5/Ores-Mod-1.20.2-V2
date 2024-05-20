package net.gecko95.oresmod.item.custom;


import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class MandibleAxeItem
        extends ToolItem
        implements Vanishable {
    private static final Formatting APPLY_FORMATTING = Formatting.GRAY;
    private static final Formatting TITLE_FORMATTING = Formatting.DARK_PURPLE;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text APPLY_TEXT = Text.literal("Applies to Self").formatted(APPLY_FORMATTING);
    private static final Text EFFECT_TEXT = Text.literal("Strength (00:10)").formatted(DESCRIPTION_FORMATTING);
    private static final Text EFFECT_EXPLAIN_TEXT = Text.literal("+3 Attack Damage").formatted(DESCRIPTION_FORMATTING);
    private static final Text WHEN_APPLIED = Text.literal("When Applied").formatted(TITLE_FORMATTING);
    private static final Text ON_HIT = Text.literal("On Hit").formatted(TITLE_FORMATTING);
    private final float attackDamage;
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public MandibleAxeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, settings);
        this.attackDamage = (float)attackDamage + toolMaterial.getAttackDamage();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", (double)attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,200,0));
        return true;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            return this.attributeModifiers;
        }
        return super.getAttributeModifiers(slot);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(ON_HIT);
        tooltip.add(EFFECT_TEXT);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(WHEN_APPLIED);
        tooltip.add(ScreenTexts.space().append(EFFECT_EXPLAIN_TEXT));
        tooltip.add(APPLY_TEXT);
        super.appendTooltip(stack, world, tooltip, context);
    }
}
