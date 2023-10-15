class Employee{
	int empId=10;
	String Name="Ajay";
	static int z=100;

	void empInfo(){
		System.out.println("ID= " +empId);
		System.out.println("Name= " +Name);
		System.out.println("z= " +z);
	}
}
class MainDemo{
	public static void main(String[]args){
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.empInfo();
		emp1.empInfo();

		System.out.println("- - - - - - - -");

		emp2.empId=20;
		emp2.Name="Kailash";
		emp2.z=2000;

		emp1.empInfo();
		emp2.empInfo();
	}
}

