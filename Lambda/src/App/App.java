package App;

interface Lambda{
	public void demo();
}

public class App {
	public static void main(String[] args) {
		Lambda lambda=new Lambda() {
			@Override
			public void demo() {
				// TODO Auto-generated method stub
				System.out.println("Statement 1");
			}
		};
		lambda.demo();
		//short expression//power of lambda
		Lambda lambda1=()->System.out.println("Statement 2");
		Lambda lambda2=()->{
			System.out.println("Statement 3");
			System.out.println("Statement 4");
		};
		lambda1.demo();
		lambda2.demo();
	}
}
