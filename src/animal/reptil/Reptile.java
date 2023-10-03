package animal.reptil;

import animal.Animal;

public class Reptile extends Animal {
	protected String skin,eggs;
	protected boolean backbone;
	public Reptile()
	{
		height=5;
		weight=20;
		animalType="REPTILE";
		bloodType="cold";
		this.skin="Dry skin";
		this.eggs="soft shelled";
		this.backbone=true;
	}
	@Override
	public String showInfo() {
		return "Reptile [skin=" + skin + ", eggs=" + eggs + ", backbone=" + backbone + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
