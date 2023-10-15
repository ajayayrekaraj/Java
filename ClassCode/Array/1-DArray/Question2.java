/* Input from user */

import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 array Element:");
		int arr[]=new int[5];

		for(int i=0;i<5;i++){
			arr[i]=Integer.parseInt(br.readLine());
		} 
		System.out.println("Array Element");
		for(int j=0;j<5;j++){
			System.out.println(arr[j]);
		}
	}
}

