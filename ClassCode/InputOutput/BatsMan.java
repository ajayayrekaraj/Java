import java.io.*;
class Demo{
	public static void main(String[]args) 
			throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Batsman Name:");
		String Batsman=br.readLine();
		System.out.println(Batsman);

		System.out.println("Enter Bowler Name:");
		String Bowler=br.readLine();
		System.out.println(Bowler);
	}
}

