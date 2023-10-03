package org.study.easy.parent;

public class Vehicle {
	private String Engine;
	private int Wheels;
	private int Seats;
	private int FuelTank;
	private String Lights;
	
	public Vehicle()
	{
		this.Engine="petrol";
		this.Wheels=4;
		this.Seats=4;
		this.FuelTank=35;
		this.Lights="LED";
	}
	
	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		super();
		Engine = engine;
		Wheels = wheels;
		Seats = seats;
		FuelTank = fuelTank;
		Lights = lights;
	}

	public String getEngine() {
		return Engine;
	}
	
	public int getWheels() {
		return Wheels;
	}
	
	public int getSeats() {
		return Seats;
	}
	
	public int getFuelTank() {
		return FuelTank;
	}

	public String getLights() {
		return Lights;
	}
	public void run()
	{
		System.out.println("Running a vechile");
		System.out.println(toString());
	}
	
}