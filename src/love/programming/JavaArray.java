package love.programming;
import java.util.Scanner;
public class JavaArray {
    public static void main(String[] args) {

        int[] arrayValues = {1, 2, 3, 4, 5};
        int sumArray = 0;
        for (int i = 0; i < arrayValues.length; i++) {
            sumArray = sumArray + arrayValues[i];
            System.out.println(sumArray);
        }

        System.out.println("Sum of Array: " + sumArray);
        System.out.println("Average Value: " + sumArray / arrayValues.length);
    }
}



