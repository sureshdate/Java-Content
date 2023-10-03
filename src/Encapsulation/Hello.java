package Encapsulation;

public class Hello {

	public static void main(String[] args) {
		Person john = new Person ();
		john.setName ("John");
		john.setAge (25);
		john.setGender ("Male");
		
		System.out.println (john.getName ());
		System.out.println (john.getAge ());
		System.out.println (john.getGender ());
	}

}
