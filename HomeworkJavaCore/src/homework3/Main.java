package homework3;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot("RobotBoss", 30);
		robot.work();
		
		CoffeRobot coffeRobot = new CoffeRobot("CoffeRobot", 20);
		coffeRobot.work();
		
		RobotDencer robotDencer = new RobotDencer("RobotDencer", 20);
		robotDencer.work();
		
		RobotCoocker robotCoocker = new RobotCoocker("RobotCoocker", 20);
		robotCoocker.work();
		
		Robot [] massRobot = {robot, coffeRobot, robotCoocker, robotDencer};
		for (int i = 0; i < massRobot.length; i++) {
			massRobot[i].work();
		}

	}

}
