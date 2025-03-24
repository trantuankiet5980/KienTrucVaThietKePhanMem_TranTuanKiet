package stateStrategyDecoratorPattern.bai02;

public class StrategyMain {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, new VATTax());
        Product product2 = new Product("Nước ngọt", 5, new ConsumptionTax());
        Product product3 = new Product("Đồng hồ Rolex", 5000, new LuxyryTax());

        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();

        // Thay đổi chiến lược thuế cho sản phẩm 1
        product1.setTaxStrategy(new LuxyryTax());
        product1.displayInfo();
    }
}
