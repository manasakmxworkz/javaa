class LibertyRunner{

	public static void main(String liberty[]){
	
	boolean value=Liberty.addShoeBrands("Skechers");
	System.out.println(value);
	value=Liberty.addShoeBrands("Nike");
	System.out.println(value);
	value=Liberty.addShoeBrands("Adidas");
	System.out.println(value);
	value=Liberty.addShoeBrands("Puma");
	System.out.println(value);
	value=Liberty.addShoeBrands("New Balance");
	System.out.println(value);
	value=Liberty.addShoeBrands("Reebok");
	System.out.println(value);
	value=Liberty.addShoeBrands("Billy Footwear");
	System.out.println(value);
	value=Liberty.addShoeBrands("Birkenstock");
	System.out.println(value);
	value=Liberty.addShoeBrands("Converse");
	System.out.println(value);
	value=Liberty.addShoeBrands("Crocs");
	System.out.println(value);
	value=Liberty.addShoeBrands("Sorel");
	System.out.println(value);
	value=Liberty.addShoeBrands("Woodland");
	System.out.println(value);
	value=Liberty.addShoeBrands("Lee Cooper");
	System.out.println(value);
	value=Liberty.addShoeBrands("Levi's Shoes");
	System.out.println(value);
	value=Liberty.addShoeBrands("Red Tape");
	System.out.println(value);
	Liberty.getAllShoeBrands();
	boolean val=Liberty.updateShoeBrands("New Balance","Vans");
	Liberty.getAllShoeBrands();
	boolean output=Liberty.delShoeBrands("Lee Cooper");
	Liberty.getAllShoeBrands();
	}
}