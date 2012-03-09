package observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float mintemp = 100.0f;
	private float maxtemp = 0.0f;
	private float tempsum = 0.0f;
	private int numreadings;
	
	private Subject weatherdata;
	
	public StatisticsDisplay(Subject weatherData){
		this.weatherdata = weatherData;
		weatherdata.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Min: " + mintemp + " Max: " + maxtemp + 
				" Avg: " + tempsum/numreadings);

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
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
