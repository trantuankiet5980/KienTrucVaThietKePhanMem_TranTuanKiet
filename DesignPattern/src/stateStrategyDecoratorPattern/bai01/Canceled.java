package stateStrategyDecoratorPattern.bai01;

public class Canceled implements Order {
    @Override
    public void handleRequet() {
        System.out.println("Hủy: Hủy đơn hàng và hoàn tiền.");
    }
}
