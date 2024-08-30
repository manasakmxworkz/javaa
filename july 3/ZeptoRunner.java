class ZeptoRunner{
public static void main(String foodApp[]){
	System.out.println("Main Started");
	
	String menuOrder="Maggie";
	double value=Zepto.orderDetails(menuOrder);
	System.out.println("The name and price of " +menuOrder+ " is "+value);
	
	System.out.println("Main Ended");
}
}
	
	