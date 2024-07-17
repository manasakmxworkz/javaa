class TicketNew{

static String loc;
static String name;
static int num;
static int amount;


public static void ticketBooking(String location,String movieName,int numOfSeats,int price)
{
	loc=location;
	name=movieName;
	num=numOfSeats;
	amount=price;
}
public static void fetchingTheInfo(){
System.out.println("Location to watch the movie: "+loc);
System.out.println("Name of the movie: "+name);
System.out.println("Num of seats : "+num);
System.out.println("Amount : "+amount);
}
}