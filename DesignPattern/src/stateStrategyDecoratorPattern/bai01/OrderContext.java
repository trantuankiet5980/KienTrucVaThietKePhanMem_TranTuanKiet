package stateStrategyDecoratorPattern.bai01;

public class OrderContext {
    private Order order;

    public OrderContext() {
        this.order = new NewOrder();
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void process() {
        order.handleRequet(this);
    }
}
