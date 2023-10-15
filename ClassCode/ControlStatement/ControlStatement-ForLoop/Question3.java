/*odd integer
  Input=6
  Output=1 3 5 */

class Question3{
	public static void main(String[]args){
		int n=6;
		int i=1;

		for(i=1;i<=n;i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
	}
}
