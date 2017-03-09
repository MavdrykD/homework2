package homework4;

public class ClassCat extends Animal{
	private Boolean hunt;
	

	public ClassCat() {
		super();
	}


	public ClassCat(Boolean hunt) {
		super();
		this.hunt = hunt;
	}


	public Boolean getHunt() {
		return hunt;
	}


	public void setHunt(Boolean hunt) {
		this.hunt = hunt;
	}
	public void metodClassCat(){
		System.out.println("Class cat");
	}



}
