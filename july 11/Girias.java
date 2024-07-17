import java.util.*;
class Girias{

	static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createhomeAppliance(String homeAppliance){
	System.out.println("Create method started");
		boolean ishomeApplianceCreated=false;
		if(homeAppliance!=null){
			homeAppliances[index]=homeAppliance;
			index++;
			ishomeApplianceCreated=true;
		}else System.out.println("Home Appliances cannot be null");
		System.out.println("Create method Ended");
		return ishomeApplianceCreated;
	}
	public static void getHomeAppliances(){
		for(String homeApp:homeAppliances)
		System.out.println(homeApp);

	} 
	public static boolean updateHomeAppliance(String oldHomeAppliance,String newHomeAppliance){
	System.out.println("Update Method Started");
	boolean ishomeApplianceUpdated=false;
		for(int index=0;index<homeAppliances.length;index++){
			if(oldHomeAppliance==homeAppliances[index]){
				homeAppliances[index]=newHomeAppliance;
				ishomeApplianceUpdated=true;
				}
		}
		if(ishomeApplianceUpdated==false){
			System.out.println("Home Appliances is not found");
		}
		System.out.println("Update Method ended");
		return ishomeApplianceUpdated;
}
	public static boolean delHomeAppliance(String homeApplianceToBeDel)
	{
		boolean ishomeApplianceToBeDel=false;
		int oldHomeAppliance,newHomeAppliance;
		for(oldHomeAppliance=0,newHomeAppliance=0;oldHomeAppliance<homeAppliances.length;oldHomeAppliance++)
		{
			if(homeAppliances[oldHomeAppliance]!=homeApplianceToBeDel){
				homeAppliances[newHomeAppliance]=homeAppliances[oldHomeAppliance];
				newHomeAppliance++;
				
			}
		}
		homeAppliances=Arrays.copyOf(homeAppliances,newHomeAppliance);
		if(homeAppliances!=null){
			ishomeApplianceToBeDel=true;
		}
		if(ishomeApplianceToBeDel==false){
		System.out.println(homeApplianceToBeDel+ "is not found");
		}		
		return ishomeApplianceToBeDel;
	}
}

