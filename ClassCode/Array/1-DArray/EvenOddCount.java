import java.util.*;
class EvenOdd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array Size:");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
			else{
				count1++;
			}
		}
		System.out.println("Even Count is "+count);
		System.out.println("Odd Count is "+count1);
	}
}
