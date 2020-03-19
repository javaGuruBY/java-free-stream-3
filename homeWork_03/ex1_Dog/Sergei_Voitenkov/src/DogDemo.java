public class DogDemo {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Джек", 3, "Белый");
        dog1.dogDescription();
        dog1.sleep();
        dog1.voice();
        dog1.eat();
        System.out.println();

        Dog dog2 = new Dog("Жорик", "Белый");
        dog2.dogDescription();
        dog2.sleep();
        dog2.voice();
        dog2.eat();
        System.out.println();

        Dog dog3 = new Dog( "Белый");
        dog3.dogDescription();
        dog3.sleep();
        dog3.voice();
        dog3.eat();
        System.out.println();

    }
}
