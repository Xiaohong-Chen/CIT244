/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelineevent;

import java.util.Scanner;


public class MainLand {

    public static void main(String[] args) {
        
        boolean loopControl = true;
        Scanner userInput = new Scanner(System.in);

        
        while(loopControl){
            
            System.out.println("--------------------------------------------");
            System.out.println("----------- 1. COMPUTER SYSTEM   -----------");
            System.out.println("----------- 2. COMPUTER HARDWARE -----------");
            System.out.println("----------- 3. HUMAN INTEREST    -----------");
            System.out.println("----------- 4. EXIT              -----------");
            System.out.println("--------------------------------------------");
            
            
            int choise = userInput.nextInt();
            if(choise == 4){
                loopControl = false;
            }else{
                factory(choise);
            }
            
            
        }
    }
    
    public static TimelineEvent factory(int timelineTpyeChoise){
        
        CollectValue cv = new CollectValue();
        
        switch (timelineTpyeChoise) {
            case 1:
                cv.setValueCollectOfComputerSystem();
                return new ComputerSystem(cv.reasonOfChoosing,cv.modelNumber,cv.releaseYear, cv.retailPriceIn2018,cv.manufacturer, cv.year, cv.description);
            case 2:
                cv.setValueCollectOfComputerHardware();
                return new ComputerHardware(cv.mostImportantSpecifications,cv.modelNumber,cv.releaseYear, cv.retailPriceIn2018,cv.manufacturer, cv.year, cv.description);
            case 3:
                cv.setValueCollectOfHumanInterest();
                return new HumanInterest(cv.year, cv.description);
            default:
                return null;
        }
    }
}
