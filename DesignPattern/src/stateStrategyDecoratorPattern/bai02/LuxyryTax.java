package stateStrategyDecoratorPattern.bai02;

public class LuxyryTax implements Tax {
    @Override
    public double calculateTax(double price) {
        return price * 0.2;
    }
}
