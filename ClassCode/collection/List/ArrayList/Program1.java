import java.util.*;

class ArrayListDemo{
	public static void main(String[] args){

		ArrayList Al=new ArrayList();

		Al.add(10);
		Al.add(20);
		Al.add(30.5f);
		Al.add("Ajay");
		Al.add('A');
		Al.add(60);
		Al.add(30.5f);

		System.out.println(Al);

             //Size()
		System.out.println(Al.size());
             //contains()
		System.out.println(Al.contains('A'));
		System.out.println(Al.contains("30"));
             //isEmpty()
		System.out.println(Al.isEmpty());
             //indexOf()
		System.out.println(Al.indexOf("Ajay"));
            //LastindexOf(in)
	        System.out.println(Al.lastIndexOf(30.5f));
	    //get()
	       System.out.println(Al.get(4));	




	}
}

