import java.util.*;
class VectorDemo{
	public static void main(String[]args){
		Vector V=new Vector();

		V.addElement(10);
		V.addElement(20);
		V.addElement(30);
		V.addElement(40);

		System.out.println(V);
		//capacity();
		System.out.println(V.capacity());
		//indexOf();
		System.out.println(V.indexOf(10));
		//size();
		System.out.println(V.size());
		
		System.out.println(V);
	}
}

