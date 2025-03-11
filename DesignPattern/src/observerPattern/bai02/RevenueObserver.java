package observerPattern.bai02;

public class RevenueObserver implements Observer{
    @java.lang.Override
    public void update(double totalRevenue) {
        System.out.println("Doanh thu hiện tại của quán: " + totalRevenue + " VNĐ");
    }
}
