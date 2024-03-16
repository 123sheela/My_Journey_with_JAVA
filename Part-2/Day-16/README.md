# Java Learning - Day 16

## Welcome to this Day-16 directory!

>  In this direcory, I've explained about **The Classes & Objects** in Java.

Everything in Java is associated with classes and objects, along with its attributes and methods.

## Classes

- A Class is like an object constructor, or a "blueprint" for creating objects.

### How to create a Class

- To create a class, use the keyword **class**:

For Example:

    //Creating a class named "Main" with a variable a:

    public class Main
    {
        int a=15;
    }

## Objects

- In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

- To create an object of Main, specify the class name, followed by the object name, and use the keyword **new**:

### How to create a Object
For Example:

    //Create an object called "obj" and print the value of a:

    public class Main 
    {
        int a = 15;

        public static void main(String[] args) 
        {
         Main myObj = new Main();
         System.out.println(myObj.a);
        }
    }

## Sample program using class and object
![objects](https://github.com/123sheela/My_Journey_with_JAVA/assets/91262191/32f7ff2f-7bd4-4264-8dd0-9eddb95f31f5)

#### Output
![output](https://github.com/123sheela/My_Journey_with_JAVA/assets/91262191/5ea03e10-df34-4e6e-86d4-c21a65486069)

