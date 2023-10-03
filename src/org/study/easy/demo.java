package org.study.easy;

import org.study.easy.vechiles.Bike;

public class demo {

	public static void main(String[] args) {
		Bike bike=new Bike("long","diesel",4,4,40,"LED");
		/*System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());
		System.out.println(bike.getFuelTank());
		System.out.println(bike.getLights());
		System.out.println(bike.getSeats());
		System.out.println(bike.getWheels());*/
		
		//now we use toString method
		
        bike.run();
		
	}

}
