package factory.factorymethod;

public class SimplePizzaFactory {

	public Pizza createPizza(PizzaType pizzatype){
		Pizza pizza = null;
		
		switch(pizzatype){
			case :
				pizza = new CheesePizza();
				break;
			case "pepperoni":
				pizza = new PepperoniPizza();
				break;
			case "clam":
				pizza = new ClamPizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
				break;
		}
		
	}
	
}
