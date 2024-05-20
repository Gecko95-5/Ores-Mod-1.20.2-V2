package net.gecko95.oresmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.world.World;

public class JungleSpiderEntity extends CaveSpiderEntity {
    public JungleSpiderEntity(EntityType<? extends CaveSpiderEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder createJungleSpiderAttributes(){
        return CaveSpiderEntity.createCaveSpiderAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 8.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.4)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,3);
    }
}
