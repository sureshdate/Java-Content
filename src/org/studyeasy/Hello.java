package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		//Car car =new Car();
		
		//by using getter setter method
		/*car.setspeed(10);
		car.setEngine("on");
		car.setDoors("closed");
		car.setDrivers("seated");
		System.out.println(car.getspeed());
		System.out.println(car.getDoors());
		System.out.println(car.getDrivers());
		System.out.println(car.getEngine());*/
		
		//run method
		/*car.setspeed(10);
		car.setEngine("on");
		car.setDoors("closed");
		car.setDrivers("seated");
		
		System.out.println(car.run());*/
		
		
		/*In the following example, we did not use the object of the class to initialize the variable, rather all the variables have been initialized using a constructor.
		
		//When “Car” is instantiated within another “Hello” class, the default constructor of Car class gets invoked and initialized all the variables.
		Car car = new Car();
		System.out.println(car.run());*/
		
		
		/*//value provided during creation of object class
		Car car = new Car("closed","on", "seated", 10 );
	    System.out.println(car.run());*/
		
		
		/*SmartPhone phone =new SmartPhone();
		System.out.println(phone.getBrand());*/
	    
		SmartPhone phone = new SmartPhone("nokia");
		System.out.println (phone. getBrand ());
		
	}
	

}
