/* Q2
  Write a program to take range as input from the user and print composite numbers.
  Input: Enter start: 1
  Enter end: 20
  Output: composite numbers between 1 and 20
  4 6 8 9 10 12 14 15 16 18 20 */
import java.io.*;
class Demo{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Start Number:");
		int start=Integer.parseInt(br.readLine());
		System.out.print("Enter End Number:");
		int end=Integer.parseInt(br.readLine());
		
		System.out.println("composite numbers between "+start+" and "+end+" ");
		for(int i=start;i<=end;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count>2){
				System.out.print(" "+i);
			}
		}
	}
}

