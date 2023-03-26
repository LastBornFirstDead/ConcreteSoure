package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.src.BlockSand;
import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityFallingConcrete extends Entity implements ISpawnable {

	private int metadata;
	public int blockID;
	public int fallTime = 0;

	public EntityFallingConcrete(World var1) {
		super(var1);
	}

	public EntityFallingConcrete(World var1, double var2, double var4, double var6, int var8, int damage) {
		super(var1);
		this.blockID = var8;
		this.preventEntitySpawning = true;
		this.setSize(0.98F, 0.98F);
		this.yOffset = this.height / 2.0F;
		this.setPosition(var2, var4, var6);
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevPosX = var2;
		this.prevPosY = var4;
		this.prevPosZ = var6;
		this.metadata = damage;
	}

	protected boolean func_25017_l() {
		return false;
	}

	protected void entityInit() {
	}

	public boolean canBeCollidedWith() {
		return !this.isDead;
	}

	public void onUpdate() {
		if (this.blockID == 0) {
			this.setEntityDead();
		} else {
			this.prevPosX = this.posX;
			this.prevPosY = this.posY;
			this.prevPosZ = this.posZ;
			++this.fallTime;
			this.motionY -= 0.03999999910593033D;
			this.moveEntity(this.motionX, this.motionY, this.motionZ);
			this.motionX *= 0.9800000190734863D;
			this.motionY *= 0.9800000190734863D;
			this.motionZ *= 0.9800000190734863D;
			int var1 = MathHelper.floor_double(this.posX);
			int var2 = MathHelper.floor_double(this.posY);
			int var3 = MathHelper.floor_double(this.posZ);
			if (this.worldObj.getBlockId(var1, var2, var3) == this.blockID) {
				this.worldObj.setBlockWithNotify(var1, var2, var3, 0);
			}

			if(checkWater(var1, var2, var3)) {
				this.setEntityDead();
				notifyUpdate(var1, var2, var3);
			} else if(this.onGround) {
	            this.motionX *= 0.699999988079071D;
	            this.motionZ *= 0.699999988079071D;
	            this.motionY *= -0.5D;
	            this.setEntityDead();
	            if((!this.worldObj.canBlockBePlacedAt(this.blockID, var1, var2, var3, true, 1) || BlockSand.canFallBelow(this.worldObj, var1, var2 - 1, var3) || !this.worldObj.setBlockAndMetadataWithNotify(var1, var2, var3, this.blockID, metadata)) && !this.worldObj.singleplayerWorld) {
	            	this.entityDropItem(new ItemStack(blockID, 1, metadata), 0.0F);
	            }
	            //worldObj.setBlockAndMetadata(var1, var2-1, var3, blockID, 7);
	            notifyUpdateDelayed(var1, var2, var3);
	         } else if(this.fallTime > 100 && !this.worldObj.singleplayerWorld) {
	        	 this.entityDropItem(new ItemStack(blockID, 1, metadata), 0.0F);
	            this.setEntityDead();
	            //DIE();
	         }

		}
	}
	
	public void notifyUpdate(int x, int y, int z) {
		for(Object p : this.worldObj.playerEntities) {
			EntityPlayerMP player = (EntityPlayerMP)p;
			player.playerNetServerHandler.sendPacket(new Packet53BlockChange(x, y, z, this.worldObj));
		}
	}
	
	public boolean checkWater(int x, int y, int z) {
		int blockIn = this.worldObj.getBlockId(x, y, z);
		if (blockIn == Block.waterMoving.blockID || blockIn == Block.waterStill.blockID) {
			this.worldObj.setBlockAndMetadataWithNotify(x, y, z, mod_Concrete.ConcreteID, metadata);
			return true;
		}
		return false;
	}
	
	private class PlayerAndPos {
        public int x;
        public int y;
        public int z;
        public EntityPlayerMP player;
        
        PlayerAndPos(int a, int b, int c, EntityPlayerMP p){
            x = a;
            y = b;
            z = c;
            player = p;
        }
    }
    
    private static List<PlayerAndPos> playersToUpdate = new ArrayList<PlayerAndPos>();
    
    public void notifyUpdateDelayed(int x, int y, int z) {
        for(Object p : worldObj.playerEntities) {
            Timer timer = new Timer();

            playersToUpdate.add(new PlayerAndPos(x,y,z,(EntityPlayerMP)p));

            TimerTask delayedThreadStartTask = new TimerTask() {
                @Override
                public void run() {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            PlayerAndPos o = playersToUpdate.get(0);
                            o.player.playerNetServerHandler.sendPacket(new Packet53BlockChange(o.x, o.y, o.z, worldObj));
                            playersToUpdate.remove(o);
                        }
                    }).start();
                }
            };

            timer.schedule(delayedThreadStartTask, 1000); //1 second
        }
    }

	public int getBlockMetadata() {
		return metadata;
	}

	protected void writeEntityToNBT(NBTTagCompound var1) {
		var1.setByte("Tile", (byte) this.blockID);
		var1.setByte("MetaData", (byte) this.metadata);
		//super.writeToNBT(var1);
	}

	protected void readEntityFromNBT(NBTTagCompound var1) {
		this.blockID = var1.getByte("Tile") & 255;
		this.metadata = var1.getByte("MetaData") & 255;
		//super.readFromNBT(var1);
	}

	@Override
	public Packet230ModLoader getSpawnPacket() {
		Packet230ModLoader pak = new Packet230ModLoader();

		pak.modId = mod_Concrete.MODID;

		pak.packetType = 120;// Entity ID

		pak.dataInt = new int[] { blockID, metadata };

		pak.dataFloat = new float[] { (float) motionX, (float) motionY, (float) motionZ, (float) posX, (float) posY, (float) posZ };
		return (Packet230ModLoader) pak;
	}
}