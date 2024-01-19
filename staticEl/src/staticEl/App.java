package staticEl;

public class App {
	public static void main(String[] args) {
		testSta obj1=new testSta();
		System.out.println(obj1.getStaticV());
		obj1.setStaticV(1);
		System.out.println(obj1.getStaticV());
		
		testSta obj2=new testSta();
		System.out.println(obj2.getStaticV());
		obj2.setStaticV(4);
		System.out.println(obj2.getStaticV());
		
		testSta obj3=new testSta();
		System.out.println(obj3.getStaticV());
		obj3.setStaticV(9);
		System.out.println(obj3.getStaticV());
	}
}
