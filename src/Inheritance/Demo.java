package Inheritance;

public class Demo {
	public static void main(String[]args)
	{
		/*Bike bike=new Bike();
		System.out.println(bike.getEngine());
		System.out.println(bike.getHandle());*/
		
		Car car =new Car("Power steering", "deisel", 4, 4, 40, "LED");
		/*System.out.println("Steering: "+car.getSteering());
		System.out.println("Engine type: "+car.getEngine());
		System.out.println("Number of seats: "+car.getSeats());
		System.out.println("Fuel tank capacity: "+car.getFuelTanks());
		System.out.println("Head lamp type: "+car.getLights());
		System.out.println("Number of wheels: "+car.getWheels());*/
		
		//System.out.println(car);//this gives hascode of object
		//System.out.println(car);//after writing to String method we dont need to write sysout statement.. directly print the object
		car.run();
		
		
		
	}

}
