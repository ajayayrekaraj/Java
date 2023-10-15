import java.io.*;
class Building{
	public static void main(String[]args)
		throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Building Name:");
		String name1=br.readLine();

		System.out.println("Enter Wing:");
		char wing=((char)br.read());
		br.skip(1);

		System.out.println("Enter FlatNo:");
		int flatNo=Integer.parseInt(br.readLine());

		System.out.println(name1);
		System.out.println(wing);
		System.out.println(flatNo);
	}
}

