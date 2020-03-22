package by.Art.Hw3Task1;

public class Dog {
    private String name;
    private String color;
    private int age;
    private static int dogsCount = 0;

    public Dog () {
        dogsCount++;
    }
    public Dog (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        dogsCount++;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public  void setAge (int age) {
        this.age = age;
    }
    public String getName () {
        return name;
    }
    public String getColor () {
        return color;
    }
    public int getAge() {
        return age;
    }
    public void voice() {
        System.out.println("орёт.");
    }
    public void eat() {
        System.out.println("что-то точит.");
    }
    public void sleep() {
        System.out.println("дрыхнет.");
    }
    public static int getCountOfDogs () {
        return dogsCount;
    }
}
