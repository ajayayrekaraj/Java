import java.util.*;
class CursorDemo{
	public static void main(String[]args){
		Vector V=new Vector();

		V.addElement("AJAY");
		V.addElement("Parth");
		V.addElement("Harsh");
		V.addElement("Rohit");
		V.addElement("Chotu");
		V.addElement("Panu");

			System.out.println(V);

			Enumeration cursor=V.elements();

			System.out.println(cursor.getClass().getName());

			while(cursor.hasMoreElements()){
				System.out.println(cursor.nextElement());
			}

	}
}

