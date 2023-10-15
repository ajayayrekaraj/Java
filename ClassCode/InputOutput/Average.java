import java.io.*;
class Average{
	public static void main(String[]args) 
		throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter PlayerName:");
		String name1=br.readLine();

		System.out.println("Enter JerNO:");
		int jerNo=Integer.parseInt(br.readLine());

		System.out.println("Enter Avg:");
		float Avg=Float.parseFloat(br.readLine());

		System.out.println(name1);
		System.out.println(jerNo);
		System.out.println(Avg);
	}
}

