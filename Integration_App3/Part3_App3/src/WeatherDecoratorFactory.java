import java.util.Scanner;

public class WeatherDecoratorFactory {

    public static WeatherData createCompositeDecorator(WeatherData weatherData,int dayNumber) {
        WeatherDataBase dataBase = new WeatherDataBase();
        WeatherData compositeDecorator = weatherData;
        Scanner scanner = new Scanner(System.in);
        ClimateData objClimateData =dataBase.getClimateData(dayNumber);
        
        
        while (true) {
           
            System.out.println("\nChoose the decorator type you prefer to view the current weather\n" +
            "1. Temperature\n2. Wind Speed\n3. Precipitation\n4. Humidity\n5.Done(When finished press 5):");
                int choice = scanner.nextInt();
        
            if (choice == 5) {
                break; 
            }
        
            if (choice == 1) {
                System.out.println("Choose temperature unit:\n 1)Celsius \n 2) Fahrenheit");
                compositeDecorator = TemperatureDecoratorFactory.createTemperatureDecorator(compositeDecorator,objClimateData);
            } else if (choice == 2) {
                compositeDecorator = new WindSpeedDecorator(compositeDecorator,objClimateData);
            } else if (choice == 3) {
                
                compositeDecorator = new PrecipitationDecorator(compositeDecorator,objClimateData);
            } else if (choice == 4) {
                compositeDecorator = new HumidityDecorator(compositeDecorator, objClimateData);
            } else {
                
                throw new IllegalArgumentException("Invalid choice. Please choose again.");
            }
        }
  
        return compositeDecorator;
        
    }
}


