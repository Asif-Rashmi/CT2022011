package Q5;

import java.util.Scanner;

public class Q5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double entreePrice = getEntree();
        double sidePrice = getSideDish();
        double drinkPrice = getDrink();

        double total = calculateTotal(entreePrice, sidePrice, drinkPrice);

        printBill(total);
    }

    // ---------------- ENTREE ----------------
    public static double getEntree() {
        System.out.println("\nENTREE:");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");

        System.out.print("Select Entree (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: return 3.49;
            case 2: return 4.59;
            case 3: return 3.99;
            case 4: return 2.99;
            default:
                System.out.println("Invalid choice");
                return 0;
        }
    }

    // ---------------- SIDE DISH ----------------
    public static double getSideDish() {
        System.out.println("\nSIDE DISH:");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");

        System.out.print("Select Side Dish (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: return 0.79;
            case 2: return 0.69;
            case 3: return 1.09;
            case 4: return 0.59;
            default:
                System.out.println("Invalid choice");
                return 0;
        }
    }

    // ---------------- DRINK ----------------
    public static double getDrink() {
        System.out.println("\nDRINK:");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");

        System.out.print("Select Drink (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: return 1.99;
            case 2: return 1.90;
            case 3: return 2.49;
            case 4: return 0.99;
            default:
                System.out.println("Invalid choice");
                return 0;
        }
    }

    // ---------------- CALCULATION ----------------
    public static double calculateTotal(double e, double s, double d) {
        return e + s + d;
    }

    // ---------------- OUTPUT ----------------
    public static void printBill(double total) {
        System.out.println("\n=== ORDER SUMMARY ===");
        System.out.println("Total Bill: $" + total);
    }
}