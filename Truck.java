package model;

public class Truck extends Vehicle {
	private String engineBreakModel; 
	
	public Truck() {
		super();
	}
	
	public Truck(String engineBreakModel, String brand, String model, int horsepower, int wheels) {
		super(brand, model, horsepower, wheels);
		this.engineBreakModel = engineBreakModel;
	}

	public String getEngineBreakModel() {
		return engineBreakModel;
	}

	public void setEngineBreakModel(String engineBreakModel) {
		this.engineBreakModel = engineBreakModel;
	}

	@Override
	void message() {
		System.out.print("I'm a truck");
	}
}
