

public interface DataBase {
    // Establishes a connection & disconnect to the database. 
    void connect();
    void disconnect();
    ClimateData getClimateData(Integer idDay);
    void addClimateData(ClimateData climateData);

}



  