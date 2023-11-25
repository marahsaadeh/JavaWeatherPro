import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        //Old values(in DataBase)
        WeatherDataBase database = new WeatherDataBase();
     database .connect();

WeatherDataBase.fillData();  
ClimateData objClimateData = database.getClimateData(3);

//Subject(Old Data "DB")
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject(
        objClimateData.getTemperatureInCelsius(),objClimateData.getHumidity(),
        objClimateData.getWindSpeed(),objClimateData.getPrecipitationType());
//The observer follows any subject
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDataSubject );
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject );

        weatherDataSubject.addObserver(currentConditionsDisplay);
        weatherDataSubject.addObserver(statisticsDisplay);

        //Update the values
        weatherDataSubject.setWeatherData(20, 70,5,"Rain");
   
database .disconnect();
  

    }
}



