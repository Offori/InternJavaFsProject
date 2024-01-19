package laptop;

public class hello {

	public static void main(String[] args) {
		//Laptop lappy = new Laptop();		//System.out.println(lappy.getProcessor().getBrand());
		
		processor processor = new processor("intel", "7200U", 7, 4, 4, "6MB"
				+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		graphics graphicsCard = new graphics("Nvidia", 1050, "4GB");
		
		laptop gamingLaptop = new laptop(17f, processor,
				"DDR4", "2TB", graphicsCard, null, "backlit");
		
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println("Gaming mode on");
		System.out.println("Current frequency: "+gamingLaptop.getProcessor().getFrequency());

	}

}