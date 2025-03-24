package stateStrategyDecoratorPattern.bai01;

public class NewOrder implements Order {
    @Override
    public void handleRequet() {
        System.out.println("Mới tạo: Kiểm tra thông tin đơn hàng.");
    }
}
