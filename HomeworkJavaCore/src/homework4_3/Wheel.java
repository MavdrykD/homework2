package homework4_3;

import com.sun.org.apache.regexp.internal.recompile;

public class Wheel {
	private int numberOfWheel;
	private int widthWheel;
	/* 
	 * Constructor
	 */
	public Wheel(int numberOfWheel, int widthWheel) {
		super();
		this.numberOfWheel = numberOfWheel;
		this.widthWheel = widthWheel;
	}
	/*
	 *  Getters & Setters
	 */
	public int getNumberOfWheel() {
		return numberOfWheel;
	}
	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
	public int getWidthWheel() {
		return widthWheel;
	}
	public void setWidthWheel(int widthWheel) {
		this.widthWheel = widthWheel;
	}


	@Override
	public String toString() {
		return "Wheel [numberOfWheel=" + numberOfWheel + ", widthWheel=" + widthWheel + "]";
	}
	/*
	 * Methods
	 */
	public int increaseOneWheel(){
		System.out.println("car has " +(getNumberOfWheel() + 1)+ " dors");
		return getNumberOfWheel(); 
	}
	
}
