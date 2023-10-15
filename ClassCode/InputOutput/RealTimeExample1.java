import java.io.*;                                                                                                                        import java.util.*;                                                                                                                      class Mall{     
	public static void main(String[]args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
	      	
		System.out.println("Enter Product Name,Grade,Original Price,Discount Price"); 
		String info=br.readLine();
		System.out.println(info);

		StringTokenizer obj=new StringTokenizer(info," ");     

		String token1=obj.nextToken();
		char token2=charAt(0)obj.nextToken(); 
		int token3=Integer.parseInt(obj.nextToken());
                float token4=Float.parseFloat(obj.nextToken());

		System.out.println("Product= " +token1); 
 
		System.out.println("Grade= " +token2);   
		System.out.println("Original Price= " +token3);
	        System.out.println("Discount Price= " +token4);
	}
}

