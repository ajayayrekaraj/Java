import java.io.*;
class Demo2{
	public static void main(String[]args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str=br.readLine();
		System.out.println(str);
		int data=0;
		try{
			data=Integer.parseInt(br.readLine());
		}catch(Exception obj){
			System.out.println("Please Enter Integer data");
			data=Integer.parseInt(br.readLine());
		}
		System.out.println(data);
	}
}


