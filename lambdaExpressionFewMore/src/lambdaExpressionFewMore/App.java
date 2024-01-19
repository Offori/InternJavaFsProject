package lambdaExpressionFewMore;

interface Lamda {
	abstract public void demo(int x, float y);

}

public class App {
	public static void main(String[] args) {
		Lamda lamda = (int x, float y) -> {
			System.out.println("The value of x is :" + x + " and the value of y is: " + y);
			System.out.println("Statement from demo method");

		};

		lamda.demo(201, 503.12f);

	}

}
