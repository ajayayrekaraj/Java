/* Take an input N as input 
   Print perfect square till N.
   Perfect square:an integer whose square root 
   is a infinite integer
   25 ->5 =yes;
   1  ->1 =yes;
   10 ->3.13=no;
   Input=30;
   Output=1 4 9 16 25
  */

class Question13{
	public static void main(String[]args){
		int N=30;
		int i=1;

		while(N<=30){
			if(i*i<=N){
				System.out.println(i*i);
				i++;
			}
			else{
				break;
			}
		}
	}
}
