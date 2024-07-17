class BankAccount{

	static double balance;
	
	public static void debit(double amount){
	System.out.println("Debit card started");
	if(amount<=balance){
	balance=balance-amount;
	}
	else{
		System.out.println("Insufficient funds");
	}
	System.out.println("Debit card ended");
	}
	
	public static void credit(double amount){
	System.out.println("Credit card started");
	if(amount>0){
	balance=balance+amount;
	}
	else{
		System.out.println("Amount can't be zero");
	}
	System.out.println("Credit card ended");
	}
	
	public static double getBalance(){
	System.out.println("Fetching balance.....");
	return balance;
	}
}