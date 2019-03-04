package timelineevent;

public class ComputerHardware extends ComputerComponent{
    
    String mostImportantSpecifications;

    public ComputerHardware(String mostImportantSpecifications, int modelNumber, int releaseYear, double retailPriceIn2018, String manufacturer, int year, String description) {
        
        super(modelNumber, releaseYear, retailPriceIn2018, manufacturer, year, description);
        this.mostImportantSpecifications = mostImportantSpecifications;
        
    }
    
    
    
    
}
