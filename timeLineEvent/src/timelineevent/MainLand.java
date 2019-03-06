package timelineevent;

import java.io.File;

public class MainLand {

    public static void main(String[] args) {

        
       
            
        //Output A TimeLineEvent
        Controller c = new Controller();
        Model m = new Model();


        m.setFile();
        File dataFile = m.getFile();
        m.writerOrder(dataFile);
        m.write(c.execute());
        m.close();
            
        
        
        
        

    }

}
