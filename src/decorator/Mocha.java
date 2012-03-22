package decorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public double Cost() {
		return 0.2 + this.beverage.Cost();
	}

}
