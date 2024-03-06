# Java Learning - Day 6

## Welcome to this Day-6 directory!

> In this directory, I'm gonna share about the data types in Java.

 ## Data Types

 - In Java, a datatype specifies the sizes and values that can be stored in the variable.
 - Java provides several built-in datatypes that developers can use to declare variables and define methods
 -  These datatypes can be classified into two categories: 
   
    **primitive datatypes** and **reference datatypes**

 ## 1. Primitive Datatypes
  > They represent single values, and they are not objects. There are eight primitive datatypes which are 
   
   - **byte, short, int, long, float, double, boolean and char**
  
### Let's see the sizes and Ranges of Primitive Datatypes.

<table>
  <tr>
    <th>DataType</th>
    <th>Size</th>
    <th>Range of Values </th>
  </tr>
  <tr>
    <td>byte</td>
    <td>1 byte</td>
    <td>Stores whole numbers from -128 to 127</td>
  </tr>
  <tr>
    <td>short</td>
    <td>2 bytes</td>
    <td>Stores whole numbers from -32,768 to 32,767</td>
  </tr>
  <tr>
    <td>int</td>
    <td>4 bytes</td>
    <td>Stores whole numbers from -2,147,483,648 to 2,147,483,647
</td>
  </tr>
   <tr>
    <td>long</td>
    <td>8 bytes</td>
    <td>Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807</td>
  </tr>
   <tr>
    <td>float</td>
    <td>4 bytes</td>
    <td>Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
</td>
  </tr>
   <tr>
    <td>double</td>
    <td>8 bytes</td>
    <td>Stores fractional numbers. Sufficient for storing 15 decimal digits
</td>
  </tr>
   <tr>
    <td>boolean</td>
    <td>1 bit</td>
    <td>Stores true or false values</td>
  </tr>
   <tr>
    <td>char</td>
    <td>2 bytes</td>
    <td>Stores a single character/letter or ASCII values</td>
  </tr>
</table>

 ## 2. Reference Datatypes
  > These datatypes are used to create objects and arrays. They are references to objects in memory rather than the actual objects themselves. Some common reference datatypes include:

  - classes
  - Interfaces
  - Arrays  

    ###  Example program for Data types 

   ``` bash
  public class DataTypesExample 
  {
    public static void main(String[] args) 
    {
        // Primitive datatypes
        byte myByte = 10;
        short myShort = 100;
        int myInt = 1000;
        long myLong = 1000000L;
        float myFloat = 3.14f;
        double myDouble = 3.14159;
        char myChar = 'A';
        boolean myBoolean = true;
        
        // Reference datatype
        String myString = "Hello, Java!";
        
        // To print Output
        System.out.println("Primitive Datatypes:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
        
        System.out.println("\nReference Datatype:");
        System.out.println("String: " + myString);
     }
  }

 //You can copy this code and run it in your IDE to see the results for further clarification


 ## Here is the output for this program