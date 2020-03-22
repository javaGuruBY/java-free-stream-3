package by.Art.Hw3Task2;

public class Human {
    private String name;
    private int age;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet () {
        System.out.printf("Hi! My name is %s, I'm %d years old\n", name, age);
    }
}
