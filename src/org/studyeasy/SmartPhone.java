package org.studyeasy;

public class SmartPhone {
   //In Smartphone class we do not write any constructor so JVM will add a default constructor in the class and properties of the Smartphone class will be initialized using this default constructor.
    /* private String brand="samsung";
     
     public String getBrand() {
    	 return brand;
     }
      */
	
     private String brand;
	
    //parameterise constructor 
	public SmartPhone(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	









}
