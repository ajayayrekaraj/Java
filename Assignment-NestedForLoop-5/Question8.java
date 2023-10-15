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


		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%4==1){
					System.out.print("$ ");
				}
				else if(i%4==2){
					System.out.print("@ ");
				}
				else if(i%4==3){
					System.out.print("& ");
				}
				else {
					System.out.print("# ");
				}
			}
			System.out.println( );
		}
	}

}

