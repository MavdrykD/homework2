package homework4_3;

public class Car {
	private String model;
	private int age;
	private Body body;
	private Helm helm;
	private Wheel wheel;
	/* 
	 * Constructor
	 */
	public Car(String model, int age, String colour, int numberOfDoors, int numberOfWheel, int widthWheel, 
													String casing, int radiusHelm) {
		super();
		this.model = model;
		this.age = age;
		body = new Body(colour, numberOfDoors);
		helm = new Helm(casing, radiusHelm);
		wheel = new Wheel(numberOfWheel, widthWheel);
	}
	/*
	 *  Getters & Setters
	 */
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", age=" + age + ", body=" + body + ", helm=" + helm + ", wheel=" + wheel + "]";
	}
	/*
	 * Methods
	 */
	public void start(){
		System.out.println("start the car");
	}
	
	public void stop(){
		System.out.println("stop the car");
	}
	
	public void drive(){
		System.out.println("drive the car");
	}
	public void increaseRadiusHelm_x2() {
		this.helm.increaseRadiusHelm_x2();
	}
	public void increaseOneWheel(){
		this.wheel.increaseOneWheel();
	}
	public void changeColourToBlack(){
		this.body.changeColourToBlack();
	}
	
	
}
