# Java Learning - Day 18

## Welcome to this Day-18 directory!

>  In this direcory, I've explained about **What is Polymorphism** in Java.

## Polymorphism
- Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
- Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.


## Example Program for Polymorphism

       import java.util.*;
        // Main.java
        public class Main {
            public static void main(String[] args) {
            Animal animal1 = new Dog(); // Polymorphism: Dog is treated as an Animal
            animal1.makeSound(); // Calls Dog's makeSound() method

            Animal animal2 = new Cat(); // Polymorphism: Cat is treated as an Animal
            animal2.makeSound(); // Calls Cat's makeSound() method
            }
        }

        // Animal.java
        class Animal 
        {
        public void makeSound() {
         System.out.println("Some generic sound");
            }
        }

        // Dog.java
         class Dog extends Animal {
        @Override
        public void makeSound() {
        System.out.println("Woof");
        }
        }

        // Cat.java
        class Cat extends Animal {
        @Override
        public void makeSound() {
        System.out.println("Meow");
        }
    }


#### Copy this code and execute in your IDE.