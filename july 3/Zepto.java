class Zepto{
	public static double orderDetails(String menuOrder){
		if(menuOrder=="Honey"){
		return 40.00;
		}
		if(menuOrder=="Maggie"){
		return 65.00;
		}
		if(menuOrder=="ChocoFills"){
		return 99.00;
		}
		if(menuOrder=="Hide And Seek"){
		return 30.00;
		}
		if(menuOrder=="Dark Fantasy"){
		return 100.00;
		}
		if(menuOrder=="Oreo"){
		return 40.00;
		}
		if(menuOrder=="Ghee"){
		return 270.00;
		}
		if(menuOrder=="Dry Fruits"){
		return 55.00;
		}
		if(menuOrder=="Icecreams"){
		return 125.00;
		}
		if(menuOrder=="Chips"){
		return 60.00;
		}
		if(menuOrder=="Tea Powder"){
		return 65.00;
		}
		if(menuOrder=="Wafers"){
		return 195.00;
		}
		if(menuOrder=="cookies"){
		return 300.00;
		}
		if(menuOrder=="Lotte Choco pie"){
		return 40.00;
		}
		if(menuOrder=="GoneMad"){
		return 65.00;
		}else{
			System.out.println(menuOrder +"Not Found");
		}
		return 0.0;
		}
	}