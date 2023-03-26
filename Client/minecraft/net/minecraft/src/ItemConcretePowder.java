package net.minecraft.src;

public class ItemConcretePowder extends ItemBlock {
	public static String[] blockNames = new String[]{"Black Concrete Powder", "Blue Concrete Powder", "Brown Concrete Powder", "Cyan Concrete Powder", "Gray Concrete Powder", "Green Concrete Powder", "Light Blue Concrete Powder", "Light Gray Concrete Powder", "Lime Concrete Powder", "Megenta Concrete Powder", "Oragne Concrete Powder", "Pink Concrete Powder", "Purple Concrete Powder", "Red Concrete Powder", "White Concrete Powder", "Yellow Concrete Powder"};

	public ItemConcretePowder(int id) {
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
