package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class AddSandwich {
    // need to change the while loop to something else bc instead of printing the bread menu it goes straight to the meat/ need to do a do while loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select the following to build your sandwich:  ");

        ArrayList<String> sandwich = new ArrayList<>();
        // select bread

        boolean choiceBread = true;
        while (choiceBread){
            System.out.println("Please select your bread of choice:   ");
            System.out.println("1. White Bread");
            System.out.println("2. Wheat Bread");
            System.out.println("3. Rye Bread ");
            System.out.println("4. Wrap ");

        // customer choice
        int breadChoice = scanner.nextInt();
        switch (breadChoice) {
            case 1:
                sandwich.add(" White Bread");
                boolean validBreadOption = true;
                break;
            case 2 :
                sandwich.add("Wheat Bread");
                validBreadOption = true;
                break;
            case 3 :
                sandwich.add("Rye Bread");
                validBreadOption = true;
                break;
            case 4:
                sandwich.add("Wrap");
                validBreadOption = true;
                break;
            default:
                System.out.println("Invalid option , please select a valid option ");
        }
        boolean validMeatChoice = false;
        if (!validMeatChoice){
            System.out.println(" Please select your choose of meat");
            System.out.println("1. Steak ");
            System.out.println("2. Ham");
            System.out.println("3. Salami");
            System.out.println("4. Roast Beef");
            System.out.println("5. Chicken");
            System.out.println("Bacon");

            int meatChoice = scanner.nextInt();
            switch (meatChoice) {
                case 1 -> {
                    sandwich.add("Steak");
                    validMeatChoice = true;
                }
                case 2 -> {
                    sandwich.add("Ham");
                    validMeatChoice = true;
                }
                case 3 -> {
                    sandwich.add("Salami");
                    validMeatChoice = true;
                }
                case 4 -> {
                    sandwich.add(" Roast Beef");
                    validMeatChoice = true;
                }
                case 5 -> {
                    sandwich.add("Chicken");
                    validMeatChoice = true;
                }
                default -> System.out.println("Invalid choice, please select from the following options :");
                // add system.out asking the user if they wanted extra meat , add if else statement and just add the price of addtional meats

            }




        }

    }
}}
