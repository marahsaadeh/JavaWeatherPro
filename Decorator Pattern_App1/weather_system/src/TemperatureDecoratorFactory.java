import java.util.Scanner;

public class TemperatureDecoratorFactory {
    
    public static WeatherData createTemperatureDecorator(WeatherData compositeDecorator,ClimateData objClimateData) {
       
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        WeatherData resultDecorator;
        

        if (choice == 1) {
            resultDecorator = new CelsiusTemperatureUnitsDecorator(compositeDecorator, objClimateData);
        } else if (choice == 2) {
            resultDecorator = new FahrenheitTemperatureUnitsDecorator(compositeDecorator, objClimateData);
        } else {
            throw new IllegalArgumentException("Invalid choice. Please choose again.");
        }
        
        return resultDecorator;
        
    }
}

