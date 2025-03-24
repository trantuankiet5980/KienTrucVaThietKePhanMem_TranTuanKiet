package factoryPattern.factoryMethod;

public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) return new ProductA();
        else if (type.equalsIgnoreCase("B")) return new ProductB();
        return null;
    }
}
