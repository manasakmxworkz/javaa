class Passport{

	static String cpvLoc;
	static int dcdrLoc;
	static String gvNm;
	static String surNm;
	static String db;
	static String mail;
	static boolean isMailLoginSame;
	static String lId;
	static String pass;
	static String cPwd;
	static String hintQ;
	static String hintA;
	static String cpt;
	
	public static boolean createPassport(String cpvLocation,int dcdrLocation,String giveName,String surName,String dob,String email,boolean isEmailLoginSame,String loginId,String pwd,String confirmPwd,String hintQues,String hintAns,String captcha){
	boolean isPassportDataCreated=false;
	System.out.println("Validation and initialistaion of account..");
		if(cpvLocation!=null && dcdrLocation>0 && giveName!=null && surName!=null && dob!=null && email!=null && isEmailLoginSame!=false && loginId!=null && pwd!=null && confirmPwd!=null && hintQues!=null && hintAns!=null && captcha!=null){
		cpvLoc=cpvLocation;
		dcdrLoc=dcdrLocation;
		gvNm=giveName;
		surNm=surName;
		db=dob;
		mail=email;
		isMailLoginSame=isEmailLoginSame;
		lId=loginId;
		pass=pwd;
		cPwd=confirmPwd;
		hintQ=hintQues;
		hintA=hintAns;
		cpt=captcha;
		isPassportDataCreated=true;
		}
	else{
		System.out.println("Account is not created");
	}
	return isPassportDataCreated;
	}
	public static void getPassportDetails(){
		System.out.println("The CPVLocation is: " +cpvLoc);
		System.out.println("The DCDRLocation is: " +dcdrLoc);
		System.out.println("The Given Nmae is: " +gvNm);
		System.out.println("The Sur Name is: " +surNm);
		System.out.println("The Date of Birth is: " +db);
		System.out.println("The Email is: " +mail);
		System.out.println("Is the Login is same: " +isMailLoginSame);
		System.out.println("The Login ID is: " +lId);
		System.out.println("The Password is: " +pass);
		System.out.println("The Confirm Password is: " +cPwd);
		System.out.println("The Hint Question is: " +hintQ);
		System.out.println("The Hint Answer is: " +hintA);
		System.out.println("The Catcha is: " +cpt);
	}
}