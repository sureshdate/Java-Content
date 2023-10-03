package study.easy;

public class Car {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	//we can initialze throgh here value here also.
	//there r two constructor one is default and other is parameteried constructor
	 //constructor is a method as same name to class
	public Car()
	{
		doors=doors;
		driver=driver;
		engine=engine;
		speed=speed;
	}

	public Car(String doors, String engine, String driver, int speed) {
		
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	// if u want to acheive encapsulation u have to use getter setter method.
//	public void setSpeed(int speed) {
//		this.speed = speed;// u have to use this keyword for avoid ambeguity
//	}

	public int getSpeed() {
		return speed;
	}

//	public void setDoors(String doors) {
//		this.doors = doors;
//	}

	public String getDoors() {
		return doors;
	}

	public String getEngine() {
		return engine;
	}

//	public void setEngine(String engine) {
//		this.engine = engine;
//	}

	public String getDriver() {
		return driver;
	}

//	public void setDriver(String driver) {
//		this.driver = driver;
//	}
   public String run()
   {
	   if(doors.equals("closed") && engine.equals("on")&&
			   driver.equals("seated")
			   && speed>0)
	   {
		   return "running";
	   }
	   else {
		   return "not running";
	   }
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
