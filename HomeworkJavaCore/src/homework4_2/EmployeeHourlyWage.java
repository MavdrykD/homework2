package homework4_2;

public class EmployeeHourlyWage extends Employee implements Salary {
	private int rateForHour;
	
	

	public EmployeeHourlyWage(int rateForHour) {
		this.rateForHour = rateForHour;
	}
	

	public int getRateForHour() {
		return rateForHour;
	}


	public void setRateForHour(int rateForHour) {
		this.rateForHour = rateForHour;
	}


	public EmployeeHourlyWage(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPaid() {
		// TODO Auto-generated method stub
		return rateForHour * 8 * 24;
	}
	
}
