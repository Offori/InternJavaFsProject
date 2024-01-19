package genericMethod;

import java.util.ArrayList;
import java.util.List;


public class App {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		Datas data=new Datas();
		data.prinListData(list1);
		System.out.println("*******************************************");
		
		List<String> list2=new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		data.prinListData(list2);
		System.out.println("************************************");
		System.out.println("************************************");
		
		String[] stringArray= {"1","2","3","4"};
		Integer[] IntData= {1,2,3,4};	
		Datas date=new Datas();
		date.printArrayData(stringArray);
		System.out.println("---------------------------");
		date.printArrayData(IntData);
		System.out.println("************************************");
		System.out.println(stringArray);
		System.out.println(IntData);
		
	}
}
