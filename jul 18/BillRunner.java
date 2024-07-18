class BillRunner{

	public static void main(String recharge[]){
	
	Bill bill=new Bill();
	boolean value=bill.createBill(101,"12/07/2024","12/08/2024",false,true);
	bill.displayBillInfo();
	
	Bill bill1=new Bill();
	value=bill1.createBill(102,"12/09/2024","12/10/2024",true,false);
	bill1.displayBillInfo();
	
	Bill bill2=new Bill();
	value=bill2.createBill(1324,"12/01/2024","24/02/2024",false,true);
	bill2.displayBillInfo();
	
	Bill bill3=new Bill();
	value=bill3.createBill(9087,"23/07/2024","23/08/2024",true,false);
	bill3.displayBillInfo();
	
	Bill bill4=new Bill();
	value=bill4.createBill(4545,"10/05/2024","10/06/2024",false,true);
	bill4.displayBillInfo();
	
	Bill bill5=new Bill();
	value=bill5.createBill(1011,"12/07/2024","12/08/2024",true,false);
	bill5.displayBillInfo();
	
	Bill bill6=new Bill();
	value=bill6.createBill(1012,"20/09/2023","20/10/2024",false,true);
	bill6.displayBillInfo();
	
	Bill bill7=new Bill();
	value=bill7.createBill(10134,"11/07/2024","11/09/2024",true,false);
	bill7.displayBillInfo();
	
	Bill bill8=new Bill();
	value=bill8.createBill(1021,"13/04/2024","13/06/2024",false,true);
	bill8.displayBillInfo();
	
	Bill bill9=new Bill();
	value=bill9.createBill(3101,"25/07/2024","25/12/2024",true,false);
	bill9.displayBillInfo();
	
	Bill bill10=new Bill();
	value=bill10.createBill(6102,"16/03/2024","15/07/2024",false,true);
	bill10.displayBillInfo();
	
	Bill bill11=new Bill();
	value=bill11.createBill(9748,"12/08/2024","12/09/2024",true,false);
	bill11.displayBillInfo();
	
	Bill bill12=new Bill();
	value=bill12.createBill(4551,"10/07/2024","10/08/2024",false,true);
	bill12.displayBillInfo();
	
	Bill bill13=new Bill();
	value=bill13.createBill(2331,"12/07/2024","12/07/2025",true,false);
	bill13.displayBillInfo();
	
	Bill bill14=new Bill();
	value=bill14.createBill(121113,"15/06/2024","15/08/2024",false,true);
	bill14.displayBillInfo();
	
	Bill bill15=new Bill();
	value=bill15.createBill(001,"21/03/2024","20/08/2024",true,false);
	bill15.displayBillInfo();
	}










}