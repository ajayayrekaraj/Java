import java.util.*;
class CursorDemo{
	public static void main(String []args){
		ArrayList al=new ArrayList();
		
		al.add("Ajay");
		al.add("Samadhan");
		al.add("Govardhan");
		al.add("Vaibhav");
		al.add("Bhole Rahul");
		al.add("Pandit");
		al.add("Akshay");

		System.out.println(al);

		ListIterator Lit=al.listIterator();

		System.out.println(Lit.getClass().getName());

		while(Lit.hasNext()){
			System.out.println(Lit.next());
		}
		while(Lit.hasPrevious()){
			System.out.println(Lit.previous());
		}
	}
}
