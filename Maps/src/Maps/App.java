package Maps;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		Map<Integer,String> student=new HashMap<>(10);

		student.put(3,"Pearce");
		student.put(1,"Rahul");
		student.put(2,"Offori");
		for(Map.Entry<Integer, String> entry:student.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value\t: "+entry.getValue()+"\n");
		}
		System.out.println("Get value only: "+student.get(3));
		System.out.println("\n\n*************With KeySet*******************");
		System.out.println("\n");
		for(Integer key: student.keySet()) {
			System.out.println("Key: "+key+"Value: "+student.get(key));
		}
		//Iterator:
		Iterator<java.util.Map.Entry<Integer, String>> entry = student.entrySet().iterator();
		while(entry.hasNext()) {
			java.util.Map.Entry<Integer,String> temp=entry.next();
			System.out.println("Key: "+temp .getKey()+" Value: "+temp.getValue());
		}
	}
}
