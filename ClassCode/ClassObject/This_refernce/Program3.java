class Demo{
	int x=10;
	Demo(){
		this(70);
		System.out.println("IN");
	}
	Demo(int x){
		this();
		System.out.println("OUT");
	}
	public static void main(){
		Demo obj2=new Demo(50);
	}
}

