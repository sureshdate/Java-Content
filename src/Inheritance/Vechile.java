package Inheritance;

public class Vechile {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTanks;
	private String lights;
	
	//we have already initialized the default value so no need to provide setter we will provide the only getter. So we are able to access the private method from the parent class.
	
	public Vechile()
	{
		this.engine="petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTanks = 35;
		this.lights = "LED";
		
	}
	public Vechile(String engine,int wheels,int seats,int fuelTanks,String lights) 
	{
		this.engine=engine;
		this.wheels=wheels;
		this.fuelTanks=fuelTanks;
		this.lights=lights;
		this.seats=seats;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTanks() {
		return fuelTanks;
	}

	public String getLights() {
		return lights;
	}
	
	public void run() {
		System.out.println( "Running vehicle");
	}
	
	
	
	

}
