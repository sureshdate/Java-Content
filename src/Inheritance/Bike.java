package Inheritance;

public class Bike extends Vechile {
	private String handle;
	
	public Bike()
	{
		this.handle="short";
	}
	//Parent class parameterized constructor is called in child class using super ().super () should be the written in the first line inside the constructor

	public Bike( String handle) {
		super();
		this.handle=handle;
	}

	public String getHandle() {
		return handle;
	}
}
