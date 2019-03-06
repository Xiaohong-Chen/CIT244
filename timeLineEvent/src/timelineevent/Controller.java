package timelineevent;


public class Controller {

    public void writeDataIntoModel(View_DataInput input, Model model) {

        if (input.choise == 4) {

            System.out.println("Please Input the Valid Number");
            

        } else {

            switch (input.choise) {
                case 1:
                    
                    input.computerSystemInput();
                    ComputerSystem cs = new ComputerSystem(input);
                    model.writeComputerSystem(cs);
                    //return new Factory_ComputerSystem().factory(input);
                case 2:
                    input.computerHardwareInput();
                    ComputerHardware ch = new ComputerHardware(input);
                    //return new Factory_ComputerHardware().factory(input);
                case 3:
                    input.humanInterestInput();

                    //return new Factory_HumanInterest().factory(input);
            }
        }
        
    }

}
