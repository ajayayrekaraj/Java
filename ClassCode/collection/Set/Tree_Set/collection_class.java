import java.util.*;
class SortDemo{
	public static void main(String[]args){
		
		ArrayList al=new ArrayList();

		al.add("Parth");
		al.add("Kartik");
		al.add("Harsh");
		al.add("Rohit");
		al.add("Ajay");
		al.add("Pranav");
		al.add("Ajay");
		al.add("Pratik");

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);
	}
}

