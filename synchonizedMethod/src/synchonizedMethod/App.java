package synchonizedMethod;

class Bracket{
	public void Generate() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i<5) {
					System.out.print("[");
				}else {
					System.out.print("]");
				}
			}
			System.out.println();
		}
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App {
	public static void main(String[] args) {
		Bracket bracket=new Bracket();
		bracket.Generate();
		new Thread(new Runnable() {
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=0;i<=5;i++) {
					bracket.Generate();
				}
				long endTime=System.currentTimeMillis();
				System.out.println("Thread 2 time's sleep\t"+(endTime-startTime));
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=0;i<=5;i++) {
					bracket.Generate();
				}
				long endTime=System.currentTimeMillis();
				System.out.println("Thread 1 time's sleep\t"+(endTime-startTime));
			}
		}).start();
	}
}
