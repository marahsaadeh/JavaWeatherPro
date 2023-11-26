import java.util.ArrayList;
import java.util.List;


public class WeatherDataSubject {
    
    private List<WeatherDataObserver> observers ;

// private int state;

//Celsius Stored in the data base
    private double temperature;

    private double humidity;
    private double windSpeed;
    private String precipitationType;

    public WeatherDataSubject(double temperature, double humidity, double windSpeed, String precipitationType) {
        this.observers = new ArrayList<>();
        //Old values Taken from Data Base
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.precipitationType = precipitationType;

        
    }

// public void attach(Observer observer)"add"
    public void addObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }
  

    public void removeObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherDataObserver observer : observers) {
            observer.update(temperature, humidity,windSpeed,precipitationType);
        }
    }

//setter function
          //setWeatherData(Values entered by the user)
public void setWeatherData(double temperature, double humidity, double windSpeed, String precipitationType) {
    //Update all values

    this.temperature = temperature;
    this.humidity = humidity;
    this.windSpeed = windSpeed;
    this.precipitationType=precipitationType;
    notifyObservers();
}
//getter functions For updated data
public double getTemperature() {
  return temperature;
}

public double getHumidity() {
  return humidity;
}


    public double getWindSpeed() {
        return windSpeed;
    }

    public String getPrecipitationType() {
        return precipitationType;
    }



}

