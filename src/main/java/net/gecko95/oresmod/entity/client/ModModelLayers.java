package net.gecko95.oresmod.entity.client;

import net.gecko95.oresmod.OresMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer SILVERPEDE =
            new EntityModelLayer(new Identifier(OresMod.MOD_ID,"silverpede"),"silverpede");
    public static final EntityModelLayer SILVERWYRM =
            new EntityModelLayer(new Identifier(OresMod.MOD_ID,"silverwyrm"),"silverwyrm");
    public static final EntityModelLayer FROSITE_GOLEM =
            new EntityModelLayer(new Identifier(OresMod.MOD_ID,"frosite_golem"),"frosite_golem");
    public static final EntityModelLayer ICE_CUBE =
            new EntityModelLayer(new Identifier(OresMod.MOD_ID,"ice_cube"),"ice_cube");
}
