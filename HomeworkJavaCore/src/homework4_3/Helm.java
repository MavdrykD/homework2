package homework4_3;

public class Helm {
	private String casing;
	private int radiusHelm;
	/* 
	 * Constructor
	 */
	public Helm(String casing, int radiusHelm) {
		super();
		this.casing = casing;
		this.radiusHelm = radiusHelm;
	}
	/*
	 *  Getters & Setters
	 */
	public String getCasing() {
		return casing;
	}
	public void setCasing(String casing) {
		this.casing = casing;
	}
	public int getRadiusHelm() {
		return radiusHelm;
	}
	public void setRadiusHelm(int radiusHelm) {
		this.radiusHelm = radiusHelm;
	}

	@Override
	public String toString() {
		return "Helm [casing=" + casing + ", radiusHelm=" + radiusHelm + "]";
	}
	/*
	 * Methods
	 */
	public int increaseRadiusHelm_x2(){
		System.out.println("now radis of helm = " + (getRadiusHelm() * 2) + "sm");
		return getRadiusHelm() * 2;
	}
	
}
