package main;

import model.Order;
import orders.Mixed;
import orders.InStore;
import orders.Delivery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть тип замовлення:");
        System.out.println("1. Замовлення в магазині");
        System.out.println("2. Замовлення на поставку");
        System.out.println("3. Змішане замовлення (самовивіз і доставка)");

        int choice = scanner.nextInt();
        Order order = null;

        if (choice == 1) {
            order = new InStore();
        } else if (choice == 2) {
            order = new Delivery();
        } else if (choice == 3) {

            order = new Mixed();
        } else {
            System.out.println("Невірний вибір. Вихід...");

        }
        System.out.println();
        double totalCost = order.calculateTotalCost();
    }
}