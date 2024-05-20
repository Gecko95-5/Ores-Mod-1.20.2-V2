package net.gecko95.oresmod.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier LEAFITE_BOAT_ID = new Identifier(OresMod.MOD_ID,"leafite_boat");
    public static final Identifier LEAFITE_CHEST_BOAT_ID = new Identifier(OresMod.MOD_ID,"leafite_chest_boat");

    public static final RegistryKey<TerraformBoatType> LEAFITE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LEAFITE_BOAT_ID);

    public static void registerBoats(){
        TerraformBoatType leafiteBoat = new TerraformBoatType.Builder()
                .item(ModItems.LEAFITE_BOAT)
                .chestItem(ModItems.LEAFITE_CHEST_BOAT)
                .planks(ModBlocks.LEAFITE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, LEAFITE_BOAT_KEY, leafiteBoat);
    }
}
