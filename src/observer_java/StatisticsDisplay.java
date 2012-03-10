package observer_java;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float temperature = 0.0f;
	private float mintemp = 100.0f;
	private float maxtemp = 0.0f;
	private float tempsum = 0.0f;
	private int numreadings;
	
	private Subject weatherdata;
	
	public StatisticsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Min: " + mintemp + " Max: " + maxtemp + 
				" Avg: " + tempsum/numreadings);

	}

	@Override
	public void update(Observable obs, Object args) {
		if(obs instanceof WeatherData){
		
			WeatherData weatherdata = (WeatherData) obs;
			temperature = weatherdata.getTemperature();
			tempsum += temperature;
			numreadings++;
		
			if(temperature > maxtemp){
				maxtemp = temperature;
			}
		
			if(temperature < mintemp){
				mintemp = temperature;
			}
			this.display();
		}
	}

}
