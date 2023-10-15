class Division{
	public static void main(String[]args){
		int x=19;

		if(x%3==0 && x%5==0){
			System.out.println("Fizz-buzz");
		}
		else if(x%3==0){
			System.out.println("fizz");
		}
		else if(x%5==0){
			System.out.println("buzz");
		}
		else{
			System.out.println("not divisible by both");
		}
	}
}

