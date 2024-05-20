package net.gecko95.oresmod.mixin;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel usePowerToolModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.HANDLED_POWER_DRIVE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "handled_power_drive_3d", "inventory"));
        }

        if (stack.isOf(ModItems.DUEL_HANDLED_POWER_DRIVE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "duel_handled_power_drive_3d", "inventory"));
        }

        if (stack.isOf(ModItems.IRON_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "iron_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.IRON_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "iron_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.DIAMOND_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "diamond_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.DIAMOND_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "diamond_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.GOLDEN_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "golden_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.GOLDEN_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "golden_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.FROSITE_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "frosite_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.FROSITE_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "frosite_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.ALUMINUM_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "aluminum_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.ALUMINUM_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "aluminum_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.NICKEL_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "nickel_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.NICKEL_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "nickel_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.COPPER_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "copper_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.COPPER_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "copper_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.COBALT_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "cobalt_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.COBALT_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "cobalt_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.STEEL_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "steel_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.STEEL_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "steel_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.NETHERITE_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "netherite_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.NETHERITE_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "netherite_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.TUNGSTEN_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "tungsten_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.TUNGSTEN_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "tungsten_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.TITANIUM_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "titanium_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.TITANIUM_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "titanium_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.TITANIUM_ALLOY_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "titanium_alloy_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.TITANIUM_ALLOY_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "titanium_alloy_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.SANDITE_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "sandite_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.SANDITE_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "sandite_chainsaw_3d", "inventory"));
        }

        if (stack.isOf(ModItems.LEAFITE_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "leafite_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.LEAFITE_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "leafite_chainsaw_3d", "inventory"));
        }
        if (stack.isOf(ModItems.END_ITE_DRILL) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "end_ite_drill_3d", "inventory"));
        }

        if (stack.isOf(ModItems.END_ITE_CHAINSAW) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "end_ite_chainsaw_3d", "inventory"));
        }
        if (stack.isOf(ModItems.SPIKED_CLUB) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "spiked_club_3d", "inventory"));
        }
        if (stack.isOf(ModItems.MANDIBLE_HATCHET) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(OresMod.MOD_ID, "mandible_hatchet_3d", "inventory"));
        }
        return value;

    }
}