package orders;

import model.Order;

import java.util.Scanner;

public class InStore implements Order {
    private static final String CURRENCY = "USD";
    private String productName;
    private int quantity;
    private int price;

    private void enterOrderDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву товару: ");
        productName = scanner.nextLine();

        System.out.printf("Введіть кількість %s: ", productName);
        quantity = scanner.nextInt();

        System.out.printf("Введіть вартість %s в %s за шт.:", productName, CURRENCY);
        price = scanner.nextInt();
    }

    @Override
    public double calclulateTotalCost() {
        double totalCoast = quantity * price;
        return totalCoast;
    }
}
