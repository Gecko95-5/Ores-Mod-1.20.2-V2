// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.gecko95.oresmod.entity.client.models.golem;

import net.gecko95.oresmod.entity.animation.ModAnimations;
import net.gecko95.oresmod.entity.custom.golem.FrositeGolemEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class FrositeGolemModel<T extends FrositeGolemEntity> extends SinglePartEntityModel<T> {
	private final ModelPart golem;
	private final ModelPart head;

	public FrositeGolemModel(ModelPart root) {
		this.golem = root.getChild("golem");
		this.head = golem.getChild("body").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData golem = modelPartData.addChild("golem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = golem.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData mainbody = body.addChild("mainbody", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -18.0F, -3.0F, 8.0F, 6.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-6.0F, -24.0F, -4.0F, 12.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData backicicles = mainbody.addChild("backicicles", ModelPartBuilder.create().uv(26, 16).cuboid(-2.0F, -16.0F, 3.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 20).cuboid(3.0F, -16.0F, 3.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 28).cuboid(-4.0F, -16.0F, 3.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(1.0F, -16.0F, 3.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData fronticicles = mainbody.addChild("fronticicles", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 16).cuboid(1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(3, 3).cuboid(3.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -14.5F, -3.5F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 28).cuboid(-3.0F, -28.0F, -7.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 1.0F));

		ModelPartData rightarm = body.addChild("rightarm", ModelPartBuilder.create().uv(24, 24).cuboid(-2.0F, -8.0F, -2.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -16.0F, 0.0F));

		ModelPartData leftarm = body.addChild("leftarm", ModelPartBuilder.create().uv(0, 40).cuboid(-2.0F, -8.0F, -2.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, -16.0F, 0.0F));

		ModelPartData rightleg = body.addChild("rightleg", ModelPartBuilder.create().uv(40, 16).cuboid(0.5F, -13.0F, -1.5F, 3.0F, 13.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leftleg = body.addChild("leftleg", ModelPartBuilder.create().uv(40, 0).cuboid(-3.5F, -13.0F, -1.5F, 3.0F, 13.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		golem.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -1.0F, 1.0F);
		headPitch = MathHelper.clamp(headPitch, -1.0F, 1.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public ModelPart getPart() {
		return golem;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(headYaw, headPitch);

		this.animateMovement(ModAnimations.FROSITE_GOLEM_WALK, limbAngle, limbDistance, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimtionState, ModAnimations.FROSITE_GOLEM_IDLE, animationProgress, 1f);
		this.updateAnimation(entity.attackAnimtionState, ModAnimations.FROSITE_GOLEM_ATTACK, animationProgress, 1f);
	}
}