import java.util.*;
class IMDemo{
	static void Add(int a,int b){
		int ans=a+b;
		System.out.println(ans);
	}
	void Sub(int a,int b){
		int ans=a-b;
		System.out.println(ans);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Integer Number:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			IMDemo obj=new IMDemo();
			Add(a,b);
			obj.Sub(a,b);

	}
}

