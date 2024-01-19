package enumJava;

public class Demo {
	public static final int COREJAVA=1;
	public static final int COLLECTIONS=2;
	public static final int GENERICS=3;
	public static final int JSPANDSERVLETS=4;
	public static final int MUILTITHREADING=5;
public static void main(String[] args) {
		Learning learn = Learning.COREJAVA;
		
		switch(learn){
		case COLLECTIONS:
			System.out.println("Step 2 : Learning Collections framework");
			break;
		case COREJAVA:
			System.out.println("Step 1 : learning Core Java");
			break;
		case GENERICS:
			System.out.println("Step 3 : Learning Generics ");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4 : Learning JSP and Servlets");
			break;
		case MUILTITHREADING:
			System.out.println("Step 5 : Learning MuiltThreading");
			break;
		default:
			System.out.println("Element not in the enumarated list");
			break;
		
		}
		
	}
}