package orders;

import model.Order;

import java.util.Scanner;

public class Mixed implements Order {
    private static final double DELIVERY_COST_PERCENTAGE = 20.0;
    private static final String CURRENCY = "USD";
    private String productName;
    private int pickupQuantity;
    private int deliveryQuantity;
    private double price;

    public Mixed() {
        enterOrderDetails();
    }

    private void enterOrderDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву товару: ");
        productName = scanner.nextLine();

        System.out.printf("Введіть кількість %s для самовивозу: ", productName);
        pickupQuantity = scanner.nextInt();

        System.out.printf("Введіть кількість %s для доставки: ", productName);
        deliveryQuantity = scanner.nextInt();

        System.out.printf("Введіть вартість за позицію в %s: ", CURRENCY);
        price = scanner.nextDouble();
    }
    @Override
    public double calculateTotalCost() {

        System.out.println("Підсумок замовлення:");
        System.out.printf("Кількість %s для самовивозу: %s\n", productName, pickupQuantity);

        double pickupCost = pickupQuantity * price;
        System.out.printf("Вартість %s для самовивозу: %.2f %s\n", productName, pickupCost, CURRENCY);
        System.out.printf("Кількість %s для доставки: %s\n", productName, deliveryQuantity);

        double deliveryCost = deliveryQuantity * price * (DELIVERY_COST_PERCENTAGE / 100.0);
        double costPickupProduct = deliveryQuantity * price;

        System.out.printf("Вартість доставки %s: %.2f %s\n", productName, deliveryCost, CURRENCY);
        System.out.printf("Вартість %s для доставки %.2f %s\n", productName, costPickupProduct, CURRENCY);

        double totalCost = pickupCost + deliveryCost + costPickupProduct;
        System.out.printf("Загальна вартість (включаючи доставку): %.2f %s", totalCost, CURRENCY);

        return totalCost;
    }
}
