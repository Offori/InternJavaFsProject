package comparableInterface;

import java.util.Collections;
import java.util.LinkedList;
//import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names>{
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		// TODO Auto-generated method stub
		if(name.length()==obj.name.length()) {
			return 0;
		}else if(name.length()<obj.name.length()) {
			return -1;
		}else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
}

public class App {
	public static void main(String[] args) {
		/*List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
 
		App app = new App();
		app.printList(countries);
		System.out.println("****************************************");
		Collections.sort(countries);
		app.printList(countries);*/
		
		/*String x="a";
		String y="b";
		
		x.compareTo(y);*/
		
		List names=new LinkedList<>();
		names.add(new Names("Offori"));
		names.add(new Names("Ed"));
		names.add(new Names("John"));
		names.add(new Names("Mia"));
		
		App app=new App();
		app.printList(names);
		System.out.println("*****************************************");
		Collections.sort(names);
		app.printList(names);
	}
	void printList(List<Names> list) {
		ListIterator<Names> iterator=list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: "+ iterator.next());
		}
	}
}
