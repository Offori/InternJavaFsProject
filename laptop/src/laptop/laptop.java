package laptop;

import java.util.concurrent.Flow.Processor;

public class laptop {

	private float screen;
	private processor processor;
	private String ram;
	private String hardDrive;
	private graphics graphicsCard;
	private String opticalDrive;
	private String keyboard;

	public laptop() {

		this.screen = 15.6f;
		this.processor = new processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard = new graphics();
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}

	public laptop(float screen, processor processor, String ram, String hardDrive, graphics graphicsCard,String opticalDrive, String keyboard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public processor getProcessor() {
		return processor;
	}

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public graphics getGraphicsCard() {
		return graphicsCard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}
    public String gamingMode(){
    	processor.setFrequency(processor.getMaxfrequency());
    	return "Success";
    }

}