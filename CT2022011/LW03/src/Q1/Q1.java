package Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // Assume first number is the smallest
        int smallest = num1;

        // Compare with second number
        if (num2 < smallest) {
            smallest = num2;
        }

        // Compare with third number
        if (num3 < smallest) {
            smallest = num3;
        }

        // Display result
        System.out.println("Smallest number is: " + smallest);
    }
}