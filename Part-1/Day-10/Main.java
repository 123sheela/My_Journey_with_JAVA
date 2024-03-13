import java.util.*;
public class Main{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 20;

        // Simple if statement
        if (x > y) {
            System.out.println("x is greater than y");
        }


        // if-else statement
        System.out.println(" ---if-else statement---");
        if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than or equal to y");
        }

        // Nested if-else statement
        System.out.println(" ---Nested if-else statement---");
        if (x == y) {
            System.out.println("x is equal to y");
        } else if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than y");
        }

        // if-else-if ladder
        int marks = 85;
        System.out.println("  ---if-else-if ladder statement---");
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        // Short if-else statement (Ternary operator)
        System.out.println(" ---Short if-else statement---");
        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}
