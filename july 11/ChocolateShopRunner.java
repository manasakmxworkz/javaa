class ChocolateShopRunner{

	public static void main(String choc[]){
	
	boolean value=ChocolateShop.createChocolateName("Dairy Milk");
	System.out.println(value);
	boolean output=ChocolateShop.addChocolatePrice(40.0);
	System.out.println(output);
	
	value=ChocolateShop.createChocolateName("KitKat");
	System.out.println(value);
	output=ChocolateShop.addChocolatePrice(20.0);
	System.out.println(output);
	
	value=ChocolateShop.createChocolateName("Ferror Rocher");
	System.out.println(value);
	output=ChocolateShop.addChocolatePrice(150.0);
	System.out.println(output);
	
	value=ChocolateShop.createChocolateName("Gone Mad");
	System.out.println(value);
	output=ChocolateShop.addChocolatePrice(10.0);
	System.out.println(output);
	
	value=ChocolateShop.createChocolateName("Munch");
	System.out.println(value);
	output=ChocolateShop.addChocolatePrice(20.0);
	System.out.println(output);
	
	value=ChocolateShop.createChocolateName("Crispello");
	System.out.println(value);
	output=ChocolateShop.addChocolatePrice(40.0);
	System.out.println(output);
	
	
	ChocolateShop.getChocolateName();
	
	}



}