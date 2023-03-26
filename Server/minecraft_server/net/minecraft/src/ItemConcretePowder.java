package net.minecraft.src;

public class ItemConcretePowder extends ItemBlock {

	public static String[] blockNames = { "Black Concrete Powder", "Blue Concrete Powder", "Brown Concrete Powder",
			"Cyan Concrete Powder", "Gray Concrete Powder", "Green Concrete Powder", "Light Blue Concrete Powder",
			"Light Gray Concrete Powder", "Lime Concrete Powder", "Megenta Concrete Powder", "Oragne Concrete Powder",
			"Pink Concrete Powder", "Purple Concrete Powder", "Red Concrete Powder", "White Concrete Powder",
			"Yellow Concrete Powder" };

	public ItemConcretePowder(int id) {
		super(id);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	public int getPlacedBlockMetadata(int damage) {
		return damage;
	}

	public int getMetadata(int var1) {
		return var1;
	}

	public String getItemNameIS(ItemStack itemstack) {
		return (new StringBuilder()).append(super.getItemName()).append(".").append(blockNames[itemstack.getItemDamage()]).toString();
	}
}
