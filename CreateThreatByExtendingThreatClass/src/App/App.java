package App;

class myCounter extends Thread{
	private int threadNo;

	public myCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		countNoThreadNo();
	}
	void countNoThreadNo(){
		for(int i=1;i<=10;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Values of i:"+i+" "+" Thread No: "+threadNo);
		}
	}
}

public class App {
	public static void main(String[] args) {
		myCounter counter1=new myCounter(1);
		myCounter counter2=new myCounter(2);
		long startTime=System.currentTimeMillis();
		counter1.start();//run should be called with JVM
		System.out.println("******************");
		counter2.start();//run should be called with JVM
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Total time requiered to process operation is:"+(endTime-startTime));
	}
}
