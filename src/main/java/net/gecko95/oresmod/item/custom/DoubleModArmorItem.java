package net.gecko95.oresmod.item.custom;

import com.google.common.collect.ImmutableMap;
import net.gecko95.oresmod.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class DoubleModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance[]> MATERIAL_TO_EFFECTS_MAP =
            new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance[]>()
                    .put(ModArmorMaterials.BEDROCK, new StatusEffectInstance[]{
                            new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 3, false, false, false),
                            new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2, false, false, false)
                    })
                    .build();

    public DoubleModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if (entity instanceof PlayerEntity player && MATERIAL_TO_EFFECTS_MAP.containsKey(this.material)) {

                boolean hasFullCorrectArmor = true;

                for (ItemStack armorStack : player.getArmorItems()) {
                    if (!(armorStack.getItem() instanceof ArmorItem armorItem) || armorItem.getMaterial() != this.material) {
                        hasFullCorrectArmor = false;
                        break;
                    }
                }

                if (hasFullCorrectArmor) {
                    for (StatusEffectInstance effect : MATERIAL_TO_EFFECTS_MAP.get(this.material)) {
                        player.addStatusEffect(new StatusEffectInstance(effect));
                    }
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}