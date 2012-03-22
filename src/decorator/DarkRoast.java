package decorator;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		this.description = "Dark Roast";
		this.description += ": " + this.size;
	}
	
	@Override
	public double Cost() {
		return 0.99;
	}

}
