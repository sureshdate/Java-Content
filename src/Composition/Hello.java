package Composition;

public class Hello {

	public static void main(String[] args) {
		//Laptop lappy=new Laptop();
		//System.out.println(lappy.getProcessor().getBrand());
	
	   //Adding Functionalities
		//The same concept is described here when the attributes of processor class are accessed by the Demo class via Laptop.
		
		Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6MB"
				+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
	
		Laptop gamingLaptop = new Laptop(17f, processor,
				"DDR4", "2TB", graphicsCard, null, "backlit");
		
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();	
		System.out.println("Gaming mode on");
		System.out.println("currentFrequency:"+gamingLaptop.getProcessor().getFrequency());
	}

}
