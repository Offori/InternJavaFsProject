package animal;

public class bird extends animal{
	protected boolean feather=true;
	protected boolean canFly=true;

	public bird() {
		super();
		this.feather = true;
		this.canFly=true;
	}

	@Override
	public String showInfo() {
		return "bird [feather=" + feather + ", canFly=" + canFly + ", heighInFeet=" + heighInFeet + ", weightInKilo="
				+ weightInKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
}
