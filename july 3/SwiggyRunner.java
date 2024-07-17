class SwiggyRunner{
public static void main(String foodApps[]){
	System.out.println("Main Started");
	
	String foodName="Steamed Rice";
	double value= Swiggy.getDetails(foodName);
	System.out.println("The name and price of " +foodName+ " is "+value);
	
	System.out.println("Main Ended");
}
}
	
	