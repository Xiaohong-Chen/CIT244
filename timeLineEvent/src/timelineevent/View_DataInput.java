package timelineevent;

import java.util.Scanner;

public class View_DataInput {

    int choise;
    int year;
    int modelNumber;
    int releaseYear;
    double retailPriceIn2018;
    String description;
    String manufacturer;
    String reasonOfChoosing;
    String mostImportantSpecifications;
    
    View_DataInput(){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("----------- 1. COMPUTER SYSTEM   -----------");
        System.out.println("----------- 2. COMPUTER HARDWARE -----------");
        System.out.println("----------- 3. HUMAN INTEREST    -----------");
        System.out.println("----------- 4. EXIT              -----------");
        System.out.println("--------------------------------------------");
        
        choise = userInput.nextInt();
    }

    public void computerSystemInput() {

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

    public void computerHardwareInput() {

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

    public void humanInterestInput() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please Input The Year(int): ");
        year = userInput.nextInt();

        System.out.println("Please Input The Discription(String): ");
        description = userInput.next();

    }
}
