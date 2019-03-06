package timelineevent;

public class ComputerComponent extends TimelineEvent{
    
    int modelNumber;
    int releaseYear;
    double retailPriceIn2018;
    String manufacturer;

    public ComputerComponent(int modelNumber, int releaseYear, double retailPriceIn2018, String manufacturer, int year, String description) {
        
        super(year, description);
        this.modelNumber = modelNumber;
        this.releaseYear = releaseYear;
        this.retailPriceIn2018 = retailPriceIn2018;
        this.manufacturer = manufacturer;
        
    }
    
    
    
    
    
    
    
}
