package somthingMore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

class Name implements Comparable<Name>{
	private String name;

	public Name(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return getName().compareTo(o.getName());
	}
}

public class App {
	public static void main(String[] args) {
		Set<Name> set=new HashSet<>();
		set.add(new Name("Chaand"));
		set.add(new Name("Offori"));
		set.add(new Name("Christian"));
		set.add(new Name("Charles"));
		set.add(new Name("BLack"));
		set.add(new Name("Chaand"));//Chaand will be printed only oncecuz of set operation
		
		List<Name> list1=new ArrayList<>();
		list1.addAll(set);
		Collections.sort(list1);
		for(Name name:list1) {
			System.out.println(name);
		}
		System.out.println(Collections.binarySearch(list1, new Name("Offori")));
		//*********************************************************************************
		Queue<Integer> q=new ArrayBlockingQueue<>(6);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		
		System.out.println("*********************************************");
		
		List<Integer> list=new ArrayList<>();
		list.addAll(q);
		for(Integer elt: list) {
			System.out.println(elt);
		}
	}
}
