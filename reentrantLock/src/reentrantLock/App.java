package reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
	public static int counter=0;
	static Lock lock=new ReentrantLock();
	public static void main(String[] args) throws InterruptedException{
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				lock.lock();
				try {
					for(int i=0;i<100;i++) {
						App.counter++;
					}
				} finally {
					// TODO Auto-generated catch block
					lock.unlock();
				}
			}
		});
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				lock.lock();
				try {
					for(int i=0;i<100;i++) {
						App.counter++;
					}
				} finally {
					// TODO Auto-generated catch block
					lock.unlock();
				}
			}
		});
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("The value of counter App "+App.counter);
	}
}
