/* A 1 B 2
   A 1 B 2
   A 1 B 2  */

class Pattern9{
	public static void main(String[]args){
		
		for(int i=1;i<=3;i++){
		           int k=1;
			   char ch='A';
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(k+ " ");
					k++;
				}
				else{
					System.out.print(ch+ " ");
					ch++;
				}
			}
			System.out.println( );
		}
	}
}

