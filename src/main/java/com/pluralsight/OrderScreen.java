package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderScreen {
    private static List<String> orderItems = new ArrayList<>();
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        displayOrderScreen();

    }
    private static void displayOrderScreen() {
        while (true){
            System.out.println("-------------------------");
            System.out.println("Order Screen");
            System.out.println("-------------------------");
            System.out.println("All entries show the newest entries first:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            System.out.println("Enter your choice:  ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSandwich();
                break;
                case 2:
                    addDrink();
                break;
                case 3:
                    addChips();
                break;
                case 4:
                    checkout();
                    return;/// exit order screen 
                case 0:
                    cancelOrder();
                    return;
                default:
                    System.out.println("Please select a valid options : ");
                
            }
        }

    }

    private static void cancelOrder() {
    }

    private static void checkout() {
    }

    private static void addChips() {
    }

    private static void addDrink() {
    }

    private static void addSandwich() {
        
    }
}

