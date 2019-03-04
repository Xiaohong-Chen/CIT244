package timelineevent;

import java.util.Scanner;

/**
 *
 * @author seanc
 */
public class CollectValue {

    int year;
    int modelNumber;
    int releaseYear;
    double retailPriceIn2018;
    String description;
    String manufacturer;
    String reasonOfChoosing;
    String mostImportantSpecifications;

    public void setValueCollectOfComputerSystem() {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please Input The Year(int): ");
        year = userInput.nextInt();
        
        System.out.println("Please Input The Discription(String): ");
        description = userInput.next();
        
        System.out.println("Please Input The Model Number: ");
        modelNumber = userInput.nextInt();
        
        System.out.println("Please Input The Release Year: ");
        releaseYear = userInput.nextInt();
        
        System.out.println("Please Input The Retail Price In 2018: ");
        retailPriceIn2018 = userInput.nextDouble();
        
        System.out.println("Please Input The Maufacturer: ");
        manufacturer = userInput.next();
        
        System.out.println("Please Input The Reason Of Choosing: ");
        reasonOfChoosing = userInput.next();
        
    }
    
    public void setValueCollectOfComputerHardware(){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please Input The Year(int): ");
        year = userInput.nextInt();
        
        System.out.println("Please Input The Discription(String): ");
        description = userInput.next();
        
        System.out.println("Please Input The Model Number: ");
        modelNumber = userInput.nextInt();
        
        System.out.println("Please Input The Release Year: ");
        releaseYear = userInput.nextInt();
        
        System.out.println("Please Input The Retail Price In 2018: ");
        retailPriceIn2018 = userInput.nextDouble();
        
        System.out.println("Please Input The Most Important Specifications: ");
        mostImportantSpecifications = userInput.next();
    }
    public void setValueCollectOfHumanInterest(){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please Input The Year(int): ");
        year = userInput.nextInt();
        
        System.out.println("Please Input The Discription(String): ");
        description = userInput.next();
        
        
    }
    
    
    
}


