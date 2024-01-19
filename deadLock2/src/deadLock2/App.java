package deadLock2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
	public static void main(String[] args) {
		Lock lock1=new ReentrantLock();
		Lock lock2=new ReentrantLock();
		Thread thread1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				boolean flagLock1=false;
				boolean flagLock2=false;
				boolean doneFlag1=false;
				boolean doneFlag2=false;
				while(true) {
					try {
						flagLock2=lock1.tryLock(10, TimeUnit.MILLISECONDS);
						flagLock2=lock2.tryLock(10, TimeUnit.MILLISECONDS);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						if(flagLock1&& !doneFlag1) {
							System.out.println("I am inside thread 1 on lock 1");
							lock1.unlock();
							doneFlag1=true;
						}
						if(flagLock2&& !doneFlag2) {
							System.out.println("I am inside thread 1 on lock 2");
							lock2.unlock();
							doneFlag2=true;
						}if(flagLock1 && flagLock2) {
							break;
						}
					}
				}
			}
		});
		Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				boolean flagLock1=false;
				boolean flagLock2=false;
				boolean doneFlag1=false;
				boolean doneFlag2=false;
				while(true) {
					try {
						flagLock2=lock1.tryLock(10, TimeUnit.MILLISECONDS);
						flagLock2=lock2.tryLock(10, TimeUnit.MILLISECONDS);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						if(flagLock1&& !doneFlag1) {
							System.out.println("I am inside thread 2 on lock 1");
							lock1.unlock();
							doneFlag1=true;
						}
						if(flagLock2&& !doneFlag2) {
							System.out.println("I am inside thread 2 on lock 2");
							lock2.unlock();
							doneFlag2=true;
						}if(flagLock1 && flagLock2) {
							break;
						}
					}
				}
			}
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am inside main method");
	}
}
