class FoodPanda{
	public static double getOrder(String sweetName){
		if(sweetName=="Gulab Jamun"){
		return 75.00;
		}
		if(sweetName=="Halwa"){
		return 65.00;
		}
		if(sweetName=="Semiya Payasam"){
		return 55.00;
		}
		if(sweetName=="Champakali"){
		return 50.00;
		}
		if(sweetName=="Dharwad Peda"){
		return 195.00;
		}
		if(sweetName=="MotiChur Laddu"){
		return 364.00;
		}
		if(sweetName=="Kaju Barfi"){
		return 270.00;
		}
		if(sweetName=="Barfi"){
		return 155.00;
		}
		if(sweetName=="Rasgulla"){
		return 225.00;
		}
		if(sweetName=="Rasmalali"){
		return 165.00;
		}
		if(sweetName=="Soan papdi"){
		return 165.00;
		}
		if(sweetName=="Modak"){
		return 95.00;
		}
		if(sweetName=="Rabri"){
		return 190.00;
		}
		if(sweetName=="Jahangeer"){
		return 240.00;
		}
		if(sweetName=="Jalebi"){
		return 165.00;
		}else{
			System.out.println(sweetName +"Not Found");
		}
		return 0.0;
		}
	}