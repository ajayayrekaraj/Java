import java.util.*;
class CursorDemo{
	public static void main(String[]args){
		ArrayList al=new ArrayList();

		al.add(10);
		al.add("Ajay");
		al.add(20.5f);
		al.add("AAA");

/*		for(var X:al){
			System.out.println(X.getClass().getName());
		}
*/
		Iterator cursor =al.iterator();

		System.out.println(cursor.getClass().getName());
/*
		System.out.println(cursor.next());
		System.out.println(cursor.next());
		System.out.println(cursor.next());
		System.out.println(cursor.next());
*/
	/*	while(cursor.hasNext()){
			System.out.println(cursor.next());

		}*/

		while(cursor.hasNext()){
			if("Ajay".equals(cursor.next()))
				cursor.remove();
		}
		System.out.println(al);


	}
}

