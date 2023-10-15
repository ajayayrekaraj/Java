import java.util.*;
class Employee{
	String empName=null;
	float empSal=0.0f;
	Employee(String empName,float empSal){
		this.empName=empName;
		this.empSal=empSal;
	}
	public String toString(){
		return "{" +empName+ ":" +empSal+ "}";
	}
}
class SortByName implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
		return obj1.empName.compareTo(obj2.empName);
	}
}
class SortBySalary implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
		return (int)(obj1.empSal-obj2.empSal);
	}
}
class ListSortDemo{
	public static void main(String[]args){
		ArrayList<Employee>al=new ArrayList<Employee>();

		al.add(new Employee("Parth",200000.00f));
		al.add(new Employee("Ajay",250000.00f));
		al.add(new Employee("Harsh",400000.00f));
		al.add(new Employee("Rohit",300000.00f));

		System.out.println(al);

		Collections.sort(al,new SortByName());
		System.out.println(al);

		Collections.sort(al,new SortBySalary());
		System.out.println(al);
		


	}
}

