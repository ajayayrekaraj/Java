class Demo{
	public static void main(String[]args){
		String str1="AJAY";
		String str2=new String("AJAY");
		String str3="AJAY";
		String str4=new String("AJAY");

		System.out.println(System.identityHashCode(str1));
		 System.out.println(System.identityHashCode(str2));
		  System.out.println(System.identityHashCode(str3));
		   System.out.println(System.identityHashCode(str4));
	}
}
