# Java Learning - Day 9

## Welcome to this Day-9 directory!

>  In this directory, I wanna share about the **Operators** in Java.

## Operators

Operators in Java are the symbols used for performing specific operations in Java. Operators make tasks like addition, multiplication, etc which look easy although the implementation of these tasks is quite complex.

### Types fo Operators in Java
- Arithmetic Operators
- Unary Operators
- Shift Operators
- Relational Operators
- Bitwise Operators
- Logical Operators
- Ternary Operators and
- Assignment Operators

### Java Operator Precedence

<table>
  <tr>
    <th>Operators</th>
    <th>Category</th>
    <th>Precedence </th>
  </tr>
  <!-- arithmetic -->
  <tr>
    <td rowspan="5">Arithmetic</td>
    <td>Addition</td>
    <td>+ </td>
  </tr>
  <tr>
    <td>Subtraction</td>
    <td>-</td>
  </tr>
  <tr>
    <td>Multiplication</td>
    <td>*</td>
  </tr>
  <tr>
    <td>Division</td>
    <td>/</td>
  </tr>
  <tr>
    <td>Modulus</td>
    <td>%</td>
  </tr>
<!-- unary -->
  <tr>
    <td rowspan="2">Unary</td>
    <td>postfix</td>
    <td>expr++, expr--</td>
  </tr>
  <tr>  
    <td>prefix</td>
    <td>++expr, --expr, +expr, -expr, ~</td>
  </tr>
 <!--shift-->
  <tr>
    <td>Shift</td>
    <td>shift</td>
    <td><<, >>, >>></td>
  </tr>
<!-- relational -->
  <tr>
    <td rowspan="6">Relational</td>
    <td>Equal to</td>
    <td>==</td>
  </tr>
  <tr>
    <td>Not Equal</td>
    <td>!=</td>
  </tr>
  <tr>
    <td>Greater Than</td>
    <td>></td>
  </tr>
   <tr>
    <td>Less Than</td>
    <td><</td>
  </tr>
   <tr>
    <td>Greater Than or Equal to</td>
    <td>>=</td>
  </tr>
   <tr>
    <td>Less Than or Equal to</td>
    <td><=</td>
  </tr>
<!-- bitwise -->
  <tr>
    <td rowspan="3">Bitwise</td>
    <td>Bitwise AND</td>
    <td>&</td>
  </tr>
  <tr>
    <td>Bitwise Exclusive OR</td>
    <td>^</td>
  </tr>
  <tr>
    <td>Bitwise inclusive OR</td>
    <td>|</td>
  </tr>
<!--logical  -->
  <tr>
    <td rowspan="3">Logical</td>
    <td>Logical AND</td>
    <td>&&</td>
  </tr>
  <tr>
    <td>Logical OR</td>
    <td>||</td>
  </tr>
  <tr>
    <td>Logical NOT</td>
    <td>!</td>
  </tr>
<!-- ternary -->
  <tr>
    <td>Ternary</td>
    <td>Ternary</td>
    <td>?, :</td>
  </tr>
<!-- assignment -->
  <tr>
    <td>Assignment</td>
    <td>assignment</td>
    <td> =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=</td>
  </tr>
</table>

### Here is the program for the Operators Mentioned above

    import java.util.*;
      public class OperatorsExample {
       public static void main(String[] args) {
    
        // Arithmetic operators
           int a = 10;
           int b = 5;
           int addition = a + b;
           int subtraction = a - b;
           int multiplication = a * b;
           int division = a / b;
           int modulus = a % b;

           System.out.println("----Arithmetic operators----");
           System.out.println("Addition: " + addition);
           System.out.println("Subtraction: " + subtraction);
           System.out.println("Multiplication: " + multiplication);
           System.out.println("Division: " + division);
           System.out.println("Modulus: " + modulus);

         // Relational operators
            int x = 10;
            int y = 5;

            System.out.println("----Relational operators----");
            System.out.println("x == y: " + (x == y));
            System.out.println("x != y: " + (x != y));
            System.out.println("x > y: " + (x > y));
            System.out.println("x < y: " + (x < y));
            System.out.println("x >= y: " + (x >= y));
            System.out.println("x <= y: " + (x <= y)); 

            // Logical operators
             boolean p = true;
             boolean q = false;

             System.out.println("----Logical operators----");
             System.out.println("p && q: " + (p && q));
             System.out.println("p || q: " + (p || q));
             System.out.println("!p: " + !p);
             
             // explore the day-9 file for the all operators in java program

            }
          }
