import java.util.*;
public class Array {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = new int[5];
        System.out.println("The arrays are:");
        for (int i = 0; i < numbers.length; i++) 
        {
              numbers[i]=i+1;
              System.out.println( numbers[i]);
        }

    }
}
