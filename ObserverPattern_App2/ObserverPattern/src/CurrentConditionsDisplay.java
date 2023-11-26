
public class CurrentConditionsDisplay implements WeatherDataObserver {
   private final WeatherDataSubject weatherData;

    public CurrentConditionsDisplay(WeatherDataSubject weatherData) {
       this.weatherData = weatherData;
    }
   
    @Override //update(Values entered by the user)i mean It was entered in Main
    public void update(double temperature, double humidity, double windSpeed, String precipitationType) {
        System.out.println("Current Conditions: \n Temperature = " + temperature + " Celsius\n Humidity = " +
                humidity + "%\n" +
                "Wind Speed = " + windSpeed + " Meters per second\n" +
                "Precipitation Type = " + precipitationType);
    }
    
}



 
