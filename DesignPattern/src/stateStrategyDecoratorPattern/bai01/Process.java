package stateStrategyDecoratorPattern.bai01;

public class Process implements Order {
    @Override
    public void handleRequet() {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển.");

    }
}
