# Java Learning - Day 21

## Welcome to this Day-21 directory!
> In this direcory, I've shared about **The Encapsulation** in Java.

## Encapsulation 

 The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 To achieve this, you must:

- declare class variables/attributes as private
- provide public get and set methods to access and update the value of a private variable

## Get and Set
 In previous chapters,I have shared that private variables can only be accessed within the same class (an outside class has no access to it).

 However, it is possible to access them if we provide public get and set methods.

 The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

### Example

    public class Person {
     private String name; // private = restricted access

    // Getter
     public String getName() {
        return name;
      }

    // Setter
        public void setName(String newName) {
        this.name = newName;
        }
    }

### Example Explained
 
 The get method returns the value of the variable name.

 The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.


## Example 

   public class Main {
    public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
    }
    }