package com.hbm.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShrapnel extends ModelBase {

	ModelRenderer bullet;

	public ModelShrapnel() {
		this.textureWidth = 16;
		this.textureHeight = 8;

		this.bullet = new ModelRenderer(this, 0, 0);
		this.bullet.addBox(0F, 0F, 0F, 4, 4, 4);
		this.bullet.setRotationPoint(1F, -0.5F, -0.5F);
		this.bullet.setTextureSize(16, 8);
		this.bullet.mirror = true;
		setRotation(this.bullet, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {

		this.renderAll(scaleFactor);
	}

	public void renderAll(float scaleFactor) {

		this.bullet.render(scaleFactor);
	}

	private static void setRotation(ModelRenderer model, float x, float y, float z) {

		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
