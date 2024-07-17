class Hotelbooking{

	static String fN;
	static long contactNo;
	static String mail;
	static String checkIn;
	static String checkOut;
	static String rT;
	static int noOfGuests;
	static boolean isbcSame;
	
	public static boolean createBookingForm(String fullName,String contactNumber,String email,String check-inDate,String check-outDate,String roomType,int numberOfGuests,boolean isbookingConformed){
	boolean isRoomBookingCreated=false;
		fN=fullName;
		contactNo=contactNumber;
		mail=email;
		checkIn=check-inDate;
		checkOut=check-outDate;
		rT=roomType;
		noOfGuests=numberOfGuests;
		isbcSame=isbookingConformed;
	return isRoomBookingCreated;
	}
	
	public static void getBookingDetails(){
	
	System.out.println("Full Name is: "+fN);
	System.out.println("Contact Number is: "+contactNo);
	System.out.println("Email ID: "+mail);
	System.out.println("Check In date: "+checkIn);
	System.out.println("Check out date: "+checkOut);
	System.out.println("Room Booking Type: "+rT);
	System.out.println("No of Guests: "+noOfGuests);
	System.out.println("Booking Confirmation: "+isbcSame);
	
	}

}