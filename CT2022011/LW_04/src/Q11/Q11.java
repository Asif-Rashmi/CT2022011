package Q11;

import java.util.Scanner;
import java.util.Random;

public class Q11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 100
        int number = random.nextInt(100) + 1;

        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess > number) {

                System.out.println("Too high! Try again.");

            } else if (guess < number) {

                System.out.println("Too low! Try again.");

            } else {

                System.out.println("Correct! You guessed the number.");
            }

        } while (guess != number);
    }
}