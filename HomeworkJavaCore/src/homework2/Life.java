package homework2;

public class Life {
	
	
	
	public void date(Woman woman, Man man, Gold gift){
		if(woman.setGolds(gift)){
			for (int i = 0; i < man.getGold().length; i++) {
				if(man.getGold()[i] == gift){
					man.getGold()[i] = null;
					break;
				}
			}
		}
	}
	
	public void getAJob(Man man, Job job){
		
		man.setJob(job);
		man.setMoney(job.getPayment() + man.getMoney());
	}
	
	

}
