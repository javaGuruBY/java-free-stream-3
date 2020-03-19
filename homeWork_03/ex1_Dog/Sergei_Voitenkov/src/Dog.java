class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog(String name, int age, String color) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void dogDescription() {
        if (name == null && age <= 0) {
            System.out.println("У собаки нет имени. Возраст собаки неизвестен. Шерсть собаки окрашена в "
                    + color + " цвет.");
        } else if (age <= 0) {
            System.out.println("Собаку зовут " + name + "." + " Возраст собаки неизвестен. Шерсть собаки окрашена в "
                    + color + " цвет.");
        } else {
            System.out.println("Собаку зовут " + name + "." + " Возраст собаки " + age + " лет. "
                    + "Шерсть собаки окрашена в " + color + " цвет.");
        }

    }

    void voice() {
        if (name == null) {
            System.out.println("Собака лаит - " + "Гав-Гав.");
        } else System.out.println(name + " лаит - " + "Гав-Гав.");

    }

    void eat() {
        if (name == null) {
            System.out.println("Собака кушает.");
        } else System.out.println(name + " кушает.");

    }

    void sleep() {
        if (name == null) {
            System.out.println("Собака спит.");
        } else System.out.println(name + " спит");

    }
}
