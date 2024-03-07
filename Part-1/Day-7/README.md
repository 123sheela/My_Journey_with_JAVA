# Java Learning - Day 7

## Welcome to this Day-7 directory!

>  In this directory, I wanna share about the **Type Casting** in java

## Type Casting 

- Type casting refers to the process of converting a variable from one data type to another. 
- Java has two types of casting:
    - **Implicit Casting (Widening Conversion)**
    - **Explicit Casting (Narrowing Conversion)**
  
  ## 1.Implicit Casting (Widening Conversion)
  > Implicit casting is converting a **Smaller data type to a Larger data type.**
  >
  >  byte -> short -> char -> int -> long -> float -> double
       
   ```bash
        public class Main 
       {
         public static void main(String[] args) 
        {
          int myInt = 5;
          double myDouble = myInt;  // int -> Double

          System.out.println(myInt);  //output- 5
          System.out.println(myDouble); //ouput- 5.0
        }
       }


## 2.Explicit Casting (Narrowing Conversion)
> Explicit Casting is converting a **Larger data type to Smaller data type**.
>
> double -> float -> long -> int -> char -> short -> byte

   ```bash
        public class Main 
       {
         public static void main(String[] args) 
        {
          double myDouble = 9.78d;
          int myInt = (int) myDouble; // Double -> int 

          System.out.println(myDouble); //output- 9.78
          System.out.println(myInt); //output- 9
        }
       }
