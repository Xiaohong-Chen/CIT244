package timelineevent;



public class MainLand {

    public static void main(String[] args) throws Exception {

        //Creating a Moder to store the text
        Model dataModel = new Model();

        //Creating a View_DataInput to get Input value
        View_DataInput input = new View_DataInput();

        //Creating a Control to execute the data
        Controller c = new Controller();

        //Creating a Controller to Transfer all the value from the user input to Model
        c.writeDataIntoModel(input, dataModel);
        
        //Creating a View_DataOutput to show the data
        View_DataOutput output= new View_DataOutput();
        output.displayAll(c, dataModel);
        
        
        
        

    }

}
