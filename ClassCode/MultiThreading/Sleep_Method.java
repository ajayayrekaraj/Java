class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String[]args) throws InterruptedException{
		System.out.println(Thread.currentThread());

		MyThread obj=new MyThread();
		obj.start();
		Thread.sleep(5000);

		Thread.currentThread().setName("Ajay");
		System.out.println(Thread.currentThread());
	}
}

