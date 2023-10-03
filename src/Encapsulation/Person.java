package Encapsulation;

public class Person {
	private String name;
	private int age;
	private String gender;
		
	public void setName(String name) {
		this.name = name;
	}
	public Boolean setAge(int age) {
		if(age>=0 && age<=100) {
			this.age=age;
			return true;
		}
		return false;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}


//In Java, Encapsulation is the process of binding the class members (variables and methods) into a single unit. It protects the data of class to be accessed from outside the class.

//In Encapsulation, we hide the implementation details from the outer class and provided them the controlled access to the class.
//Encapsulation can be achieved by declaring the instance variables as private. However, we can access the private variable through the getter and setter method. setter method used to update ( void setAge() ) and getter method is used to read (int getAge() ) the value  of private variable.