package ydovbyshenko.person;

import org.w3c.dom.ls.LSOutput;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар"),
                new Person("Alice", 28, "Архітектор")
        };

        for (int i = 0; i < persons.length; i++) {
            persons[i].printInfo();
        }

        System.out.println("\n\n");
        persons[3].switchProfession("Дизайнер");
        for (int i = 0; i < persons.length; i++) {
            persons[i].printInfo();
        }
    }
}
