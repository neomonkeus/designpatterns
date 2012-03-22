package factory.factorymethod;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	public Pizza orderPizza(PizzaType pizzatype){
		Pizza pizza;
		
		pizza = factory.createPizza(pizzatype);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;	
	}

}
