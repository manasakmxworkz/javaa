class Swiggy{
	public static double getDetails(String foodName){
		if(foodName=="Steamed Rice"){
		return 50.00;
		}
		if(foodName=="Jeera Rice"){
		return 95.00;
		}
		if(foodName=="Veg Biriyani Rice"){
		return 260.00;
		}
		if(foodName=="Curd Rice"){
		return 150.00;
		}
		if(foodName=="Plain Rice"){
		return 95.00;
		}
		if(foodName=="Ghee Rice"){
		return 104.00;
		}
		if(foodName=="Biriyani Rice"){
		return 140.00;
		}
		if(foodName=="Rice Bhath"){
		return 95.00;
		}
		if(foodName=="Egg Rice"){
		return 79.00;
		}
		if(foodName=="Masala Rice"){
		return 110.00;
		}
		if(foodName=="Veg Fried Rice"){
		return 165.00;
		}
		if(foodName=="CurryLeaves Rice"){
		return 95.00;
		}
		if(foodName=="Rasam Rice"){
		return 199.00;
		}
		if(foodName=="Lemon Rice"){
		return 89.00;
		}
		if(foodName=="Puliyogare"){
		return 65.00;
		}else{
			System.out.println(foodName +"Not Found");
		}
		return 0.0;
		}
	}