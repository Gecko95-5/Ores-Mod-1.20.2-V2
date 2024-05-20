package net.gecko95.oresmod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.LocationCheckLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.RandomChanceWithLootingLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.function.SetDamageLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.entity.LocationPredicate;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;




public class ModLootTableModifiers {
    public static final LootCondition.Builder NEEDS_SNOWY_PLAINS_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.SNOWY_PLAINS));
    public static final LootCondition.Builder NEEDS_SNOWY_BEACH_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.SNOWY_BEACH));
    public static final LootCondition.Builder NEEDS_SNOWY_TAIGA_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.SNOWY_TAIGA));
    public static final LootCondition.Builder NEEDS_GROVE_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.GROVE));
    public static final LootCondition.Builder NEEDS_ICE_SPIKES_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.ICE_SPIKES));
    public static final LootCondition.Builder NEEDS_FROZEN_RIVER_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.FROZEN_RIVER));
    public static final LootCondition.Builder NEEDS_FROZEN_OCEAN_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.FROZEN_OCEAN));
    public static final LootCondition.Builder NEEDS_DEEP_FROZEN_OCEAN_BIOME = LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.DEEP_FROZEN_OCEAN));
    private static final Identifier SIMPLE_DUNGEON_ID =
            new Identifier("minecraft","chests/simple_dungeon");
    private static final Identifier ABANDONED_MINESHAFT_ID =
            new Identifier("minecraft","chests/abandoned_mineshaft");
    private static final Identifier STRONGHOLD_CORRIDOR_ID =
            new Identifier("minecraft","chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_ID =
            new Identifier("minecraft","chests/stronghold_crossing");
    private static final Identifier ANCIENT_CITY_ID =
            new Identifier("minecraft","chests/ancient_city");
    private static final Identifier NETHER_BRIDGE_ID =
            new Identifier("minecraft","chests/nether_bridge");
    private static final Identifier RUINED_PORTAL_ID =
            new Identifier("minecraft","chests/ruined_portal");
    private static final Identifier DESERT_TEMPLE_ID =
            new Identifier("minecraft","chests/desert_pyramid");
    private static final Identifier JUNGLE_TEMPLE_ID =
            new Identifier("minecraft","chests/jungle_temple");
    private static final Identifier IGLOO_ID =
            new Identifier("minecraft","chests/igloo_chest");
    private static final Identifier OUTPOST_ID =
            new Identifier("minecraft","chests/pillager_outpost");
    private static final Identifier WOODLAND_MANSION_ID =
            new Identifier("minecraft","chests/woodland_mansion");
    private static final Identifier SHIPWRECK_TREASURE_ID =
            new Identifier("minecraft","chests/shipwreck_treasure");
    private static final Identifier BURIED_TREASURE_ID =
            new Identifier("minecraft","chests/buried_treasure");
    private static final Identifier BASTION_BRIDGE_ID =
            new Identifier("minecraft","chests/bastion_bridge");
    private static final Identifier BASTION_GENERIC_ID =
            new Identifier("minecraft","chests/bastion_other");
    private static final Identifier BASTION_STABLE_ID =
            new Identifier("minecraft","chests/bastion_hoglin_stable");
    private static final Identifier BASTION_TREASURE_ID =
            new Identifier("minecraft","chests/bastion_treasure");
    private static final Identifier END_CITY_ID =
            new Identifier("minecraft","chests/end_city_treasure");
    private static final Identifier VILLAGE_ARMORER_ID =
            new Identifier("minecraft","chests/village/village_armorer");
    private static final Identifier VILLAGE_FISHER_ID =
            new Identifier("minecraft","chests/village/village_fisher");
    private static final Identifier VILLAGE_TEMPLE_ID =
            new Identifier("minecraft","chests/village/village_temple");
    private static final Identifier VILLAGE_TOOLSMITH_ID =
            new Identifier("minecraft","chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH_ID =
            new Identifier("minecraft","chests/village/village_weaponsmith");
    private static final Identifier STRAY_ID =
            new Identifier("minecraft","entities/stray");
    private static final Identifier HUSK_ID =
            new Identifier("minecraft","entities/husk");
    private static final Identifier SILVERFISH_ID =
            new Identifier("minecraft","entities/silverfish");
    private static final Identifier ENDER_DRAGON_ID =
            new Identifier("minecraft","entities/ender_dragon");
    private static final Identifier WITHER_ID =
            new Identifier("minecraft","entities/wither");
    private static final Identifier ELDER_GUARDIAN_ID =
            new Identifier("minecraft","entities/elder_guardian");
    private static final Identifier WARDEN_ID =
            new Identifier("minecraft","entities/warden");
    private static final Identifier JUNK_ID =
            new Identifier("minecraft","gameplay/fishing/junk");
    private static final Identifier BARTERING_ID =
            new Identifier("minecraft","gameplay/piglin_bartering");
    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.096f))
                        .with(ItemEntry.builder(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.341f))
                        .with(ItemEntry.builder(ModBlocks.STONEBARK_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.096f))
                        .with(ItemEntry.builder(ModBlocks.DEEPBARK_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.341f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.185f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.031f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }



            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.387f))
                        .with(ItemEntry.builder(ModBlocks.STONEBARK_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.145f))
                        .with(ItemEntry.builder(ModBlocks.DEEPBARK_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.089f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.273f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.273f))
                        .with(ItemEntry.builder(ModItems.NICKEL_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.271f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_PICKAXE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }


            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.332f))
                        .with(ItemEntry.builder(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.332f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.025f))
                        .with(ItemEntry.builder(ModItems.NICKEL_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.23f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.073f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_SWORD));

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_PICKAXE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_HELMET));

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_CHESTPLATE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_LEGGINGS));

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_BOOTS));

                tableBuilder.pool(poolBuilder.build());
            }


            if (STRONGHOLD_CROSSING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.186f))
                        .with(ItemEntry.builder(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CROSSING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.343f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CROSSING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.343f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CROSSING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.04f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_PICKAXE));

                tableBuilder.pool(poolBuilder.build());
            }

            if (ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.465f))
                        .with(ItemEntry.builder(ModBlocks.DEEPBARK_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.232f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_LEGGINGS))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.161f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_HOE)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.8f, 1.0f)))
                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(30.0f, 50.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.161f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_LEGGINGS))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(30.0f, 50.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }

            if (RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.015f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.464f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(9.0f, 18.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.205f))
                        .with(ItemEntry.builder(ModItems.COBALT_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.073f))
                        .with(ItemEntry.builder(ModItems.COBALT_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (RUINED_PORTAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.073f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.291f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModItems.COBALT_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.118f))
                        .with(ItemEntry.builder(ModItems.COBALT_SWORD));

                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.118f))
                        .with(ItemEntry.builder(ModItems.COBALT_CHESTPLATE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModItems.FLINT_AND_ALUMINUM));

                tableBuilder.pool(poolBuilder.build());
            }



            if (DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.287f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.143f))
                        .with(ItemEntry.builder(ModBlocks.WHITE_SAND))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 8.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.235f))
                        .with(ItemEntry.builder(ModItems.NICKEL_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.18f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.063f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.076f))
                        .with(ItemEntry.builder(ModItems.SANDITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (IGLOO_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.076f))
                        .with(ItemEntry.builder(ModItems.FROSITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.076f))
                        .with(ItemEntry.builder(ModItems.LEAFITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }


            if (JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.534f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.374f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.129f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (OUTPOST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.305f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.266f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.218f))
                        .with(ItemEntry.builder(ModItems.NICKEL_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.185f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.077f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_CHESTPLATE));

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_ARMORER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.542f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_ARMORER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.318f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_HELMET));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_FISHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.43f))
                        .with(ItemEntry.builder(ModItems.POWDERED_SALT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.448f))
                        .with(ItemEntry.builder(ModItems.RAW_FLESH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.099f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.412f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.412f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_SHOVEL));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.412f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_PICKAXE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.099f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }


            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.598f))
                        .with(ItemEntry.builder(ModItems.NICKEL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.451f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.256f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_SWORD));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.256f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_PICKAXE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.256f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_HELMET));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.256f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_CHESTPLATE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.256f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_LEGGINGS));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.256f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_BOOTS));

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.162f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (SHIPWRECK_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.974f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.945f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.141f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.994f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.599f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_SWORD));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.479f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.COBALT_SWORD));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.COBALT_AXE)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.COBALT_HELMET)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.COBALT_CHESTPLATE)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.COBALT_LEGGINGS)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.COBALT_BOOTS)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.479f))
                        .with(ItemEntry.builder(ModItems.COBALT_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112f))
                        .with(ItemEntry.builder(ModItems.COBALT_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.244f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModBlocks.ALUMINUM_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.244f))
                        .with(ItemEntry.builder(ModItems.COBALT_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModItems.COBALT_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModBlocks.COBALT_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_SWORD)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.1f, 0.9f)))
                        .apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.COBALT_SWORD));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.COBALT_AXE)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.067f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_PICKAXE)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_SHOVEL));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.COBALT_HELMET));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.COBALT_CHESTPLATE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.COBALT_LEGGINGS));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.COBALT_BOOTS));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_GENERIC_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.098f))
                        .with(ItemEntry.builder(ModItems.COBALT_BOOTS)).apply(new EnchantRandomlyLootFunction.Builder().add(Enchantments.SOUL_SPEED));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_PICKAXE)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.228f))
                        .with(ItemEntry.builder(ModItems.COBALT_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.228f))
                        .with(ItemEntry.builder(ModItems.COBALT_AXE)).apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_SHOVEL)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.15f, 0.8f)))
                        .apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.337f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.337f))
                        .with(ItemEntry.builder(ModBlocks.ALUMINUM_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.169f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_SWORD)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.8f, 1.0f)))
                        .apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.169f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_SWORD));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.337f))
                        .with(ItemEntry.builder(ModItems.COBALT_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.337f))
                        .with(ItemEntry.builder(ModBlocks.COBALT_BLOCK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.169f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 8.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.143f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.143f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_HELMET));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.143f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_CHESTPLATE));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.143f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_BOOTS));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.143f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_LEGGINGS));

                tableBuilder.pool(poolBuilder.build());
            }


            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.169f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_HELMET)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.8f, 1.0f)))
                        .apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.169f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_CHESTPLATE)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.8f, 1.0f)))
                        .apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.169f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_BOOTS)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.8f, 1.0f)))
                        .apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.169f))
                        .with(ItemEntry.builder(ModItems.TUNGSTEN_LEGGINGS)).apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.8f, 1.0f)))
                        .apply(EnchantRandomlyLootFunction.builder());

                tableBuilder.pool(poolBuilder.build());
            }

            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.384f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 8.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.076f))
                        .with(ItemEntry.builder(ModItems.END_ITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.212f))
                        .with(ItemEntry.builder(ModItems.PLATINUM_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_SWORD))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_SHOVEL))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_PICKAXE))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_HELMET))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_CHESTPLATE))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_LEGGINGS))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_BOOTS))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.PLATINUM_HELMET))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.PLATINUM_CHESTPLATE))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.PLATINUM_LEGGINGS))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133f))
                        .with(ItemEntry.builder(ModItems.PLATINUM_BOOTS))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20.0f, 39.0f)).allowTreasureEnchantments());

                tableBuilder.pool(poolBuilder.build());
            }
            if (STRAY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithLootingLootCondition.builder(0.2f,0.2f))
                        .with(ItemEntry.builder(ModItems.FROSITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (HUSK_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithLootingLootCondition.builder(0.2f,0.2f))
                        .with(ItemEntry.builder(ModItems.SANDITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SILVERFISH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.SILVER_SCALE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ENDER_DRAGON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModBlocks.ENDER_DRAGON_TROPHY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (WITHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModBlocks.WITHER_TROPHY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (ELDER_GUARDIAN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(ModBlocks.ELDER_GUARDIAN_TROPHY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (WARDEN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModBlocks.WARDEN_TROPHY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (JUNK_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.POWDERED_SALT));

                tableBuilder.pool(poolBuilder.build());
            }
            if (JUNK_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.FROZEN_FLESH))
                        .conditionally(NEEDS_SNOWY_PLAINS_BIOME.or(NEEDS_SNOWY_TAIGA_BIOME).or(NEEDS_GROVE_BIOME)
                                .or(NEEDS_SNOWY_BEACH_BIOME).or(NEEDS_ICE_SPIKES_BIOME).or(NEEDS_FROZEN_RIVER_BIOME)
                                .or(NEEDS_FROZEN_OCEAN_BIOME).or(NEEDS_DEEP_FROZEN_OCEAN_BIOME));

                tableBuilder.pool(poolBuilder.build());
            }
            if (BARTERING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(0.0218f))
                        .with(ItemEntry.builder(ModItems.ALUMINUM_NUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(10.0f, 36.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
