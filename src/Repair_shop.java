
public class Repair_shop {
	public static void repairCar(Car car) {
		System.out.println(" car is repaired");
		
	}
	
	public static void main(String[] args) {
		Wagnor wagnor=new Wagnor();
		Audi audi=new Audi();
		repairCar(wagnor);
		repairCar(audi);
		
		
	}

}
//Data abstraction is a process of hiding certain details and showing only essesntial information yo the user.
//it helps reduce programming complexitivity and efforts
//abstraction can be achieved by eighter abstract classes or interfaces.//a class is declared using abstract keyword is known as abstract class
//it can have abstract method(methods withought body)as well as concrete methods(regular methods with body)
//a normal class(non-abstract class) cannot have abstract method
//an abstract class cannot be instantiated,which means you are not allowed to create an object of it.
//abstarct class must be extended in same way abstract method must be overidden.



//difference between abstract and encapsulation
//abstraction is about hiding unwanted details and showing most essential information
//encapsulation means hiding the internal details or mechanism of how an object does something for security reson.
