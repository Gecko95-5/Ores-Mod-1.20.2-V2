// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.gecko95.oresmod.entity.client.models;

import net.gecko95.oresmod.entity.animation.ModAnimations;
import net.gecko95.oresmod.entity.custom.SilverpedeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class SilverpedeModel<T extends SilverpedeEntity> extends SinglePartEntityModel<T> {
	private final ModelPart silverpede;
	private final ModelPart head;
	public SilverpedeModel(ModelPart root) {
		this.silverpede = root.getChild("silverpede");
		this.head = silverpede.getChild("body").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData silverpede = modelPartData.addChild("silverpede", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = silverpede.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(12, 32).cuboid(-1.5F, -5.0F, -8.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment1 = body.addChild("segment1", ModelPartBuilder.create().uv(0, 30).cuboid(-2.0F, -5.5F, -6.0F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 22).cuboid(-3.0F, -7.5F, -6.0F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment2 = body.addChild("segment2", ModelPartBuilder.create().uv(0, 7).cuboid(-3.0F, -6.0F, -4.0F, 6.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 14).cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 7).cuboid(-4.0F, -8.0F, -1.0F, 8.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legfrontleft1 = segment2.addChild("legfrontleft1", ModelPartBuilder.create().uv(34, 9).cuboid(-2.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legfrontright1 = segment2.addChild("legfrontright1", ModelPartBuilder.create().uv(34, 3).cuboid(1.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legbackleft1 = segment2.addChild("legbackleft1", ModelPartBuilder.create().uv(34, 23).cuboid(-2.0F, -2.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legbackright1 = segment2.addChild("legbackright1", ModelPartBuilder.create().uv(34, 6).cuboid(1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment3 = body.addChild("segment3", ModelPartBuilder.create().uv(10, 27).cuboid(-2.0F, -5.5F, -1.0F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment4 = body.addChild("segment4", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -6.0F, 1.0F, 6.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(16, 14).cuboid(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 0).cuboid(-4.0F, -8.0F, 1.0F, 8.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legfrontleft2 = segment4.addChild("legfrontleft2", ModelPartBuilder.create().uv(32, 33).cuboid(-2.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 5.0F));

		ModelPartData legfrontright2 = segment4.addChild("legfrontright2", ModelPartBuilder.create().uv(32, 30).cuboid(1.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 5.0F));

		ModelPartData legbackleft2 = segment4.addChild("legbackleft2", ModelPartBuilder.create().uv(34, 0).cuboid(-2.0F, -2.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 5.0F));

		ModelPartData legbackright2 = segment4.addChild("legbackright2", ModelPartBuilder.create().uv(12, 22).cuboid(1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 5.0F));

		ModelPartData segment5 = body.addChild("segment5", ModelPartBuilder.create().uv(16, 21).cuboid(-3.0F, -7.5F, 7.0F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
		.uv(25, 24).cuboid(-1.5F, -5.5F, 4.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment6 = body.addChild("segment6", ModelPartBuilder.create().uv(29, 18).cuboid(-1.0F, -5.0F, 7.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(22, 30).cuboid(-2.5F, -7.0F, 10.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment7 = body.addChild("segment7", ModelPartBuilder.create().uv(32, 12).cuboid(-1.0F, -4.5F, 10.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tail1 = body.addChild("tail1", ModelPartBuilder.create().uv(12, 25).cuboid(-0.5F, -4.5F, 12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tail2 = body.addChild("tail2", ModelPartBuilder.create().uv(32, 15).cuboid(-0.5F, -4.5F, 13.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(SilverpedeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.SILVERPEDE_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimtionState, ModAnimations.SILVERPEDE_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -1.0F, 1.0F);
		headPitch = MathHelper.clamp(headPitch, -1.0F, 1.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		silverpede.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return silverpede;
	}
}