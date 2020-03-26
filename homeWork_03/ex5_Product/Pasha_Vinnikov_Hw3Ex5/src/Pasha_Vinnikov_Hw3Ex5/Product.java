package Pasha_Vinnikov_Hw3Ex5;

public class Product {
    public String name;
    public double price;
    public double discount;
    public Product(String name){
        this.name = name;
    }
    public double actualPrice(){
        return this.price - (this.price * this.discount / 100);
    }
    public void printInformation(){
        System.out.println("Name - " + name + ";");
        System.out.println("Price = " + price + "$;");
        System.out.println("Discount = " + discount + "%");
        System.out.println("Actual price = " + actualPrice() + "$.");
    }
}
class ProductDemo{
    public static void main(String[] args) {
    Product product = new Product("АКМ");
    product.price = 1200;
    product.discount = 15;
    product.printInformation();
    }
}
