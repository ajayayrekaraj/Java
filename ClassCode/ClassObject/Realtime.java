class BOAT{
	String Product="BOAT SmartWatch";

	void BatteryCapacity(){
		String SmartWatchName="Boat Storm Call";
		String BatteryCapacity="Battery Capacity 220 mAh";	//mAh milliamp hours
		System.out.println(Product);
		System.out.println(SmartWatchName);
		System.out.println(BatteryCapacity);
	}
}
class User{
	public static void main(String[]args){
		BOAT obj=new BOAT();
		obj.BatteryCapacity();
	}
}

							      



