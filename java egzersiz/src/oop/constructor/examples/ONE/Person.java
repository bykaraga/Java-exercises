package oop.constructor.examples.ONE;

public class Person {
    public String name;
    public int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\n-------------------";
    }
}
