package animal.reptil;

public class Crocodile extends Reptile {

	public Crocodile() {
		super();
		eggs="hard shelled";
	}

	@Override
	public String toString() {
		return "Crocodile [skin=" + skin + ", eggs=" + eggs + ", backbone=" + backbone + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
 
}
