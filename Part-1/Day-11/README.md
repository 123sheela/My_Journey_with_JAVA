# Java Learning - Day 11

## Welcome to this Day-11 directory!

>  In this directory, I'm gonna explain about the **Looping Statements** in Java.

## Looping Statements

In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true. However, loop statements are used to execute the set of instructions in a repeated order.
- for loop
- while loop
- do-while loop
  
## 1. for loop

In java, for loop is similar to C and C++. It enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code. We use the for loop only when we exactly know the numbers are used to execute the set of instructions in a repeated order.

**Syntax**:

    for(initialization; condition; increment/decrement) 
    {
        // code block that needs to be executed
    }
   

## 2. for-each loop

Java provides an enhanced for loop to traverse the data structures like array or collection. In the for-each loop, we don't need to update the loop variable. The syntax to use the for-each loop in java is given below.

**Syntax**:
    
     for(data type : object/container) 
     {
         //code block that needs to be executed
     }

## 3. while loop

The while loop is also used to iterate over the number of statements multiple times. However, if we don't know the number of iterations in advance, it is recommended to use a while loop.

**Syntax**:

      while(condition)  
      {
        // code block that needs to be executed 
      }

## 4. do-while loop

The do-while loop checks the condition at the end of the loop after executing the loop statements. When the number of iteration is not known and we have to execute the loop at least oner, we can use do-while loop.

**Syntax**:

      do
      {
        // statements
      }
      while(condition);


// Here You can see the output image for the looping statement in java program. Do check the file named Loop.java for source code

![loop](https://github.com/123sheela/My_Journey_with_JAVA/assets/91262191/95a6dc10-6e38-4c3b-bb1c-59d7c942abd1)

