package setTypes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		for(int i=30;i>0;i--) {
			set.add(i);
		}
		for(int i:set) {
			System.out.println(i);
		}//with set the order is not kept.
		System.out.println("linked hash set keeps the order*************************************************");
		Set<Integer> linkSet=new LinkedHashSet<>();
		for(int i=30;i>0;i--) {
			linkSet.add(i);
		}
		for(int i:linkSet) {
			System.out.println(i);
		}//Linked hash set keeps the order
		System.out.println("Tree set keeps the order of the next priority*************************************************");
		Set<String> treeSet=new TreeSet<>();
		for(int i=30;i>0;i--) {
			treeSet.add("A"+i);
		}
		for(String i:treeSet) {
			System.out.println(i);
		}//Tree set keeps the order of the next priority
	}
}
