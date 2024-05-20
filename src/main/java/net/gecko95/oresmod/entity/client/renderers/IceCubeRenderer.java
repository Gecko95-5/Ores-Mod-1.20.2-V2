package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.client.ModModelLayers;
import net.gecko95.oresmod.entity.client.models.IceCubeModel;
import net.gecko95.oresmod.entity.custom.IceCubeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class IceCubeRenderer extends MobEntityRenderer<IceCubeEntity, IceCubeModel<IceCubeEntity>> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/ice_cube.png");
    public IceCubeRenderer(EntityRendererFactory.Context context) {
        super(context, new IceCubeModel<>(context.getPart(ModModelLayers.ICE_CUBE)),0.4f);
    }

    @Override
    public Identifier getTexture(IceCubeEntity entity) {
        return TEXTURE;
    }
}
