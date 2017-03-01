package homework2;

public class Main {

	public static void main(String[] args) {
		
		
		Job job = new Job("driver", 12000);
		Man man = new Man("dimon", 200);
		man.setJob(job);
		System.out.println(man.getMoney());
		Gold buyGold = new Gold(1100, "ring");
		man.setGold(buyGold);
		Gold buyGold2 = new Gold(1100, "watch");
		man.setGold(buyGold2);
		System.out.println(man.getMoney());
		
		Woman woman = new Woman("Nataly");
		Life life = new Life();
		life.date(woman, man, buyGold2);
		woman.seeGold();
		man.seeGold();
		
		life.date(woman, man, buyGold);
		woman.seeGold();
		man.seeGold();
		

	}

}
