package homework3;

public class RobotCoocker extends Robot{

	public RobotCoocker(String name, int age) {
		super(name, age);
	}
	
	public void work(){
		System.out.println("Я " +getName()+ " - я просто готую");
	}

}
