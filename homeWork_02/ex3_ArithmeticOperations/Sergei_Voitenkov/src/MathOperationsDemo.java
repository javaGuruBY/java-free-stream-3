public class MathOperationsDemo {
    public static void main(String[] args) {

        double carPriceMercedes = 35000;       // стоимость автомобиля Мерседес.
        double carPriceGeely = 12000;          // стоимость автомобиля Джили.
        double carPriceRenault = 15800;        // стоимость автомобиля Рено.
        double carPriceBugatti = 70002;        // стоимость автомобиля Бугатти.
        double carPriceToyota = 23000;         // стоимость автомобиля Тайота.
        double numberCarSold = 5;              // количнство атомобилей.
        double percentDiscountOnMercedes = 10;      // скидка на автомобиль Мерсодес в процентах

        // расчитываем общую стоимость автомобилей.
        double costAllCars = carPriceMercedes + carPriceGeely + carPriceRenault + carPriceBugatti + carPriceToyota;
        double averageCarPrice = costAllCars / numberCarSold; // средняя стоимость.
        double discountForMercedes = carPriceMercedes / 100 * percentDiscountOnMercedes; // сумма скидки.
        double discountPriceMercedes = carPriceMercedes - discountForMercedes; // стоимость Mercedes с учетом скидки.
        String parityCar;  // четное или нечетное количество автомобилей.
        if (numberCarSold % 2 == 0){  // ищем остаток от количества автомоиблей, если остток есть, значит нечетное.
            parityCar = "- Четное.";
        } else {parityCar = "- Нечетное.";}

        System.out.println("Стоимость автомобиля Mercedes = " + carPriceMercedes + " USD" + '\n' +
                "Скидка на автомобиль Mercedes = " + discountForMercedes + " USD" + '\n' +
                "Стоимость автомобиля Mercedes с учетом скидки ="
                + discountPriceMercedes + " USD" );
        System.out.println("Стоимость автомобиля Geely = " + carPriceGeely + " USD");
        System.out.println("Стоимость автомобиля Renault = " + carPriceRenault + " USD");
        System.out.println("Стоимость автомобиля Bugatti = " + carPriceBugatti + " USD");
        System.out.println("Стоимость автомобиля Toyota = " + carPriceToyota + " USD");
        System.out.println("Общая стоимость всех автомобилей = " + costAllCars + " USD");
        System.out.println("Средняя стоимость автомобиля = " + averageCarPrice + " USD");
        System.out.println("Количество автомобилей в продаже " + numberCarSold + ". " + '\n' +
                            "- Количество автомобилей четное?" + '\n' + parityCar);
    }
}
