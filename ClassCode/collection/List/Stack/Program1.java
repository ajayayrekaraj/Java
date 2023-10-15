import java.util.*;
class StackDemo{
	public static void main(String[]args){
		Stack S=new Stack();

		S.push(10);
		S.push(100);
		S.push(30);
		S.push(400);

		System.out.println(S);
		S.pop();
		System.out.println(S);
		System.out.println(S.peek());
		System.out.println(S);

		System.out.println(S.search(30));



	}
}

