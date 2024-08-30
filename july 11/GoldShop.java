import java.util.*;
class GoldShop{

	static String goldItemNames[]={null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addGoldItem(String goldItemName){
	System.out.println("create method started");
		boolean isGoldItemAdded=false;
		if(index<goldItemNames.length){
		if(goldItemName!=null){
		   goldItemNames[index]=goldItemName;
		   index++;
		   isGoldItemAdded=true;
		}else System.out.println("Gold Item is null,cannot be declared");
		}else System.out.println("Amele tagolona");
	System.out.println("create method ended");
	return isGoldItemAdded;
	}
	
	public static void getAllGoldItems(){
	System.out.println("The Avilable gold items are");
	for(String goldItem:goldItemNames)
	System.out.println(goldItem);
	}
	
	public static boolean updateGoldItem(String oldGoldItemName,String newGoldItemName){
	System.out.println("Update Method started");
		boolean isGoldItemUpdated=false;
			for(int index=0;index<goldItemNames.length;index++){
				if(oldGoldItemName==goldItemNames[index]){
				goldItemNames[index]=newGoldItemName;
				isGoldItemUpdated=true;
			}
		}
		if(isGoldItemUpdated==false){
			System.out.println("Gold Item not found");
		}
	System.out.println("Update Method ended");
	return isGoldItemUpdated;
	}
	
	public static boolean delGoldItem(String goldItemToBeDel)
	{
		boolean isgoldItemToBeDel=false;
		int oldGoldItem,newGoldItem;
		int oldGoldItemindex;
		for(oldGoldItem=0,newGoldItem=0;oldGoldItem<goldItemNames.length;oldGoldItem++)
		{
			if(goldItemNames[oldGoldItem]!= goldItemToBeDel){
				goldItemNames[newGoldItem]=goldItemNames[oldGoldItem];
				newGoldItem++;
				isgoldItemToBeDel=true;
			}
		}
		goldItemNames=Arrays.copyOf(goldItemNames,newGoldItem);
		if(goldItemNames!=null)
			isgoldItemToBeDel=true;
		if(isgoldItemToBeDel==false)
			System.out.println( goldItemToBeDel+ "is not found");
		
		return isgoldItemToBeDel;
	}
}
