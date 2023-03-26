package net.minecraft.src;

import java.util.Random;

public class BlockConcrete extends Block {
	
	   public BlockConcrete(int id) {
		      super(id, Material.rock);
			     this.setHardness(1.5F);
				 this.setStepSound(Block.soundStoneFootstep);
			     this.setBlockName("Concrete");
		   }
	   
		public int idDropped(int metadata, Random random) {
	        return blockID;
	}
		
		protected int damageDropped(int metadata) {
	        return metadata;
	}

	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
	        switch (metadata){
	        case 0: return mod_Concrete.Black;
	        case 1: return mod_Concrete.Blue;
	        case 2: return mod_Concrete.Brown;
	        case 3: return mod_Concrete.Cyan;
	        case 4: return mod_Concrete.Gray;
	        case 5: return mod_Concrete.Green;
	        case 6: return mod_Concrete.LightBlue;
	        case 7: return mod_Concrete.LightGray;
	        case 8: return mod_Concrete.Lime;
	        case 9: return mod_Concrete.Megenta;
	        case 10: return mod_Concrete.Orange;
	        case 11: return mod_Concrete.Pink;
	        case 12: return mod_Concrete.Purple;
	        case 13: return mod_Concrete.Red;
	        case 14: return mod_Concrete.White;
	        case 15: return mod_Concrete.Yellow;
	        }
			return metadata;
	}

}
