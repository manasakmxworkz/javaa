class LPGCylinder{

static String tloc;
static String Aadhar;
static long num;
static int amount;
static String datee;
static String sv;

public static void cylinderBooking(String toLocation,String aadharNum,long phoneNumber,int price,String date,String subscrptionVoucher)
{
	tloc=toLocation;
	Aadhar=aadharNum;
	num=phoneNumber;
	amount=price;
	datee=date;
	sv=subscrptionVoucher;
}
public static void fetchingTheInfo(){
System.out.println("Source Location: "+tloc);
System.out.println("Aadhar Num: "+Aadhar);
System.out.println("Phone Num: "+num);
System.out.println("Price : "+amount);
System.out.println("Date : "+datee);
System.out.println("Subscription Vocher: "+sv);
}
}