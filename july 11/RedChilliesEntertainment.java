import java.util.*;
class RedChilliesEntertainment{

	static String movieActors[]={null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMovieActors(String actorsName){
	System.out.println("Create method started");
		boolean isMovieActorsCreated=false;
		if(actorsName!=null){
			movieActors[index]=actorsName;
				index++;
				isMovieActorsCreated=true;
				}
				else System.out.println("Movie Actors cannot be null");
				System.out.println("Create method Ended");
				return isMovieActorsCreated;
	}
	public static void getMovieActors(){
	System.out.println("The Available Movie Actors are:");
	for(String movAct:movieActors)
		System.out.println(movAct);
	}
	public static boolean updateMovieActors(String oldActorsName,String newActorsName){
	System.out.println("Update Method Started");
	boolean isMovieActorsCreated=false;
		for(int index=0;index<movieActors.length;index++){
			if(oldActorsName==movieActors[index]){
				movieActors[index]=newActorsName;
				isMovieActorsCreated=true;
				}
		}
		if(isMovieActorsCreated==false){
			System.out.println("Movie Actors is not found");
		}
		System.out.println("Update Method ended");
		return isMovieActorsCreated;
}
	public static boolean delMovieActors(String movieActorsToBeDel)
	{
		boolean ismovieActorsToBeDel=false;
		int oldActorsName,newActorsName;
		int oldActorsNameindex;
		for(oldActorsName=0,newActorsName=0;oldActorsName<movieActors.length;oldActorsName++)
		{
			if(movieActors[oldActorsName]!=movieActorsToBeDel){
				movieActors[newActorsName]=movieActors[oldActorsName];
				newActorsName++;
				ismovieActorsToBeDel=true;
			}
		}
		movieActors=Arrays.copyOf(movieActors,newActorsName);
		if(movieActors!=null)
			ismovieActorsToBeDel=true;
		if(ismovieActorsToBeDel==false)
			System.out.println(movieActorsToBeDel+ "is not found");
		
		return ismovieActorsToBeDel;
	}
}
