package net.gecko95.oresmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.custom.*;
import net.gecko95.oresmod.entity.custom.golem.FrositeGolemEntity;
import net.gecko95.oresmod.entity.custom.projectiles.BombProjectileEntity;
import net.gecko95.oresmod.entity.custom.projectiles.IceBombProjectileEntity;
import net.gecko95.oresmod.entity.custom.projectiles.IceProjectileEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<SilverpedeEntity> SILVERPEDE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"silverpede"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SilverpedeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f,0.5f)).build());
    public static final EntityType<SilverwyrmEntity> SILVERWYRM = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"silverwyrm"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SilverwyrmEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f,1.0f)).build());
    public static final EntityType<JungleSpiderEntity> JUNGLE_SPIDER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"jungle_spider"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, JungleSpiderEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 0.5f)).build());

    public static final EntityType<EnderSpiderEntity> ENDER_SPIDER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"ender_spider"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EnderSpiderEntity::new)
                    .dimensions(EntityDimensions.fixed(1.4f, 0.9f)).build());

    public static final EntityType<FrositeGolemEntity> FROSITE_GOLEM = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"frosite_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FrositeGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.6f)).build());
    public static final EntityType<IceProjectileEntity> ICE_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"ice_projectile"),FabricEntityTypeBuilder.
                    <IceProjectileEntity>create(SpawnGroup.MISC,IceProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f,0.25f)).build());
    public static final EntityType<FrostbitenEntity> FROSTBITEN = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"frostbiten"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FrostbitenEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());
    public static final EntityType<IceCubeEntity> ICE_CUBE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"ice_cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, IceCubeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.6f)).build());
    public static final EntityType<BombProjectileEntity> BOMB_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"bomb_projectile"),FabricEntityTypeBuilder.
                    <BombProjectileEntity>create(SpawnGroup.MISC,BombProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f,0.25f)).build());

    public static final EntityType<IceBombProjectileEntity> ICE_BOMB_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"ice_bomb_projectile"),FabricEntityTypeBuilder.
                    <IceBombProjectileEntity>create(SpawnGroup.MISC,IceBombProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f,0.25f)).build());
}
