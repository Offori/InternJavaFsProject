package polymorphism;

import nokia.nokia;
import phone.phone;
import samsung.sumsung;

public class hello {
	public static void main(String[] args) {
		phone phone=new phone("Nokia 3310");
		System.out.println(phone.getModel());
		phone.features();
		sumsung not8=new sumsung("Not8");
		System.out.println(not8.getModel());
		not8.features();
		
		phone nokia3301=new hello().phone(1);
		System.out.println(nokia3301.getModel());
		nokia3301.features();
		
		phone note81=new hello().phone(2);
		System.out.println(not8.getModel());
		note81.features();
	}
	public phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new nokia("3301");
		case 2: return new sumsung("not5");
		}
		return null;
	}
}
