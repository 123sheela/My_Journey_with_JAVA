# Java Learning - Day 13

## Welcome to this Day-13 directory!

>  In this directory, **The Arrays** are explained briefly.
## Arrays

In java, the arrays are used to store multiple values in a single variable, instead of declaring seperate variables for each value.

## Advantages of Arrays

- Code Optimization
- Random Access
  
## Disadvantages of Arrays

- It has fixed size which means we can't increase or decrease the size dynamically. If we try to add more elements beyond the declared size of the array, it will result in an **ArrayIndexOutOfBoundsException** error during runtime. 
- Searching in an array is not efficient
  
There are two types of Arrays in java
- Single Dimensional Array
- Multi-Dimensional Array
  
## Single Dimensional Arrays

A single-dimensional array in Java is a type of array that stores elements of the same data type in a linear sequence.

### Syntax 

    dataType[] arr;
       (or) 
    dataType []arr; 
       (or) 
    dataType arr[]; 

    ex. int[] arr;

### Declaration,Instantiation and Initialization of Array

    int arr[] = new int[5]; //declaration and instantiation
    arr[0] = 1; //initialization
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;

## Sample program 

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

// Here is the output for the Array program
