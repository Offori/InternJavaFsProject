package arrayList;

import java.util.ArrayList;

public class App {
	static ArrayList<String> listNames=new ArrayList<>();
	public static void main(String[] args) {
		listNames.add("Offori");
		listNames.add("Christ");
		listNames.add("char");
		listNames.add("charl");
		listNames.add("John");
		listNames.add("Black");
		listNames.add("White");
		listNames.add("offo");
		//System.out.println(listNames.get(0));
		System.out.println(listNames);
		
		App app=new App();
		/*app.displayList(listNames);
		app.removeNamesByPosition(0);
		System.out.println("*****************");
		app.displayList(listNames);
		System.out.println("****************************");
		app.removeNamesByString("offo");
		app.displayList(listNames);
		System.out.println("****************************");
		System.out.println(listNames.get(3));*/
		app.modifyName(3, "Emma");
		System.out.println("**************************************");
		app.displayList(listNames);
		System.out.println("*********************************print position of the an element");
		int positionEl=app.search("John");
		System.out.println(positionEl);
	}
	void displayList(ArrayList<String> names) {
		for(String name: names) {
			System.out.println(names);
		}
	}
	void removeNamesByPosition(int position) {
		listNames.remove(position);
	}
	void removeNamesByString(String name) {
		listNames.remove(name);
	}
	void modifyName(int position,String newName) {
		listNames.set(position, newName);
	}
	int search(String name) {
		return listNames.indexOf(name);
	}
}
