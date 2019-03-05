package timelineevent;

public class Factory_HumanInterest implements Factory {

    @Override
    public Controller_TimelineEvent factory(View_DataInput di) {
        return new Controller_HumanInterest(di.year, di.description);
    }
    
}
