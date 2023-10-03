package org.study.easy;

import org.study.easy.Phone.OnePlusFive;
import org.study.easy.Phone.Phone;

public class Hello {

	public static void main(String[] args) {
		Phone phone=new OnePlusFive();
		System.out.println(phone.processor());
		System.out.println(phone.SpaceInGb());
	}//two advantage of interface
	//there is restriction applied in your classes and u must implement unimplemented methods.
	//u can apply concept of polymorphism.//u can skip access modifier.

}
