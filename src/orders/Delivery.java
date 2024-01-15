package orders;

import model.Order;

public class Delivery implements Order {
    private static final String CURRENCY = "USD";
    private String productName;
    private int quantity;
    private int price;

    @Override
    public double calclulateTotalCost() {
        return 0;
    }
}
