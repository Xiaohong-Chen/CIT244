package timelineevent;

public class ComputerHardware extends ComputerComponent{
    
    String mostImportantSpecifications;

    public ComputerHardware(View_DataInput di) {
        
        super(di.modelNumber, di.releaseYear, di.retailPriceIn2018, di.manufacturer, di.year, di.description);
        mostImportantSpecifications = di.mostImportantSpecifications;
        
    }
    
    
    
    
    
}
