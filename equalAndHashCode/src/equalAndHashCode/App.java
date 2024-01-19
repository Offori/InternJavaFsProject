package equalAndHashCode;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class code implements Comparable<code>{
	private String sectionNo;
	private String lectureNo;
	public code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		code other = (code) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
}

public class App{
	public static void main(String[] args) {
		Map<code,String> lectures=new TreeMap<>();
		lectures.put(new code("SO1","L03"), "Generic");
		lectures.put(new code("SO2","L01"), "File under Java");
		lectures.put(new code("SO1","L04"), "Network Programing");
		lectures.put(new code("SO2","L01"), "OOPS");
		lectures.put(new code("SO3","L02"), "Methods");
		lectures.put(new code("SO3","L04"), "Expressions");
		for(Map.Entry<code, String> entry: lectures.entrySet()) {
			//System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue());
		}
		String name1="offori";
		String name2="offori";
		System.out.println(name1==name2+"\n\n");//simple bolean comparison with output "True"
		System.out.println("**************************");
		
		String name3=new String("offori");
		String name4=new String("offori");
		System.out.println(name3==name4);//Using object with bolean comparison with output "False"
		
		System.out.println("Hash code name1:"+name1.hashCode()+"\n"+"Hash code name2:"+name1.hashCode());
		System.out.println("\n"+"use of '.equal' for string comparison\n"+name1.equals(name2));
		//with custom object .equals doesn't work properly.
		System.out.println("**************************");
		code code1=new code("SO1","L03");
		code code2=new code("SO1","L03");

		System.out.println("Hashcode code1: "+code1.hashCode()+"\n"+ "Hashcode code1: "+code2.hashCode());
		System.out.println(code1.equals(code2));
	}
}
