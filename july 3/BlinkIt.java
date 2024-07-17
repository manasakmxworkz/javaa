class BlinkIt{
	public static double getItems(String itemOrder){
		if(itemOrder=="Vegetables"){
		return 140.00;
		}
		if(itemOrder=="Fruits"){
		return 65.00;
		}
		if(itemOrder=="Cosmetics"){
		return 255.00;
		}
		if(itemOrder=="Bakery items"){
		return 50.00;
		}
		if(itemOrder=="Accessories"){
		return 495.00;
		}
		if(itemOrder=="Baby Care Products"){
		return 264.00;
		}
		if(itemOrder=="Dal Palak"){
		return 70.00;
		}
		if(itemOrder=="Salted Lassie"){
		return 55.00;
		}
		if(itemOrder=="Curd"){
		return 20.00;
		}
		if(itemOrder=="Cold drinks"){
		return 65.00;
		}
		if(itemOrder=="Milk"){
		return 30.00;
		}
		if(itemOrder=="Atta"){
		return 95.00;
		}
		if(itemOrder=="Sauce and Spreads"){
		return 199.00;
		}
		if(itemOrder=="Cleaning Essentials"){
		return 240.00;
		}
		if(itemOrder=="pet Care"){
		return 365.00;
		}else{
			System.out.println(itemOrder +"Not Found");
		}
		return 0.0;
		}
	}