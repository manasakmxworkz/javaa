class ZeptoQuantityRunner{
public static void main(String takeOrder[]){
	System.out.println("Main Started");
	double output=ZeptoQuantity.orderDetails("Chocofills",2);
	System.out.println(output);
	double value =ZeptoQuantity.orderDetails("Hide and Seek",3);
	System.out.println(value);
	System.out.println("Main Ended");
}
}