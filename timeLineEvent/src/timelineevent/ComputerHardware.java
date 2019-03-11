package timelineevent;

public class ComputerHardware extends ComputerComponent{
    
    String mostImportantSpecifications;

    public ComputerHardware(View_DataInput di) {
        
        super(di);
        mostImportantSpecifications = di.mostImportantSpecifications;
        
    }
    
    
    
    
    
}
