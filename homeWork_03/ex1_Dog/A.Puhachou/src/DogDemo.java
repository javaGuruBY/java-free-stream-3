public class DogDemo {
    public static void main(String[] args) {
        Dog Dog = new Dog();
        System.out.println("Hello, my name is " + Dog.name + ".");
        System.out.println("I'm " + Dog.age + " years old.");
        System.out.println("I have got a " + Dog.color + " color coat.");
        System.out.println("And! Yes! I can speak in English too!");
        Dog.voice();
        Dog.eat();
        Dog.sleep();

    }
}
