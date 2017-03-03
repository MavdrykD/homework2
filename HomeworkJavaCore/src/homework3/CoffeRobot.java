package homework3;

public class CoffeRobot extends Robot {
	

	public CoffeRobot(String name, int age) {
		super(name, age);
		
	}
	public void work(){
		System.out.println("Я " +getName()+ " - я варю каву");
	}

}
