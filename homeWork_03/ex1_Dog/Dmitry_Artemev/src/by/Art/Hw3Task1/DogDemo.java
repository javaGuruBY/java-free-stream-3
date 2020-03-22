package by.Art.Hw3Task1;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", "Голубой", 3);      //Инициализирую объект через конструктор с параметрами
        Dog dog2 = new Dog("Треугольник", "Белый", 1);  //Инициализирую объект через конструктор с параметрами
        Dog dog3 = new Dog();       //Инициализирую объект с помощью конструктора без параметров
        dog3.setName("Кубик");      //Добавляю имя пса через сеттер
        dog3.setColor("Синий");     //Добавляю цвет пса через сеттер
        dog3.setAge(1);             //Добавляю возраст пса через сеттер

        System.out.println("Общее количество собак: " + Dog.getCountOfDogs()); //Вывожу общее для всех объектов статическое значение

        //Действия псов описанные методами класса Dogs
        System.out.print("Первая собачка ");
        dog1.sleep();
        System.out.print("Вторая собачка ");
        dog2.voice();
        System.out.print("Третья собачка ");
        dog3.eat();

        //Вывод данных о собаках
        System.out.println("Пса №1 зовут " + dog1.getName()+ ", он " + dog1.getColor() + ", ему " + dog1.getAge() + " год(a)\n" +
                            "Пса №2 зовут " + dog2.getName()+ ", он " + dog2.getColor() + ", ему " + dog2.getAge() + " год(a)\n" +
                             "Пса №3 зовут " + dog3.getName()+ ", он " + dog3.getColor() + ", ему " + dog3.getAge() + " год(a)\n");
    }
}
