package moduleFunc;

import java.util.Scanner;

public class LearnParam {
    
    public static double tipCalc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input your total bill:");
        double bill = scan.nextDouble();
        System.out.println();
        System.out.println("How much would you like to tip? 15, 18, or 20 percent");
        int tipPercent = scan.nextInt();
        scan.close();
        
       double tipAmount = tipPercent / bill * 100;
       
       System.out.println(tipAmount);
        
        return tipAmount;
    }
    public static void main(String[] args) {
        
        tipCalc();
        
    }
    

}
