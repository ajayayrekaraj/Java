/* A B C
   A B C
   A B C  */

class Pattern9{
	public static void main(String[]args){
		char ch='A';
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println( );
		}
	}
}

