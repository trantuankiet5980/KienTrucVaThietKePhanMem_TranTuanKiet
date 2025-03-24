package stateStrategyDecoratorPattern.bai01;

public class StateMain {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();
        context.setOrder(new NewOrder());
        context.process();

        context.setOrder(new Process());
        context.process();

        context.setOrder(new Delivered());
        context.process();

        context.setOrder(new Canceled());
        context.process();
    }
}
