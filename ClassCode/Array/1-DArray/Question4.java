class Demo{
	public static void main(String[]args){
		int arr[]={10,20,30,40};
	        float arr1[]={10.25f,20.55f,30.25f};
			char arr2[]={'A','B','C'};
			boolean arr3[]={true,false,true};

			for(int i=0;i<4;i++){
				System.out.println(arr[i]);
			}
		//	for(float j=0;j<=2;j++){
		//		System.out.println((float)arr1[j]);
		//	}
			for(char c=0;c<=2;c++){
				System.out.println((char)arr2[c]);
			}
		//	for(boolean i=0;i<3;i++){
		//		System.out.println(arr3[i]);
		//	} 
// int
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);

			//float
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);

			//character
			System.out.println(arr2[0]);
			System.out.println(arr2[1]);
			System.out.println(arr2[2]);

			//boolean
			System.out.println(arr3[0]);
			System.out.println(arr3[1]);
			System.out.println(arr3[2]);
	}
}

