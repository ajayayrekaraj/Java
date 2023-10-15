class StringDemo{
	public static void main(String[]args){
		String str1="AJAY";
		String str2="AYREKAR";

		System.out.println(str1 + str2);

		String str3="Ajay Ayrekar";
		String str4=str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

