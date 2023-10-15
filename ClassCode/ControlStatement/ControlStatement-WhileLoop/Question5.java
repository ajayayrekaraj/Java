/* print odd numbers from 1 to 10
 input N=10;
 Output= 1 3 5 7 9 */

class Question5{
	public static void main(String[]args){
		int N=10;
		int i=1;

		while(i<=10){
			if(i%2==1){
				System.out.println(i);
			}
			i++;
		}
	}
}
