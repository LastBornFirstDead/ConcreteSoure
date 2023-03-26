package net.minecraft.src;

public class ItemConcrete extends ItemBlock {
	public static String[] blockNames = new String[]{"Black Concrete", "Blue Concrete", "Brown Concrete", "Cyan Concrete", "Gray Concrete", "Green Concrete", "Light Blue Concrete", "Light Gray Concrete", "Lime Concrete", "Megenta Concrete", "Oragne Concrete", "Pink Concrete", "Purple Concrete", "Red Concrete", "White Concrete", "Yellow Concrete"};

	public ItemConcrete(int id) {
		super(id);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	public int getPlacedBlockMetadata(int damage) {
		return damage;
	}

	public int getMetadata(int var1) {
		return var1;
	}

	public String getItemNameIS(ItemStack itemstack) {
		return super.getItemName() + "." + blockNames[itemstack.getItemDamage()];
	}
}
