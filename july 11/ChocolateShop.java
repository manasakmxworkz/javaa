class ChocolateShop{

	static String name="Five Star";
	static String ownerName="ABC";
	//Datatype arrayVariable={value};
	static String chocolateNames[]={null,null,null,null,null,null};
	static double chocolatePrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
	static int nameIndex;
	static int priceIndex;
	
	//add chocolateName in chocolateNames index positions[ref]
	public static boolean createChocolateName(String chocolateName){
		System.out.println("create method is started");
			boolean isChocolateNameCreated=false;
			//validation
			if(chocolateName!=null){
				chocolateNames[nameIndex]=chocolateName;//initialisation
				nameIndex++;//next positions
				isChocolateNameCreated=true;
			}else System.out.println("Chocolate name is null,cannot be declared");
		System.out.println("create method is ended ");
		return isChocolateNameCreated;
}

	public static boolean addChocolatePrice(double chocolatePrice){
		boolean isChocolatePriceAdded=false;
		if(chocolatePrice>0.0){
			chocolatePrices[priceIndex]=chocolatePrice;
			priceIndex++;
			isChocolatePriceAdded=true;
		}else System.out.println("Price should not be zero");
		return isChocolatePriceAdded;
		
	}
		public static void getChocolateName(){
		System.out.println("The Available Chocolates are");
		for(String chocolateeName:chocolateNames)
			System.out.println(chocolateeName);
		for(double chocolatePrice:chocolatePrices)
			System.out.println(chocolatePrice);
		}

}