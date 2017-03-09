package homework4_2;

public class EmployeeWithAMonthSalary extends Employee implements Salary{
	public int monthlyRate;
	

	public EmployeeWithAMonthSalary(int monthlyRate) {
		super();
		this.monthlyRate = monthlyRate;
	}
	

	public int getMonthlyRate() {
		return monthlyRate;
	}


	public void setMonthlyRate(int monthlyRate) {
		this.monthlyRate = monthlyRate;
	}


	public EmployeeWithAMonthSalary(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPaid() {
		// TODO Auto-generated method stub
		return monthlyRate;
	}

	

}
