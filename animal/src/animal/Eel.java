package animal;

public class Eel extends fish{
	private String special;

	public Eel() {
		super();
		this.special = "Release an electric stock";
	}

	@Override
	public String showInfo() {
		return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", heighInFeet="
				+ heighInFeet + ", weightInKilo=" + weightInKilo + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
}
