class Outer{
	void m1(){
		System.out.println("In m1-Outer");
	}
	class Inner{
		void m1(){
			System.out.println("In m1-Inner");
		}
	        void m2(){
		System.out.println("In m2-Outer");
	        }
	Inner obj=new Inner();
	obj.m1();
	}
	public static void main(String[]args){
		Outer obj=new Outer();
		obj.m1();
		obj.m2();
	}
}


