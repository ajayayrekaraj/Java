import java.util.*;
class HashSetDemo{
	public static void main(String[]args){

		HashSet HS=new HashSet();

		HS.add("Ajay");
		HS.add("Parth");
		HS.add(10);
		HS.add(20.5f);
		HS.add("Ajay");
		HS.add(20.5f);

		System.out.println(HS);
		System.out.println(HS.size());
	}
}
