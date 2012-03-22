package factory.abstractfactory;

public class NYStylePizzaStore extends PizzaStore{

	public Pizza createPizza(PizzaType pizzatype){
		Pizza pizza = null;
		
		switch(pizzatype){
			case CHEESE:
				pizza = new CheesePizza();
				break;
			case PEPPERONI:
				pizza = new PepperoniPizza();
				break;
			case CLAM:
				pizza = new ClamPizza();
				break;
			case VEGGIE:
				pizza = new VeggiePizza();
				break;
		}
		return pizza;
		
	}
}
