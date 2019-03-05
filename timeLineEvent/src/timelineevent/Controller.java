package timelineevent;

public class Controller {

    public Controller_TimelineEvent execute() {

            View_DataInput input = new View_DataInput();

            input.choiseInput();

            switch (input.choise) {
                case 1:
                    input.computerSystemInput();
                    return new Factory_ComputerSystem().factory(input);
                case 2:
                    input.computerHardwareInput();
                    return new Factory_ComputerHardware().factory(input);
                case 3:
                    input.humanInterestInput();
                    return new Factory_HumanInterest().factory(input);
                
            }
        return null;
    }

}
