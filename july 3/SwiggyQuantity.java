class SwiggyQuantity{
	public static double takeOrder(String foodName){
		double price=0.0;
		if(foodName=="Steamed Rice"){
		price = 50.00;
		}
		if(foodName=="Jeera Rice"){
		price = 95.00;
		}
		 return price;
	}	
	public static double takeOrder(String foodName,int quantity){
		double price=0.0;
		if(foodName=="Steamed Rice"){
		price= 50.00*quantity;
		}
		if(foodName=="Jeera Rice");{
		price= 95.00*quantity;
		}
		return price;
	}
	}