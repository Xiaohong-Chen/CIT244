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

    public void writeComputerHardware(ComputerHardware ch) {

        writerTimeline.print(ch.year+", ");
        writerTimeline.print(ch.description+", ");
        writerTimeline.print(ch.modelNumber+", ");
        writerTimeline.print(ch.manufacturer+", ");
        writerTimeline.print(ch.releaseYear+", ");
        writerTimeline.print(ch.retailPriceIn2018+", ");
        writerTimeline.print(" , ");
        writerTimeline.println(ch.mostImportantSpecifications);
            
    }
    
    public void writeComputerSystem(ComputerSystem cs){
        writerTimeline.print(cs.year+", ");
        writerTimeline.print(cs.description+", ");
        writerTimeline.print(cs.modelNumber+", ");
        writerTimeline.print(cs.manufacturer+", ");
        writerTimeline.print(cs.releaseYear+", ");
        writerTimeline.print(cs.retailPriceIn2018+", ");
        writerTimeline.println("");
        
    }
    
    public void writeHumanInterest(HumanInterest hi){
        writerTimeline.print(hi.year+", ");
        writerTimeline.print(" , ");
        writerTimeline.print(" , ");
        writerTimeline.print(" , ");
        writerTimeline.print(" , ");
        writerTimeline.print(" , ");
        writerTimeline.println("");
    }
    
    public void close(){
                           
        writerTimeline.close();
           

    }
}
