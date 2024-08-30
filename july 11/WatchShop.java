import java.util.*;
class WatchShop{

	static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;

	public static boolean addWatchBrandNames(String watchName){
		boolean isWatchNameAdded=false;
			if(index<watchNames.length){
				if(watchName!=null){
					watchNames[index]=watchName;
					index++;
					isWatchNameAdded=true;
				}else System.out.println("Watch Name is null,cannot be declared");
			}else System.out.println("Amele nodana");
	return isWatchNameAdded;
	}
	public static void getAllWatchBrands(){
		for(String watchNamee:watchNames)
		System.out.println(watchNamee);
	}
	
	public static boolean updateWatchBrands(String oldWatchBrand,String newWatchBrand){
		boolean isWatchNameUpdated=false;
			for(int index=0;index<watchNames.length;index++){
				if(oldWatchBrand==watchNames[index]){
				watchNames[index]=newWatchBrand;
				isWatchNameUpdated=true;
				}
	}
	if(isWatchNameUpdated==false){
		System.out.println("Watch Brand Name not found");
	}
	return isWatchNameUpdated;
	}
	public static boolean delWatchBrands(String watchNameToBeDel)
	{
		boolean iswatchNameToBeDel=false;
		int oldWatchBrand,newWatchBrand;
		int oldWatchBrandindex;
		for(oldWatchBrand=0,newWatchBrand=0;oldWatchBrand<watchNames.length;oldWatchBrand++)
		{
			if(watchNames[oldWatchBrand]!=watchNameToBeDel){
				watchNames[newWatchBrand]=watchNames[oldWatchBrand];
				newWatchBrand++;
				iswatchNameToBeDel=true;
			}
		}
		watchNames=Arrays.copyOf(watchNames,newWatchBrand);
		if(watchNames!=null)
			iswatchNameToBeDel=true;
		if(iswatchNameToBeDel==false)
			System.out.println(watchNameToBeDel+ "is not found");
		
		return iswatchNameToBeDel;
	}
}
