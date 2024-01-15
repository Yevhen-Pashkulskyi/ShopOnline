package orders;

import model.Order;

import java.util.Scanner;

public class Delivery implements Order {
    private static final String CURRENCY = "USD";
    private static final double DELIVERY_COST_PRECENTAGE = 5.0;
    private String productName;
    private int quantity;
    private double price;

    public Delivery() {
        enterOrderDetails();
    }

    private void enterOrderDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву товару: ");
        productName = scanner.nextLine();

        System.out.printf("Введіть кількість %s: ", productName);
        quantity = scanner.nextInt();

        System.out.printf("Введіть вартість %s за шт.:", productName);
        price = scanner.nextDouble();
    }

    public double calculateTotalCost() {
        double deliveryCost = quantity * price * (DELIVERY_COST_PRECENTAGE / 100.0);

        System.out.println("Підсумок замовлення на доставку:");
        System.out.printf("Товар: %s\n", productName);
        System.out.printf("Кількість: %d\n", quantity);
        System.out.printf("Вартість за шт.: %.2f %s\n", price, CURRENCY);
        System.out.printf("Вартість доставки %s: %.2f %s\n", productName, deliveryCost, CURRENCY);

        double totalCost = quantity * price + deliveryCost;
        System.out.printf("Загальна вартість (включаючи доставку): %.2f %s", totalCost, CURRENCY);

        return totalCost;
    }
}
