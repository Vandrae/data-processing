package com.pluralsight.loops;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

//        List<Person> searchMatch = new ArrayList<>();
        //ability to ask for more than 1 name
        List<Person> searchMatch = people.stream()
                .filter(person -> nameSearch.equalsIgnoreCase(person.getFirstName()) ||
                        nameSearch.equalsIgnoreCase(person.getLastName()))
                .toList();

        for (Person person:searchMatch) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        double total = 0;
        for (Person person:people){
            total += person.getAge();

        }
        total /= people.size();
        System.out.println("The average age of everyone on the list is: " + total);
    }
}
