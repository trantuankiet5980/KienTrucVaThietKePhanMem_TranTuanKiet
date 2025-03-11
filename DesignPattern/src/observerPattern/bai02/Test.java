package observerPattern.bai02;

public class Test {
    public static void main(String[] args) {
        Product coffee = new Product("Cà phê", 30000);
        Product water = new Product("Nước suối", 10000);
        Product milkTea = new Product("Trà sữa", 40000);

        CoffeeShop coffeeShop = new CoffeeShop();

        Table table1 = new Table(coffeeShop);
        Table table2 = new Table(coffeeShop);

        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        table1.addProduct(coffee);
        table1.addProduct(water);

        table2.addProduct(milkTea);

        coffeeShop.updateRevenue();

        table1.addProduct(milkTea);
        coffeeShop.updateRevenue();
    }
}
