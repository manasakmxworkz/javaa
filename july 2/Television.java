class Television{
	static boolean isConnected;
	static int currentVolume;
	static int minVolume=0;
	static int maxVolume=7;

	public static void onOrOff(){
		if(isConnected==false){
		isConnected=true;
		System.out.println("Television is ON");
		}else{
		isConnected=false;
		System.out.println("Television is OFF");
		}
		}
	
	public static void increaseVolume(){
		if(isConnected==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
			System.out.println("The currentVolume "+currentVolume);
			}
			else{
				System.out.println("Max Volume is reached");
			}
		}else{
				System.out.println("Switch on the TV");
			}
		}
	public static void decreaseVolume(){
		if(isConnected==true){
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
			System.out.println("The currentVolume "+currentVolume);
			}
			else{
				System.out.println("Min Volume is reached");
			}
		}else{
				System.out.println("Switch off the TV");
			}
		}
}
