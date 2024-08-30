class DominosRunner{
public static void main(String orderOnline[]){
	System.out.println("Main Started");
	
	String dominosMenu="Paratha Pizza";
	double value=Dominos.getMenu(dominosMenu);
	System.out.println("The name and price of " +dominosMenu+ " is "+value);
	
	System.out.println("Main Ended");
}
}
	
	