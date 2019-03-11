package timelineevent;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {

    public void writeDataIntoModel(View_DataInput input, Model model) {

        boolean controlLoop = true;

        while (controlLoop) {
            try {

                input.choiseInput();

                switch (input.choise) {
                    case 1:
                        input.computerSystemInput();
                        ComputerSystem cs = new ComputerSystem(input);
                        model.writeComputerSystem(cs);
                        break;
                    case 2:
                        input.computerHardwareInput();
                        ComputerHardware ch = new ComputerHardware(input);
                        model.writeComputerHardware(ch);
                        break;
                    case 3:
                        input.humanInterestInput();
                        HumanInterest hi = new HumanInterest(input);
                        model.writeHumanInterest(hi);
                        break;
                    case 4:
                        controlLoop = false;
                        break;
                    default:
                        throw new Exception("Please Input the Valid Number");
                }

            } catch (Exception ex) {
                System.out.println("Please Input the Valid Number");
            }
        }
        model.close();

    }
    
    public int getDataRow(Model model) throws FileNotFoundException{
        
        Scanner userOutput = new Scanner(model.getFile());
            
            int n=2;
            while(userOutput.hasNextLine()){
                userOutput.nextLine();
                n=n+1;
            }
        return n;
    }
            
    public String[][] readDataFromModel(Model model) throws FileNotFoundException {

            int row = getDataRow(model);
            
            Scanner userOutput = new Scanner(model.getFile());
            String[][] s = new String[row][];
            int m =0;
            while(userOutput.hasNextLine()){
                s[m]=userOutput.nextLine().split(",");
                m=m+1;
            }
            
            return s;

    }

}
