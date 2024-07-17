class PenRunner{

	public static void main(String factory[]){
	
	//ClassName ref=new ClassName();
	Pen ref=new Pen();
	//object(pen) reference
	ref.name="Doms";
	ref.id=1;
	ref.color="black";
	ref.price=4.0;
	
	System.out.println("The Brand Name of the pen is" + ref.name);
	System.out.println("The ID of the pen is" + ref.id);
	
	Pen ref1=new Pen();
	ref1.name="RitoMeter";
	ref1.id=2;
	ref1.color="Purple";
	ref1.price=20.0;
	
	System.out.println("The Color of the pen is" + ref1.color);
	System.out.println("The Price of the pen is" + ref1.price);
	}
	


}