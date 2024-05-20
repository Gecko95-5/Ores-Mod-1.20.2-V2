package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class FrostbitenRenderer extends ZombieEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/frostbiten.png");
    public FrostbitenRenderer(EntityRendererFactory.Context context) {
        super(context);
    }
    public Identifier getTexture(ZombieEntity zombieEntity){
        return TEXTURE;
    }
}
