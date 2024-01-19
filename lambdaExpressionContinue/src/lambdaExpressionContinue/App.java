package lambdaExpressionContinue;

interface Lambda{
	public void demo();
}

public class App {
	public static void main(String[] args) {
		Lambda lambda=()->{
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};
		lambda.demo();
		Thread thread1=new Thread(()->System.out.println("I am inside thread 1"));
		thread1.start();
		Thread thread2=new Thread(()->{
			System.out.println("Thread 2");
			System.out.println("Thread 2 second line");
		});
		thread1.start();
		thread2.start();
	}
}
