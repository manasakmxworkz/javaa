import java.util.*;
class Liberty{

	static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;

	public static boolean addShoeBrands(String shoeBrand){
		boolean isShoeBrandsAdded=false;
			if(index<shoeBrands.length){
				if(shoeBrand!=null){
					shoeBrands[index]=shoeBrand;
					index++;
					isShoeBrandsAdded=true;
				}else System.out.println("Shoe Names is null,cannot be declared");
			}else System.out.println("Amele nodana");
	return isShoeBrandsAdded;
	}
	public static void getAllShoeBrands(){
		for(String shoeNames:shoeBrands)
		System.out.println(shoeNames);
	}
	
	public static boolean updateShoeBrands(String oldShoeBrands,String newShoeBrands){
		boolean isShoeBrandsUpdated=false;
			for(int index=0;index<shoeBrands.length;index++){
				if(oldShoeBrands==shoeBrands[index]){
				shoeBrands[index]=newShoeBrands;
				isShoeBrandsUpdated=true;
				}
	}
	if(isShoeBrandsUpdated==false){
		System.out.println("Shoe Brands Name not found");
	}
	return isShoeBrandsUpdated;
	}
	public static boolean delShoeBrands(String shoeNameToBeDel)
	{
		boolean isshoeNameToBeDel=false;
		int oldShoeBrands,newShoeBrands;
		int oldShoeBrandsindex;
		for(oldShoeBrands=0,newShoeBrands=0;oldShoeBrands<shoeBrands.length;oldShoeBrands++)
		{
			if(shoeBrands[oldShoeBrands]!=shoeNameToBeDel){
				shoeBrands[newShoeBrands]=shoeBrands[oldShoeBrands];
				newShoeBrands++;
				isshoeNameToBeDel=true;
			}
		}
		shoeBrands=Arrays.copyOf(shoeBrands,newShoeBrands);
		if(shoeBrands!=null)
			isshoeNameToBeDel=true;
		if(isshoeNameToBeDel==false)
			System.out.println(isshoeNameToBeDel+ "is not found");
		
		return isshoeNameToBeDel;
	}
}
