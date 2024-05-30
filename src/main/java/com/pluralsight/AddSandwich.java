package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddSandwich {
    // need to change the while loop to something else bc instead of printing the bread menu it goes straight to the meat/ need to do a do while loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select the following to build your sandwich:  ");

        ArrayList<String> sandwich = new ArrayList<>();
        String toppings = String.valueOf(new ArrayList<>());
        String sauces = String.valueOf(new ArrayList<>());

        // select bread
        Sandwich1 userSandwich = new Sandwich1("Null", "Null", toppings, sauces,false, 0,"Null", false, false);

        boolean choiceBread = true;
        while (choiceBread){
          try{
            System.out.println("Please select your bread of choice:   ");
            System.out.println("1. White Bread");
            System.out.println("2. Wheat Bread");
            System.out.println("3. Rye Bread ");
            System.out.println("4. Wrap ");

        // customer choice
        int breadChoice = scanner.nextInt();
        switch (breadChoice) {
            case 1:
              //  sandwich.add(" White Bread");
                userSandwich.setBread("White Bread");
                boolean validBreadOption = true;
                break;
            case 2 :
              //  sandwich.add("Wheat Bread");
                userSandwich.setBread("Wheat Bread");
                validBreadOption = true;
                break;
            case 3 :
              //  sandwich.add("Rye Bread");
                userSandwich.setBread("Rye Bread ");
                validBreadOption = true;
                break;
            case 4:
              //  sandwich.add("Wrap");
                userSandwich.setBread("Wrap");
                validBreadOption = true;
                break;
            default:
                System.out.println("Invalid option , please select a valid option ");
        }
            System.out.println(" Please select the size for your sandwich:  ");
            System.out.println("1. 4, Small");
            System.out.println("2. 8, Medium");
            System.out.println("3. 12, Large");
            int sizeChoice = scanner.nextInt();
            String breadSize = "";
            double price = 0.00;
            switch(sizeChoice){
                case 1:

                    breadSize = "Small";
                    userSandwich.setSize("Small"); userSandwich.setSandwichTotal(5.50);
                    price = 5.50;
                    break;
                case 2:
                    breadSize = "Medium";
                    userSandwich.setSize("Medium "); userSandwich.setSandwichTotal(7.00);
                    price = 7.00;
                break;
                case 3:
                    breadSize = "Large";
                    userSandwich.setSize("Large"); userSandwich.setSandwichTotal(12.00);
                    price = 12.00;
                    break;
                default:
                    System.out.println("Please select a valid option:   ");

                    System.out.println("Would you like your bread toasted? (yes/no)");
                    String toastedChoice = scanner.next().toLowerCase();
                    boolean isToasted = toastedChoice.equals("yes");
            }


        boolean validMeatChoice = false;
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
                    if (breadSize.equalsIgnoreCase("Small")) {
                        userSandwich.setMeatChoice("Steak"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 1.00);
                        price = 1.00;
                    } else if (breadSize.equalsIgnoreCase("Medium ")) {
                    userSandwich.setMeatChoice("Steak"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 2.00);
                        price = 2.00;
                    } else if (breadSize.equalsIgnoreCase("Large")) {
                    userSandwich.setMeatChoice("Steak"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 1.50);
                        price = 1.50;
                    }
                    validMeatChoice = true;
                }
                case 2 -> {
                    sandwich.add("Ham");
                    if (breadSize.equalsIgnoreCase("Small")) {
                        userSandwich.setMeatChoice("Ham"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 1.00);
                    price = 1.00;
                    } else if (breadSize.equalsIgnoreCase("Medium ")) {
                    userSandwich.setMeatChoice("Ham"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 2.00);
                        price = 2.00;
                    } else if (breadSize.equalsIgnoreCase("Large")) {
                    userSandwich.setMeatChoice("Ham"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 3.00);
                        price = 3.00;
                        validMeatChoice = true;
                    }
                    case 3 -> {
                        sandwich.add("Salami");
                        if (breadSize.equalsIgnoreCase("Small")) {
                            userSandwich.setMeatChoice("Salami"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 1.00);
                        price = 1.00;
                        } else if (breadSize.equalsIgnoreCase("Medium ")) {
                            userSandwich.setMeatChoice("Salami"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 2.00);
                            price = 2.00;
                        } else if (breadSize.equalsIgnoreCase("Large")) {
                            userSandwich.setMeatChoice("Salami"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 3.00);
                            price = 3.00;
                            validMeatChoice = true;
                        }
                        case 4 -> {
                            sandwich.add(" Roast Beef");
                            if (breadSize.equalsIgnoreCase("Small")) {
                                userSandwich.setMeatChoice("Roast Beef"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 1.00);
                                price = 1.00;
                            } else if (breadSize.equalsIgnoreCase("Medium ")) {
                                userSandwich.setMeatChoice("Roast Beef"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 2.00);
                                price = 2.00;
                            } else if (breadSize.equalsIgnoreCase("Large")) {
                                userSandwich.setMeatChoice("Roast Beef"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 3.00);
                                price = 3.00;
                                validMeatChoice = true;
                            }
                            String extraMeat;
                            case 5 -> {
                                sandwich.add("Chicken");
                                if (breadSize.equalsIgnoreCase("Small")) {
                                    userSandwich.setMeatChoice("Chicken"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 1.00);
                                    price = 1.00;
                                } else if (breadSize.equalsIgnoreCase("Medium ")) {
                                    userSandwich.setMeatChoice("Chicken"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 2.00);
                                    price = 2.00;
                                } else if (breadSize.equalsIgnoreCase("Large")) {
                                    userSandwich.setMeatChoice("Chicken"); userSandwich.setSandwichTotal(userSandwich.getSandwichTotal() + 3.00);
                                    price = 3.00;
                                    validMeatChoice = true;
                                } else {
                                    System.out.println("Invalid choice, please select from the following options :");


                                    System.out.println(" Do you want extra meat? please reply yes or no ?");
                                    double extraMeatPrice;
                                    extraMeat = scanner.next().toLowerCase();
                                    extraMeatPrice = 0.00;
                                    if (extraMeat.equals("yes "))
                                        if (sizeChoice == 1) {
                                            extraMeat = String.valueOf(0.50);

                                        } else if (sizeChoice == 2) {
                                            extraMeat = String.valueOf(1.00);
                                        } else if (sizeChoice == 3) ;
                                    extraMeat = String.valueOf(1.50);
                                    price += extraMeatPrice;
                                    System.out.println(" Extra meat was added to your order " + extraMeatPrice + "add to total price");
                                }else if (!extraMeat.equals("no")) {
                                System.out.println("Invalid choice. Assuming no extra meat.");
                            }
                                System.out.println();

                            // add options for  topping to be included
                            System.out.println("Please say yes or no to the following topping included:" +
                                    "Regular Toppings\n" +
                                    "- lettuce\n" +
                                    "- peppers\n" +
                                    "- onions\n" +
                                    "- tomatoes\n" +
                                    "- jalepenos\n" +
                                    "- cucumbers\n" +
                                    "- pickles\n" +
                                    "- guacamole\n" +
                                    "- mushrooms");
                            toppings = scanner.nextLine().toLowerCase();
                            if (toppings.equals("yes")) {
                                System.out.println("Regular Toppings\n" +
                                        "- lettuce\n" +
                                        "- peppers\n" +
                                        "- onions\n" +
                                        "- tomatoes\n" +
                                        "- jalepenos\n" +
                                        "- cucumbers\n" +
                                        "- pickles\n" +
                                        "- guacamole\n" +
                                        "- mushrooms");
                            } else if
                            (!toppings.equals("no")) {
                                System.out.println("no topping");
                            }
                            // sauces included
                            System.out.println("Please reply yes or no if you would like the following sauces included " +
                                    "- mayo\n" +
                                    "- mustard" +
                                    "- ketchup\n" +
                                    "- ranch\n" +
                                    "- thousand islands\n" +
                                    "- vinaigrette");
                            sauces = scanner.nextLine().toLowerCase();
                            if(sauces.equals("yes")){
                                System.out.println(" The following sauces was added to your order " +
                                        "- mayo\n" +
                                        "- mustard" +
                                        "- ketchup\n" +
                                        "- ranch\n" +
                                        "- thousand islands\n" +
                                        "- vinaigrette");
                            }else if (!sauces.equals("no")){
                                System.out.println("No Sauces");
                            }
                            System.out.println(" Please reply yes or no if you would like sides included:" +
                                    "- au jus\n" +
                                    "- sauce ");
                            String side = scanner.nextLine().toLowerCase();
                            if(side.equals("yes")){
                                System.out.println("Side were added to your order" +
                                        "- au jus\n" +
                                        "- sauce");
                            }else if (!side.equals("no")){
                                System.out.println("no sides");
                            }

                            System.out.println(" Please confirm if you would like a drink ? Yes or No ");
                            String drinkChoice = scanner.next().toLowerCase();
                            double drinkPrice = 0.00;
                            if (drinkChoice.equals("yes")) {
                                System.out.println("Select your drink ");
                                System.out.println("1. Small ");
                                System.out.println("2. Medium");
                                System.out.println("3. Large");
                                int drinkSizeChoice = scanner.nextInt();
                                if (drinkSizeChoice == 1) {
                                    drinkPrice = 1.50;
                                } else if (drinkSizeChoice == 2) {
                                    drinkPrice = 2.00;
                                } else if (drinkSizeChoice == 3) {
                                    drinkPrice = 2.50;
                                }
                                System.out.println(" Please Select which flavor you would like your drink to be? ");
                                System.out.println("1.Soda");
                                System.out.println("2. Juice ");
                                System.out.println("3. Water");
                                int drinkFlavor = scanner.nextInt();
                                if (drinkFlavor == 1) {
                                    System.out.println("Soda");
                                } else if (drinkFlavor == 2) {
                                    System.out.println("Juice");
                                } else if (drinkFlavor == 3) {
                                    System.out.println("Water");
                                }
                            }
                            System.out.println("");


                        }
                    }
                }
        }
                default -> throw new IllegalStateException("Unexpected value: " + meatChoice);
            } catch (IOException e) {
              throw new RuntimeException(e);
          }
}
        }
    }
}