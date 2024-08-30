class SwiggyQuantityRunner{
public static void main(String foodApps[]){
	System.out.println("Main Started");
	double output=SwiggyQuantity.takeOrder("Steamed Rice",2);
	System.out.println(output);
	double value =	SwiggyQuantity.takeOrder("jeera Rice",3);
	System.out.println(value);
	System.out.println("Main Ended");
}
}