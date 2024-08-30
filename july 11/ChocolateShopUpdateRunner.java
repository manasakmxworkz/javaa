class ChocolateShopUpdateRunner{

	public static void main(String choc[]){
	
	boolean value=ChocolateShopUpdate.createChocolateName("Dairy Milk");
	System.out.println(value);
	
	value=ChocolateShopUpdate.createChocolateName("KitKat");
	System.out.println(value);
	
	value=ChocolateShopUpdate.createChocolateName("Ferror Rocher");
	System.out.println(value);
	
	value=ChocolateShopUpdate.createChocolateName("Gone Mad");
	System.out.println(value);
	
	value=ChocolateShopUpdate.createChocolateName("Munch");
	System.out.println(value);
	
	value=ChocolateShop.createChocolateName("Crispello");
	System.out.println(value);
	
	value=ChocolateShopUpdate.createChocolateName("Milkybar");
	System.out.println(value);
	
	ChocolateShopUpdate.getChocolateName();
	
	boolean output=ChocolateShopUpdate.updateChocolateName("Milkybar","KinderJoy");
	ChocolateShopUpdate.getChocolateName();
	
	boolean isValdel=ChocolateShopUpdate.delChocolateName("Munch");
	System.out.println(isValdel);
	ChocolateShopUpdate.getChocolateName();
	}
	}

