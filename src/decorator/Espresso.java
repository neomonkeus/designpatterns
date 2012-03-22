package decorator;

public class Espresso extends Beverage {

	public Espresso(){
		description = "Espresso";
	}
	
	@Override
	public double Cost() {
		return 1.99;
	}

}
