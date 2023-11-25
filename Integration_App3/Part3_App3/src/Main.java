import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
   System.out.println("**************************************************");

    WeatherDataBase database = new WeatherDataBase();
     database .connect();

     WeatherDataBase.fillData();

    Map<Integer, ClimateData>  allClimateDatas = WeatherDataBase.getClimateDatas();
    System.out.println("-------------------------------------------------------------------------------------------");

    System.out.printf("| %-10s | %-20s | %-8s | %-10s | %-15s |\n", "DayID", "Temperature(Celsius)", "Humidity", "WindSpeed", "PrecipitationType");
    System.out.println("-------------------------------------------------------------------------------------------");
    for (ClimateData climate_data : allClimateDatas.values()) {
        System.out.printf("| %-10d | %-20.2f | %-8.2f | %-10.2f | %-15s |\n",
                climate_data.getIdDay(),
                climate_data.getTemperatureInCelsius(),
                climate_data.getHumidity(),
                climate_data.getWindSpeed(),
                climate_data.getPrecipitationType());
    }
    System.out.println("-------------------------------------------------------------------------------------------");
    
database .disconnect();
System.out.println("**************************************************");
System.out.println("!!!Welcome to our system!!!");
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the day number (from 1 to 5) to select the day you want to check the weather for: ");
int dayNumber = scanner.nextInt();

//object was actually specified by the user(day number) 
ClimateData objClimateData = database.getClimateData(dayNumber);

WeatherData basicWeather = new BasicWeatherData();
   /*
    complexDecorator : I just saw it like this and felt that a Factory is the most suitable thing for it
   WeatherData complexDecorator = new TemperatureUnitsDecorator
   (new WindSpeedDecorator(new PrecipitationDecorator(basicWeather)));
   */
   WeatherData compositeDecorator = WeatherDecoratorFactory.createCompositeDecorator(basicWeather, dayNumber);
   System.out.println("SOo Weather condition:- " + compositeDecorator.getWeatherInfo());

        //Subject(Old Data "DB")
        
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject(
        //object was actually specified by the user(day number) "DB"
        objClimateData.getTemperatureInCelsius(),objClimateData.getHumidity(),
        objClimateData.getWindSpeed(),objClimateData.getPrecipitationType());
//Definition The observer and specifi subject
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDataSubject );
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject );

        
//Add the first observer in observers array
// "observers are an array located in the subject class and it contains the observers"
System.out.println("---------------------------------------------------------------");

        weatherDataSubject.addObserver(currentConditionsDisplay);
        System.out.println("The first observer 'CurrentConditionsDisplay' has been added only :-");

        //Update the values
        weatherDataSubject.setWeatherData(20, 70,5,"Rain");

//Add the second observer in observers array  
System.out.println("---------------------------------------------------------------");  
        weatherDataSubject.addObserver(statisticsDisplay);
        System.out.println("The second observer 'StatisticsDisplay' has also been added :-");

        //Proof of adding the first and second observers
        weatherDataSubject.setWeatherData(22.0, 70.0, 8.0, "Snow");

//Remove the first observer in observers array  
System.out.println("---------------------------------------------------------------"); 
        weatherDataSubject.removeObserver(currentConditionsDisplay);
        System.out.println("The first observer has been removed :-");
 //Proof of removeing the first observer in observers array 
weatherDataSubject.setWeatherData(30.0, 80.0, 10.0, "Sleet");
       
//Remove the second observer in observers array  
System.out.println("---------------------------------------------------------------"); 
        weatherDataSubject.removeObserver(statisticsDisplay);
        System.out.println("The second observer has been removed :-\n");
 //Proof of removeing the second observer in observers array 
weatherDataSubject.setWeatherData(40.0, 90.0, 3, "Rain");
   //There are no observers
    }
}

