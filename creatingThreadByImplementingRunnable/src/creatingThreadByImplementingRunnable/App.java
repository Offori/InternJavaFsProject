package creatingThreadByImplementingRunnable;

import java.util.Random;

class myCounter implements Runnable{
	private int threadNo;

	public myCounter(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rand=new Random();
		for(int i=0;i<=9;i++) {
			try {
				Thread.sleep(rand.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is:"+i+"The number of Thread is: "+threadNo);
		}
	}
}

public class App {
	public static void main(String[] args) {
		/*Thread thread1=new Thread(new myCounter(1));
		Thread thread2=new Thread(new myCounter(2));
		thread1.start();
		thread2.start();*/
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<10;i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					System.out.println(i);
				}
				
			}
		});
		thread.start();
	}
}

