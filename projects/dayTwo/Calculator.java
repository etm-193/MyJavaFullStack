public class Calculator {
    
    public static void main(String[] args) {
    //pass in values to your method here
    int firstNumber = 5;
    int secondNumber = 8;
    //your code goes here
     
    System.out.println(addNumbers(firstNumber, secondNumber));
    System.out.println(subNumbers(firstNumber, secondNumber));
    System.out.println(multNumbers(firstNumber, secondNumber));
    System.out.println(divNumbers(firstNumber, secondNumber));
    
    }
    
    
    public static float addNumbers(int numeroUno, int numeroDos){
        int sum;
        sum = numeroUno + numeroDos;
        return sum;
    }
    
    public static float subNumbers(int numeroUno, int numeroDos){
        int sub;
        sub = numeroUno - numeroDos;
        return sub;
    }
    
    public static float multNumbers(int numeroUno, int numeroDos){
        int mult;
        mult = numeroUno + numeroDos;
        return mult;
    }
    
    public static float divNumbers(int numeroUno, int numeroDos){
        int div;
        div = numeroUno + numeroDos;
        return div;
    }
    
}