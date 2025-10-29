package oop.constructor.examples.ONE;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Age? ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Name? ");
        String name = scan.nextLine();


        Person pson1 = new Person(age, name);
        Person pson2 = new Person(25, "Zebab");


        System.out.println(pson1);
        System.out.println(pson2);

        scan.close();
    }
}
