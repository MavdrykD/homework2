package homework4_2;

public class Main {

	public static void main(String[] args) {
		EmployeeHourlyWage employeeHW = new EmployeeHourlyWage("Styvy", 25);
		employeeHW.setRateForHour(55);
		System.out.println(employeeHW.getName()+ " get "+employeeHW.getPaid()+ "$ salary for a month");
		
		EmployeeWithAMonthSalary employeeMS = new EmployeeWithAMonthSalary("Olya", 19);
		employeeMS.setMonthlyRate(7800);
		System.out.println(employeeMS.getName()+ " get "+employeeMS.getPaid()+ "$ salary for a month");

		
		
	}

}
