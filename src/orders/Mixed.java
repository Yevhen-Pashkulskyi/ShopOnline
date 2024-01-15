package orders;

import model.Order;

public class Mixed implements Order {
    private static final double DELIVERY_COST_PERCENTAGE = 20.0;
    private static final String CURRENCY = "USD";
    private String productName;
    private int pickupQuantity;
    private int deliveryQuantity;
    private double price;

    @Override
    public double calculateTotalCost() {
        return 0;
    }
}
