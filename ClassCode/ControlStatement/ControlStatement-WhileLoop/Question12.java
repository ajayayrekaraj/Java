/*Given an integer N                                                                                                            Print sum of its digits                                                                                                       Assume=N>=0                                                                                                                   Input=653                                                                                                                    Output=90    */    

class Question12{
	public static void main(String[]args){
		int N=653;
		int mul=1;
		int rem;

		while(N!=0){
			rem=N%10;
			mul=mul*rem;
			N=N/10;
		}
		System.out.println(mul);
	}
}

