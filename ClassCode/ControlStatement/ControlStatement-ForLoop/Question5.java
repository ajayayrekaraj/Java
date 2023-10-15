/* Take N as input print all its factors
   factors
     x is a factor of N%X==0
     Input=6;
     Output=1 2 3 6 */

class Question5{
	public static void main(String[]args){
		int n=6;
		int i=1;

		for(i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}
}

