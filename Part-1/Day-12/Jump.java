import java.util.*;
public class Jump
{
    public static void main(String[] args) 
    {
        // Using break statement
        System.out.println("Using break statement:");
        for (int i = 0; i < 5; i++) 
        {
            if (i == 3) 
            {
                break; // terminates the loop when i equals 3
            }
            System.out.println("Value of i: " + i);
        }

        // Using continue statement
        System.out.println("\nUsing continue statement:");
        for (int i = 0; i < 5; i++) 
        {
            if (i == 2) 
            {
                continue; // skips the rest of the code for i equals 2 and continues with the next iteration
            }
            System.out.println("Value of i: " + i);
        }
    }

}
