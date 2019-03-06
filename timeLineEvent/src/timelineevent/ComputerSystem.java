package timelineevent;

public class ComputerSystem extends ComputerComponent{
    
    String reasonOfChoosing;

    public ComputerSystem(View_DataInput di) {
        
        super(di.modelNumber, di.releaseYear, di.retailPriceIn2018, di.manufacturer, di.year, di.description);
        reasonOfChoosing =di.reasonOfChoosing;
        
    }
    

   
    
    
    
   
    
    
    
    
}
