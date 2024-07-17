class GiriasRunner{

	public static void main(String girias[]){
	
	boolean output=Girias.createhomeAppliance("Pan");
	System.out.println(output);
	output=Girias.createhomeAppliance("Dryer");
	System.out.println(output);
	output=Girias.createhomeAppliance("Microwave");
	System.out.println(output);
	output=Girias.createhomeAppliance("Washing Machine");
	System.out.println(output);
	output=Girias.createhomeAppliance("Air conditioner");
	System.out.println(output);
	output=Girias.createhomeAppliance("Iron");
	System.out.println(output);
	output=Girias.createhomeAppliance("Heater");
	System.out.println(output);
	output=Girias.createhomeAppliance("Oven");
	System.out.println(output);
	output=Girias.createhomeAppliance("Toaster");
	System.out.println(output);
	output=Girias.createhomeAppliance("Refrigerator");
	System.out.println(output);
	output=Girias.createhomeAppliance("Mixer");
	System.out.println(output);
	output=Girias.createhomeAppliance("Vacum Cleaner");
	System.out.println(output);
	Girias.getHomeAppliances();
	boolean value=Girias.updateHomeAppliance("Refrigerator","Cooler");
	System.out.println(value);
	Girias.getHomeAppliances();	
    Girias.delHomeAppliance("Dryer");
	Girias.getHomeAppliances();
	}
}