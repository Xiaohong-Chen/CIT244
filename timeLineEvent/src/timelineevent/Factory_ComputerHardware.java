package timelineevent;

public class Factory_ComputerHardware implements Factory{

    @Override
    public Controller_TimelineEvent factory(View_DataInput di) {
        
        return new Controller_ComputerHardware(di.mostImportantSpecifications,di.modelNumber,di.releaseYear, di.retailPriceIn2018,di.manufacturer, di.year, di.description);
        
    }
}
