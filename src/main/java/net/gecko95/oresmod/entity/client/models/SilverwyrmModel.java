// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.gecko95.oresmod.entity.client.models;

import net.gecko95.oresmod.entity.animation.ModAnimations;
import net.gecko95.oresmod.entity.custom.SilverwyrmEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class SilverwyrmModel<T extends SilverwyrmEntity> extends SinglePartEntityModel<T> {
	private final ModelPart fullbody;
	private final ModelPart mainface;

	public SilverwyrmModel(ModelPart root) {
		this.fullbody = root.getChild("fullbody");
		this.mainface = fullbody.getChild("head").getChild("face").getChild("mainface");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData fullbody = modelPartData.addChild("fullbody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 23.5F, 6.0F));

		ModelPartData head = fullbody.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData face = head.addChild("face", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData mandible1 = face.addChild("mandible1", ModelPartBuilder.create().uv(9, 65).cuboid(3.5F, -5.5F, -25.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(8, 61).cuboid(3.5F, -6.5F, -23.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(51, 31).cuboid(0.5F, -5.5F, -25.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(51, 26).cuboid(2.5F, -6.5F, -21.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 10).cuboid(0.5F, -6.5F, -25.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 44).cuboid(2.5F, -6.5F, -25.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData mandible2 = face.addChild("mandible2", ModelPartBuilder.create().uv(63, 39).cuboid(1.5F, -5.5F, -25.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(49, 65).cuboid(1.5F, -6.5F, -23.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(46, 23).cuboid(2.5F, -5.5F, -25.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 44).cuboid(2.5F, -6.5F, -21.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 32).cuboid(2.5F, -6.5F, -25.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(27, 12).cuboid(4.5F, -6.5F, -25.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, 0.0F, 0.0F));

		ModelPartData mainface = face.addChild("mainface", ModelPartBuilder.create().uv(28, 12).cuboid(-3.5F, -9.5F, -22.0F, 6.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment1 = head.addChild("segment1", ModelPartBuilder.create().uv(20, 57).cuboid(-4.0F, -10.0F, -19.0F, 7.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData crown = head.addChild("crown", ModelPartBuilder.create().uv(0, 26).cuboid(-12.0F, -3.0F, 11.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 61).cuboid(-5.0F, -3.0F, 5.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F))
		.uv(60, 50).cuboid(-12.0F, -3.0F, 5.0F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F))
		.uv(65, 59).cuboid(-12.0F, -3.0F, 4.0F, 8.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(65, 63).cuboid(-5.0F, -4.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 65).cuboid(-12.0F, -4.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 65).cuboid(-12.0F, -4.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 32).cuboid(-10.0F, -4.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 10).cuboid(-10.0F, -4.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(59, 31).cuboid(-7.0F, -4.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 44).cuboid(-7.0F, -4.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 10).cuboid(-5.0F, -4.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(37, 57).cuboid(-12.0F, -4.0F, 9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 44).cuboid(-5.0F, -4.0F, 9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 10).cuboid(-12.0F, -4.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(17, 52).cuboid(-5.0F, -4.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.5F, -9.5F, -27.0F));

		ModelPartData mainbody = fullbody.addChild("mainbody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bigsegment1 = mainbody.addChild("bigsegment1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segmentpart1 = bigsegment1.addChild("segmentpart1", ModelPartBuilder.create().uv(0, 40).cuboid(-6.0F, -15.5F, -13.5F, 11.0F, 12.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-5.0F, -11.5F, -16.0F, 9.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs1 = bigsegment1.addChild("legs1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerlegs1 = legs1.addChild("outerlegs1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftlegs1 = outerlegs1.addChild("outerleftlegs1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftfrontleg1 = outerleftlegs1.addChild("outerleftfrontleg1", ModelPartBuilder.create().uv(68, 46).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftbackleg1 = outerleftlegs1.addChild("outerleftbackleg1", ModelPartBuilder.create().uv(68, 16).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 4.0F));

		ModelPartData outerrightlegs1 = outerlegs1.addChild("outerrightlegs1", ModelPartBuilder.create(), ModelTransform.pivot(10.0F, 0.0F, 0.0F));

		ModelPartData outerrightfrontleg1 = outerrightlegs1.addChild("outerrightfrontleg1", ModelPartBuilder.create().uv(68, 10).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerrightbackleg1 = outerrightlegs1.addChild("outerrightbackleg1", ModelPartBuilder.create().uv(61, 67).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 4.0F));

		ModelPartData innerleftlegs1 = outerlegs1.addChild("innerleftlegs1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData innerleftfrontleg1 = innerleftlegs1.addChild("innerleftfrontleg1", ModelPartBuilder.create().uv(37, 70).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData innerleftbackleg1 = innerleftlegs1.addChild("innerleftbackleg1", ModelPartBuilder.create().uv(70, 37).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData innerrightlegs1 = outerlegs1.addChild("innerrightlegs1", ModelPartBuilder.create(), ModelTransform.pivot(6.0F, 0.0F, 0.0F));

		ModelPartData innerrightfrontleg1 = innerrightlegs1.addChild("innerrightfrontleg1", ModelPartBuilder.create().uv(4, 70).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData innerrightbackleg1 = innerrightlegs1.addChild("innerrightbackleg1", ModelPartBuilder.create().uv(70, 0).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment2 = mainbody.addChild("segment2", ModelPartBuilder.create().uv(41, 56).cuboid(-4.0F, -10.0F, -11.0F, 7.0F, 6.0F, 3.0F, new Dilation(0.0F))
		.uv(22, 46).cuboid(-6.0F, -14.5F, -9.5F, 11.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bigsegment2 = mainbody.addChild("bigsegment2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segmentpart2 = bigsegment2.addChild("segmentpart2", ModelPartBuilder.create().uv(23, 21).cuboid(-5.0F, -11.5F, -8.0F, 9.0F, 8.0F, 5.0F, new Dilation(0.0F))
		.uv(24, 34).cuboid(-6.0F, -15.5F, -5.5F, 11.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs2 = bigsegment2.addChild("legs2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 8.0F));

		ModelPartData outerlegs2 = legs2.addChild("outerlegs2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftlegs2 = outerlegs2.addChild("outerleftlegs2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftfrontleg2 = outerleftlegs2.addChild("outerleftfrontleg2", ModelPartBuilder.create().uv(57, 67).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftbackleg2 = outerleftlegs2.addChild("outerleftbackleg2", ModelPartBuilder.create().uv(33, 66).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 4.0F));

		ModelPartData outerrightlegs2 = outerlegs2.addChild("outerrightlegs2", ModelPartBuilder.create(), ModelTransform.pivot(10.0F, 0.0F, 0.0F));

		ModelPartData outerrightfrontleg2 = outerrightlegs2.addChild("outerrightfrontleg2", ModelPartBuilder.create().uv(29, 66).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerrightbackleg2 = outerrightlegs2.addChild("outerrightbackleg2", ModelPartBuilder.create().uv(21, 66).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 4.0F));

		ModelPartData innerleftlegs2 = outerlegs2.addChild("innerleftlegs2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData innerleftfrontleg2 = innerleftlegs2.addChild("innerleftfrontleg2", ModelPartBuilder.create().uv(0, 70).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData innerleftbackleg2 = innerleftlegs2.addChild("innerleftbackleg2", ModelPartBuilder.create().uv(69, 67).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData innerrightlegs2 = outerlegs2.addChild("innerrightlegs2", ModelPartBuilder.create(), ModelTransform.pivot(6.0F, 0.0F, 0.0F));

		ModelPartData innerrightfrontleg2 = innerrightlegs2.addChild("innerrightfrontleg2", ModelPartBuilder.create().uv(52, 69).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData innerrightbackleg2 = innerrightlegs2.addChild("innerrightbackleg2", ModelPartBuilder.create().uv(48, 69).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segment3 = mainbody.addChild("segment3", ModelPartBuilder.create().uv(0, 52).cuboid(-4.0F, -10.0F, -3.0F, 7.0F, 6.0F, 3.0F, new Dilation(0.0F))
		.uv(46, 12).cuboid(-6.0F, -14.5F, -1.5F, 11.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bigsegment3 = mainbody.addChild("bigsegment3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData segmentpart3 = bigsegment3.addChild("segmentpart3", ModelPartBuilder.create().uv(0, 13).cuboid(-5.0F, -11.5F, 0.0F, 9.0F, 8.0F, 5.0F, new Dilation(0.0F))
		.uv(28, 0).cuboid(-6.0F, -15.5F, 2.5F, 11.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs3 = bigsegment3.addChild("legs3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 16.0F));

		ModelPartData outerlegs3 = legs3.addChild("outerlegs3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftlegs3 = outerlegs3.addChild("outerleftlegs3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftfrontleg3 = outerleftlegs3.addChild("outerleftfrontleg3", ModelPartBuilder.create().uv(66, 0).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerleftbackleg3 = outerleftlegs3.addChild("outerleftbackleg3", ModelPartBuilder.create().uv(0, 61).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 4.0F));

		ModelPartData outerrightlegs3 = outerlegs3.addChild("outerrightlegs3", ModelPartBuilder.create(), ModelTransform.pivot(10.0F, 0.0F, 0.0F));

		ModelPartData outerrightfrontleg3 = outerrightlegs3.addChild("outerrightfrontleg3", ModelPartBuilder.create().uv(50, 0).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData outerrightbackleg3 = outerrightlegs3.addChild("outerrightbackleg3", ModelPartBuilder.create().uv(18, 26).cuboid(-6.0F, -4.5F, -16.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 4.0F));

		ModelPartData innerleftlegs3 = outerlegs3.addChild("innerleftlegs3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData innerleftfrontleg3 = innerleftlegs3.addChild("innerleftfrontleg3", ModelPartBuilder.create().uv(23, 13).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData innerleftbackleg3 = innerleftlegs3.addChild("innerleftbackleg3", ModelPartBuilder.create().uv(23, 0).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData innerrightlegs3 = outerlegs3.addChild("innerrightlegs3", ModelPartBuilder.create(), ModelTransform.pivot(6.0F, 0.0F, 0.0F));

		ModelPartData innerrightfrontleg3 = innerrightlegs3.addChild("innerrightfrontleg3", ModelPartBuilder.create().uv(0, 13).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData innerrightbackleg3 = innerrightlegs3.addChild("innerrightbackleg3", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -3.5F, -13.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData backsegment1 = mainbody.addChild("backsegment1", ModelPartBuilder.create().uv(0, 28).cuboid(-3.5F, -10.0F, 5.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 46).cuboid(-6.0F, -13.5F, 6.5F, 11.0F, 10.0F, 0.0F, new Dilation(0.0F))
		.uv(46, 34).cuboid(-6.0F, -13.5F, 9.5F, 11.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tailbone = fullbody.addChild("tailbone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData backsegment2 = tailbone.addChild("backsegment2", ModelPartBuilder.create().uv(50, 0).cuboid(-3.0F, -9.0F, 11.0F, 5.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData backsegment3 = tailbone.addChild("backsegment3", ModelPartBuilder.create().uv(51, 23).cuboid(-3.0F, -8.0F, 17.0F, 5.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tail1 = tailbone.addChild("tail1", ModelPartBuilder.create().uv(37, 65).cuboid(-2.0F, -8.0F, 23.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tail2 = tailbone.addChild("tail2", ModelPartBuilder.create().uv(55, 59).cuboid(-1.6F, -8.0F, 26.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(SilverwyrmEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.SILVERWYRM_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimtionState, ModAnimations.SILVERWYRM_IDLE, ageInTicks, 1f);
	}
	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -1.0F, 1.0F);
		headPitch = MathHelper.clamp(headPitch, -1.0F, 1.0F);

		this.mainface.yaw = headYaw * 0.017453292F;
		this.mainface.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		fullbody.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return fullbody;
	}
}