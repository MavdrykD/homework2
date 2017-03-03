package homework2;

public class Woman extends Adult{
	private Gold[] golds = new Gold [3];
	
	public Woman(String name, int age) {
		super(name, age);
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
		System.out.println();
		System.out.print(getName()+" has: " );
		for (int i = 0; i < golds.length; i++) {
			if(golds[i] != null){
				System.out.print(golds[i].getName()+" ");
			}
		}
	}
	
	
	
}
