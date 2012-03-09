package strategy;

public abstract class Duck {

	FlyBehaviour flybehaviour;
	QuackBehaviour quackbehaviour;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flybehaviour.fly();
	}
	
	
	public void performQuack(){
		quackbehaviour.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehaviour(FlyBehaviour fb){
		flybehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb){
		quackbehaviour = qb;
	}
	
}