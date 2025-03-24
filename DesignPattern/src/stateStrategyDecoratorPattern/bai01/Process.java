package stateStrategyDecoratorPattern.bai01;

public class Process implements Order {
    @Override
    public void handleRequet(OrderContext context) {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển.");
        context.setOrder(new Delivered());
    }
}
