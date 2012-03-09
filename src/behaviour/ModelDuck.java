package behaviour;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flybehaviour = new FlyNoWay();
		quackbehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
