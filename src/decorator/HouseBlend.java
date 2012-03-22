package decorator;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		this.description = "House Blend Coffee";
	}
	
	@Override
	public double Cost() {
		return 0.89;
	}

}
