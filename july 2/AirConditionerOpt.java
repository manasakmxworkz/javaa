class AirConditionerOpt{
	
	static boolean isConnected;
	static int currentTemperature;
	static int minTemperature;
	static int maxTemperature=6;
	
	public static void onOrOff(){
	//false==false//turnary operator	
	isConnected=(isConnected==false)?true:false;
	return;
	}
	
	public static void increaseTemperature(){
		if(isConnected==false){
			if(currentTemperature<=maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("The current Temperature is "+currentTemperature);
			}
			else{
				System.out.println("Max temperature exceeds");
			}
		}else{
				System.out.println("Switch on the AC");
			}
			return;
	}
	public static void decreaseTemperature(){
		if(isConnected==false){
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("The current Temperature is "+currentTemperature);
			}
			else{
				System.out.println("Min temperature exceeds");
			}
		}else{
				System.out.println("Switch off the AC");
			}
			return;
	}

	
	public static void getFeatuers(){
	String name="Samsung";
	double price=8000.00;
	System.out.println("The Name of the AirConditioner:" +name);
	System.out.println("The price of the AirConditioner:" +price);
	return;
	}
	}
