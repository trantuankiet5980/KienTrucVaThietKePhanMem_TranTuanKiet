package stateStrategyDecoratorPattern.bai01;

public class Canceled implements Order {
    @Override
    public void handleRequet(OrderContext context) {
        System.out.println("Hủy: Hủy đơn hàng và hoàn tiền.");
    }
}
