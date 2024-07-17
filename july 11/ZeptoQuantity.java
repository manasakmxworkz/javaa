class ZeptoQuantity{
	public static double orderDetails(String menuOrder){
		double price=0.0;
		if(menuOrder=="Chocofills"){
		price = 99.00;
		}
		if(menuOrder=="Hide and Seek"){
		price = 30.00;
		}
		 return price;
	}	
	public static double orderDetails(String menuOrder,int quantity){
		double price=0.0;
		if(menuOrder=="Chocofills"){
		price= 99.00*quantity;
		}
		if(menuOrder=="Hide and Seek");{
		price= 30.00*quantity;
		}
		return price;
	}
	}