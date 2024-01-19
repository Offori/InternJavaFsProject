package innerSta;

public class Outer {
	private int testV=5;
	private static void testOuterMethod() {
		// TODO Auto-generated method stub
		System.out.println("test outer method");
	}
	public static class Inner{
		public static int x=0;
		public static void testInnerMethod() {
			System.out.println("Testing Inner class");
			System.out.println("test Variable: "+new Outer().testV);
			testOuterMethod();
		}
	}
}
