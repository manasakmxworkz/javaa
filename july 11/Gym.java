import java.util.*;
class Gym{

	static String gymEquipments[]={null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createGymEquipment(String gymEquipmentName){
	System.out.println("Create method started");
		boolean isGymEquipmentCreated=false;
		if(gymEquipmentName!=null){
			gymEquipments[index]=gymEquipmentName;
				index++;
				isGymEquipmentCreated=true;
				}
				else System.out.println("Gym Equipment cannot be null");
				System.out.println("Create method Ended");
				return isGymEquipmentCreated;
	}
	public static void getGymEquipments(){
	System.out.println("The Available Gym Equipments are:");
	for(String gymEqu:gymEquipments)
		System.out.println(gymEqu);
	}
	public static boolean updateGymEquipment(String oldGymEquipmentName,String newGymEquipmentName){
	System.out.println("Update Method Started");
	boolean isGymEquipmentUpdated=false;
		for(int index=0;index<gymEquipments.length;index++){
			if(oldGymEquipmentName==gymEquipments[index]){
				gymEquipments[index]=newGymEquipmentName;
				isGymEquipmentUpdated=true;
				}
		}
		if(isGymEquipmentUpdated==false){
			System.out.println("Gym Equipment is not found");
		}
		System.out.println("Update Method ended");
		return isGymEquipmentUpdated;
}
	public static boolean delGymEquipment(String gymEquipmentNameToBeDel)
	{
		boolean isGymEquipmentNameToBeDel=false;
		int oldGymEquipmentName,newGymEquipmentName;
		int oldGymEquipmentNameindex;
		for(oldGymEquipmentName=0,newGymEquipmentName=0;oldGymEquipmentName<gymEquipments.length;oldGymEquipmentName++)
		{
			if(gymEquipments[oldGymEquipmentName]!=gymEquipmentNameToBeDel){
				gymEquipments[newGymEquipmentName]=gymEquipments[oldGymEquipmentName];
				newGymEquipmentName++;
				isGymEquipmentNameToBeDel=true;
			}
		}
		gymEquipments=Arrays.copyOf(gymEquipments,newGymEquipmentName);
		if(gymEquipments!=null)
			isGymEquipmentNameToBeDel=true;
		if(isGymEquipmentNameToBeDel==false)
			System.out.println(isGymEquipmentNameToBeDel+ "is not found");
		
		return isGymEquipmentNameToBeDel;
	}
}
