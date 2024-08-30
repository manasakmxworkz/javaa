class JobApplForm{
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static String placee;
	static String mailId;
	static long phoneNumber;
	
public static void fillingForm(String fName,String lName,String dob,String place,String emailId,long phoneNo)
{
	firstName=fName;
	lastName=lName;
	dateOfBirth=dob;
	placee=place;
	mailId=emailId;
	phoneNumber=phoneNo;
}
	public static void getTheDetails(){
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name :"+lastName);
		System.out.println("Date of Birth :"+dateOfBirth);
		System.out.println("Place :"+placee);
		System.out.println("Email id :"+mailId);
		System.out.println("Phone Number :"+phoneNumber);
	}
}