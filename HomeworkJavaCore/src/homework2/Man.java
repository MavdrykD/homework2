package homework2;

public class Man extends Adult{

	private Gold [] golds = new Gold[3];
	
	

	public Man(String name, int age) {
		super(name, age);
	}
	
	
	
	
	public Gold[] getGolds() {
		return golds;
	}

	public void setGold(Gold gold) {
		int myMoney = getMoney();
		if(myMoney > gold.getPrice()){
			myMoney = myMoney - gold.getPrice();
			for (int i = 0; i < golds.length; i++) {
				if(golds[i] == null){
					golds[i] = gold;
					break;
				}
			}
		}else{
			System.out.println("You got no money");
		}
		setMoney(myMoney);
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
