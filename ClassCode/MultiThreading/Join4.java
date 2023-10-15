class MyThread extends Thread{

	static Thread nmmain=null;
	public void run(){
		try{
			nmmain.join();
		}catch(InterruptedException ie){

		}
		for(int i=0;i<10;i++){
			System.out.println("In Thread-0");
		}
	}
}
class ThreadDemo{
	public static void main(String[]args)throws InterruptedException{

		MyThread.nmmain=Thread.currentThread();

		MyThread obj=new MyThread();
		obj.start();

		obj.join();

		for(int i=0;i<10;i++){
			System.out.println("In Main");
		}
	}
}

		
