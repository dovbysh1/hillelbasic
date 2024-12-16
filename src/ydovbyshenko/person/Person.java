package ydovbyshenko.person;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void printInfo() {
        System.out.printf("Ім'я: %s, Вік: %d, Професія: %s\n", name, age, profession);
    }

    public void switchProfession(String profession) {
        this.profession = profession;
    }
}
