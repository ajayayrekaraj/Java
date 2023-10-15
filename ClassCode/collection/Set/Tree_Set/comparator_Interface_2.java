import java.util.*;
class Movies{
	String movieName=null;
	double totColl=0.0f;
	float imdbRating=0.0f;

	Movies(String movieName,double totColl,float imdbRating){
		this.movieName=movieName;
		this.totColl=totColl;
		this.imdbRating=imdbRating;
	}
	public String toString(){
		return "{" +movieName+ ":" +totColl+ ":" +imdbRating+ "}";
	}
}
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){
		return (int)((((Movies)obj1).movieName).compareTo(((Movies)obj2).movieName));
	}
}
class SortByTOTALCOLL implements Comparator{
	public int compare(Object obj1,Object obj2){
		return (int)((((Movies)obj1).totColl)-(((Movies)obj2).totColl));
	}
}
class SortByIMDBRATING implements Comparator{
	public int compare(Object obj1,Object obj2){
		return (int)((((Movies)obj1).imdbRating)-(((Movies)obj2).imdbRating));
	}
}
class UserDefinedListDemo{
	public static void main(String[]args){
		ArrayList al=new ArrayList();

		al.add(new Movies("RHTDM",200.00,8.9f));
		al.add(new Movies("TDM",100.00,9.0f));
		al.add(new Movies("Sairat",150.00,9.5f));
		al.add(new Movies("Rondal",120.00,8.2f));
		al.add(new Movies("Sairat",150.00,9.5f));

		System.out.println(al);

		Collections.sort(al,new SortByName());
		System.out.println(al);

		Collections.sort(al,new SortByTOTALCOLL());
		System.out.println(al);

		Collections.sort(al,new SortByIMDBRATING());
		System.out.println(al);
	}
}

