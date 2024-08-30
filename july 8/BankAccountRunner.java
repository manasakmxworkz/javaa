class BankAccountRunner{

	public static void main(String []syndicatebank){
	BankAccount.credit(1000);
	BankAccount.credit(2000);
	BankAccount.debit(2000);
	BankAccount.debit(1000);
	double output=BankAccount.getBalance();
	System.out.println(output);
	}



}