package org.studyeasy;

public class Car {

	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	
	/*public void setspeed(int speed)
	{
		this.speed=speed;
	}
	
	public int getspeed()
	{
		return speed;
	}
	
	public void setDoors(String doors){
		this.doors=doors;
	}

	public String getDoors() {
		return doors;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngine() {
		return engine;
	}
    
	public void setDrivers(String drivers) {
    	this.drivers=drivers;
    }
	public String getDrivers() {
		return drivers;
	}
	*/
	
	//default constructor
	public Car() {
		doors = "closed";
		engine = "on";
		drivers= "seated";
		speed = 10;
	}
	//parametrised constructor
	
	public Car(String doors,String engine,String drivers,int speed) {
		this.doors=doors;
		this.engine=engine;
		this.speed=speed;
		this.drivers=drivers;
		
	}
	
	public String run()
	{
		 if(doors.equals("closed") &&engine.equals("on") && drivers.equals("seated")&&speed>0) {
			 return "car is running";
		 }
		 else {
				return "car is not running";
			}
	}
	

}
