package module1Variables;

import java.util.Scanner;

public class variablesMain {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello, what is your name?");
        
        String userName = scan.nextLine();
        System.out.println("Hi " + userName + "! I'm Javabot. Where are you from?");
        String userHome = scan.nextLine();
        System.out.println("I hear it's beautiful at " + userHome+ "I'm from a place called Oracle");
        System.out.println("How old are you?");
        int userAge = scan.nextInt();
        System.out.println("So you are" + userAge + "Cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / userAge) + " times older than you!");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)"); 
        String favoriteLang = scan.nextLine();
        System.out.println(favoriteLang + "thats great, nice chatting with you " + userName );
        
        scan.close();
    }

}
