package homework2;

public class Woman {
	private Job job;
	private String name;
	private Gold[] golds = new Gold [3];
	
	
	public Woman(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Gold[] getGolds() {
		return golds;
	}
	public boolean setGolds(Gold gold) {
		boolean isAdded = false;
		for (int i = 0; i < golds.length; i++) {
			if(golds[i] == null){
				golds[i] = gold;
				isAdded = true;
				return isAdded;
			}
			
		}
		
			System.out.println("No, thanks.");
			return isAdded;
	}
	
	public void seeGold(){
		System.out.print(getName()+" has: " );
		for (int i = 0; i < golds.length; i++) {
			if(golds[i] != null){
				System.out.print(golds[i].getName()+" ");
			}
		}
	}
	
	
	
}
