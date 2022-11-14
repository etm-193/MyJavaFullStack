package moduleLoops;

public class ForWhileLoops {
    
    //know when you know how many times you need the code to run.
    //for syntax = for (i = 0; i <= 5; i++){code goes in here and will loop for the set number}
    
    //while syntax while(condition = true){ code runs }
    
    //while loop example
    
    public static void main(String[] args) {
        double choice = 0.01;
        double guess = 0.99;
        
        while (guess > choice) {
            guess = Math.random();
            System.out.println("guess");
        }
        //break and continue
        
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; //or break if i want to  stop it completely
            }
            System.out.println(i);
        }
    }
}
