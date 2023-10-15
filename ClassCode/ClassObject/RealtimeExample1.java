class SmartPhone{
	int SmartPhone_Price;
	static String Function="Calling";
	
	void Specification(){
		System.out.println("SmartPhone_Price=" +SmartPhone_Price);
		System.out.println("Function=" +Function);
	}
}
class BrandInfo{
	public static void main(String[]args){
		SmartPhone obj1=new SmartPhone();
		SmartPhone obj2=new SmartPhone();

		obj1.SmartPhone_Price=8000;
		obj2.SmartPhone_Price=9000;

		obj1.Specification();
		obj2.Specification();

		obj.Function="Camera 


