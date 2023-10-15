import java.util.*;
class Movies implements Comparable{
	String movieName=null;
	float totalCollection=0.0f;

	Movies(String movieName,float totalCollection){
		this.movieName=movieName;
		this.totalCollection=totalCollection;
	}
	public int compareTo(Object obj){
		return -(movieName.compareTo(((Movies)obj).movieName));
	}
	public String toString(){
		return movieName;
	}
}
class TreeSetDemo{
	public static void main(String[]args){
		TreeSet TS=new TreeSet();

		TS.add(new Movies("Gadar-2",150.00f));
		TS.add(new Movies("OMG-2",120.00f));
		TS.add(new Movies("Jailer",250.00f));
		TS.add(new Movies("OMG-2",120.00f));

		System.out.println(TS);
	}
}

