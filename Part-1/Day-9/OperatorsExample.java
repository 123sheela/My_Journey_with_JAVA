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
    
// Assignment operators
    int c = 10;
    c += 5; // Equivalent to c = c + 5;
    System.out.println("----Assignment operators----");
    System.out.println("c: " + c);

// Unary operators
      int d = 10;
    int e = -d; // Unary minus
    boolean flag = true;
    boolean result = !flag; // Unary logical complement
    
    System.out.println("----Unary operators----");
    System.out.println("Unary Minus: " + e);
    System.out.println("Unary Logical Complement: " + result);

// Ternary operator
    int m = 10;
    int n = 5;
    int max = (m > n) ? m : n;
    System.out.println("----Ternary operators----");
    System.out.println("Max value: " + max);
    
// Bitwise operators
    int num1 = 5; // Binary: 0101
    int num2 = 3; // Binary: 0011
    
    int bitwiseAnd = num1 & num2; // Bitwise AND (result: 1)
    int bitwiseOr = num1 | num2;  // Bitwise OR (result: 7)
    int bitwiseXor = num1 ^ num2; // Bitwise XOR (result: 6)
    int bitwiseComplement = ~num1; // Bitwise Complement (result: -6)

    System.out.println("----Bitwise operators----");
    System.out.println("Bitwise AND: " + bitwiseAnd);
    System.out.println("Bitwise OR: " + bitwiseOr);
    System.out.println("Bitwise XOR: " + bitwiseXor);
    System.out.println("Bitwise Complement: " + bitwiseComplement);
    
// Shift operators
    int num = 8; // Binary: 1000
    int leftShift = num << 1; // Left shift by 1 (result: 16)
    int rightShift = num >> 1; // Right shift by 1 (result: 4)
    int zeroFillRightShift = num >>> 1; // Zero-fill right shift by 1 (result: 4)
    
    System.out.println("----Shift operators----");
    System.out.println("Left Shift: " + leftShift);
    System.out.println("Right Shift: " + rightShift);
  }
}
