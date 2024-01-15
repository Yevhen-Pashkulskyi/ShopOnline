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
        return 0;
    }
}
