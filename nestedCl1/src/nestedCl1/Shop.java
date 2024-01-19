package nestedCl1;

public class Shop {
	public static void main(String[] args) {
		Door door=new Door();
		if(door.getLocked().isUnlocked(args[0])) {
			System.out.println("welcom we are open");
		}else {
			System.out.println("We are closed now, please visit later");
		}
	}
}
