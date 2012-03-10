package observer_java;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements DisplayElement, Observer {

	private Observable observable;
	
	private float currentPressure = 29.92f;  
	private float lastPressure;
	
	public ForecastDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
		
	}
	
	@Override
	public void update(Observable obs, Object args) {
		if(obs instanceof WeatherData){
			WeatherData weatherdata = (WeatherData) obs;
			lastPressure = currentPressure;
			currentPressure = weatherdata.getPressure();
			display();
		}

	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}