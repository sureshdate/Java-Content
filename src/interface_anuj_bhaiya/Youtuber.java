package interface_anuj_bhaiya;

public abstract interface Youtuber {
	
	public  void make_videos();

}
//we cannot make object of interface.
//any attribute of interface is public,static,final so we dont need to provide access modifiers to the attributes but 
//continue//if we do,compiler doesent complain about it eighter.
//
//no any costrutor possible in interface
//we cant instantiate interface in java
//interface can have method and body
//by default any 
//interface is by default public & abstract method and class,it makes total sense because method dont have any body so that subclass can provide its method implementation.
//interface cant extend any class but it can extend any other interface

