class Demo{
	int x=10;
	Demo(){
		System.out.println("In No-args Constructor");
	}
	Demo(int x){
		System.out.println("In Para Constructor");
	}
	public static void main(String[]args){
		Demo obj1=new Demo();
		Demo obj2=new Demo(50);
	}
}


