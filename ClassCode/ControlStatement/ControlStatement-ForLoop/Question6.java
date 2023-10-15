/* Take N as input count all its factors and print count
   Input=6;
   Output=4;
   */

class Question6{
	public static void main(String[]args){
		int n=6;
		int i=1;
		int count=0;

		for(i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		System.out.println(count);
	}
}
