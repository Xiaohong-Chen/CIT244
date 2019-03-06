package timelineevent;

public class HumanInterest extends TimelineEvent{

    public HumanInterest(View_DataInput di) {
        super(di.year, di.description);
    }
}
