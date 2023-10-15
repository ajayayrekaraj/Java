import java.io.*;
class Neww{
public static void main(String[]args) throws IOException{
	InputStreamReader isr=new InputStreamReader(System.in);

	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

	String str1=br1.readLine();
	System.out.println("String= " +str1);

	char ch=(char)isr.read();
	System.out.println("Char= " +ch);
}
}

