class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void fun(int x){
		System.out.println("In Parent fun");
	}
	void gun(){
	};
}
class Child extends Parent{
	Child(){
		System.out.println("In child Constructor");
	}
	void fun(){
		System.out.println("In child fun");
	}
	void gun(){
		System.out.println("In child gun");
	}
}
class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.fun(10);
		obj.gun();
	}
}

