# Java Learning - Day 12

## Welcome to this Day-12 directory!

>  In this directory, I'm gonna explain about the **Jump Statements** in Java.

## Jump statements

In Java, the jump statements are used to transfer the control of the program to the specific statements. In other words, jump statements transfer the control to the next statement outside a loop or switch statement.

These two are the jumping statements in java.
- break
- continue

## 1. break statement

In java, the break statement is used to break the current flow of the program and transfer the control to the next statement outside a loop or the switch statement.

## 2. continue statement

In java, the continue statement doesn't break the loop, whereas it skips the specific part of the loop and jumps to the next iteration of the loop immediately.

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

// Here is the output for this program using Jump statements.