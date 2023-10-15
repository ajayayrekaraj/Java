class ConstructDemo{

	ConstructDemo(){
		System.out.println("In Constructor");
	}
	void fun(){
		ConstructDemo obj1=new ConstructDemo();
	}
	public static void main(String[]args){
		ConstructDemo obj1=new ConstructDemo();
		ConstructDemo obj2=new ConstructDemo();
		obj1.fun();
	}
}

