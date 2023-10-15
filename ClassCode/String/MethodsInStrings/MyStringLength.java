class ToCharArrayDemo{
	static int mystring(String str){
		char arr[]=str.toCharArray();
		int count;

		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}

	public static void main(String[]args){
		String str="ShashiBagal";
		System.out.println(str.length());

		int len=myStrlen(str);
		System.out.println(len);
	}
}


