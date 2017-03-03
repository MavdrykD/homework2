package homework2;

public class Main {

	public static void main(String[] args) {
		
		
		Job job = new Job("driver", 12000);
		Man man = new Man("dimon", 25);
		man.setMoney(700);
		man.setJob(job);
		System.out.println("Currently i have "+man.getMoney()+" UAN");
		
		Gold buyGold = new Gold(1100, "ring");
		man.buyAGold(buyGold);
		System.out.println("I purchased " +buyGold.getName()+" " +buyGold.getPrice()+ " UAN");
		System.out.println("Currently i have "+man.getMoney()+" UAN");
		
		Gold buyGold2 = new Gold(1900, "watch");
		man.buyAGold(buyGold2);
		System.out.println("I purchased " +buyGold2.getName()+" " +buyGold2.getPrice()+ " UAN");
		System.out.println("Currently i have "+man.getMoney()+" UAN");
		
		Woman woman = new Woman("Nataly", 22);
		Life life = new Life();
		life.date(woman, man, buyGold2);
		woman.seeGold();
		man.seeGold();
		
		life.date(woman, man, buyGold);
		woman.seeGold();
		man.seeGold();
		

	}

}
