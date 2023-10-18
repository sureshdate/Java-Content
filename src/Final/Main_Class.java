package Final;

public class Main_Class extends Student {
	// final int ROLLNO=4;//this is blanck field non initialized final variable.

	public static void main(String[] args) {

		// final String NAME="Anuj";

//	Student obj=new Student();
//	Student obj2=new Student();
//	obj=obj2;//obj1 ke andar bhi object 2 ka referance and object 2 ke andar objet 1 ka refrance he
//  obj.name="Anuj";

		// object referance
//	   final Student obj=new Student();
//		Student obj2=new Student();
//		obj=obj2;
		// The final local variable obj cannot be assigned. It must be blank and not
		// using a compound assignment
		// but objectke andar value change kr sakte he..after making final also.
		// obj.name="Anuj";

		Main_Class obj = new Main_Class();
		obj.get_Description();
	}

}

//final keyword cannot be change
// final method cannot be overridden
// final class cannot be extended.
// a final variable can only be initilize once
// we must initilze final variable ,otherwise compiler will throw compile time
// error
// it good final variable in all caps

// final varibale is called blank final variable if its not initilized with
// declaration
// in case of referance final variable,internal state of the object pointed by
// that referance variable can be changed
//Also i we make student class as final then we cannot extend in main class.