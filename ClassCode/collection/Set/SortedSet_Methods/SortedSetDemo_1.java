import java.util.*;

class SortedSetDemo{
	public static void main(String[]args){
		SortedSet SS=new TreeSet();

		SS.add("AJAY");
		SS.add("ajay");
		SS.add("JAY");
		SS.add("Harsh");
		SS.add("Parth");
		SS.add("Kartik");
		SS.add("Anmol");
		SS.add("Pratik");
		SS.add("Pranav");

		System.out.println(SS);
                
		//headSet();
		System.out.println(SS.headSet("Parth"));

		//tailSet();
		System.out.println(SS.tailSet("Kartik"));

		//subSet();
		System.out.println(SS.subSet("JAY","Parth"));

		//first();
		System.out.println(SS.first());

		//last();
		System.out.println(SS.last());



	}
}
