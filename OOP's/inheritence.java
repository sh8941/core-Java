// Inheritance is one of the pillars of Object Oriend Programming.
// Inheritance is used to aquare the property(attributes and methods) in child from parent class.
// Inherritance can achieved with the help of exntends keyword in Java.
// Which class aquire properties of another class that konwn as child class, sub class or derived class.
// Which class properties inherited known as parent class, super class or base class.

// There are fives typed of inheritance in java
// 1. Where a single child class inherited from a parent class known as single inheritance.
// 2. Where a class inherited from a child class known ass multilevel inheritance.
// 3. Where multiple child classes inherited from in single parent class known as Hierarchical inheritance.
// 4. Where a combination of more than one type of inheritance known as hybrid inheritance.
// -> multiple inheritance in not supported by Java

// example of Hierarchical Inheritance given below

// base class
class Computer{
    public void start(){
        System.out.println("Your device has started.");
    }
}

// derived class
class Laptop extends Computer{
    public void runCode(){
        System.out.println("Code is running.");
    }
}

// derived class
class Mobile extends Computer{
    public void playMusic(){
        System.out.println("Music is playing.");
    }
}

public class inheritence{
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.start(); // start() mehtod is not defined in the laptop class but it inherited from the Computer class.
        Mobile mob = new Mobile();
        mob.start(); // start() method is not defined in the laptop class but it inherited from the Computer class.
    }
}