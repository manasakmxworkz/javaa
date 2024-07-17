class BarRunner{

	public static void main(String bar[]){
	
	boolean value=Bar.addWineBrands("York");
	System.out.println(value);
	value=Bar.addWineBrands("Big Banyan");
	System.out.println(value);
	value=Bar.addWineBrands("Sula");
	System.out.println(value);
	value=Bar.addWineBrands("Grover Zampa");
	System.out.println(value);
	value=Bar.addWineBrands("Fratelli");
	System.out.println(value);
	value=Bar.addWineBrands("Rhythm");
	System.out.println(value);
	value=Bar.addWineBrands("Four Seasons");
	System.out.println(value);
	value=Bar.addWineBrands("Charosa");
	System.out.println(value);
	value=Bar.addWineBrands("Vallonne");
	System.out.println(value);
	value=Bar.addWineBrands("Yellow Tail");
	System.out.println(value);
	value=Bar.addWineBrands("Changyu");
	System.out.println(value);
	value=Bar.addWineBrands("Moet&Chandon");
	System.out.println(value);
	value=Bar.addWineBrands("Lafite Rothschild");
	System.out.println(value);
	value=Bar.addWineBrands("Penfolds");
	System.out.println(value);
	value=Bar.addWineBrands("Louis Roederer");
	System.out.println(value);
	Bar.getAllWineBrands();
	boolean val=Bar.updateWineBrands("Yellow Tail","Red Wine");
	Bar.getAllWineBrands();
	boolean output=Bar.delWineBrands("Moet&Chandon");
	Bar.getAllWineBrands();
	}
}