package Q10;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();

        // Remove spaces and convert to lowercase
        String original = text.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {

            reversed = reversed + original.charAt(i);
        }

        // Check palindrome
        if (original.equals(reversed)) {

            System.out.println("It is a palindrome.");
        } else {

            System.out.println("It is not a palindrome.");
        }
    }
}