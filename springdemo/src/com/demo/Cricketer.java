package com.demo;

public class Cricketer implements Player {
	int jersey;
	String name;

	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cricketer(int jersey, String name) {
		super();
		this.jersey = jersey;
		this.name = name;
	}

	public int getJersey() {
		return jersey;
	}

	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cricketer eat salad");
	}

	@Override
	public void exerscise() {
		// TODO Auto-generated method stub
		System.out.println("cricketer go to gym");
	}

}
