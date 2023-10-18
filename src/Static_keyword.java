
public class Static_keyword {

	/*
	  public static class Peson {
	  
	  int age; String name; static String breed="Homo Sapiens"; //the field breed
	  type cannot be declared static in non-static inner type,unless initialize
	  with //constant expression.. }
	 */

	public static void main(String[] args) {

		// System.out.println(Math.PI);

		A obja = new A();
		A.B objb = obja.new B();// class b is not static.

		A.C objc = new A.C();// here class c is static thats why we have to not make object of A(outer class)

	}

}

//static keyword indicates that the particular member belongs to type itself rather than to an instance of that type.
//It is used to help memory management.//The keyword can apply to variables,methods,blocks,nested class
//in simple words static means no change in value..

//we cannot declare a top level class with static modifier,but we can declare a nested class as a static.
//in block  static  used when we have to initialize data before main class ..then we use static.
