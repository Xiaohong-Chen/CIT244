package timelineevent;

public class Controller_ComputerSystem extends Controller_ComputerComponent{
    
    String reasonOfChoosing;

    public Controller_ComputerSystem(String reasonOfChoosing, int modelNumber, int releaseYear, double retailPriceIn2018, String manufacturer, int year, String description) {
        
        super(modelNumber, releaseYear, retailPriceIn2018, manufacturer, year, description);
        this.reasonOfChoosing = reasonOfChoosing;
        
    }

   
    
    
    
   
    
    
    
    
}
