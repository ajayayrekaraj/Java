import java.util.*;
class LinkedHashSetDemo1{
	public static void main(String[]args){

		LinkedHashSet LHS1=new LinkedHashSet();

		LHS1.add(10);
		LHS1.add(20);
		LHS1.add(new Integer(10));
		LHS1.add(new Integer(20));

		System.out.println(LHS1);
	}
}

