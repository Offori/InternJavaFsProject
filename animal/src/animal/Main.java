package animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static List<animal> animals=new ArrayList<>();
	public static void main(String[] String) {
		//animal animal=new animal();
		//System.out.println(animal.showInfo());
		//reptile reptile=new reptile();
		//System.out.println(reptile.showInfo());
		//crocrodile croc=new crocrodile();
		//System.out.println(croc.showInfo());
		//Eel eel=new Eel();
		//System.out.println(eel.showInfo());
		//bird bird=new bird();
		//System.out.println(bird.showInfo());
		
		animal animal=new animal();
		animal reptile=new animal();
		animal croc=new animal();
		animal eel=new animal();
		animal eagle=new animal();
		
		animals.add(animal);
		animals.add(reptile);
		animals.add(croc);
		animals.add(eel);
		animals.add(eagle);
		listAnimals(animals);
	}
	public static void listAnimals(List<animal> animal) {
		for(animal animal1 : animals) {
			System.out.println(animal1.showInfo());
		}
	}
}
