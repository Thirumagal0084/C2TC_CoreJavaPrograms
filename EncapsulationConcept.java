package tnsif.oopsconcepts;

//Hogwarts houses - Ravenclaw, Hufflepuff, Slytherin

public class Encapsulation {
	
	//instance variable
	private String House;
	private int Founder;
	private int Colour;
	
	
	//Applying Getters and Setters
	public String getHouse() {
		return house;
	}
	
	public void setHouse(String house) {
		this.house = house;
	}

	public int getFounder() {
		return founder;
	}

	public void setFounder(int founder) {
		this.founder = founder;
	}

	public int getColour() {
		return colour;
	}

	public void setColour(int colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Encapsulation [house=" + house + ", founder=" + founder + ", colour=" + colour + "]";
	}
	

	
	
	
}
