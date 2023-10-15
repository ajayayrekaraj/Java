class MBBS{
	MBBS(){
		System.out.println("MBBS Degree");
	}
	void fees(){
		System.out.println("Fees Structure");
	}
}
class BHMS extends MBBS{
	BHMS(){
		System.out.println("BHMS Degree");
	}
}

class Patient{
	public static void main(String[]args){
		BHMS obj=new BHMS();
		obj.fees();
	}
}

