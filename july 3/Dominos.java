class Dominos{
	public static double getMenu(String dominosMenu){
		if(dominosMenu=="Paratha Pizza"){
		return 199.00;
		}
		if(dominosMenu=="Corn Stuffed pizza"){
		return 165.00;
		}
		if(dominosMenu=="Cheesy Pizza"){
		return 255.00;
		}
		if(dominosMenu=="Panner Paratha Pizza"){
		return 250.00;
		}
		if(dominosMenu=="Burger pizza"){
		return 195.00;
		}
		if(dominosMenu=="Margherita Pizza"){
		return 164.00;
		}
		if(dominosMenu=="Tandoori Pizza"){
		return 319.00;
		}
		if(dominosMenu=="Veggie Supreme"){
		return 379.00;
		}
		if(dominosMenu=="Classic Corn"){
		return 109.00;
		}
		if(dominosMenu=="Potato cheese Balls"){
		return 99.00;
		}
		if(dominosMenu=="Aloo Tikki Burger"){
		return 165.00;
		}
		if(dominosMenu=="Panner Burger"){
		return 195.00;
		}
		if(dominosMenu=="Coco Cola"){
		return 20.00;
		}
		if(dominosMenu=="Cheese Burger"){
		return 240.00;
		}
		if(dominosMenu=="Barbeque pizza"){
		return 165.00;
		}else{
			System.out.println(dominosMenu +"Not Found");
		}
		return 0.0;
		}
	}