package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.minecraft.client.render.entity.CaveSpiderEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SpiderEntityRenderer;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.util.Identifier;

public class EnderSpiderRenderer extends SpiderEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/ender_spider.png");

    public EnderSpiderRenderer(EntityRendererFactory.Context context) {
        super(context);
    }
    public Identifier getTexture(SpiderEntity spiderEntity){
        return TEXTURE;
    }
}
