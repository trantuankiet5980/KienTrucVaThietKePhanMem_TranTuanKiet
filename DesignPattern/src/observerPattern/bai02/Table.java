package observerPattern.bai02;
import java.util.ArrayList;
import java.util.List;
public class Table {
    private List<Product> products;
    private CoffeeShop coffeeShop;
    public Table(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
        coffeeShop.updateRevenue(); // Cập nhật doanh thu của quán sau khi thêm sản phẩm
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
