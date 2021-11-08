/*
This program creates a vending machine that users insert coins into,
in order to buy certain food items.
 */

import java.util.Scanner;
public class VendingMachine {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int foodValue = 0;
        int potatoStock = 2;
        int cookieStock = 2;
        int candyStock = 2;
        int stock = 6;
        System.out.println("Welcome to the Vending Machine! You have the option to order" +
                " potato chips, cookies, and/or candies.");
        System.out.println("Type in the number of the food item that you would like.");

        while (stock > 0){
        System.out.println("1: Potato Chips (Cost: $1.25)");
        System.out.println("2: Cookies (Cost: $0.85)");
        System.out.println("3: Candies (Cost: $0.95)");
        int choice = in.nextInt();

        if (choice == 1) {
            foodValue = 125;
            potatoStock = potatoStock - 1;
            stock = stock - 1;
            if (potatoStock <= 0){
                System.out.println("Sold out. Please select another food item.");
                continue;
            }
            else {
                System.out.println(foodValue + " cents is your cost for today.");
            }
        } else if (choice == 2) {
            foodValue = 85;
            cookieStock = cookieStock - 1;
            stock = stock - 1;
            if (cookieStock <= 0){
                System.out.println("Sold out. Please select another food item.");
                continue;
            }

        } else if (choice == 3) {
            foodValue = 95;
            candyStock = candyStock - 1;
            stock = stock - 1;
            if (candyStock == 0){
                System.out.println("Sold out. Please select another food item.");
                continue;
            }
            System.out.println(foodValue + " cents is your cost for today.");
        } else if (choice > 3 || choice < 1) {
            System.out.println("Sorry, that food item does not exist. Please select an item that does exist.");
            continue;
        }
        double change = 0;
            System.out.println("You will now be directed to payment.");

            System.out.println("Insert quarters:");
            int quarterAmount = in.nextInt();
            int quarterValue = quarterAmount * 25;

            System.out.println("Insert dimes:");
            int dimeAmount = in.nextInt();
            int dimeValue = dimeAmount * 10;

            System.out.println("Insert nickels:");
            int nickelAmount = in.nextInt();
            int nickelValue = nickelAmount * 5;

            int amountInserted = quarterValue + dimeValue + nickelValue;
            change = amountInserted - foodValue;

            if (amountInserted > foodValue) {
                System.out.println("Change will be dispensed...");
            } else if (amountInserted < foodValue) {
                System.out.println("Not enough money has been inserted.");
                System.out.println("Due to technical issues, your money will be refunded, and"
                        +" you will be redirected back to the menu.");
                stock = stock + 1;
                continue;
            } else {
                System.out.println("Exact amount of money has been inserted...");
            }


        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        while (change >= 25){
            quarters = quarters + 1;
            change = change - 25;
        }
        while (change >= 10){
            dimes = dimes + 1;
            change = change - 10;
            while (change >= 5){
                nickels = nickels + 1;
                change = change - 5;
            }
        }
        System.out.println("Thank you for your purchase! You will now receive the following change:");
        System.out.println(quarters+" quarter(s)");
        System.out.println(dimes+" dime(s)");
        System.out.println(nickels+" nickel(s)");

            System.out.println("Would you like to order more food? Enter \"1\" if you would like to," +
                    " and any other number if you would like to leave.");
            int finalChoice = in.nextInt();
            if (finalChoice == 1) {
                System.out.println("Alright then. Returning you to the menu...");
                continue;
            }
            else {
                System.out.println("Farewell then!");
                System.exit(0);
            }
        }
    }
}
