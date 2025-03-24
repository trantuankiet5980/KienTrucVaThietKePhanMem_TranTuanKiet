package stateStrategyDecoratorPattern.bai03;

public class DecoratorMain {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment();
        Payment paypal = new PaypalPayment();

        System.out.println("Thanh toán qua thẻ tín dụng với phí xử lý:");
        Payment fee = new PhiXuLy(credit);
        fee.pay(1000);

        System.out.println("\nThanh toán qua Paypal với phí xử lý:");
        Payment discount = new PhiXuLy(paypal);
        discount.pay(1000);

        System.out.println("\nThanh toán qua thẻ tín dụng với cả phí xử lý và mã giảm giá:");
        Payment feeAndDiscount = new PhiXuLy(new MaGiamGia(credit));
        feeAndDiscount.pay(1000);
    }
}
