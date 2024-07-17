import java.util.*;
class Textile{

	static String materialNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;

	public static boolean addMaterial(String material){
		boolean ismaterialNamesAdded=false;
			if(index<materialNames.length){
				if(material!=null){
					materialNames[index]=material;
					index++;
					ismaterialNamesAdded=true;
				}else System.out.println("Material is null,cannot be declared");
			}else System.out.println("Amele nodana");
	return ismaterialNamesAdded;
	}
	public static void getAllmaterialInfo(){
		for(String materialNm:materialNames)
		System.out.println(materialNm);
	}
	
	public static boolean updateMaterial(String oldMaterialNames,String newMaterialNames){
		boolean ismaterialNamesUpdated=false;
			for(int index=0;index<materialNames.length;index++){
				if(oldMaterialNames==materialNames[index]){
				materialNames[index]=newMaterialNames;
				ismaterialNamesUpdated=true;
				}
	}
	if(ismaterialNamesUpdated==false){
		System.out.println("Material Brand Name not found");
	}
	return ismaterialNamesUpdated;
	}
	public static boolean delMaterial(String materialNameToBeDel)
	{
		boolean ismaterialNameToBeDel=false;
		int oldMaterialNames,newMaterialNames;
		int oldMaterialNamesindex;
		for(oldMaterialNames=0,newMaterialNames=0;oldMaterialNames<materialNames.length;oldMaterialNames++)
		{
			if(materialNames[oldMaterialNames]!=materialNameToBeDel){
				materialNames[newMaterialNames]=materialNames[oldMaterialNames];
				newMaterialNames++;
				ismaterialNameToBeDel=true;
			}
		}
		materialNames=Arrays.copyOf(materialNames,newMaterialNames);
		if(materialNames!=null)
			ismaterialNameToBeDel=true;
		if(ismaterialNameToBeDel==false)
			System.out.println(materialNameToBeDel+ "is not found");
		
		return ismaterialNameToBeDel;
	}
}
