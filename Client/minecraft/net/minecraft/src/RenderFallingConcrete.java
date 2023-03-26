package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderFallingConcrete extends Render {
	private RenderBlocks field_197_d = new RenderBlocks();

	public RenderFallingConcrete() {
		this.shadowSize = 0.5F;
	}

	public void doRenderFallingSand(EntityFallingConcrete entityfallingsand, double d, double d1, double d2, float f, float f1) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
		this.loadTexture("/terrain.png");
		Block block = Block.blocksList[entityfallingsand.blockID];
		World world = entityfallingsand.getWorld();
		GL11.glDisable(GL11.GL_LIGHTING);
		this.renderBlockFallingSand(block, world, MathHelper.floor_double(entityfallingsand.posX), MathHelper.floor_double(entityfallingsand.posY), MathHelper.floor_double(entityfallingsand.posZ), entityfallingsand.getBlockMetadata());
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	public void renderBlockFallingSand(Block block, World world, int i, int j, int k, int metadata) {
		float f = 0.5F;
		float f1 = 1.0F;
		float f2 = 0.8F;
		float f3 = 0.6F;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		float f4 = block.getBlockBrightness(world, i, j, k);
		float f5 = block.getBlockBrightness(world, i, j - 1, k);
		if(f5 < f4) {
			f5 = f4;
		}

		tessellator.setColorOpaque_F(f * f5, f * f5, f * f5);
		this.field_197_d.renderBottomFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0, metadata));
		f5 = block.getBlockBrightness(world, i, j + 1, k);
		if(f5 < f4) {
			f5 = f4;
		}

		tessellator.setColorOpaque_F(f1 * f5, f1 * f5, f1 * f5);
		this.field_197_d.renderTopFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(1, metadata));
		f5 = block.getBlockBrightness(world, i, j, k - 1);
		if(f5 < f4) {
			f5 = f4;
		}

		tessellator.setColorOpaque_F(f2 * f5, f2 * f5, f2 * f5);
		this.field_197_d.renderEastFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(2, metadata));
		f5 = block.getBlockBrightness(world, i, j, k + 1);
		if(f5 < f4) {
			f5 = f4;
		}

		tessellator.setColorOpaque_F(f2 * f5, f2 * f5, f2 * f5);
		this.field_197_d.renderWestFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(3, metadata));
		f5 = block.getBlockBrightness(world, i - 1, j, k);
		if(f5 < f4) {
			f5 = f4;
		}

		tessellator.setColorOpaque_F(f3 * f5, f3 * f5, f3 * f5);
		this.field_197_d.renderNorthFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(4, metadata));
		f5 = block.getBlockBrightness(world, i + 1, j, k);
		if(f5 < f4) {
			f5 = f4;
		}

		tessellator.setColorOpaque_F(f3 * f5, f3 * f5, f3 * f5);
		this.field_197_d.renderSouthFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(5, metadata));
		tessellator.draw();
	}

	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
		this.doRenderFallingSand((EntityFallingConcrete)entity, d, d1, d2, f, f1);
	}
}
