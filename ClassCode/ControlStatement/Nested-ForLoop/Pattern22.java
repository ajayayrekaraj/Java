/* A 1 B 2
   C 3 D
   E 4
   F  */

class Pattern22{
	public static void main(String[]args){
		int n=4;
		char ch='A';
		int num=1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
				if(j%2==1){
					System.out.print(ch+ " ");
					ch++;
				}
				else{
					System.out.print(num+ " ");
					num++;
				}
			}
			System.out.println( );
		}
	}
}

