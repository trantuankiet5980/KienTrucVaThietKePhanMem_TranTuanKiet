package stateStrategyDecoratorPattern.bai01;

public class Delivered implements Order {
    @Override
    public void handleRequet(OrderContext context) {
        System.out.println("Đã giao: Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
