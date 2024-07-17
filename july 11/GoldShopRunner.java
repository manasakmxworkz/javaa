class GoldShopRunner{

	public static void main(String[] gold){
	
	boolean output=GoldShop.addGoldItem("Bangles");
	System.out.println(output);
	output=GoldShop.addGoldItem("Rings");
	System.out.println(output);
	output=GoldShop.addGoldItem("Chain");
	System.out.println(output);
	output=GoldShop.addGoldItem("EarRings");
	System.out.println(output);
	output=GoldShop.addGoldItem("Crown");
	System.out.println(output);
	output=GoldShop.addGoldItem("Bracelet");
	System.out.println(output);
	output=GoldShop.addGoldItem("Pearl");
	System.out.println(output);
	GoldShop.getAllGoldItems();
	boolean op=GoldShop.updateGoldItem("EarRings","Diamond");
	GoldShop.getAllGoldItems();
	boolean isValdel=GoldShop.delGoldItem("Pearl");
	System.out.println(isValdel);
	GoldShop.getAllGoldItems();
	}
}