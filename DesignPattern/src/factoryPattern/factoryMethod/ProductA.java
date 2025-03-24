package factoryPattern.factoryMethod;

public class ProductA implements Product{
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}
