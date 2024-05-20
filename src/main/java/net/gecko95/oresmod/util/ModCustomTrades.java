package net.gecko95.oresmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER,1,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 7),
                    new ItemStack(ModItems.ALUMINUM_LEGGINGS, 1),
                    12, 1, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(ModItems.ALUMINUM_BOOTS, 1),
                    12, 1, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ModItems.ALUMINUM_HELMET, 1),
                    12, 1, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 9),
                    new ItemStack(ModItems.ALUMINUM_CHESTPLATE, 1),
                    12, 1, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.NICKEL_INGOT, 15),
                    new ItemStack(Items.EMERALD, 1),
                    16, 2, 0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.COPPER_INGOT, 15),
                    new ItemStack(Items.EMERALD, 1),
                    16, 2, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER,2,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.NICKEL_BOOTS, 1),
                    12, 5, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ModItems.NICKEL_LEGGINGS, 1),
                    12, 5, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.COPPER_BOOTS, 1),
                    12, 5, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ModItems.COPPER_LEGGINGS, 1),
                    12, 5, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.ALUMINUM_INGOT, 4),
                    new ItemStack(Items.EMERALD, 1),
                    12, 10, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER,3,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.NICKEL_HELMET, 1),
                    12, 10, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(ModItems.NICKEL_CHESTPLATE, 1),
                    12, 10, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.COPPER_HELMET, 1),
                    12, 10, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(ModItems.COPPER_CHESTPLATE, 1),
                    12, 10, 0.2f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.TITANIUM_INGOT, 1),
                    new ItemStack(Items.EMERALD, 1),
                    12, 20, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_FLESH, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 20, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.POWDERED_SALT, 10),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.NICKEL_AXE, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.NICKEL_PICKAXE, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.NICKEL_SHOVEL, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.NICKEL_HOE, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.COPPER_AXE, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.COPPER_PICKAXE, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.COPPER_SHOVEL, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.COPPER_HOE, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.NICKEL_INGOT, 15),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_INGOT, 15),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ALUMINUM_INGOT, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.TITANIUM_INGOT, 1),
                        new ItemStack(Items.EMERALD, 1),
                    12, 30, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Items.IRON_PICKAXE, 1),
                            new ItemStack(ModItems.IRON_DRILL, 1),
                            3, 30, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Items.IRON_AXE, 1),
                            new ItemStack(ModItems.IRON_CHAINSAW, 1),
                            3, 30, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.ALUMINUM_PICKAXE, 1),
                            new ItemStack(ModItems.ALUMINUM_DRILL, 1),
                            3, 30, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.ALUMINUM_AXE, 1),
                            new ItemStack(ModItems.ALUMINUM_CHAINSAW, 1),
                            3, 30, 0.2f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.ALUMINUM_AXE, 1),
                            12, 1, 0.2f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.NICKEL_INGOT, 15),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_INGOT, 15),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ALUMINUM_INGOT, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TITANIUM_INGOT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(Items.EMERALD, 2),
                            3, 30, 0.2f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModBlocks.WHITE_SAND, 4),
                            6, 0, 0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModBlocks.BLACK_SAND, 4),
                            6, 0, 0.0f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModBlocks.STONEBARK_SAPLING, 1),
                            8, 0, 0.0f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModBlocks.DEEPBARK_SAPLING, 1),
                            8, 0, 0.0f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModBlocks.LEAFITE_SAPLING, 1),
                            8, 0, 0.0f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModBlocks.ICY_CROCUS, 1),
                            8, 0, 0.0f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.POWDERED_SALT, 16),
                            8, 0, 0.0f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.ICE_CHUNK, 8),
                            6, 0, 0.0f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.STEEL_COMPOUND, 1),
                            1, 0, 0.0f));
                });

    }
}
