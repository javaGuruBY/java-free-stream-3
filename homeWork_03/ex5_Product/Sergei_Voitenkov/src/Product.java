public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice(){
        return getRegularPrice() * (100 - getDiscount()) / 100;
    }

    void printInformation(){
        System.out.print("Product : name = \""  + getName() + "\", " );
        System.out.print("regular price = " + getRegularPrice() + " EUR, ");
        System.out.print("discount = " + ((int) getDiscount()) + "%, ");
        System.out.println("actual price = " + actualPrice() + " EUR");
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
