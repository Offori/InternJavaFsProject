package countDownLatches;

import java.util.concurrent.CountDownLatch;

class someThread extends Thread{
	private CountDownLatch latch;

	public someThread(CountDownLatch latch) {
		super();
		this.latch = latch;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running with Thread name "+Thread.currentThread().getName());
		System.out.println("Thread execution completed");
		System.out.println("***************************");
	}
}

public class App {
	public static void main(String[] args) {
		CountDownLatch latch=new CountDownLatch(4);
		someThread thread1=new someThread(latch);
		someThread thread2=new someThread(latch);
		someThread thread3=new someThread(latch);
		someThread thread4=new someThread(latch);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("I am in main thread"+Thread.currentThread().getName());
	}
}
