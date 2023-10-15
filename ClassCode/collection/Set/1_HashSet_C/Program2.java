import java.util.*;
class HashSetDemo1{
	public static void main(String[]args){
		HashSet HS=new HashSet();

		HS.add(new Integer(10));
		HS.add(10);
		HS.add(new Integer(20));
		HS.add(20);

		System.out.println(HS);
	}
}

