class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){

			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{
	public static void main(String[]args)throws InterruptedException{
		ThreadGroup pThreadGP=new ThreadGroup("India");

		MyThread t1=new MyThread(pThreadGP,"Maharashtra");
		MyThread t2=new MyThread(pThreadGP,"Punjab");
		MyThread t3=new MyThread(pThreadGP,"Delhi");

		t1.start();
		t2.start();
		t3.start();

		ThreadGroup cThreadGP=new ThreadGroup("Pakistan");

		MyThread t4=new MyThread(cThreadGP,"Karachi");
		MyThread t5=new MyThread(cThreadGP,"Islamabad");
		MyThread t6=new MyThread(cThreadGP,"Lahore");

		t4.start();
		t5.start();
		t6.start();

		ThreadGroup dThreadGP=new ThreadGroup("Bangladesh");

		MyThread t7=new MyThread(dThreadGP,"Mirpur");
		MyThread t8=new MyThread(dThreadGP,"Dhaka");

		t7.start();
		t8.start();

		cThreadGP.interrupt();

		System.out.println(dThreadGP.activeCount() +"Bangladesh");
		System.out.println(pThreadGP.activeGroupCount());
		System.out.println(cThreadGP.getMaxPriority());

	}
	
}



