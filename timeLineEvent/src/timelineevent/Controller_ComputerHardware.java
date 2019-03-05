package timelineevent;

public class Controller_ComputerHardware extends Controller_ComputerComponent{
    
    String mostImportantSpecifications;

    public Controller_ComputerHardware(String mostImportantSpecifications, int modelNumber, int releaseYear, double retailPriceIn2018, String manufacturer, int year, String description) {
        
        super(modelNumber, releaseYear, retailPriceIn2018, manufacturer, year, description);
        this.mostImportantSpecifications = mostImportantSpecifications;
        
    }
    
    
    
    
}
