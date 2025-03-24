package factoryPattern.factoryAbstract;

public class FactoryAbstractMain {
    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();
        Button button = factory.createButton();
        button.paint();

        factory = new WindowsFactory();
        button = factory.createButton();
        button.paint();
    }
}
