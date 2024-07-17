class Speaker{

	static boolean isConnected;
	static int currentVolume;
	static int maxVolume=5;
	
	public static void onOrOff(){
		if(isConnected==false){
			isConnected=true;
			System.out.println("Speaker is ON");
			}else{
			System.out.println("Speaker is OFF");
			}
			}
	
	public static void increaseVolume(){
		
		if(isConnected==false){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("Volume is High" +currentVolume);	
			}else{
				System.out.println("Max Volume");
			}
		}else{
				System.out.println("Turn on the Speaker");
			}
		
		}
}

	
