package net.minecraft.src;

import java.lang.reflect.Field;
import java.util.Arrays;

public class mod_Concrete extends BaseModMp {

	 @MLProp(min=97.0D, max=255.0D) public static int ConcretePowderID = 232;
	 @MLProp(min=97.0D, max=255.0D) public static int ConcreteID = 233;
	
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
	 
	 public static final Block ConcretePowder = new BlockConcretePowder(ConcretePowderID).setRequiresSelfNotify();// setRequiresSelfNotify Needed?
	 public static final Block Concrete = new BlockConcrete(ConcreteID).setRequiresSelfNotify();
	 //public static Item itemConcretePowder = new ItemConcretePowder((ConcretePowderID - 256) + 1);
	 //public static Item itemConcrete = new ItemConcrete((ConcreteID - 256) + 1);
	 
	 public static int MODID;
	
	public mod_Concrete() {
		ModLoader.RegisterBlock(ConcretePowder, net.minecraft.src.ItemConcretePowder.class);

		ModLoader.RegisterBlock(Concrete, net.minecraft.src.ItemConcrete.class);
		
		/*ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 0), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 0), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 1), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 2), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 3), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 3), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 6), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 4), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 8), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 5), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 2), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 6), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 12), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 7), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 8), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 8), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 10), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 9), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 13), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 10), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 14), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 11), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 9), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 12), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 6), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 13), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 1), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 14), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 15), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});
		ModLoader.AddRecipe(new ItemStack(ConcretePowder, 8, 15), new Object[]{"X##", "##Y", "YYY", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 11), Character.valueOf('#'), new ItemStack(Block.sand), Character.valueOf('Y'), new ItemStack(Block.gravel)});*/
		
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

		ModLoader.RegisterEntityID(EntityFallingConcrete.class, "FallingConcrete", 120); // Is this even needed? I do not know...
		ModLoaderMp.RegisterEntityTrackerEntry(EntityFallingConcrete.class, 120);
		ModLoaderMp.RegisterEntityTracker(EntityFallingConcrete.class, 160, 5);
		
		MODID = this.getId();
	}

    private void tool(Item i, Block block) {
        try {
            ItemTool tool = (ItemTool) i;// The tool to modify
            Field f = ItemTool.class.getDeclaredField("bk");// Remember the obfuscated name is "bk"
            f.setAccessible(true);
            
            Block[] blocksEffectiveAgainst = (Block[]) f.get(tool);// Get the value of f from the pick
            
            Block[] arrayCopy = Arrays.copyOf(blocksEffectiveAgainst, blocksEffectiveAgainst.length + 1);// Make room for one more block
            
            arrayCopy[blocksEffectiveAgainst.length] = block;// Add wool to the list
            
            f.set(tool, arrayCopy);// Set blocksEffectiveAgainst to our new array
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void ModsLoaded() {
    	for(Item i : Item.itemsList) {
            if(i instanceof ItemTool) {
                if(i instanceof ItemSpade) {
                    tool(i, mod_Concrete.ConcretePowder);
                    continue;
                }
                try {
                    Block b[] = (Block[]) ModLoader.getPrivateValue(ItemTool.class, i, "bk");// Unobfuscated name is blocksEffectiveAgainst
                    for(Block block : b) {
                        if(block.blockMaterial == Material.sand) {
                        	tool(i, mod_Concrete.ConcretePowder);
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(i instanceof ItemPickaxe) {
                    tool(i, mod_Concrete.Concrete);
                    continue;
                }
                try {
                    Block b[] = (Block[]) ModLoader.getPrivateValue(ItemTool.class, i, "bk");// Unobfuscated name is blocksEffectiveAgainst
                    for(Block block : b) {
                        if(block.blockMaterial == Material.rock) {
                        	tool(i, mod_Concrete.Concrete);
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
    public String Version() {
        return "v1.1";
    }
}
