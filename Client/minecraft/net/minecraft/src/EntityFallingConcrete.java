package net.minecraft.src;

public class EntityFallingConcrete extends Entity implements ISpawnable {
	private int metadata;
	public int blockID;
	public int fallTime = 0;

	public EntityFallingConcrete(World var1) {
		super(var1);
	}

	public EntityFallingConcrete(World var1, double var2, double var4, double var6, int var8, int damage) {
		super(var1);
		this.init(var2, var4, var6, var8, damage);
	}

	private void init(double var2, double var4, double var6, int var8, int damage) {
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

	protected boolean canTriggerWalking() {
		return false;
	}

	protected void entityInit() {
	}

	public boolean canBeCollidedWith() {
		return !this.isDead;
	}

	public void onUpdate() {
		if(this.blockID == 0) {
			this.setEntityDead();
		} else {
			this.prevPosX = this.posX;
			this.prevPosY = this.posY;
			this.prevPosZ = this.posZ;
			++this.fallTime;
			this.motionY -= (double)0.04F;
			this.moveEntity(this.motionX, this.motionY, this.motionZ);
			this.motionX *= (double)0.98F;
			this.motionY *= (double)0.98F;
			this.motionZ *= (double)0.98F;
			int var1 = MathHelper.floor_double(this.posX);
			int var2 = MathHelper.floor_double(this.posY);
			int var3 = MathHelper.floor_double(this.posZ);
			if(this.worldObj.getBlockId(var1, var2, var3) == this.blockID) {
				this.worldObj.setBlockWithNotify(var1, var2, var3, 0);
			}

			if (this.checkWater(var1, var2, var3)) {
				this.setEntityDead();
				this.DIE();
			} else if(this.onGround) {
				this.motionX *= (double)0.7F;
				this.motionZ *= (double)0.7F;
				this.motionY *= -0.5D;
				this.setEntityDead();
				this.DIE();
				this.worldObj.weatherEffects.remove(this);
				if((!this.worldObj.canBlockBePlacedAt(this.blockID, var1, var2, var3, true, 1) || BlockSand.canFallBelow(this.worldObj, var1, var2 - 1, var3) || !this.worldObj.setBlockAndMetadataWithNotify(var1, var2, var3, this.blockID, this.metadata)) && !this.worldObj.multiplayerWorld) {
					this.entityDropItem(new ItemStack(this.blockID, 1, this.metadata), 0.0F);
				}
			} else if(this.fallTime > 100 && !this.worldObj.multiplayerWorld) {
				this.DIE();
				this.entityDropItem(new ItemStack(this.blockID, 1, this.metadata), 0.0F);
				this.setEntityDead();
				this.worldObj.weatherEffects.remove(this);
			}
		}

	}

	public boolean checkWater(int x, int y, int z) {
		int blockIn = this.worldObj.getBlockId(x, y, z);
		if(blockIn != Block.waterMoving.blockID && (blockIn != Block.waterStill.blockID || this.worldObj.multiplayerWorld)) {
			return false;
		} else {
			this.worldObj.setBlockAndMetadataWithNotify(x, y, z, mod_Concrete.ConcreteID, this.metadata);
			return true;
		}
	}

	public void DIE() {
		if(this.worldObj instanceof WorldClient) {
			((WorldClient)this.worldObj).removeEntityFromWorld(this.entityId);
		}

	}

	public int getBlockMetadata() {
		return this.metadata;
	}

	protected void writeEntityToNBT(NBTTagCompound var1) {
		var1.setByte("Tile", (byte)this.blockID);
		var1.setByte("MetaData", (byte)this.metadata);
	}

	protected void readEntityFromNBT(NBTTagCompound var1) {
		this.blockID = var1.getByte("Tile") & 255;
		this.metadata = var1.getByte("MetaData") & 255;
	}

	public float getShadowSize() {
		return 0.0F;
	}

	public World getWorld() {
		return this.worldObj;
	}

	public void spawn(Packet230ModLoader var1) {
		this.blockID = var1.dataInt[0];
		this.metadata = var1.dataInt[1];
		this.init((double)var1.dataFloat[3], (double)var1.dataFloat[4], (double)var1.dataFloat[5], var1.dataInt[0], var1.dataInt[1]);
	}
}
