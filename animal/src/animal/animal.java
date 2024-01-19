package animal;

public class animal {
	protected float heighInFeet;
	protected float weightInKilo;
	protected String animalType;
	protected String bloodType;
	protected boolean canFly;
	
	public animal() {
		this.heighInFeet=0;
		this.weightInKilo=0;
		this.animalType="unknown";
		this.bloodType="unknown";
		this.canFly=true;
	}
	public String showInfo() {
		return "Animal [heighInFeet="+ heighInFeet +", weightInKilo="+ weightInKilo +", animalType=" +animalType+",bloodType="+bloodType+"]";
	}
}
