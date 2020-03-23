package by.Art.HW3Task5;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Milk");
        product1.setRegularPrice(12);
        product1.setDiscount(10);
        product1.printInformation();

        Product product2 = new Product("Potato");
        product2.setRegularPrice(15);
        product2.setDiscount(12);
        product2.printInformation();

    }
}
