class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo{
	public static void main(String[]args){
		ThreadGroup pthreadGP=new ThreadGroup("DELL");

		MyThread obj1=new MyThread(pthreadGP,"DELL-Inspiron-3511");
		MyThread obj2=new MyThread(pthreadGP,"DELL-Vostro");
		MyThread obj3=new MyThread(pthreadGP,"DELL-Latitude");

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"AlienWare");

		MyThread obj4=new MyThread(cthreadGP,"Alienware x17R2");
		MyThread obj5=new MyThread(cthreadGP,"New Alienware 17");
		
		obj4.start();
		obj5.start();
	}
}
