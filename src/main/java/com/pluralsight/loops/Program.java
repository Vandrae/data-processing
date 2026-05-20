package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        people.add(new Person("Frodo", "Baggins", 50));
        people.add(new Person("Sam", "Gamgee", 38));
        people.add(new Person("Meriadoc", "Brandybuck", 36));
        people.add(new Person("Bilbo", "Baggins", 128));
        people.add(new Person("Aragorn", "Elessar", 87));
        people.add(new Person("Boromir", "Denethorion", 35));
        people.add(new Person("Gimli", "Glóinson", 24));
        people.add(new Person("Legolas", "Greenleaf", 2932));
        people.add(new Person("Gandalf", "the Grey", 10000));
        people.add(new Person("Saruman", "the White", 10000));

        System.out.print("Enter a name (First or Last) : ");
        String nameSearch = input.nextLine();

    }
}
