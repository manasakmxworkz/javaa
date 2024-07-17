class Zomato{
	public static double getOrder(String foodOrder){
		if(foodOrder=="Idly"){
		return 40.00;
		}
		if(foodOrder=="Noodles"){
		return 65.00;
		}
		if(foodOrder=="Paratha"){
		return 55.00;
		}
		if(foodOrder=="Shawarma"){
		return 50.00;
		}
		if(foodOrder=="Paneer Curry"){
		return 195.00;
		}
		if(foodOrder=="Khichdi"){
		return 64.00;
		}
		if(foodOrder=="Dal"){
		return 70.00;
		}
		if(foodOrder=="Soup"){
		return 55.00;
		}
		if(foodOrder=="Butter Nan"){
		return 25.00;
		}
		if(foodOrder=="Pulao"){
		return 65.00;
		}
		if(foodOrder=="Chole Bhature"){
		return 165.00;
		}
		if(foodOrder=="Chole Kulche"){
		return 195.00;
		}
		if(foodOrder=="Vada"){
		return 19.00;
		}
		if(foodOrder=="Poha"){
		return 40.00;
		}
		if(foodOrder=="Upma"){
		return 65.00;
		}else{
			System.out.println(foodOrder +"Not Found");
		}
		return 0.0;
		}
	}