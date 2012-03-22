package observer.java;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object args){
		if(obs instanceof WeatherData){
			WeatherData weatherdata = (WeatherData)obs;
			this.temperature = weatherdata.getTemperature();
			this.humidity = weatherdata.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + 
				"F degrees and " + humidity + "% humidity");
	}

}
