// Date: 22.02.2018 20:57:37
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.hbm.render.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStinger extends ModelBase {

	ModelRenderer B1;
	ModelRenderer B2;
	ModelRenderer B3;
	ModelRenderer E1;
	ModelRenderer E2;
	ModelRenderer E3;
	ModelRenderer F1;
	ModelRenderer F2;
	ModelRenderer F3;
	ModelRenderer D1;
	ModelRenderer D2;
	ModelRenderer D3;
	ModelRenderer F;
	ModelRenderer H1;
	ModelRenderer H2;
	ModelRenderer H3;
	ModelRenderer E4;

	public ModelStinger() {
		this.textureWidth = 128;
		this.textureHeight = 64;

		this.B1 = new ModelRenderer(this, 0, 0);
		this.B1.addBox(0F, 0F, 0F, 52, 4, 2);
		this.B1.setRotationPoint(-26F, 0F, -1F);
		this.B1.setTextureSize(128, 64);
		this.B1.mirror = true;
		setRotation(this.B1, 0F, 0F, 0F);
		this.B2 = new ModelRenderer(this, 0, 6);
		this.B2.addBox(0F, 0F, 0F, 52, 2, 4);
		this.B2.setRotationPoint(-26F, 1F, -2F);
		this.B2.setTextureSize(128, 64);
		this.B2.mirror = true;
		setRotation(this.B2, 0F, 0F, 0F);
		this.B3 = new ModelRenderer(this, 0, 12);
		this.B3.addBox(0F, 0F, 0F, 52, 3, 3);
		this.B3.setRotationPoint(-26F, 0.5F, -1.5F);
		this.B3.setTextureSize(128, 64);
		this.B3.mirror = true;
		setRotation(this.B3, 0F, 0F, 0F);
		this.E1 = new ModelRenderer(this, 0, 18);
		this.E1.addBox(0F, 0F, 0F, 2, 6, 3);
		this.E1.setRotationPoint(26F, -1F, -1.5F);
		this.E1.setTextureSize(128, 64);
		this.E1.mirror = true;
		setRotation(this.E1, 0F, 0F, 0F);
		this.E2 = new ModelRenderer(this, 10, 18);
		this.E2.addBox(0F, 0F, 0F, 2, 3, 6);
		this.E2.setRotationPoint(26F, 0.5F, -3F);
		this.E2.setTextureSize(128, 64);
		this.E2.mirror = true;
		setRotation(this.E2, 0F, 0F, 0F);
		this.E3 = new ModelRenderer(this, 26, 18);
		this.E3.addBox(0F, 0F, 0F, 2, 5, 5);
		this.E3.setRotationPoint(26F, -0.5F, -2.5F);
		this.E3.setTextureSize(128, 64);
		this.E3.mirror = true;
		setRotation(this.E3, 0F, 0F, 0F);
		this.F1 = new ModelRenderer(this, 0, 27);
		this.F1.addBox(0F, 0F, 0F, 4, 5, 5);
		this.F1.setRotationPoint(-30F, -0.5F, -2.5F);
		this.F1.setTextureSize(128, 64);
		this.F1.mirror = true;
		setRotation(this.F1, 0F, 0F, 0F);
		this.F2 = new ModelRenderer(this, 0, 37);
		this.F2.addBox(0F, 0F, 0F, 4, 6, 3);
		this.F2.setRotationPoint(-30F, -1F, -1.5F);
		this.F2.setTextureSize(128, 64);
		this.F2.mirror = true;
		setRotation(this.F2, 0F, 0F, 0F);
		this.F3 = new ModelRenderer(this, 14, 37);
		this.F3.addBox(0F, 0F, 0F, 4, 3, 6);
		this.F3.setRotationPoint(-30F, 0.5F, -3F);
		this.F3.setTextureSize(128, 64);
		this.F3.mirror = true;
		setRotation(this.F3, 0F, 0F, 0F);
		this.D1 = new ModelRenderer(this, 0, 46);
		this.D1.addBox(0F, 0F, 0F, 16, 8, 3);
		this.D1.setRotationPoint(-25F, 4F, -1F);
		this.D1.setTextureSize(128, 64);
		this.D1.mirror = true;
		setRotation(this.D1, 0F, 0F, 0F);
		this.D2 = new ModelRenderer(this, 38, 46);
		this.D2.addBox(0F, 0F, 0F, 12, 8, 1);
		this.D2.setRotationPoint(-21F, 4F, -2F);
		this.D2.setTextureSize(128, 64);
		this.D2.mirror = true;
		setRotation(this.D2, 0F, 0F, 0F);
		this.D3 = new ModelRenderer(this, 34, 38);
		this.D3.addBox(0F, 0F, 0F, 16, 6, 2);
		this.D3.setRotationPoint(-21F, 0.5F, -4F);
		this.D3.setTextureSize(128, 64);
		this.D3.mirror = true;
		setRotation(this.D3, 0F, 0F, 0F);
		this.F = new ModelRenderer(this, 40, 18);
		this.F.addBox(0F, 0F, 0F, 12, 8, 5);
		this.F.setRotationPoint(-25F, -8F, -2.5F);
		this.F.setTextureSize(128, 64);
		this.F.mirror = true;
		setRotation(this.F, 0F, 0F, 0F);
		this.H1 = new ModelRenderer(this, 18, 27);
		this.H1.addBox(0F, 0F, 0F, 2, 7, 1);
		this.H1.setRotationPoint(-4F, 4F, -0.5F);
		this.H1.setTextureSize(128, 64);
		this.H1.mirror = true;
		//setRotation(H1, 0F, 0F, -0.2617994F);
		setRotation(this.H1, 0F, 0F, 0F);
		this.H2 = new ModelRenderer(this, 24, 31);
		this.H2.addBox(0F, 0F, 0F, 8, 1, 2);
		this.H2.setRotationPoint(-9F, 4F, -1F);
		this.H2.setTextureSize(128, 64);
		this.H2.mirror = true;
		setRotation(this.H2, 0F, 0F, 0F);
		this.H3 = new ModelRenderer(this, 44, 31);
		this.H3.addBox(0F, 0F, 0F, 2, 3, 2);
		this.H3.setRotationPoint(-12F, 12F, -1F);
		this.H3.setTextureSize(128, 64);
		this.H3.mirror = true;
		setRotation(this.H3, 0F, 0F, 0F);
		this.E4 = new ModelRenderer(this, 38, 55);
		this.E4.addBox(0F, 0F, 0F, 8, 6, 2);
		this.E4.setRotationPoint(16F, -1F, -4F);
		this.E4.setTextureSize(128, 64);
		this.E4.mirror = true;
		setRotation(this.E4, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {

		this.B1.render(scaleFactor);
		this.B2.render(scaleFactor);
		this.B3.render(scaleFactor);
		this.E1.render(scaleFactor);
		this.E2.render(scaleFactor);
		this.E3.render(scaleFactor);
		this.F1.render(scaleFactor);
		this.F2.render(scaleFactor);
		this.F3.render(scaleFactor);
		this.D1.render(scaleFactor);
		this.D2.render(scaleFactor);
		this.D3.render(scaleFactor);
		GL11.glDisable(GL11.GL_CULL_FACE);
		this.F.render(scaleFactor);
		GL11.glEnable(GL11.GL_CULL_FACE);
		this.H1.render(scaleFactor);
		this.H2.render(scaleFactor);
		this.H3.render(scaleFactor);
		this.E4.render(scaleFactor);
	}

	private static void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
