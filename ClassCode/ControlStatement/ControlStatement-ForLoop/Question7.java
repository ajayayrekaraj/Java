/* Take N as input and check it is prime number or not
   Input:5
   Output:Prime Number
   Input:8
   Output:Not a prime number */

class Question7{
	public static void main(String[]args){
		int N=5;
		int count=0;

		for(int i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(+N+" Prime Number");
		}
		else{
		System.out.println(+N+" Not a prime Number");
		}
	}
}	
