package lambdaExpressionWithVariableAndIteration;

import java.util.ArrayList;
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
		list.add(new Data("Offori"));
		list.add(new Data("Park"));
		list.add(new Data("Artk"));
		list.add(new Data("Alpha"));
		
//		for(Integer i:list) {
//			System.out.println(i);
//		}
		//forEach power
//		list.forEach(i->System.out.println(i));
		list.forEach(temp->{
				System.out.println(temp.getName());
		});
	}
}
