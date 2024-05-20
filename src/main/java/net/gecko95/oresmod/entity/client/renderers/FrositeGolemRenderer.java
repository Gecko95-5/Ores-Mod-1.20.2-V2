package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.client.ModModelLayers;
import net.gecko95.oresmod.entity.client.models.SilverpedeModel;
import net.gecko95.oresmod.entity.client.models.golem.FrositeGolemModel;
import net.gecko95.oresmod.entity.custom.golem.FrositeGolemEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FrositeGolemRenderer extends MobEntityRenderer<FrositeGolemEntity, FrositeGolemModel<FrositeGolemEntity>> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/golem/frosite_golem.png");
    public FrositeGolemRenderer(EntityRendererFactory.Context context) {
        super(context, new FrositeGolemModel<>(context.getPart(ModModelLayers.FROSITE_GOLEM)),0.5f);
    }

    @Override
    public Identifier getTexture(FrositeGolemEntity entity) {
        return TEXTURE;
    }
}
