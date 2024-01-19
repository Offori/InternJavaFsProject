package animal;

public class reptile extends animal{
	protected String skin,egg;
	protected boolean backbone;
	
	public reptile() {
		heighInFeet=5;
		weightInKilo=20;
		animalType="Reptile";
		bloodType="cold";
		this.skin="Dry skin";
		this.egg="soft sheld";
		this.backbone=true;
	}

	@Override
	public String showInfo() {
		return "reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heighInFeet=" + heighInFeet
				+ ", weightInKilo=" + weightInKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
}
