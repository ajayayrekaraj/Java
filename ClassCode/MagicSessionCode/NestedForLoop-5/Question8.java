/*Q8
write a program to print the following pattern
Row =8
 $
 @ @
 & & &
 # # #
 $ $ $ $ $
 @ @ @ @ @ @
 & & & & & & &
 # # # # # # # #
 USE THIS FOR LOOP STRICTLY for the outer loop
 Int row;
 Take row from user
 for(int i =1;i<=row;i++){
 } */

import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row: ");
		int row=Integer.parseInt(br.readLine());

		int count=1;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(count==1){
					System.out.print("$ ");
				}
				else if(count==2){
					System.out.print("@ ");
				}
				else if(count==3){
					System.out.print("& ");
				}
				else if(count==4){
					System.out.print("# ");
				}
			
				if(count==4){
					count=0;
				}
			
			}
			System.out.println( );
			count++;
		}
	}

}

