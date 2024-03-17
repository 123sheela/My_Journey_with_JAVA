// Parent class
class Parent {
    void display() {
        System.out.println("This is the parent class");
    }
}
// Child class inheriting from Parent
class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class");
    }
}
public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.display();
        child.displayChild();
    }
}
