import java.util.*;
class LinkedListDemo{
	public static void main(String[]args){
		LinkedList LL=new LinkedList();

		LL.add(10);
		LL.add(20);
		//addFirst();
		LL.addFirst(15);
		//addLast();
		LL.addLast(30);

		System.out.println(LL);
         //   add();
		LL.add(2,25);

		System.out.println(LL);

        //	getFirst();
		System.out.println(LL.getFirst());

		//getLast();
		System.out.println(LL.getLast());

		//removeFirst();
		System.out.println(LL.removeFirst());

		System.out.println(LL);


	}
}

