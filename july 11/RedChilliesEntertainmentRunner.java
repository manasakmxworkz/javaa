class RedChilliesEntertainmentRunner{

	public static void main(String entertainment[]){
	
	boolean output=RedChilliesEntertainment.addMovieActors("Sudeep");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Dhruva Sarja");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Vikikaushal");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Vijay Thalapathy");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Puneeth Rajkumar");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Karthik Aryan");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Radhika Pandit");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Ramya");
	System.out.println(output);
	output=RedChilliesEntertainment.addMovieActors("Priyamani");
	System.out.println(output);
	RedChilliesEntertainment.getMovieActors();
	boolean value=RedChilliesEntertainment.updateMovieActors("Karthik Aryan","Hritik Roshan");
	System.out.println(value);
	
	RedChilliesEntertainment.getMovieActors();
	
	boolean val=RedChilliesEntertainment.delMovieActors("Hritik Roshan");
	RedChilliesEntertainment.getMovieActors();
	}

}