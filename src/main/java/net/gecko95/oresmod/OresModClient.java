package net.gecko95.oresmod;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.entity.ModBoats;
import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.entity.client.*;
import net.gecko95.oresmod.entity.client.models.IceCubeModel;
import net.gecko95.oresmod.entity.client.models.SilverpedeModel;
import net.gecko95.oresmod.entity.client.models.SilverwyrmModel;
import net.gecko95.oresmod.entity.client.models.golem.FrositeGolemModel;
import net.gecko95.oresmod.entity.client.renderers.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;

public class OresModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALUMINUM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALUMINUM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALUMINUM_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STEEL_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STONEBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STONEBARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STONEBARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPSLATE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPBARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DEEPBARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STONEBARK_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STONEBARK_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPBARK_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPBARK_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARDEN_TROPHY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHTY_RUSTED_STEEL_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTED_STEEL_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEAFITE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEAFITE_LEAVES_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEAFITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEAFITE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEAFITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LEAFITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICY_CROCUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ICY_CROCUS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WATER_TANK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLINT_SPIKES, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_DRAGON_TROPHY, RenderLayer.getTranslucent());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.STONEBARK_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.STONEBARK_HANDING_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.DEEPBARK_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.DEEPBARK_HANDING_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.LEAFITE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.LEAFITE_HANDING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(ModBoats.LEAFITE_BOAT_ID,false);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SILVERPEDE, SilverpedeModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SILVERWYRM, SilverwyrmModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.FROSITE_GOLEM, FrositeGolemModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ICE_CUBE, IceCubeModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SILVERPEDE, SilverpedeRenderer::new);
        EntityRendererRegistry.register(ModEntities.SILVERWYRM, SilverwyrmRenderer::new);
        EntityRendererRegistry.register(ModEntities.JUNGLE_SPIDER, JungleSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.ENDER_SPIDER, EnderSpiderRenderer::new);
        EntityRendererRegistry.register(ModEntities.FROSITE_GOLEM, FrositeGolemRenderer::new);
        EntityRendererRegistry.register(ModEntities.FROSTBITEN, FrostbitenRenderer::new);
        EntityRendererRegistry.register(ModEntities.ICE_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.BOMB_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.ICE_BOMB_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.ICE_CUBE, IceCubeRenderer::new);
    }
}
