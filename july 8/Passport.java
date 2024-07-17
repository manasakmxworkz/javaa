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
		boolean isPassportDatacreated =false;
		
		boolean	isFullNameValid=false;
		boolean isDcdrLocationValid=false;
		boolean	isFullAddressValid=false;
		boolean  isCityPlaceValid=false;
		boolean	isUserEmailValid =false;
		boolean  isConfirmPwdvalid=false;
		boolean isLoginIdValid=false;






		System.out.println("The Passport Created started");
		// if ( fullname!= null && phoneNumber >=0 && fulladdress!=null && cityPlace!=null && userEmail!=null  && confirmPwd!=null && loginid!=null && dcdrLocation >=0)
		
			if ( fullname!= null){
				name=fullname;
				isFullNameValid=true;
				
			}else{
				System.out.println("please provide the valid fullname");
			}
			if (phoneNumber >=0){
				dcdrLoc	=dcdrLocation;
				isDcdrLocationValid=true;
			}else{
				System.out.println("please provide the valid dcdrLocation");
			}
			if(fulladdress!=null){
				add=fulladdress;
				isFullAddressValid=true;
			}else{
				System.out.println("Please provide the Valid fulladdress");
					}
			if(cityPlace!=null){
			   place=cityPlace;
			   isCityPlaceValid=true;

			}else{
				
				System.out.println("please provide the valid cityPlace");
			}
			if(userEmail!=null){
					  email =userEmail;
			isUserEmailValid =true;
				
			}else{
				System.out.println("please provide the valid userEmail");
			}
			if(confirmPwd!=null){
			     pwd=confirmPwd;
            isConfirmPwdvalid=true;
			}else{
				System.out.println("please provide the valid confirmPwd");
			}
			if(loginid!=null){
			login=loginid;
				isLoginIdValid=true;
			}else{
				System.out.println("please provide the valid loginid");
			}
			if(isFullNameValid && isDcdrLocationValid && isFullAddressValid && isCityPlaceValid && isUserEmailValid && isConfirmPwdvalid && isLoginIdValid)
			{
		 isPassportDatacreated = true;	
		}else{
			System.out.println("Provide the vaildation of Passport created");
		}

	
	return isPassportDatacreated;
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