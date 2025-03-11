package observerPattern.bai02;
import java.util.ArrayList;
import java.util.List;
public class CoffeeShop implements Subject{
    private List<Observer> observers;
    private List<Table> tables;
    private double totalRevenue;
    public CoffeeShop() {
        observers = new ArrayList<>();
        tables = new ArrayList<>();
        totalRevenue = 0;
    }
    public void addTable(Table table) {
        tables.add(table);
        attach(new RevenueObserver());
    }

    public void updateRevenue() {
        totalRevenue = 0;
        for (Table table : tables) {
            totalRevenue += table.getTotalAmount();
        }
        notifyObservers(); // Thông báo khi doanh thu thay đổi
    }
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(totalRevenue);
        }
    }
    public double getTotalRevenue() {
        return totalRevenue;
    }
}
