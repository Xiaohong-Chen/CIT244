package timelineevent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Model {
    
    
    private File dataFile;
    public PrintWriter  writerTimeline;
    
    public void setFile(){
        
        dataFile = new File("TimeLineData.txt");
        
    }

    public File getFile() {

        return dataFile;
        
    }
    
    public void writerOrder(File f){
        
        try {
  
            writerTimeline = new PrintWriter(f);
            
            writerTimeline.print("Year, ");
            writerTimeline.print("Description, ");
            writerTimeline.print("ModelNumber, ");
            writerTimeline.print("Manufacturer, ");
            writerTimeline.print("ReleaseYear, ");
            writerTimeline.print("RetailPriceIn2018, ");
            writerTimeline.print("ReasonOfChoosing, ");
            writerTimeline.println("MostImportantSpecifications, ");
            
            
           
        } catch (FileNotFoundException ex) {

        }
    }

    public void write(Controller_TimelineEvent t) {

        writerTimeline.print(t.year+", ");
        writerTimeline.println(t.description);
            
    }
    
    public void close(){
                           
        writerTimeline.close();
           

    }
}
