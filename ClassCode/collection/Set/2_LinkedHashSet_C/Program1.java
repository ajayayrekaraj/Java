import java.util.*;
class LinkedHashSetDemo{
	public static void main(String[]args){
		LinkedHashSet LHS=new LinkedHashSet();

		LHS.add(10);
		LHS.add(20);
		LHS.add(10);
		LHS.add(30);
		LHS.add(new Integer(10));
		LHS.add(new Integer(50));

		System.out.println(LHS);
	}
}
