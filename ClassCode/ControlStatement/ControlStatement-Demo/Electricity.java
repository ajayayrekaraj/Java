class Electricity{
	public static void main(String[]args){
		int units=200;

		if(units<=100){
			System.out.println(units);
		}
		else{
			System.out.println(100*1+(units-100)*2);
		}
	}
}

