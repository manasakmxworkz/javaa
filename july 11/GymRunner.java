class GymRunner{

	public static void main(String gym[]){
	boolean value=Gym.createGymEquipment("Tread Mill");
	System.out.println(value);
	value=Gym.createGymEquipment("Cycling");
	System.out.println(value);
	value=Gym.createGymEquipment("Dumbbells");
	System.out.println(value);
	value=Gym.createGymEquipment("Weight Plate");
	System.out.println(value);
	value=Gym.createGymEquipment("Bench Press");
	System.out.println(value);
	value=Gym.createGymEquipment("AdjustableBench");
	System.out.println(value);
	value=Gym.createGymEquipment("Raises Machine");
	System.out.println(value);
	value=Gym.createGymEquipment("Cable Row Machine");
	System.out.println(value);
	Gym.getGymEquipments();
	boolean output=Gym.updateGymEquipment("AdjustableBench","Skipping");
	System.out.println(value);
	
	Gym.getGymEquipments();
	
	boolean op=Gym.delGymEquipment("Cable Row Machine");
	System.out.println(op);
	Gym.getGymEquipments();
	}
}