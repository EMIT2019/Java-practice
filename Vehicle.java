package model;

public abstract class Vehicle {
	private String brand;
	private String model; 
	private int horsePower;
	private int wheels; 
	
	public Vehicle() {
		
	}
	
	public Vehicle(String brand, String model, int horsepower, int wheels) {
		this.brand = brand; 
		this.model = model; 
		this.horsePower = horsepower; 
		this.wheels = wheels; 
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	} 
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	abstract void message();
}
