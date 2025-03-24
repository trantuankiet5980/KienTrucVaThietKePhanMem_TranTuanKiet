package stateStrategyDecoratorPattern.bai02;

public class Product {
    private String name;
    private double price;
    private Tax taxStrategy;

    public Product(String name, double price, Tax taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(Tax taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double getPriceWithTax() {
        return price + taxStrategy.calculateTax(price);
    }

    public void displayInfo() {
        System.out.println(name + " - Giá sau thuế: " + getPriceWithTax());
    }
}
