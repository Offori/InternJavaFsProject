package autoBoxingUnboxing;

import java.util.ArrayList;

class intWrapper{
	public int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}

public class App {
	public static void main(String[] args) {
		/*ArrayList<Integer> studentNo=new ArrayList<>();
		studentNo.add(25);
		System.out.println(studentNo.get(0));*/
		ArrayList<intWrapper> studentNo=new ArrayList<>();
		studentNo.add(new intWrapper(12));//boxing
		System.out.println(studentNo.get(0).getIntValue());//unboxing
		
		ArrayList<Double> demoList=new ArrayList<>();
		//demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0));//autoboxing
		System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue());//unboxing
		
	}
}
