package homework2;

public class Man {
	private String name;
	private int money;
	private Job job;
	private Gold [] golds = new Gold[3];
	
	
	public Man(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public Job getJob() {	
		return job;
	}
	
	public void setJob(Job job) {
		money = job.getPayment() + money;
		this.job = job;
	}
	
	public Gold[] getGold() {
		return golds;
	}
	
	public void setGold(Gold gold) {
		
		if(money > gold.getPrice()){
			money = money - gold.getPrice();
			for (int i = 0; i < golds.length; i++) {
				if(golds[i] == null){
					golds[i] = gold;
					break;
				}
			}
		}else{
			System.out.println("You got no money");
		}
	}
	public void buyAGold(Gold gold){
		setGold(gold);
	}
	
	public void seeGold(){
		System.out.println();
		System.out.print(getName()+" has: " );
		for (int i = 0; i < golds.length; i++) {
			if(golds[i] != null){
				System.out.print(golds[i].getName()+" ");
			}
		}
	}
}
