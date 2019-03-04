package timelineevent;

public class ComputerSystem extends ComputerComponent{
    
    String reasonOfChoosing;

    public ComputerSystem(String reasonOfChoosing, int modelNumber, int releaseYear, double retailPriceIn2018, String manufacturer, int year, String description) {
        
        super(modelNumber, releaseYear, retailPriceIn2018, manufacturer, year, description);
        this.reasonOfChoosing = reasonOfChoosing;
        
    }

   
    
    
    
   
    
    
    
    
}
