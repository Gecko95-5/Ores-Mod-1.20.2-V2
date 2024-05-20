package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.client.ModModelLayers;
import net.gecko95.oresmod.entity.client.models.SilverpedeModel;
import net.gecko95.oresmod.entity.custom.SilverpedeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SilverpedeRenderer extends MobEntityRenderer<SilverpedeEntity, SilverpedeModel<SilverpedeEntity>> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/silverpede.png");
    public SilverpedeRenderer(EntityRendererFactory.Context context) {
        super(context, new SilverpedeModel<>(context.getPart(ModModelLayers.SILVERPEDE)),0.4f);
    }

    @Override
    public Identifier getTexture(SilverpedeEntity entity) {
        return TEXTURE;
    }
}
