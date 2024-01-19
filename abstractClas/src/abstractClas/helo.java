package abstractClas;

import NonVegan.noVegan;
import Vegan.Vegan;
import abPerson.Person;

public class helo {
	public static void main(String[] args) {
		Person john=new Vegan();
		john.speak();
		john.eat();
		System.out.println("***************************");
		Person Mia=new noVegan();
		Mia.eat();
		Mia.speak();
	}
}
