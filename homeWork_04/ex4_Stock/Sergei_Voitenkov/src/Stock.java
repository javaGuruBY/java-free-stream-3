public class Stock {
    String nameCompany;
    int currentSharePrice;
    int minimumSharePrice;
    int maximumSharePrice;

    public Stock(String nameCompany, int currentSharePrice) {
        this.nameCompany = nameCompany;
        this.currentSharePrice = currentSharePrice;
        this.minimumSharePrice = currentSharePrice;
        this.maximumSharePrice = currentSharePrice;
    }

    public void updatePrice(int currentSharePrice){
        if (currentSharePrice >= maximumSharePrice){
            maximumSharePrice = currentSharePrice;
        }
        else if (currentSharePrice <= minimumSharePrice){
            minimumSharePrice = currentSharePrice;
        }
        else {this.currentSharePrice = currentSharePrice;
        }

    }

    public void printInformation (){
        System.out.println("Company = " + '"' + nameCompany + '"' + ", Current Price = " + currentSharePrice + ", " +
                "Min Price = " + minimumSharePrice + ", Max Price = " + maximumSharePrice);
    }




}
