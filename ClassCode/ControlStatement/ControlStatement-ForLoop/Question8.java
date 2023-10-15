/* Take N as input and check number is perfect number or not
   Input=4
   Output:Not a perfect Number
   Input=6
   Output:Perfect Number */

class Question8{
	public static void main(String[]args){
		int N=6;
		int sum=0;

		for(int i=1;i<N;i++){
			if(N%i==0){
				sum=sum+i;
			}
		}
		if(sum==N){
			System.out.println(+N+" is a perfect Number");
		}
		else{
			System.out.println(+N+" not a perfect number");
		}
	}
}

