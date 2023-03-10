package com.springdemo2;

public class Charger {
	String brand;
	float power;

	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Charger(String brand, float power) {
		super();
		this.brand = brand;
		this.power = power;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", power=" + power + "]";
	}

}
