package moduleArray;

public class LoopingArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
            System.out.println("the element at index " + i +" is " + numbers[i]);
        }
        
    }
}
