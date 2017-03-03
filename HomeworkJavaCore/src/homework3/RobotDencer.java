package homework3;

public class RobotDencer extends Robot{

	public RobotDencer(String name, int age) {
		super(name, age);
	}
	
	public void work(){
		System.out.println("Я " +getName()+ " - я просто танцюю");
	}
}
