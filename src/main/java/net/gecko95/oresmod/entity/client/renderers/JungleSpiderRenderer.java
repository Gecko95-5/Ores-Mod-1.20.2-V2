package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.minecraft.client.render.entity.CaveSpiderEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.util.Identifier;

public class JungleSpiderRenderer extends CaveSpiderEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/jungle_spider.png");

    public JungleSpiderRenderer(EntityRendererFactory.Context context) {
        super(context);
    }
    public Identifier getTexture(CaveSpiderEntity caveSpiderEntity){
        return TEXTURE;
    }
}
