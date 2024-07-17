class AmazonAccountRunner{
    public static void main(String[] args) {
        System.out.println("Main method started");

        AmazonAccount.createAmazonAccount("pallavi", "pallavigmail.com", "qwerty", "97875634234", "Mysore");
		AmazonAccount.getAccountData();
        System.out.println("Main method ended");
    }
}