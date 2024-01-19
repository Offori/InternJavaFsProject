package person;

public class hello {
	public static void main(String[] args) {
		//person John=new person();
		//System.out.println(John.age);
		person Pooja=new person("Pooja",26,"Female");
		System.out.println(Pooja);
		Pooja.setAge(-5);
		System.out.println(Pooja);
	}
}
