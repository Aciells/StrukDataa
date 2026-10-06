// Pesanan makanan milik pelanggan
public class FoodOrder {
    private String orderCode;
    private Customer<?> customer;   // wildcard: ID pelanggan boleh bertipe apa saja
    private String menuName;
    private FoodCategory category;

    public FoodOrder(String orderCode, Customer<?> customer, String menuName, FoodCategory category) {
        this.orderCode = orderCode;
        this.customer = customer;
        this.menuName = menuName;
        this.category = category;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public Customer<?> getCustomer() {
        return customer;
    }

    public String getMenuName() {
        return menuName;
    }

    public FoodCategory getCategory() {
        return category;
    }
}