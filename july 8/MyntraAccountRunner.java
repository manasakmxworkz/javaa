class MyntraAccountRunner{
    public static void main(String[] args) {
        System.out.println("Main method started");
        MyntraAccount.createMyntraAccount("Baba", "baba123@gmail.com", "baba123", "9972603788", "Banglore");
		MyntraAccount.getAccountData();
        System.out.println("Main method ended");
    }
}