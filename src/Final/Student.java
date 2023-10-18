package Final;

public class Student {

	/*
	 * final int ROLL_NO; final String name;
	 * 
	 * // static { // name="Anuj"; // // }//Cannot make a static reference to the
	 * non-static field name
	 * 
	 * // public Student() { // name="Anuj"; // ROLL_NO=2; // }
	 */

	// REFERANCE FINAL VARIABLE
	// int ROLL_NO;
	// String name;

	// final method
	int roll_no;
	String name;

	public final void get_Description() {
		System.out.println("name is described");
	}

}
