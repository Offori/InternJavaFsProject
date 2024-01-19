package linkList;

import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		LinkedList<String> countries=new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		System.out.println(countries);
		
		new App().printLinkedList(countries);
		System.out.println("Add anotehr country between the India and USA");
		countries.add(1, "Canada");
		new App().printLinkedList(countries);
		countries.add("brazil");
		new App().printLinkedList(countries);
		countries.set(7, "Brazil");
		new App().printLinkedList(countries);
		System.out.println("******************************************");
		countries.remove();
		new App().printLinkedList(countries);
	}
	void printLinkedList(LinkedList<String> list) {
		for(String elt: list) {
			System.out.println("Element: "+ elt);
		}
		System.out.println("********************************************");
	}
}
