package stateStrategyDecoratorPattern.bai01;

public class StateMain {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();
        context.process();
        context.process();
        context.process();

        // Nếu muốn hủy đơn
        context.setOrder(new Canceled());
        context.process();
    }
}
