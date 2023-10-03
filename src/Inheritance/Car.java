package Inheritance;

public class Car extends Vechile {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	public Car()
	{
		super();
		this.steering = "Power Steering";
	}
	public Car(String steering, String engine, int wheels, int seats, int fueTank, String lights) {
		super(engine,wheels, seats,fueTank,lights);
		this.steering = steering;
	}
	public String getSteering() {
		return steering;
	}
	@Override
	public String toString() {
		return "Car [getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTanks()=" + getFuelTanks() + ", getLights()=" + getLights() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	//The toString() method of the Object class helps us to return values of the object, so we don’t need to write much code.
	//In Java toString() method is used to get a String representation of an object.
	
	/*Rules for Java Method Overriding
	The method must have the same name as in the parent class
	The method must be IS-A relationship(inheritance)
	The method must have the same parameters as in the parent class.*/
	public void run()
	{
		System.out.println("Running Car");
		System.out.println(toString());
	}
}
