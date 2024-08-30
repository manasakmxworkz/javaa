import java.util.*;
class Bar{

	static String barNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;

	public static boolean addWineBrands(String barName){
		boolean isWineBrandsAdded=false;
			if(index<barNames.length){
				if(barName!=null){
					barNames[index]=barName;
					index++;
					isWineBrandsAdded=true;
				}else System.out.println("Wine Bar is null,cannot be declared");
			}else System.out.println("Amele nodana");
	return isWineBrandsAdded;
	}
	public static void getAllWineBrands(){
		for(String barNamess:barNames)
		System.out.println(barNamess);
	}
	
	public static boolean updateWineBrands(String oldWineBrands,String newWineBrands){
		boolean isWineBrandsUpdated=false;
			for(int index=0;index<barNames.length;index++){
				if(oldWineBrands==barNames[index]){
				barNames[index]=newWineBrands;
				isWineBrandsUpdated=true;
				}
	}
	if(isWineBrandsUpdated==false){
		System.out.println("Wine Brand Name not found");
	}
	return isWineBrandsUpdated;
	}
	public static boolean delWineBrands(String barNameToBeDel)
	{
		boolean isbarNameToBeDel=false;
		int oldWineBrands,newWineBrands;
		int oldWineBrandsindex;
		for(oldWineBrands=0,newWineBrands=0;oldWineBrands<barNames.length;oldWineBrands++)
		{
			if(barNames[oldWineBrands]!=barNameToBeDel){
				barNames[newWineBrands]=barNames[oldWineBrands];
				newWineBrands++;
				isbarNameToBeDel=true;
			}
		}
		barNames=Arrays.copyOf(barNames,newWineBrands);
		if(barNames!=null)
			isbarNameToBeDel=true;
		if(isbarNameToBeDel==false)
			System.out.println(isbarNameToBeDel+ "is not found");
		
		return isbarNameToBeDel;
	}
}
