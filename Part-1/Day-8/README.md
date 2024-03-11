# Java Learning - Day 8

## Welcome to this Day-8 directory!

>  In this directory, I'm gonna talk about the **Literals and Keywords** in Java.

## Literals
> In java, the Literal is a notation that represents a fixed value in the source code.In lexical analysis, literals of a given type are generally known as tokens.
>
> Literals are the constant values that appear directly in the program. It can be assigned directly to a variable. Java has various types of literals.

## Types of Literals

- Integer Literal
- Character Literal
- String Literal
- Boolean Literal
  
## 1. Integer Literals
> Integer literals are sequences of digits. There are four types of integer literals 
### i) Decimal Integer
> These are the set of numbers that consist of digits from 0 to 9.It may have a positive (+) or negative (-) . For example, 5678, +657, -89, etc.

       int decVal = 26;

### ii) Octal Integer
> It is a combination of number have digits from 0 to 7 with a leading 0. For example, 045, 026.

     int octVal = 067;  

### iii) Hexa-Decimal
> The sequence of digits preceded by 0x or 0X is considered as hexadecimal integers.It may also include a character from a to f or A to F that represents numbers from 10 to 15, respectively. For example, 0xd, 0xf,

    int hexVal = 0x1a;  

### iv) Binary Integer
> Base 2, whose digits consists of the numbers 0 and 1.
Prefix 0b represents the Binary system. For example, 0b11010.

    int binVal = 0b11010;  

## 2. Character Literals
> A character literal is expressed as a character or an escape sequence, enclosed in a single quote ('') mark. It is always a type of char. For example, 'a', '%', '\u000d', etc.

      char li = 'a';

## 3. String Literals 
> String literal is a sequence of characters that is enclosed between double quotes ("") marks. It may be alphabet, numbers, special characters, blank space, etc. For example, "Jack", "12345", "\n", etc.

      String s = "Jack";

## 4. Boolean Literals
> Boolean literals are the value that is either true or false. It may also have values 0 and 1. For example, true, 0, etc.

     boolean isEven = true;  

## Backslash Literals 
> Java supports some special backslash character literals known as backslash literals. They are used in formatted output.

     \n: It is used for a new line
     \t: It is used for horizontal tab
     \b: It is used for blank space
     \v: It is used for vertical tab
     \a: It is used for a small beep
     \r: It is used for carriage return
     \': It is used for a single quote
     \": It is used for a double quotes

## Keywords

Java keywords are also known as reserved words. Keywords are particular words that act as a key to a code. These are predefined words by Java so they cannot be used as a variable or object name or class name.

> A list of Java keywords or reserved words are given below:

                                          
     abstract      finally        public       
     boolean       float          return 
     break         for            short
     byte          if             static
     case          implements     strictfp           
     catch         import         switch             
     char          instanceof     super      
     class         int            synchronized
     continue      interface      this      
     default       long           throw  
     do            native         throws  
     double        new            transient
     else          null           try  
     enum          package        void   
     extends       private        volatile
     final         protected      while                
                                   
                                   
