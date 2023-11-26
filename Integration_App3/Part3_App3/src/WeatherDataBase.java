import java.util.HashMap;
import java.util.Map;

public class WeatherDataBase implements DataBase {
    //<day number, object climate data >
    private static final Map<Integer, ClimateData> climateDataList = new HashMap<>();


    public static void fillData() {
        climateDataList.put(1, new ClimateData(1,25.5, 60, 10, "Rain"));
        climateDataList.put(2, new ClimateData(2,28, 55, 3, "Snow"));
        climateDataList.put(3, new ClimateData( 3,30, 50, 11, "Sleet"));
        climateDataList.put(4, new ClimateData( 4,22, 65, 7, "Hail"));
        climateDataList.put(5, new ClimateData( 5,18, 70, 5, "Drizzle"));

}
      
//Overriding of Database class
     public void connect() {
        System.out.println("Connecting to Database!!");
    }
//Overriding of Database class
    public void disconnect() {
        System.out.println("Disconnected from the Database.");
    }
//Overriding of Database class
    public void addClimateData(ClimateData climateData) {
        // Implementation of adding climate data to the database
        climateDataList.put(climateData.getIdDay(), climateData);
    }



//Overriding of Database class
    public ClimateData getClimateData(Integer idDay) {
        // Implementation of retrieving climate data object from the database
        return climateDataList .get(idDay);
    }


//retrieve all data in database
public static Map<Integer, ClimateData> getClimateDatas(){ return climateDataList;}
  
}


