package phone;

public class phone {
	private String model;

	public phone(String model) {
		this.model = model;
	}
	public void features() {
		System.out.println("Features phone");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
