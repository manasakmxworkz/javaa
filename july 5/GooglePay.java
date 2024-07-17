class GooglePay{
static String applicationUrl;
static String nameOfCustomer;
static String emailId;
static long mblNum;
static boolean termsAndConds;
static int oneTimePwd;

public static void registration(String appUrl,String name,String email,long mbl, boolean agreeForCondns,int otp){
	
		applicationUrl=appUrl;
		nameOfCustomer=name;
		emailId=email;
		mblNum=mbl;
		termsAndConds=agreeForCondns;
		oneTimePwd=otp;
		
	}
	
	public static void getTheDetails()
	{
		System.out.println(" App/Website URL on which you wish to accept Payments : "+applicationUrl);
		System.out.println("Name of Customer : "+nameOfCustomer);
		System.out.println("Emailid : " +emailId);
		System.out.println("Mobile Number : "+mblNum);
		System.out.println("Agreeing for the conds : "+termsAndConds);
		System.out.println("OTP : "+oneTimePwd);
	}
}