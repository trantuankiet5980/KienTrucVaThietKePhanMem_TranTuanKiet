package stateStrategyDecoratorPattern.bai03;

public class MaGiamGia extends PaymentDecorator {


    public MaGiamGia(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        double discount = amount * 0.1;
        System.out.println("Mã giảm giá: " + discount);
        payment.pay(amount - discount);
    }
}
