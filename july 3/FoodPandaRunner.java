class FoodPandaRunner{
public static void main(String sweetFood[]){
	System.out.println("Main Started");
	
	String sweetName="Rabdi";
	double value=FoodPanda.getOrder(sweetName);
	System.out.println("The name and price of " +sweetName+ " is "+value);
	
	System.out.println("Main Ended");
}
}
	
	