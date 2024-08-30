class NewsPaperRunner{

	public static void main(String affairs[]){
	
	NewsPaper ref=new NewsPaper();
	boolean value=ref.createNewsPaper("Vijaya Karnataka",10,"Kannada",5.00);
	ref.displayNewsPaperInfo();
	
	NewsPaper ref1=new NewsPaper();
	value=ref1.createNewsPaper("Prajavani",50,"Kannada",6.00);
	ref1.displayNewsPaperInfo();
	
	NewsPaper ref2=new NewsPaper();
	value=ref2.createNewsPaper("Udayavani",10,"Kannada",8.00);
	ref2.displayNewsPaperInfo();
	
	NewsPaper ref3=new NewsPaper();
	value=ref3.createNewsPaper("Kannada Prabha",12,"Kannada",6.50);
	ref3.displayNewsPaperInfo();
	
	NewsPaper ref4=new NewsPaper();
	value=ref4.createNewsPaper("Samyukta karnataka",15,"Kannada",7.00);
	ref4.displayNewsPaperInfo();
	
	NewsPaper ref5=new NewsPaper();
	value=ref5.createNewsPaper("The Times of India",20,"English",10.00);
	ref5.displayNewsPaperInfo();
	
	NewsPaper ref6=new NewsPaper();
	value=ref6.createNewsPaper("Hindustan Times",15,"English",8.79);
	ref6.displayNewsPaperInfo();
	
	NewsPaper ref7=new NewsPaper();
	value=ref7.createNewsPaper("Deccan Chronicle",9,"English",10.00);
	ref7.displayNewsPaperInfo();
	
	NewsPaper ref8=new NewsPaper();
	value=ref8.createNewsPaper("The Indian Express",15,"English",4.50);
	ref8.displayNewsPaperInfo();
	
	NewsPaper ref9=new NewsPaper();
	value=ref9.createNewsPaper("The hindu",12,"English",7.75);
	ref9.displayNewsPaperInfo();
	
	NewsPaper ref10=new NewsPaper();
	value=ref10.createNewsPaper("Navbharat Times",13,"Hindi",25.00);
	ref10.displayNewsPaperInfo();
	
	NewsPaper refl1=new NewsPaper();
	value=refl1.createNewsPaper("Dainik Jagran",4,"Hindi",5.00);
	refl1.displayNewsPaperInfo();
	
	NewsPaper refl2=new NewsPaper();
	value=refl2.createNewsPaper("Amar Ujala",15,"Hindi",7.00);
	refl2.displayNewsPaperInfo();
	
	NewsPaper ref13=new NewsPaper();
	value=ref13.createNewsPaper("Hindustan",30,"Hindi",20.00);
	ref13.displayNewsPaperInfo();
	
	NewsPaper ref14=new NewsPaper();
	value=ref14.createNewsPaper("Putani",25,"Kannada",6.00);
	ref14.displayNewsPaperInfo();
	
	NewsPaper ref15=new NewsPaper();
	value=ref15.createNewsPaper("Rajasthan Patrika",20,"Hindi",5.00);
	ref15.displayNewsPaperInfo();
	}
}