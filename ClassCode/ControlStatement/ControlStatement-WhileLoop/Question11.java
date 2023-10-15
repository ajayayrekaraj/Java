/*Given an integer N
  Print sum of its digits
  Assume=N>=0
  Input=6531
  Output=15
 */

class Question11{
	public static void main(String[]args){
		int N=6531;
	        int sum=0;
		int rem;
	      
	       while(N!=0){
	       rem=N%10;
               sum=sum+rem;
	       N=N/10;
	       }
	        System.out.println(sum);
	}
}

