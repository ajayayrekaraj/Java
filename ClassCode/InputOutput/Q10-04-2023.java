import java.io.*;
class InputDemo{
	public static void main(String[]args) throws IOException{

		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		 BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

		 String str1=br1.readLine();
		 br1.close();
		 System.out.println("String= " +str1);

		 String str2=br2.readLine();
		 System.out.println("String= " +str2);
	}
}

