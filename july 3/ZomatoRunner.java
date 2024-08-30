class ZomatoRunner{
public static void main(String foodApp[]){
	System.out.println("Main Started");
	
	String foodOrder="Noodles";
	double value=Zomato.getOrder(foodOrder);
	System.out.println("The name and price of " +foodOrder+ " is "+value);
	
	System.out.println("Main Ended");
}
}
	
	