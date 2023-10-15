import java.util.*;
class CricPlayer{
	int jerNo=0;
	String pName=null;

	CricPlayer(int jerNo,String pName){
		this.jerNo=jerNo;
		this.pName=pName;
	}
}
class HashSetDemo2{
	public static void main(String[]args){
		LinkedHashSet LHS=new LinkedHashSet();

		LHS.add(new CricPlayer(18,"VIRAT"));
		LHS.add(new CricPlayer(7,"MSDHONI"));
		LHS.add(new CricPlayer(45,"ROHIT"));
		LHS.add(new CricPlayer(7,"MSDHONI"));

		System.out.println(LHS);
	}
}

