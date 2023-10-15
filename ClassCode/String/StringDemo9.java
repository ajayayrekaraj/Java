class Demo{
	public static void main(String []args){
		String str1="Ayrekar";
		String str3="Ajay";

		String str2=str1+str3;
		String str4=str1.concat(str3);

		System.out.println(str2);
		System.out.println(str4);

		 System.out.println(System.identityHashCode(str2));
		 System.out.println(System.identityHashCode(str4));
	}
}

