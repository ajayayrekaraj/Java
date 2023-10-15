class Outer{
	class Inner{
		void fun(){
			System.out.println("Inner-Fun");
		}
	}
	void run(){
		System.out.println("Outer-fun");
	}
}
class Client{
	public static void main(String[]args){
		Outer obj=new Outer();
		obj.run();
		Outer.Inner obj1=obj.new Inner();
		obj1.fun();
	}
}

