package net.minecraft.src;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

public class mod_Concrete extends BaseModMp {
	@MLProp(
		min = 97.0D,
		max = 255.0D
	)
	public static int ConcretePowderID = 232;
	@MLProp(
		min = 97.0D,
		max = 255.0D
	)
	public static int ConcreteID = 233;
	public static int BlackPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/black_concrete_powder.png");
	public static int Black = ModLoader.addOverride("/terrain.png", "/Concrete/black_concrete.png");
	public static int BluePowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/blue_concrete_powder.png");
	public static int Blue = ModLoader.addOverride("/terrain.png", "/Concrete/blue_concrete.png");
	public static int BrownPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/brown_concrete_powder.png");
	public static int Brown = ModLoader.addOverride("/terrain.png", "/Concrete/brown_concrete.png");
	public static int CyanPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/cyan_concrete_powder.png");
	public static int Cyan = ModLoader.addOverride("/terrain.png", "/Concrete/cyan_concrete.png");
	public static int GrayPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/gray_concrete_powder.png");
	public static int Gray = ModLoader.addOverride("/terrain.png", "/Concrete/gray_concrete.png");
	public static int GreenPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/green_concrete_powder.png");
	public static int Green = ModLoader.addOverride("/terrain.png", "/Concrete/green_concrete.png");
	public static int LightBluePowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/light_blue_concrete_powder.png");
	public static int LightBlue = ModLoader.addOverride("/terrain.png", "/Concrete/light_blue_concrete.png");
	public static int LightGrayPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/light_gray_concrete_powder.png");
	public static int LightGray = ModLoader.addOverride("/terrain.png", "/Concrete/light_gray_concrete.png");
	public static int LimePowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/lime_concrete_powder.png");
	public static int Lime = ModLoader.addOverride("/terrain.png", "/Concrete/lime_concrete.png");
	public static int MegentaPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/magenta_concrete_powder.png");
	public static int Megenta = ModLoader.addOverride("/terrain.png", "/Concrete/magenta_concrete.png");
	public static int OrangePowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/orange_concrete_powder.png");
	public static int Orange = ModLoader.addOverride("/terrain.png", "/Concrete/orange_concrete.png");
	public static int PinkPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/pink_concrete_powder.png");
	public static int Pink = ModLoader.addOverride("/terrain.png", "/Concrete/pink_concrete.png");
	public static int PurplePowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/purple_concrete_powder.png");
	public static int Purple = ModLoader.addOverride("/terrain.png", "/Concrete/purple_concrete.png");
	public static int RedPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/red_concrete_powder.png");
	public static int Red = ModLoader.addOverride("/terrain.png", "/Concrete/red_concrete.png");
	public static int WhitePowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/white_concrete_powder.png");
	public static int White = ModLoader.addOverride("/terrain.png", "/Concrete/white_concrete.png");
	public static int YellowPowder = ModLoader.addOverride("/terrain.png", "/Concrete/powder/yellow_concrete_powder.png");
	public static int Yellow = ModLoader.addOverride("/terrain.png", "/Concrete/yellow_concrete.png");
	public static final Block ConcretePowder = new BlockConcretePowder(ConcretePowderID);
	public static final Block Concrete = new BlockConcrete(ConcreteID);

	public mod_Concrete() {
		ModLoader.RegisterBlock(ConcretePowder, ItemConcretePowder.class);
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 0), "Black Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 1), "Blue Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 2), "Brown Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 3), "Cyan Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 4), "Gray Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 5), "Green Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 6), "Light Blue Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 7), "Light Gray Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 8), "Lime Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 9), "Megenta Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 10), "Orange Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 11), "Pink Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 12), "Purple Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 13), "Red Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 14), "White Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 8, 15), "Yellow Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 0), "Black Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 1), "Blue Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 2), "Brown Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 3), "Cyan Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 4), "Gray Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 5), "Green Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 6), "Light Blue Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 7), "Light Gray Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 8), "Lime Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 9), "Megenta Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 10), "Orange Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 11), "Pink Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 12), "Purple Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 13), "Red Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 14), "White Concrete Powder");
		ModLoader.AddName(new ItemStack(ConcretePowder, 1, 15), "Yellow Concrete Powder");
		ModLoader.RegisterBlock(Concrete, ItemConcrete.class);
		ModLoader.AddName(new ItemStack(Concrete, 1, 0), "Black Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 1), "Blue Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 2), "Brown Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 3), "Cyan Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 4), "Gray Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 5), "Green Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 6), "Light Blue Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 7), "Light Gray Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 8), "Lime Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 9), "Megenta Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 10), "Orange Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 11), "Pink Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 12), "Purple Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 13), "Red Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 14), "White Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 1, 15), "Yellow Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 0), "Black Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 1), "Blue Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 2), "Brown Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 3), "Cyan Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 4), "Gray Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 5), "Green Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 6), "Light Blue Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 7), "Light Gray Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 8), "Lime Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 9), "Megenta Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 10), "Orange Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 11), "Pink Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 12), "Purple Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 13), "Red Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 14), "White Concrete");
		ModLoader.AddName(new ItemStack(Concrete, 8, 15), "Yellow Concrete");
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 0), new Object[]{new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 1), new Object[]{new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 2), new Object[]{new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 3), new Object[]{new ItemStack(Item.dyePowder, 1, 6), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 4), new Object[]{new ItemStack(Item.dyePowder, 1, 8), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 5), new Object[]{new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 6), new Object[]{new ItemStack(Item.dyePowder, 1, 12), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 7), new Object[]{new ItemStack(Item.dyePowder, 1, 7), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 8), new Object[]{new ItemStack(Item.dyePowder, 1, 10), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 9), new Object[]{new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 10), new Object[]{new ItemStack(Item.dyePowder, 1, 14), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 11), new Object[]{new ItemStack(Item.dyePowder, 1, 9), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 12), new Object[]{new ItemStack(Item.dyePowder, 1, 6), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 13), new Object[]{new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 14), new Object[]{new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(ConcretePowder, 8, 15), new Object[]{new ItemStack(Item.dyePowder, 1, 11), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.sand), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 0), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 0), new ItemStack(ConcretePowder, 8, 0), new ItemStack(ConcretePowder, 8, 0), new ItemStack(ConcretePowder, 8, 0), new ItemStack(ConcretePowder, 8, 0), new ItemStack(ConcretePowder, 8, 0), new ItemStack(ConcretePowder, 8, 0), new ItemStack(ConcretePowder, 8, 0)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 1), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 1), new ItemStack(ConcretePowder, 8, 1), new ItemStack(ConcretePowder, 8, 1), new ItemStack(ConcretePowder, 8, 1), new ItemStack(ConcretePowder, 8, 1), new ItemStack(ConcretePowder, 8, 1), new ItemStack(ConcretePowder, 8, 1), new ItemStack(ConcretePowder, 8, 1)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 2), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 2), new ItemStack(ConcretePowder, 8, 2), new ItemStack(ConcretePowder, 8, 2), new ItemStack(ConcretePowder, 8, 2), new ItemStack(ConcretePowder, 8, 2), new ItemStack(ConcretePowder, 8, 2), new ItemStack(ConcretePowder, 8, 2), new ItemStack(ConcretePowder, 8, 2)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 3), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 3), new ItemStack(ConcretePowder, 8, 3), new ItemStack(ConcretePowder, 8, 3), new ItemStack(ConcretePowder, 8, 3), new ItemStack(ConcretePowder, 8, 3), new ItemStack(ConcretePowder, 8, 3), new ItemStack(ConcretePowder, 8, 3), new ItemStack(ConcretePowder, 8, 3)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 4), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 4), new ItemStack(ConcretePowder, 8, 4), new ItemStack(ConcretePowder, 8, 4), new ItemStack(ConcretePowder, 8, 4), new ItemStack(ConcretePowder, 8, 4), new ItemStack(ConcretePowder, 8, 4), new ItemStack(ConcretePowder, 8, 4), new ItemStack(ConcretePowder, 8, 4)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 5), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 5), new ItemStack(ConcretePowder, 8, 5), new ItemStack(ConcretePowder, 8, 5), new ItemStack(ConcretePowder, 8, 5), new ItemStack(ConcretePowder, 8, 5), new ItemStack(ConcretePowder, 8, 5), new ItemStack(ConcretePowder, 8, 5), new ItemStack(ConcretePowder, 8, 5)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 6), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 6), new ItemStack(ConcretePowder, 8, 6), new ItemStack(ConcretePowder, 8, 6), new ItemStack(ConcretePowder, 8, 6), new ItemStack(ConcretePowder, 8, 6), new ItemStack(ConcretePowder, 8, 6), new ItemStack(ConcretePowder, 8, 6), new ItemStack(ConcretePowder, 8, 6)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 7), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 7), new ItemStack(ConcretePowder, 8, 7), new ItemStack(ConcretePowder, 8, 7), new ItemStack(ConcretePowder, 8, 7), new ItemStack(ConcretePowder, 8, 7), new ItemStack(ConcretePowder, 8, 7), new ItemStack(ConcretePowder, 8, 7), new ItemStack(ConcretePowder, 8, 7)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 8), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 8), new ItemStack(ConcretePowder, 8, 8), new ItemStack(ConcretePowder, 8, 8), new ItemStack(ConcretePowder, 8, 8), new ItemStack(ConcretePowder, 8, 8), new ItemStack(ConcretePowder, 8, 8), new ItemStack(ConcretePowder, 8, 8), new ItemStack(ConcretePowder, 8, 8)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 9), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 9), new ItemStack(ConcretePowder, 8, 9), new ItemStack(ConcretePowder, 8, 9), new ItemStack(ConcretePowder, 8, 9), new ItemStack(ConcretePowder, 8, 9), new ItemStack(ConcretePowder, 8, 9), new ItemStack(ConcretePowder, 8, 9), new ItemStack(ConcretePowder, 8, 9)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 10), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 10), new ItemStack(ConcretePowder, 8, 10), new ItemStack(ConcretePowder, 8, 10), new ItemStack(ConcretePowder, 8, 10), new ItemStack(ConcretePowder, 8, 10), new ItemStack(ConcretePowder, 8, 10), new ItemStack(ConcretePowder, 8, 10), new ItemStack(ConcretePowder, 8, 10)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 11), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 11), new ItemStack(ConcretePowder, 8, 11), new ItemStack(ConcretePowder, 8, 11), new ItemStack(ConcretePowder, 8, 11), new ItemStack(ConcretePowder, 8, 11), new ItemStack(ConcretePowder, 8, 11), new ItemStack(ConcretePowder, 8, 11), new ItemStack(ConcretePowder, 8, 11)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 12), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 12), new ItemStack(ConcretePowder, 8, 12), new ItemStack(ConcretePowder, 8, 12), new ItemStack(ConcretePowder, 8, 12), new ItemStack(ConcretePowder, 8, 12), new ItemStack(ConcretePowder, 8, 12), new ItemStack(ConcretePowder, 8, 12), new ItemStack(ConcretePowder, 8, 12)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 13), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 13), new ItemStack(ConcretePowder, 8, 13), new ItemStack(ConcretePowder, 8, 13), new ItemStack(ConcretePowder, 8, 13), new ItemStack(ConcretePowder, 8, 13), new ItemStack(ConcretePowder, 8, 13), new ItemStack(ConcretePowder, 8, 13), new ItemStack(ConcretePowder, 8, 13)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 14), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 14), new ItemStack(ConcretePowder, 8, 14), new ItemStack(ConcretePowder, 8, 14), new ItemStack(ConcretePowder, 8, 14), new ItemStack(ConcretePowder, 8, 14), new ItemStack(ConcretePowder, 8, 14), new ItemStack(ConcretePowder, 8, 14), new ItemStack(ConcretePowder, 8, 14)});
		ModLoader.AddShapelessRecipe(new ItemStack(Concrete, 8, 15), new Object[]{new ItemStack(Item.bucketWater), new ItemStack(ConcretePowder, 8, 15), new ItemStack(ConcretePowder, 8, 15), new ItemStack(ConcretePowder, 8, 15), new ItemStack(ConcretePowder, 8, 15), new ItemStack(ConcretePowder, 8, 15), new ItemStack(ConcretePowder, 8, 15), new ItemStack(ConcretePowder, 8, 15), new ItemStack(ConcretePowder, 8, 15)});
		ModLoaderMp.RegisterNetClientHandlerEntity(EntityFallingConcrete.class, 120);
	}

	private void tool(Item i, Block block) {
		try {
			ItemTool e = (ItemTool)i;
			Field f = ItemTool.class.getDeclaredField("bk");
			f.setAccessible(true);
			Block[] blocksEffectiveAgainst = (Block[])((Block[])f.get(e));
			Block[] arrayCopy = (Block[])Arrays.copyOf(blocksEffectiveAgainst, blocksEffectiveAgainst.length + 1);
			arrayCopy[blocksEffectiveAgainst.length] = block;
			f.set(e, arrayCopy);
		} catch (Exception exception7) {
			exception7.printStackTrace();
		}

	}

	public void ModsLoaded() {
		Item[] item1 = Item.itemsList;
		int i2 = item1.length;

		for(int i3 = 0; i3 < i2; ++i3) {
			Item i = item1[i3];
			if(i instanceof ItemTool) {
				if(i instanceof ItemSpade) {
					this.tool(i, ConcretePowder);
				} else {
					Block[] e;
					Block[] block6;
					int i7;
					int i8;
					Block block;
					try {
						e = (Block[])((Block[])ModLoader.getPrivateValue(ItemTool.class, i, "blocksEffectiveAgainst"));
						block6 = e;
						i7 = e.length;

						for(i8 = 0; i8 < i7; ++i8) {
							block = block6[i8];
							if(block.blockMaterial == Material.sand) {
								this.tool(i, ConcretePowder);
								break;
							}
						}
					} catch (Exception exception11) {
						exception11.printStackTrace();
					}

					if(i instanceof ItemPickaxe) {
						this.tool(i, Concrete);
					} else {
						try {
							e = (Block[])((Block[])ModLoader.getPrivateValue(ItemTool.class, i, "blocksEffectiveAgainst"));
							block6 = e;
							i7 = e.length;

							for(i8 = 0; i8 < i7; ++i8) {
								block = block6[i8];
								if(block.blockMaterial == Material.rock) {
									this.tool(i, Concrete);
									break;
								}
							}
						} catch (Exception exception10) {
							exception10.printStackTrace();
						}
					}
				}
			}
		}

	}

	public void AddRenderer(Map map) {
		map.put(EntityFallingConcrete.class, new RenderFallingConcrete());
	}

	public String Version() {
		return "v1.1";
	}
}
