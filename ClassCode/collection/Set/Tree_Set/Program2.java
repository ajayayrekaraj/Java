import java.util.*;
	class TATAMotors implements Comparable{
		String carName=null;
		float carPrice=0.0f;

		TATAMotors(String carName,float carPrice){
			this.carName=carName;
			this.carPrice=carPrice;
		}
		public int compareTo(Object obj){
			return (carName.compareTo(((TATAMotors)obj).carName));
		}
		public String toString(){
			return carName;
		}
	}

class User{
	public static void main(String[]args){
		TreeSet TS=new TreeSet();

		TS.add(new TATAMotors("TATA NEXON",1460000.00f));
		TS.add(new TATAMotors("TATA ALTROZ",1074000.00f));
		TS.add(new TATAMotors("TATA PUNCH",952000.00f));
		TS.add(new TATAMotors("TATA TIAGO",815000.00f));
		TS.add(new TATAMotors("TATA ALTROZ",1074000.00f));

		System.out.println(TS);
	}
}

