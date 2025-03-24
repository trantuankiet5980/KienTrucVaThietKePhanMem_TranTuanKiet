package stateStrategyDecoratorPattern.bai02;

public class VATTax implements Tax {
    @Override
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
