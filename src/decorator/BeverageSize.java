package decorator;

public enum BeverageSize {
	SMALL("tall"), MEDIUM("grande"), LARGE("venti");

	private String coffeesize;
	
	private BeverageSize(String s){
		this.coffeesize = s;
	}
	
	public String toString(){
		return this.coffeesize;
	}

}