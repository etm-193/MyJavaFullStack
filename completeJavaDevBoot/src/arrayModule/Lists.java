package arrayModule;

import java.util.Arrays;

public class Lists {
    
    public static void main(String[] args) {
        
        
        int[] numbers = {1,2,3,4};
        float[] decimals = {(float) 1.1, (float) 1.2, (float) 1.3, (float) 1.4};
        String[] names = {"jane", "tom"};
        
        
        System.out.println(numbers[3]);
        System.out.println(decimals[2]);
        System.out.println(names[0]);
        
        
        //2darrays
        
        int[][] grades = new int[3][4];
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[1][0] = 40;
        grades[2][0] = 100;
        grades[2][1] = 100;
        grades[2][2] = 100;
        grades[2][3] = 100;
        System.out.print(Arrays.toString(grades[0]));
        System.out.print(Arrays.toString(grades[1]));
        System.out.print(Arrays.toString(grades[2]));
    }

}
