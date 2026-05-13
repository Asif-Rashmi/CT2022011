package Q7;

import java.util.Scanner;

public class Q7 {

    // Method to count digits
    public static int countDigits(int number) {

        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter an integer (negative 1 to stop): ");
            int num = input.nextInt();

            if (num < 0) {
                break;
            }

            int digits = countDigits(num);

            System.out.println("Number of digits: " + digits);
        }

        System.out.println("Program ended.");
    }
}