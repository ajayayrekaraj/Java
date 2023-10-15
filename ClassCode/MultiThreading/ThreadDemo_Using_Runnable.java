class MyThread implements Runnable{
	public void run(){
		for( int i=0;i<10;i++) {
			try{
				System.out.println("NOW I AM IN");
				Thread.sleep(3000);
			}catch(InterruptedException ie){
				System.out.println(ie.toString());
			}
		}
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(Exception ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String []args)throws InterruptedException{
		ThreadGroup pThreadGP=new ThreadGroup("India");

		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();
		MyThread obj3=new MyThread();

		Thread t1=new Thread(pThreadGP,obj1,"Maharashtra");
		Thread t2=new Thread(pThreadGP,obj2,"GOA");
		Thread t3=new Thread(pThreadGP,obj3,"Bihar");

		t1.start();
		t2.start();
		t3.start();

		ThreadGroup cThreadGP=new ThreadGroup(pThreadGP,"Pakistan");

		MyThread obj4=new MyThread();
		MyThread obj5=new MyThread();
		MyThread obj6=new MyThread();

		Thread t4=new Thread(cThreadGP,obj4,"Islamabad");
		Thread t5=new Thread(cThreadGP,obj5,"Karachi");
		Thread t6=new Thread(cThreadGP,obj6,"Lahore");

		t4.start();
		t5.start();
		t6.start();

		System.out.println(pThreadGP.activeCount());
		System.out.println(cThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
		System.out.println(cThreadGP.activeGroupCount());

	}
}




