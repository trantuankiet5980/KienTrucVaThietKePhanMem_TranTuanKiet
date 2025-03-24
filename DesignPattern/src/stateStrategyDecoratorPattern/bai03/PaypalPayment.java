package stateStrategyDecoratorPattern.bai03;

public class PaypalPayment implements Payment {
    @Override
    public void pay( double amount ) {
        System.out.println("Thanh toán " + amount + " bằng Paypal");
    }
}
