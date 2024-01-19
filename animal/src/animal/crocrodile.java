package animal;

public class crocrodile extends reptile{

	public crocrodile() {
		super();
		// TODO Auto-generated constructor stub
		egg="Hard sheld";
	}

	@Override
	public String showInfo() {
		return "crocrodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heighInFeet=" + heighInFeet
				+ ", weightInKilo=" + weightInKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
}
