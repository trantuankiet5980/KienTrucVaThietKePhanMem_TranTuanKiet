package factoryPattern.factoryMethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("B");
        product.use();
    }
}
