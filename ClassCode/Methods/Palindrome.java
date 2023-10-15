import java.util.*;
class Palindrome{
	static void Pali(int n){
		int rev=0;
		int rem=0;
		int temp=n;
		while(n!=0){
		rem=temp%10;
		rev=(rem*10)+rev;
		temp=temp/10;
		}
		if(n==rev){
			System.out.println("It is palindrome Number");
		}
		else{
			System.out.println("Not a Palindrome Number");
		}
	}


	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value:");

		int n=sc.nextInt();
		Pali(n);
	}
}


