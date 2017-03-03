package homework2;

public class Life {
	
	
	
	public void date(Woman woman, Man man, Gold gift){
		if(woman.setGolds(gift)){
			for (int i = 0; i < man.getGolds().length; i++) {
				if(man.getGolds()[i] == gift){
					man.getGolds()[i] = null;
					break;
				}
			}
		}
	}
	
	public void getAJob(Man man, Job job){
		
		man.setJob(job);
		man.setMoney(job.getPayment() + man.getMoney());
		System.out.println("sldgh zhg hzdfg hk gdsfg ");
	}
	
	

}
