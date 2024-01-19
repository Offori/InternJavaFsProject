package nesteCl;

import Door.Door;

public class shop {
	public static void main(String[] args) {
		Door door=new Door();
		System.out.println(door.isLocked("qwerty"));
	}
}
