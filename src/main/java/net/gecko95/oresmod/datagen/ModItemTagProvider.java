package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.gecko95.oresmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.FROSITE_HELMET, ModItems.FROSITE_CHESTPLATE, ModItems.FROSITE_LEGGINGS, ModItems.FROSITE_BOOTS)
                .add(ModItems.ALUMINUM_HELMET, ModItems.ALUMINUM_CHESTPLATE, ModItems.ALUMINUM_LEGGINGS, ModItems.ALUMINUM_BOOTS)
                .add(ModItems.NICKEL_HELMET, ModItems.NICKEL_CHESTPLATE, ModItems.NICKEL_LEGGINGS, ModItems.NICKEL_BOOTS)
                .add(ModItems.COPPER_HELMET, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_LEGGINGS, ModItems.COPPER_BOOTS)
                .add(ModItems.STEEL_HELMET, ModItems.STEEL_CHESTPLATE, ModItems.STEEL_LEGGINGS, ModItems.STEEL_BOOTS)
                .add(ModItems.TITANIUM_HELMET, ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM_BOOTS)
                .add(ModItems.TUNGSTEN_HELMET, ModItems.TUNGSTEN_CHESTPLATE, ModItems.TUNGSTEN_LEGGINGS, ModItems.TUNGSTEN_BOOTS)
                .add(ModItems.TITANIUM_ALLOY_HELMET, ModItems.TITANIUM_ALLOY_CHESTPLATE, ModItems.TITANIUM_ALLOY_LEGGINGS, ModItems.TITANIUM_ALLOY_BOOTS)
                .add(ModItems.COBALT_HELMET, ModItems.COBALT_CHESTPLATE, ModItems.COBALT_LEGGINGS, ModItems.COBALT_BOOTS)
                .add(ModItems.BEDROCK_HELMET, ModItems.BEDROCK_CHESTPLATE, ModItems.BEDROCK_LEGGINGS, ModItems.BEDROCK_BOOTS)
                .add(ModItems.SANDITE_HELMET, ModItems.SANDITE_CHESTPLATE, ModItems.SANDITE_LEGGINGS, ModItems.SANDITE_BOOTS)
                .add(ModItems.LEAFITE_HELMET, ModItems.LEAFITE_CHESTPLATE, ModItems.LEAFITE_LEGGINGS, ModItems.LEAFITE_BOOTS)
                .add(ModItems.END_ITE_HELMET, ModItems.END_ITE_CHESTPLATE, ModItems.END_ITE_LEGGINGS, ModItems.END_ITE_BOOTS)
                .add(ModItems.PLATINUM_HELMET, ModItems.PLATINUM_CHESTPLATE, ModItems.PLATINUM_LEGGINGS, ModItems.PLATINUM_BOOTS)
                .add(ModItems.CLAY_HELMET, ModItems.CLAY_CHESTPLATE, ModItems.CLAY_LEGGINGS, ModItems.CLAY_BOOTS)
                .add(ModItems.TERRACOTTA_HELMET, ModItems.TERRACOTTA_CHESTPLATE, ModItems.TERRACOTTA_LEGGINGS, ModItems.TERRACOTTA_BOOTS)
                .add(ModItems.BLACK_TERRACOTTA_HELMET, ModItems.BLACK_TERRACOTTA_CHESTPLATE, ModItems.BLACK_TERRACOTTA_LEGGINGS, ModItems.BLACK_TERRACOTTA_BOOTS)
                .add(ModItems.BLUE_TERRACOTTA_HELMET, ModItems.BLUE_TERRACOTTA_CHESTPLATE, ModItems.BLUE_TERRACOTTA_LEGGINGS, ModItems.BLUE_TERRACOTTA_BOOTS)
                .add(ModItems.BROWN_TERRACOTTA_HELMET, ModItems.BROWN_TERRACOTTA_CHESTPLATE, ModItems.BROWN_TERRACOTTA_LEGGINGS, ModItems.BROWN_TERRACOTTA_BOOTS)
                .add(ModItems.CYAN_TERRACOTTA_HELMET, ModItems.CYAN_TERRACOTTA_CHESTPLATE, ModItems.CYAN_TERRACOTTA_LEGGINGS, ModItems.CYAN_TERRACOTTA_BOOTS)
                .add(ModItems.GRAY_TERRACOTTA_HELMET, ModItems.GRAY_TERRACOTTA_CHESTPLATE, ModItems.GRAY_TERRACOTTA_LEGGINGS, ModItems.GRAY_TERRACOTTA_BOOTS)
                .add(ModItems.GREEN_TERRACOTTA_HELMET, ModItems.GREEN_TERRACOTTA_CHESTPLATE, ModItems.GREEN_TERRACOTTA_LEGGINGS, ModItems.GREEN_TERRACOTTA_BOOTS)
                .add(ModItems.LIGHT_BLUE_TERRACOTTA_HELMET, ModItems.LIGHT_BLUE_TERRACOTTA_CHESTPLATE, ModItems.LIGHT_BLUE_TERRACOTTA_LEGGINGS, ModItems.LIGHT_BLUE_TERRACOTTA_BOOTS)
                .add(ModItems.LIGHT_GRAY_TERRACOTTA_HELMET, ModItems.LIGHT_GRAY_TERRACOTTA_CHESTPLATE, ModItems.LIGHT_GRAY_TERRACOTTA_LEGGINGS, ModItems.LIGHT_GRAY_TERRACOTTA_BOOTS)
                .add(ModItems.LIME_TERRACOTTA_HELMET, ModItems.LIME_TERRACOTTA_CHESTPLATE, ModItems.LIME_TERRACOTTA_LEGGINGS, ModItems.LIME_TERRACOTTA_BOOTS)
                .add(ModItems.MAGENTA_TERRACOTTA_HELMET, ModItems.MAGENTA_TERRACOTTA_CHESTPLATE, ModItems.MAGENTA_TERRACOTTA_LEGGINGS, ModItems.MAGENTA_TERRACOTTA_BOOTS)
                .add(ModItems.ORANGE_TERRACOTTA_HELMET, ModItems.ORANGE_TERRACOTTA_CHESTPLATE, ModItems.ORANGE_TERRACOTTA_LEGGINGS, ModItems.ORANGE_TERRACOTTA_BOOTS)
                .add(ModItems.PINK_TERRACOTTA_HELMET, ModItems.PINK_TERRACOTTA_CHESTPLATE, ModItems.PINK_TERRACOTTA_LEGGINGS, ModItems.PINK_TERRACOTTA_BOOTS)
                .add(ModItems.PURPLE_TERRACOTTA_HELMET, ModItems.PURPLE_TERRACOTTA_CHESTPLATE, ModItems.PURPLE_TERRACOTTA_LEGGINGS, ModItems.PURPLE_TERRACOTTA_BOOTS)
                .add(ModItems.RED_TERRACOTTA_HELMET, ModItems.RED_TERRACOTTA_CHESTPLATE, ModItems.RED_TERRACOTTA_LEGGINGS, ModItems.RED_TERRACOTTA_BOOTS)
                .add(ModItems.WHITE_TERRACOTTA_HELMET, ModItems.WHITE_TERRACOTTA_CHESTPLATE, ModItems.WHITE_TERRACOTTA_LEGGINGS, ModItems.WHITE_TERRACOTTA_BOOTS)
                .add(ModItems.YELLOW_TERRACOTTA_HELMET, ModItems.YELLOW_TERRACOTTA_CHESTPLATE, ModItems.YELLOW_TERRACOTTA_LEGGINGS, ModItems.YELLOW_TERRACOTTA_BOOTS);


        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.STONEBARK_PLANKS.asItem())
                .add(ModBlocks.DEEPSLATE_PLANKS.asItem())
                .add(ModBlocks.LEAFITE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SAND)
                .add(ModBlocks.WHITE_SAND.asItem())
                .add(ModBlocks.BLACK_SAND.asItem());

        getOrCreateTagBuilder(ItemTags.SMELTS_TO_GLASS)
                .add(ModBlocks.WHITE_SAND.asItem())
                .add(ModBlocks.BLACK_SAND.asItem());

        getOrCreateTagBuilder(ModTags.Items.TERRACOTTA_HELMETS)
                .add(ModItems.BLACK_TERRACOTTA_HELMET)
                .add(ModItems.BLUE_TERRACOTTA_HELMET)
                .add(ModItems.BROWN_TERRACOTTA_HELMET)
                .add(ModItems.CYAN_TERRACOTTA_HELMET)
                .add(ModItems.GRAY_TERRACOTTA_HELMET)
                .add(ModItems.GREEN_TERRACOTTA_HELMET)
                .add(ModItems.LIGHT_BLUE_TERRACOTTA_HELMET)
                .add(ModItems.LIGHT_GRAY_TERRACOTTA_HELMET)
                .add(ModItems.LIME_TERRACOTTA_HELMET)
                .add(ModItems.MAGENTA_TERRACOTTA_HELMET)
                .add(ModItems.ORANGE_TERRACOTTA_HELMET)
                .add(ModItems.PINK_TERRACOTTA_HELMET)
                .add(ModItems.PURPLE_TERRACOTTA_HELMET)
                .add(ModItems.RED_TERRACOTTA_HELMET)
                .add(ModItems.WHITE_TERRACOTTA_HELMET)
                .add(ModItems.YELLOW_TERRACOTTA_HELMET);

        getOrCreateTagBuilder(ModTags.Items.TERRACOTTA_CHESTPLATES)
                .add(ModItems.BLACK_TERRACOTTA_CHESTPLATE)
                .add(ModItems.BLUE_TERRACOTTA_CHESTPLATE)
                .add(ModItems.BROWN_TERRACOTTA_CHESTPLATE)
                .add(ModItems.CYAN_TERRACOTTA_CHESTPLATE)
                .add(ModItems.GRAY_TERRACOTTA_CHESTPLATE)
                .add(ModItems.GREEN_TERRACOTTA_CHESTPLATE)
                .add(ModItems.LIGHT_BLUE_TERRACOTTA_CHESTPLATE)
                .add(ModItems.LIGHT_GRAY_TERRACOTTA_CHESTPLATE)
                .add(ModItems.LIME_TERRACOTTA_CHESTPLATE)
                .add(ModItems.MAGENTA_TERRACOTTA_CHESTPLATE)
                .add(ModItems.ORANGE_TERRACOTTA_CHESTPLATE)
                .add(ModItems.PINK_TERRACOTTA_CHESTPLATE)
                .add(ModItems.PURPLE_TERRACOTTA_CHESTPLATE)
                .add(ModItems.RED_TERRACOTTA_CHESTPLATE)
                .add(ModItems.WHITE_TERRACOTTA_CHESTPLATE)
                .add(ModItems.YELLOW_TERRACOTTA_CHESTPLATE);

        getOrCreateTagBuilder(ModTags.Items.TERRACOTTA_LEGGINGS)
                .add(ModItems.BLACK_TERRACOTTA_LEGGINGS)
                .add(ModItems.BLUE_TERRACOTTA_LEGGINGS)
                .add(ModItems.BROWN_TERRACOTTA_LEGGINGS)
                .add(ModItems.CYAN_TERRACOTTA_LEGGINGS)
                .add(ModItems.GRAY_TERRACOTTA_LEGGINGS)
                .add(ModItems.GREEN_TERRACOTTA_LEGGINGS)
                .add(ModItems.LIGHT_BLUE_TERRACOTTA_LEGGINGS)
                .add(ModItems.LIGHT_GRAY_TERRACOTTA_LEGGINGS)
                .add(ModItems.LIME_TERRACOTTA_LEGGINGS)
                .add(ModItems.MAGENTA_TERRACOTTA_LEGGINGS)
                .add(ModItems.ORANGE_TERRACOTTA_LEGGINGS)
                .add(ModItems.PINK_TERRACOTTA_LEGGINGS)
                .add(ModItems.PURPLE_TERRACOTTA_LEGGINGS)
                .add(ModItems.RED_TERRACOTTA_LEGGINGS)
                .add(ModItems.WHITE_TERRACOTTA_LEGGINGS)
                .add(ModItems.YELLOW_TERRACOTTA_LEGGINGS);

        getOrCreateTagBuilder(ModTags.Items.TERRACOTTA_BOOTS)
                .add(ModItems.BLACK_TERRACOTTA_BOOTS)
                .add(ModItems.BLUE_TERRACOTTA_BOOTS)
                .add(ModItems.BROWN_TERRACOTTA_BOOTS)
                .add(ModItems.CYAN_TERRACOTTA_BOOTS)
                .add(ModItems.GRAY_TERRACOTTA_BOOTS)
                .add(ModItems.GREEN_TERRACOTTA_BOOTS)
                .add(ModItems.LIGHT_BLUE_TERRACOTTA_BOOTS)
                .add(ModItems.LIGHT_GRAY_TERRACOTTA_BOOTS)
                .add(ModItems.LIME_TERRACOTTA_BOOTS)
                .add(ModItems.MAGENTA_TERRACOTTA_BOOTS)
                .add(ModItems.ORANGE_TERRACOTTA_BOOTS)
                .add(ModItems.PINK_TERRACOTTA_BOOTS)
                .add(ModItems.PURPLE_TERRACOTTA_BOOTS)
                .add(ModItems.RED_TERRACOTTA_BOOTS)
                .add(ModItems.WHITE_TERRACOTTA_BOOTS)
                .add(ModItems.YELLOW_TERRACOTTA_BOOTS);

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.STONEBARK_LEAVES.asItem())
                .add(ModBlocks.DEEPSLATE_LEAVES.asItem())
                .add(ModBlocks.LEAFITE_LEAVES.asItem())
                .add(ModBlocks.LEAFITE_LEAVES_ORE.asItem());
    }
}
