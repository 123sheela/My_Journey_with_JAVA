import java.util.*;
public class Loop{
    public static void main(String[] args) {
        // For loop example
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count is: " + i);
        }

        // Enhanced for loop (for-each loop) example
        System.out.println("\nEnhanced for loop (for-each loop):");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }

        // While loop example
        System.out.println("\nWhile loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Do-while loop example
        System.out.println("\nDo-While loop:");
        int i = 1;
        do {
            System.out.println("Count is: " + i);
            i++;
        } while (i <= 5);
    }
}
