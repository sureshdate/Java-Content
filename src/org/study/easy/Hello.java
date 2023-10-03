package org.study.easy;

import org.study.easy.Phone.Nokia;
import org.study.easy.Phone.Phone;
import org.study.easy.Phone.Samsung;

public class Hello {

	public static void main(String[] args) {
		//multiple forms.
		//help us to provide multiple forms for a object.also known as let binding.dynamically we can bind 
		//some specific entity base don situation.
		
		/*Phone note8=new Phone("Note9");
		System.out.println(note8.getModel());
		note8.feature();
		
		Samsung note12=new Samsung("Note10");
		System.out.println(note12.getModel());
		note8.feature();*/ //this is normal java method
		
		Phone note8=new Samsung("Note9");
		System.out.println(note8.getModel());//this is polymorphism example
		note8.feature();
		
		Phone note10=new Nokia("nokia3300");
		System.out.println(note10.getModel());//this is polymorphism example
		note10.feature();
		
	}

}
