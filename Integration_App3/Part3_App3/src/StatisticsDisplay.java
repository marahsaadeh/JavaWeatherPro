
public class StatisticsDisplay implements WeatherDataObserver {
   
    private final WeatherDataSubject weatherData;
    public StatisticsDisplay(WeatherDataSubject weatherData) {
       this.weatherData = weatherData;
  }
 
  @Override //update(Values entered by the user)"in main"
  public void update(double temperature, double humidity, double windSpeed, String precipitationType) {
    System.out.println("\nStatistics:-\n ");
  
    Averages.calculateAverages(temperature,humidity,windSpeed);
   
     
  }
  
}


  
  
    