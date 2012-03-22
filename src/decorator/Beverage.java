package decorator;

public abstract class Beverage {
	String description = "Unknown beverage";
	BeverageSize size = BeverageSize.SMALL;
	
	public String getDescription(){
		return this.description;
	}
	
	public abstract double Cost();

	public BeverageSize getSize(){
		return this.size;
	}
	
	public void setSize(BeverageSize size){
		this.size = size;
	}
}
