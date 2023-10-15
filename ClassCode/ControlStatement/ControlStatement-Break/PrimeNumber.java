// first two prime numbers

class PrimeNumber{
	public static void main(String[]args){
		int N=15;
		int count=0;

		for(int i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
			if(count>2){
				break;
			}
			System.out.println(i);
		}

		if(count==2){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not a prime number");
		}
	}
}

