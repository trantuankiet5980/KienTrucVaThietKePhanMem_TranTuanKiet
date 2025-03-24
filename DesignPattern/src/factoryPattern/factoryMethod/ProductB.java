package factoryPattern.factoryMethod;

public class ProductB implements Product{

    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}
