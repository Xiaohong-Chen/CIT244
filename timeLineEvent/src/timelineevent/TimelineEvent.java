package timelineevent;

public class TimelineEvent {
    
    int year;
    String title;
    String description;
    
    public TimelineEvent(View_DataInput di) {
        
        year = di.year;
        title = di.title;
        description = di.description;
        
    }
    
    
}
