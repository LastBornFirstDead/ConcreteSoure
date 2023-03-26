package net.minecraft.src;

import java.util.Random;

public class BlockConcretePowder extends Block {
	public static boolean fallInstantly = false;

	public BlockConcretePowder(int id) {
		super(id, id, Material.sand);
		this.setHardness(0.5F);
		this.setStepSound(Block.soundSandFootstep);
		this.setBlockName("Concrete Powder");
	}

	public int idDropped(int metadata, Random random) {
		return this.blockID;
	}

	protected int damageDropped(int metadata) {
		return metadata;
	}

	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		switch(metadata) {
		case 0:
			return mod_Concrete.BlackPowder;
		case 1:
			return mod_Concrete.BluePowder;
		case 2:
			return mod_Concrete.BrownPowder;
		case 3:
			return mod_Concrete.CyanPowder;
		case 4:
			return mod_Concrete.GrayPowder;
		case 5:
			return mod_Concrete.GreenPowder;
		case 6:
			return mod_Concrete.LightBluePowder;
		case 7:
			return mod_Concrete.LightGrayPowder;
		case 8:
			return mod_Concrete.LimePowder;
		case 9:
			return mod_Concrete.MegentaPowder;
		case 10:
			return mod_Concrete.OrangePowder;
		case 11:
			return mod_Concrete.PinkPowder;
		case 12:
			return mod_Concrete.PurplePowder;
		case 13:
			return mod_Concrete.RedPowder;
		case 14:
			return mod_Concrete.WhitePowder;
		case 15:
			return mod_Concrete.YellowPowder;
		default:
			return metadata;
		}
	}

	public void onBlockAdded(World var1, int var2, int var3, int var4) {
		var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
	}

	public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5) {
		var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
	}

	private void tryToFall(World var1, int var2, int var3, int var4) {
		if(canFallBelow(var1, var2, var3 - 1, var4) && var3 >= 0) {
			byte var8 = 32;
			if(!fallInstantly && var1.checkChunksExist(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
				EntityFallingConcrete var9 = new EntityFallingConcrete(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.blockID, var1.getBlockMetadata(var2, var3, var4));
				var1.entityJoinedWorld(var9);
			} else {
				var1.setBlockWithNotify(var2, var3, var4, 0);

				while(canFallBelow(var1, var2, var3 - 1, var4) && var3 > 0) {
					--var3;
				}

				if(var3 > 0) {
					var1.setBlockWithNotify(var2, var3, var4, this.blockID);
				}
			}
		}

	}

	public void updateTick(World w, int x, int y, int z, Random r) {
		if(!checkWater(w, x, y, z, w.getBlockMetadata(x, y, z))) {
			this.tryToFall(w, x, y, z);
		}

	}

	public static boolean checkWater(World w, int x, int y, int z, int metadata) {
		int[][] coords = new int[][]{{x, y, z - 1}, {x, y, z + 1}, {x - 1, y, z}, {x + 1, y, z}, {x, y + 1, z}, {x, y - 1, z}};
		int[][] i6 = coords;
		int i7 = coords.length;

		for(int i8 = 0; i8 < i7; ++i8) {
			int[] c = i6[i8];
			int id = w.getBlockId(c[0], c[1], c[2]);
			if(id == Block.waterMoving.blockID || id == Block.waterStill.blockID) {
				w.setBlockAndMetadataWithNotify(x, y, z, mod_Concrete.ConcreteID, metadata);
				return true;
			}
		}

		return false;
	}

	public int tickRate() {
		return 3;
	}

	public static boolean canFallBelow(World var0, int var1, int var2, int var3) {
		int var4 = var0.getBlockId(var1, var2, var3);
		if(var4 == 0) {
			return true;
		} else if(var4 == Block.fire.blockID) {
			return true;
		} else {
			Material var5 = Block.blocksList[var4].blockMaterial;
			return var5 == Material.water ? true : var5 == Material.lava;
		}
	}

	public static int func_21034_c(int var0) {
		return ~var0 & 15;
	}

	public static int func_21035_d(int var0) {
		return ~var0 & 15;
	}
}
