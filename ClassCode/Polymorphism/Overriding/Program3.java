class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void Property(){
		System.out.println("Home,Gold,Car");
	}
	void marry(){
		System.out.println("Deepika Padukone");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In child fun");
	}
	void marry(){
		System.out.println("Alia Bhatta");
	}
}
class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.Property();
		obj.marry();
	}
}

