package org.study.easy;

import org.study.easy.parent.Non_vegan;
import org.study.easy.parent.Person;
import org.study.easy.parent.Vegan;

public class Hello {
	public static void main(String[]args)
	{
		/*Person john=new Vegan();
		john.speak();
		john.eat();
		System.out.println("************");
		Person aman=new Non_vegan();
		aman.speak();
		aman.eat();*/
		
		
//if there is requiremnet for multiple inheritance then use interface because multiple inheritance not supported in java
//multiple inheritance using interface//multiple inheritace not used in java because there is possibility of ambeguity
		Person john=new Vegan();
		john.breathe();
		john.speak();
		john.eat();
		john.message();
		
		
		
		
		
		
		
	}

}
