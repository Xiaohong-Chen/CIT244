package timelineevent;

public class Factory_ComputerSystem implements Factory{

    @Override
    public Controller_TimelineEvent factory(View_DataInput di) {
        
        return new Controller_ComputerSystem(di.reasonOfChoosing,di.modelNumber,di.releaseYear, di.retailPriceIn2018,di.manufacturer, di.year, di.description);
        
    }
    
    

   
}
