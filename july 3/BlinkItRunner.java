class BlinkItRunner{
public static void main(String foodApp[]){
	System.out.println("Main Started");
	
	String itemOrder="Vegetables";
	double value=BlinkIt.getItems(itemOrder);
	System.out.println("The name and price of " +itemOrder+ " is "+value);
	System.out.println("Main Ended");
}
}
	
	