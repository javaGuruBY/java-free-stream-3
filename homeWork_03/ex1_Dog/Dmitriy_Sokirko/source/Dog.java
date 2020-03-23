public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public  void sleep() {
        System.out.println("sleep");
    }

    public  void eat() {
        System.out.println("eat");
    }

    public  void voice() {
        System.out.println("bark");
    }
}
