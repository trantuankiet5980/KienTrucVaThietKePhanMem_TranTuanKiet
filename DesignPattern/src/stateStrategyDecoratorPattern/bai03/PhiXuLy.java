package stateStrategyDecoratorPattern.bai03;

public class PhiXuLy extends PaymentDecorator {
    public PhiXuLy(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        double fee = amount * 0.02;
        System.out.println("Phí xử lý: " + fee);
        payment.pay(amount + fee);
    }
}
