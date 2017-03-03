package homework2;

public class Adult extends Human{
	
	private Job job;
	private int money;
	
	public Adult(String name, int age) {
		super(name, age);
		
	}

	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		money = job.getPayment() + money;
		this.job = job;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
