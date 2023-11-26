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

WeatherData basicWeather = new BasicWeatherData();
   /*
    complexDecorator : I just saw it like this and felt that a Factory is the most suitable thing for it
   WeatherData complexDecorator = new TemperatureUnitsDecorator
   (new WindSpeedDecorator(new PrecipitationDecorator(basicWeather)));
   */
   WeatherData compositeDecorator = WeatherDecoratorFactory.createCompositeDecorator(basicWeather, dayNumber);
   System.out.println("SOo Weather condition:- " + compositeDecorator.getWeatherInfo());

        
   
    }
}
