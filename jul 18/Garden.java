class Garden{
	String name;
	String place;
	public boolean create(String name,String place){
	boolean isGardenCreated=false;
	
	if(name!=null && place!=null){
	this.name=name;
	this.place=place;
	isGardenCreated=true;
	}
	
	return isGardenCreated;
}
	public void displayGardenDetails()
	{
		System.out.println("name of garden is: "+this.name);
		System.out.println("place of garden is: "+this.place);
		}
}