package orders;

import model.Order;

import java.util.Scanner;

public class InStore implements Order {
    private static final String CURRENCY = "USD";
    private String productName;
    private int quantity;
    private double price;

    public InStore() {
        enterOrderDetails();
    }

    private void enterOrderDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву товару: ");
        productName = scanner.nextLine();

        System.out.printf("Введіть кількість %s: ", productName);
        quantity = scanner.nextInt();

        System.out.printf("Введіть вартість %s в %s за шт.:", productName, CURRENCY);
        price = scanner.nextDouble();
    }

    @Override
    public double calculateTotalCost() {
        double totalCoast = quantity * price;

        System.out.println("Підсумок замовлення в магазині: ");
        System.out.printf("Товар: %s\n", productName);
        System.out.printf("Кількість %s: %d\n", productName, quantity);
        System.out.printf("Вартість %s за шт.: %.2f %s\n", productName, price, CURRENCY);
        System.out.printf("Загальа вартітсь %.2f %s", totalCoast, CURRENCY);
        return totalCoast;
    }
}
