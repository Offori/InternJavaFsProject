package synchronisationUnderConcurencyControl;

public class App {
	public static int counter=0;
	public static void main(String[] args) throws InterruptedException{
		Thread thread1=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++) {
					App.counter++;
				}
				System.out.println("Thread1 is over");
			}
		});
		Thread thread2=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++) {
					App.counter++;
				}
				System.out.println("Thread2 is over");
			}
		});
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("The value of counter is: "+App.counter);
	}
}
