package factory.abstractfactory;

public abstract class PizzaStore {
	
	public Pizza orderPizza(PizzaType pizzatype){
		Pizza pizza;
		
		pizza = createPizza(pizzatype);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;	
	}
	
	abstract Pizza createPizza(PizzaType type);

}
