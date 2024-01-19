package lambdaExpressionMore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
	private String Name;

	public Data(String name) {
		super();
		Name = name;
	}

	@Override
	public String toString() {
		return "Data [Name=" + Name + "]";
	}

	public String getName() {
		return Name;
	}
}

public class App {
	public static void main(String[] args) {
		List<Data> list=new ArrayList<>();
		list.add(new Data("Chaand"));
		list.add(new Data("Christ"));
		list.add(new Data("Albd"));
		list.add(new Data("Beldr"));
		list.add(new Data("Edit"));
		
		/*Collections.sort(list, new Comparator<Data>() {
			@Override
			public int compare(Data o1, Data o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});*/
		//lambda power
		/*Collections.sort((List<Data>) list, (Comparator<? super Data>) (Data o1,Data o2)->o1.getName().compareTo(o2.getName()));*/
		Collections.sort(list, new Comparator<Data>() {
			@Override
			public int compare(Data o1, Data o2) {
				// TODO Auto-generated method stub
				if(o1.getName().length()<o2.getName().length()) {
					return -1;
				}else if(o1.getName().length()>o2.getName().length()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
		for(Data data:list) {
			System.out.println(data.getName());
		}
	}
}
