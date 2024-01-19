package abPerson;

import isAlive.isAlive;
import liveLife.liveLife;

public abstract class Person implements isAlive,liveLife{
	public void speak() {
		System.out.println("helo");
	}
	public abstract void eat();
}