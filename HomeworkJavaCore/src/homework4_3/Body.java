package homework4_3;

public class Body {
	private String colour;
	private int numberOfDoors;
	/* 
	 * Constructor
	 */
	public Body(String colour, int numberOfDoors) {
		super();
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
	}
	/*
	 *  Getters & Setters
	 */
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	
	@Override
	public String toString() {
		return "Body [colour=" + colour + ", numberOfDoors=" + numberOfDoors + "]";
	}
	/*
	 * Methods
	 */
	public void changeColourToBlack(){
		setColour("black");
		System.out.println("colour of body is "+getColour());
	}
	
}
