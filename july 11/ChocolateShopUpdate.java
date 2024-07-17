import java.util.*;
class ChocolateShopUpdate{

	static String name="Five Star";
	static String ownerName="ABC";
	static String chocolateNames[]={null,null,null,null,null,null};
	static int nameIndex;
	
	public static boolean createChocolateName(String chocolateName){
		System.out.println("create method is started");
			boolean isChocolateNameCreated=false;
			if(nameIndex<chocolateNames.length){
			if(chocolateName!=null){
				chocolateNames[nameIndex]=chocolateName;
				nameIndex++;
				isChocolateNameCreated=true;
			}else System.out.println("Chocolate name is null,cannot be declared");
			}else System.out.println("Amele nodana");
		System.out.println("create method is ended ");
		return isChocolateNameCreated;
}

	public static void getChocolateName(){
		System.out.println("The Available Chocolates are");
		for(String chocolateeName:chocolateNames)
			System.out.println(chocolateeName);
	}
		
	public static boolean updateChocolateName(String oldChocolateName,String newChocolateName){
	System.out.println("Update Method Started");
	boolean isChocolateNameUpdated=false;
		for(int nameIndex=0;nameIndex<chocolateNames.length;nameIndex++){
			if(oldChocolateName==chocolateNames[nameIndex]){
				chocolateNames[nameIndex]=newChocolateName;
				isChocolateNameUpdated=true;
				}
		}
		if(isChocolateNameUpdated==false){
			System.out.println("Chocolate is not found");
		}
		System.out.println("Update Method ended");
		return isChocolateNameUpdated;
}
	public static boolean delChocolateName(String chocolateNameToBeDel)
	{
		boolean isChocolateNameToBeDel=false;
		int oldChocolateName,newChocolateName;
		int oldChocolateNamenameIndex;
		for(oldChocolateName=0,newChocolateName=0;oldChocolateName<chocolateNames.length;oldChocolateName++)
		{
			if(chocolateNames[oldChocolateName]!=chocolateNameToBeDel){
				chocolateNames[newChocolateName]=chocolateNames[oldChocolateName];
				newChocolateName++;
				isChocolateNameToBeDel=true;
			}
		}
		chocolateNames=Arrays.copyOf(chocolateNames,newChocolateName);
		if(chocolateNames!=null)
			isChocolateNameToBeDel=true;
		if(isChocolateNameToBeDel==false)
			System.out.println(chocolateNameToBeDel+ "is not found");
		
		return isChocolateNameToBeDel;
	}
}
