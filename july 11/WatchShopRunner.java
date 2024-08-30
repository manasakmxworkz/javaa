class WatchShopRunner{

	public static void main(String watch[]){
	
	boolean value=WatchShop.addWatchBrandNames("Rolex");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Titan");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Fastrack");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Sonata");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Timex");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Citizen");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Longines");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Omega");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Daniel Klein");
	System.out.println(value);
	value=WatchShop.addWatchBrandNames("Hublot");
	System.out.println(value);
	WatchShop.getAllWatchBrands();
	boolean val=WatchShop.updateWatchBrands("Rolex","Samsung");
	WatchShop.getAllWatchBrands();
	boolean output=WatchShop.delWatchBrands("Longines");
	WatchShop.getAllWatchBrands();
	}
}