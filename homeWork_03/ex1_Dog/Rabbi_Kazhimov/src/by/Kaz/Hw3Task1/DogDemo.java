package by.Kaz.Hw3Task1;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Муха", "Черный", 2);
        Dog dog2 = new Dog("Рекс", "Рыжий", 3);
        Dog dog3 = new Dog("Бетховен", "Белый", 4);
        System.out.println("Первая собака");
        dog1.sleep();
        dog1.voice();
        dog1.eat();
        System.out.println("Вторая собака");
        dog2.voice();
        dog2.eat();
        dog2.sleep();
        System.out.println("Третья собака");
        dog3.eat();
        dog3.sleep();
        dog3.voice();

        System.out.println("Имя первой собаки " + dog1.getName() + ", его цвет " + dog1.getColor() + ", ему " + dog1.getAge() + " год(а)\n");
        System.out.println("Имя первой собаки " + dog2.getName() + ", его цвет " + dog2.getColor() + ", ему " + dog2.getAge() + " год(а)\n");
        System.out.println("Имя первой собаки " + dog3.getName() + ", его цвет" + dog3.getColor() + ", ему " + dog3.getAge() + " год(а)\n");
    }
}

