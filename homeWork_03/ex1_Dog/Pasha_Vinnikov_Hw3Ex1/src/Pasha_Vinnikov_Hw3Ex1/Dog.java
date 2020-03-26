package Pasha_Vinnikov_Hw3Ex1;

public class Dog {
    public int age;
    public String colour;
    public String name;
    public void voice(){
        System.out.println("Гав, гав!!! Я Шарик!");
    };
    public void eat(){
        System.out.println("Когда я ем, я глух и нем!");
    };
    public void sleep(){
        System.out.println("Шарик спит.");
    };
}
class DogDemo {
    public static void main(String[] args) {
        Dog sharik = new Dog();
        sharik.age = 3;
        sharik.colour = "черный";
        sharik.name = "Шарик";
        sharik.voice();
        sharik.eat();
    }
}