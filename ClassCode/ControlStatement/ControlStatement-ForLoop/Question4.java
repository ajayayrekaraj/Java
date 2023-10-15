/* factorial 
   Input=5;
   Output=120;
   */

class Question4{
	public static void main(String[]args){
		int n=5;
		int fact=1;
		int i=1;

		for(i=1;i<=5;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
