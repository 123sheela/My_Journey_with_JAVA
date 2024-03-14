# Java Learning - Day 14

## Welcome to this Day-14 directory!

>  In this directory, **The Multi-dimensional Arrays** were explained.

## Multi-dimensional Arrays

 Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

 To create a two-dimensional array, add each array within its own set of curly braces:

For example:

      int num[][]=new int[4][3];

## Sample Program

     import java.util.*;
     public class Marray
     {
        public static void main(String[] args)
        {
            int num[][]= {{1,2},{3,4}};
            
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    System.out.print(num[i][j]+" ");
                }
                System.out.println();
            }
        }
     }
