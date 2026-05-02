package Q4;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (pounds): ");
        double weight = input.nextDouble();

        double calories = weight * 19;

        System.out.println("Calories needed: " + calories);
    }
}