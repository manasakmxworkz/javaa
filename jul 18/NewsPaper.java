class NewsPaper{

	String companyName;
	int noOfPages;
	String language;
	double price;
	
	public boolean createNewsPaper(String companyName,int noOfPages,String language,double price){
		boolean isNewsPaperCreated=false;
		if(companyName!=null && noOfPages>0 && language!=null && price>0){
			this.companyName=companyName;
			this.noOfPages=noOfPages;
			this.language=language;
			this.price=price;
			isNewsPaperCreated=true;
		}
		return isNewsPaperCreated;
	}
	
	public void displayNewsPaperInfo(){
	System.out.println("The Company Name is:" + this.companyName);
	System.out.println("No. Of pages :" + this.noOfPages);
	System.out.println("Language is:" + this.language);
	System.out.println("Price of NewsPaper:" + this.price);
	
	}
	
	}
