class TATA{
	String prodCatgry="cars";
	TATA(){
		System.out.println("In TATA constructor brand");
	}
	void Speed(){
		String carName="Nexon";
		System.out.println("Top Speed is 190km/hr");
		System.out.println(prodCatgry);
		System.out.println(carName);
	}
}

class LuxuryThings{
	public static void main(String[] args){
		TATA obj=new TATA();
		obj.Speed();            
	} 
}
