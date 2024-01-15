package orders;

import model.Order;

import java.util.Scanner;

public class Delivery implements Order {
    private static final String CURRENCY = "USD";
    private String productName;
    private int quantity;
    private double price;

    private void enterOrderDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву товару: ");
        productName = scanner.nextLine();

        System.out.printf("Введіть кількість %s: ", productName);
        quantity = scanner.nextInt();

        System.out.printf("Введіть вартість %s за шт.:", productName);
        price = scanner.nextDouble();
    }
    @Override
    public double calclulateTotalCost() {
        return 0;
    }
}
