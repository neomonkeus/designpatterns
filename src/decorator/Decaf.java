package decorator;

public class Decaf extends Beverage {

	public Decaf(){
		this.description = "Decaf Coffee";
		this.description += " - " + this.size;
	}
	@Override
	public double Cost() {
		return 1.05;
	}

}
