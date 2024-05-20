package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.client.ModModelLayers;
import net.gecko95.oresmod.entity.client.models.SilverwyrmModel;
import net.gecko95.oresmod.entity.custom.SilverwyrmEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SilverwyrmRenderer extends MobEntityRenderer<SilverwyrmEntity, SilverwyrmModel<SilverwyrmEntity>> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/silverwyrm.png");
    public SilverwyrmRenderer(EntityRendererFactory.Context context) {
        super(context, new SilverwyrmModel<>(context.getPart(ModModelLayers.SILVERWYRM)),0.6f);
    }

    @Override
    public Identifier getTexture(SilverwyrmEntity entity) {
        return TEXTURE;
    }
}
