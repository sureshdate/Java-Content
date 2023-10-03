package org.study.easy.parent;

public abstract class Person implements isAlive,LiveLife {
 public void speak()
 {
	 System.out.println("share his/her thoughts");
 }
 
 @Override
 public void breathe() {
	 System.out.println("be alive,remain life");
 }
 @Override
 public void message() {
	 System.out.println("life is journey,keep moving");
 }
 
 public abstract void eat();
 //when to use abstarct class or interface
 //vegan is a person nonvegan is a person.realation between classes are a is a realation then use make of abstarct class
 //else use interface. relataion for interface can realation
 
}
