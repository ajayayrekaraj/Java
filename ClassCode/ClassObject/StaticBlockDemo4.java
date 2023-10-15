class Demo{
	static{
		System.out.println("static block 1");
		}
	public static void main(String[]args){
		System.out.println("In Demo main");
	}
}
class Client{
	static{
		System.out.println("Static Block 2");
	}
	public static void main(String[]args){
		System.out.println("In main");
	}
	static{
		System.out.println("Static Block 3");
	}
}

