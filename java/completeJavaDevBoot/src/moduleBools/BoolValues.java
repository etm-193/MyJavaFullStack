package moduleBools;

import java.util.Scanner;

public class BoolValues {
    
    //dealership project
    
    
    //buy method
    
    public static void buy() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("what is your budget?");
        double budget = scan.nextDouble();
        
        if (budget >= 20000) {
            System.out.println("Great! $" + budget + " is enough for a new car!");
            
            System.out.println("\nDo you have inssurance? Y / N");
            String insurance = scan.nextLine();
            
            System.out.println("\nDo you have a valid Drivers License? Y / N");
            String insurance = scan.nextLine();
            
            System.out.println();
        } else {
            System.out.println("With $" + budget +" We can get you in an used car.");
        }
        
        
        
        
    }
    
    //sell method
    public static void sell() {
        
    }
    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Please select option 'a' to buy a car.");
       System.out.println("Please select option 'b' to buy a car.");
       
       String selection =  scan.nextLine();
       
       switch (selection) {
           case "a": System.out.println("You chose option" + selection);
           break;
           case "b": System.out.println("You chose option" + selection);
           break;
           default: System.out.println("Invalid option");
           
           
           scan.close();
           
           
        
           
           
       }
       
       
       
       
       
       
       scan.close(); 
    }
    

}
