class FiveStarChicken{

	public static double getFood(String getOrder){
	if(getOrder=="Cheesy Chicken shots"){
	return 55.00 ;
	}
	if(getOrder=="Chicken Nuggets"){
	return 45.00 ;
	}
	if(getOrder=="Masala Fries"){
	return 45.00 ;
	}
	if(getOrder=="Chicken PopCorn"){
	return 55.00 ;
	}
	if(getOrder=="Chicken Roll"){
	return 58.00 ;
	}
	if(getOrder=="Hot Crispy Burger"){
	return 70.00;
	}
	if(getOrder=="French Fries"){
	return 70.00;
	}
	if(getOrder=="Hungry Bird Burger"){
	return 78.00 ;
	}
	if(getOrder=="Veg Roll"){
	return 60.00 ;
	}
	if(getOrder=="Khati Roll"){
	return 80.00 ;
	}
	if(getOrder=="Chicken Buckets"){
	return 350.00 ;
	}
	if(getOrder=="Chilli Cheese Burger"){
	return 115.00 ;
	}
	if(getOrder=="Nachos"){
	return 55.00 ;
	}
	if(getOrder=="Pepsi"){
	return 15.00 ;
	}
	if(getOrder=="Sprite"){
	return 25.00 ;
	}else{
			System.out.println(getOrder +"Not Found");
		}
		return 0.0;
		}
	}