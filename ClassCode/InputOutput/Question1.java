import java.util.Scanner;
class DreamCompany{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Dream Company Name:  ");
		String name=obj.next();
		System.out.println("Enter Your Expected Packaged:  ");
		float packaged=obj.nextFoat();
		System.out.println(name);
		System.out.println(packaged);
	}
}

