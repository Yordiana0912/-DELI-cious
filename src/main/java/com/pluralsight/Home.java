package com.pluralsight;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // allow client to either start order of exit application
        System.out.println("------------------------");
        System.out.println("Welcome to Yordiana Deli");
        System.out.println("------------------------");
        System.out.println("Please start of by selecting an option ");
        System.out.println("1. New Order");
        System.out.println("2. Exit");

        System.out.println("Please enter your option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> newOrder();
            case 2-> {
                System.out.println("Thank you for stopping by , have a great day");
                System.exit(2); // to exit the application
            }
            default -> System.out.println("Invalid selection , please select a valid option ");
        }
        scanner.close();
    }

    private static void newOrder() {
        System.out.println(" Start New order ....");
    }
}
