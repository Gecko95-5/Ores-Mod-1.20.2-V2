package net.gecko95.oresmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.entity.ModBoats;
import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.entity.custom.*;
import net.gecko95.oresmod.entity.custom.golem.FrositeGolemEntity;
import net.gecko95.oresmod.item.ModItemGroups;
import net.gecko95.oresmod.item.ModItems;
import net.gecko95.oresmod.potion.ModPotions;
import net.gecko95.oresmod.registry.RegisterModEffects;
import net.gecko95.oresmod.util.ModCustomTrades;
import net.gecko95.oresmod.util.ModLootTableModifiers;
import net.gecko95.oresmod.world.gen.ModWorldGeneration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OresMod implements ModInitializer {
	public static final String MOD_ID = "oresmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();
		RegisterModEffects.registerEffects();
		ModPotions.registerPotions();

		StrippableBlockRegistry.register(ModBlocks.STONEBARK_LOG, ModBlocks.STRIPPED_STONEBARK_LOG);
		StrippableBlockRegistry.register(ModBlocks.STONEBARK_WOOD, ModBlocks.STRIPPED_STONEBARK_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STONEBARK_LEAVES,30,60);

		StrippableBlockRegistry.register(ModBlocks.DEEPSLATE_LOG, ModBlocks.STRIPPED_DEEPSLATE_LOG);
		StrippableBlockRegistry.register(ModBlocks.DEEPSLATE_WOOD, ModBlocks.STRIPPED_DEEPSLATE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DEEPSLATE_LEAVES,15,30);

		StrippableBlockRegistry.register(ModBlocks.LEAFITE_LOG, ModBlocks.STRIPPED_LEAFITE_LOG);
		StrippableBlockRegistry.register(ModBlocks.LEAFITE_WOOD, ModBlocks.STRIPPED_LEAFITE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_LEAVES,30,60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_PLANKS_SLAB,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_PLANKS_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_PLANKS_FENCE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_PLANKS_FENCE_GATE,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LEAFITE_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LEAFITE_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LEAFITE_WOOD,5,5);

		FabricDefaultAttributeRegistry.register(ModEntities.SILVERPEDE, SilverpedeEntity.createSilverpedeAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SILVERWYRM, SilverwyrmEntity.createSilverwyrmAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.JUNGLE_SPIDER, JungleSpiderEntity.createJungleSpiderAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ENDER_SPIDER, EnderSpiderEntity.createEnderSpiderAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.FROSTBITEN, FrostbitenEntity.createFrostbitenAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.FROSITE_GOLEM, FrositeGolemEntity.createFrositeGolemAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ICE_CUBE, IceCubeEntity.createIceCubeAttributes());

		ModBoats.registerBoats();

		LOGGER.info("Generating Ores!");
	}
}