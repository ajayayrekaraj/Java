/*Print Multiples Of 4
 input N=22;
 Output=4 8 12 16 20 */

class Question7{
	public static void main(String[]args){
		int N=22;
		int i=4;

		while(i<=22){
			if(i%4==0){
				System.out.println(i);
				i=i+4;
			}
		}
	}
}

