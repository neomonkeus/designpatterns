package decorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return 0.10 + this.beverage.Cost();
	}

}
