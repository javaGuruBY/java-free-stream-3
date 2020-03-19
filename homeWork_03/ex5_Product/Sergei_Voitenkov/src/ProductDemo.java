public class ProductDemo {
    public static void main(String[] args) {
        // для сравнения результата с заданием
        System.out.println("Требуется: \nProduct : name = \"Milk\", regular price = 0.8 EUR, discount = 20%, actual price = 0.64 EUR \nРезультат:");

        Product product = new Product("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20);
        product.printInformation();




    }
}
