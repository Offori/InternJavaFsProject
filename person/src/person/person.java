package person;

public class person {
	public String name;
	public int age;
	public String gender;
	
	
	
	public person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public boolean setAge(int age) {
		if(age>=0&&age<100) {
			this.age = age;
			return true;
		}
		else return false;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "hello [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
