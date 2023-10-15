import java.util.*;
class Sum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];

		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
				sum=sum+arr[i];
		}
		System.out.println("Sum is "+sum);
	}
}


