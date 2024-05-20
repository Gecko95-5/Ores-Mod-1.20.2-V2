package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.entity.ModEntities;
import net.gecko95.oresmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ModEntityTypeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS)
                .add(ModEntities.SILVERPEDE)
                .add(ModEntities.SILVERWYRM)
                .add(ModEntities.ICE_CUBE);

        getOrCreateTagBuilder(EntityTypeTags.FREEZE_IMMUNE_ENTITY_TYPES)
                .add(ModEntities.FROSITE_GOLEM)
                .add(ModEntities.FROSTBITEN)
                .add(ModEntities.ICE_CUBE);

        getOrCreateTagBuilder(EntityTypeTags.IMPACT_PROJECTILES)
                .add(ModEntities.ICE_PROJECTILE)
                .add(ModEntities.BOMB_PROJECTILE)
                .add(ModEntities.ICE_BOMB_PROJECTILE);

        getOrCreateTagBuilder(EntityTypeTags.FALL_DAMAGE_IMMUNE)
                .add(ModEntities.FROSITE_GOLEM);
    }
}
