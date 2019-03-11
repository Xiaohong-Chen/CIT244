package timelineevent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Model {

    private File dataFile;
    public PrintWriter writerTimeline;

    public Model()  {

        try {
            
            dataFile = new File("TimeLineData.txt");
            writerTimeline = new PrintWriter(dataFile);
            writerOrder();
        } catch (FileNotFoundException ex) {
           
        }

    }
    public File getFile(){
        return dataFile;
    }

    public final void writerOrder() {
        
        
        writerTimeline.print("Title, ");
        writerTimeline.print("Year, ");
        writerTimeline.print("Description, ");
        writerTimeline.print("ModelNumber, ");
        writerTimeline.print("Manufacturer, ");
        writerTimeline.print("ReleaseYear, ");
        writerTimeline.print("RetailPriceIn2018, ");
        writerTimeline.print("ReasonOfChoosing, ");
        writerTimeline.println("MostImportantSpecifications, ");
        writerTimeline.flush();

    }

    public void writeComputerHardware(ComputerHardware ch) {
        
        writerTimeline.print(ch.title+",");
        writerTimeline.print(ch.year + ", ");
        writerTimeline.print(ch.description + ", ");
        writerTimeline.print(ch.modelNumber + ", ");
        writerTimeline.print(ch.manufacturer + ", ");
        writerTimeline.print(ch.releaseYear + ", ");
        writerTimeline.print(ch.retailPriceIn2018 + ", ");
        writerTimeline.print(", ");
        writerTimeline.println(ch.mostImportantSpecifications+ ", ");
        writerTimeline.flush();

    }

    public void writeComputerSystem(ComputerSystem cs) {
        
        writerTimeline.print(cs.title+",");
        writerTimeline.print(cs.year + ", ");
        writerTimeline.print(cs.description + ", ");
        writerTimeline.print(cs.modelNumber + ", ");
        writerTimeline.print(cs.manufacturer + ", ");
        writerTimeline.print(cs.releaseYear + ", ");
        writerTimeline.print(cs.retailPriceIn2018 + ", ");
        writerTimeline.print(cs.reasonOfChoosing + ", ");
        writerTimeline.println(" "+ ", ");
        writerTimeline.flush();

    }

    public void writeHumanInterest(HumanInterest hi) {
        writerTimeline.print(hi.title+", ");
        writerTimeline.print(hi.year + ", ");
        writerTimeline.print(hi.description + ", ");
        writerTimeline.print(", ");
        writerTimeline.print(", ");
        writerTimeline.print(", ");
        writerTimeline.print(", ");
        writerTimeline.print(", ");
        writerTimeline.println(",");
        writerTimeline.flush();
    }

    public void close() {

        writerTimeline.close();

    }
}
