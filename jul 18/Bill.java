class Bill{

	int billId;
	String billIssueDate;
	String billExpiryDate;
	boolean isBillPaid;
	boolean isLatestBill;
	
	public boolean createBill(int billId,String billIssueDate,String billExpiryDate,boolean isBillPaid,boolean isLatestBill){
		boolean isBillCreated=false;
		if(billId>0 && billIssueDate!=null && billExpiryDate!=null){
			this.billId=billId;
			this.billIssueDate=billIssueDate;
			this.billExpiryDate=billExpiryDate;
			this.isBillPaid=isBillPaid;
			this.isLatestBill=isLatestBill;
			isBillCreated=true;
		}
		return isBillCreated;
	}
	
	public void displayBillInfo(){
	System.out.println("The Bill Id is:" + this.billId);
	System.out.println("Bill Issue Date:" + this.billIssueDate);
	System.out.println("Bill Expiry Date:" + this.billExpiryDate);
	System.out.println("Is Bill Paid:" + this.isBillPaid);
	System.out.println("Latest Bill is:" + this.isLatestBill);
	
	}
	
	}
