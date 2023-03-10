package com.springdemo2;

public class Laptop {
	Charger c;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(Charger c) {
		super();
		this.c = c;
	}

	public Charger getC() {
		return c;
	}

	public void setC(Charger c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Laptop [c=" + c + "]";
	}

}
