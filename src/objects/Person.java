package objects;

/****
 * Person.java:
 * - simulates a person (not in the Terminator/Blade Runner sense)
 * - demonstrates defining static/non-static fields and methods
 * - demonstrates calling these methods with two different syntaxes
 ***/

public class Person {

        
    private int money;
    private String name;

    // constructor
    public Person(int money, String name) { 
        this.money = money;
        this.name = name;
    }

    // instance method
    public void printName() { 
        System.out.println("the name is " + name + ".");
    }

    // instance method: return name and age
    // 
    public String toString() { 
        return "Name: " + this.name + " has: " + this.money + " €."; 
    }
  }