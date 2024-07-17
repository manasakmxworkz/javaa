class AdmissionForm{

	static String fN;
	static String mN;
	static String lN;
	static String dB;
	static int agee;
	static String gen;
	static long phNo;
	static String mail;
	static String cas;
	static String rel;
	static String add;
	

	public static void createForm(String firstName,String middleName,String lastName,String dob,int age,String gender,Long phoneNumber,String email,String caste,String religion,String address){
	 
	fN=firstName;
	mN=middleName;
	lN=lastName;
	dB=dob;
	agee=age;
	gen=gender;
	phNo=phoneNumber;
	mail=email;
	cas=caste;
	rel=religion;
	add=address;
	
}

	public static void getAdmissionDetails(){
		System.out.println("The First Name is: "+fN);
		System.out.println("The Middle Name is: "+mN);
		System.out.println("The Last Name is: "+lN);
		System.out.println("Date of Birth is: "+dB);
		System.out.println("Age: "+agee);
		System.out.println("Phone Number: "+phNo);
		System.out.println("Email: "+mail);
		System.out.println("Caste: "+cas);
		System.out.println("Religion: "+rel);
		System.out.println("Address: "+add);
		}
	}