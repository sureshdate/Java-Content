package animal.fish;

public class Eel extends Fish{
	private String special;

	public Eel() {
		super();
		this.special="Realease electric shock";
	}

	@Override
	public String showInfo() {
		return "Eel [special=" + special + ", waterBone=" + waterBone + ", gills=" + gills + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	

}
