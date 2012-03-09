package strategy;

public class MallardDuck extends Duck{
	
	public MallardDuck(){
		quackbehaviour = new Quack();
		flybehaviour = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I'm a real Mallard duck");
	}

}
