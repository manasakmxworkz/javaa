class RedBus{

static String floc;
static String tloc;
static String name;
static long num;
static int amount;
static String datee;

public static void ticketBooking(String fromLocation,String toLocation,String busName,int numOfSeats,int price,String date)
{
	floc=fromLocation;
	tloc=toLocation;
	name=busName;
	num=numOfSeats;
	amount=price;
	datee=date;
}
public static void fetchingTheInfo(){
System.out.println("Source Location: "+floc);
System.out.println("Destination Location: "+tloc);
System.out.println("Name of the bus: "+name);
System.out.println("Num of seats : "+num);
System.out.println("Amount : "+amount);
System.out.println("Date: "+datee);
}
}