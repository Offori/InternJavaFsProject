package staticSynchronization;

class Bracket{
	synchronized static public void Generate(String threadCode) {
		for(int i=0;i<10;i++) {
			if(i<5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println("Generate by thread:"+threadCode);
	}
}

public class App {
	public static void main(String[] args) {

		new Thread(new Runnable() {
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=0;i<=5;i++) {
					Bracket.Generate("Thread 1");
				}
				long endTime=System.currentTimeMillis();
				System.out.println("Thread 2 time's sleep\t"+(endTime-startTime));
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=0;i<=5;i++) {
					Bracket.Generate("Thread 2");
				}
				long endTime=System.currentTimeMillis();
				System.out.println("Thread 1 time's sleep\t"+(endTime-startTime));
			}
		}).start();
	}
}


