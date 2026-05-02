package Q7;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        int w = input.nextInt();

        System.out.print("Enter height (cm): ");
        int h = input.nextInt();

        double bmi = w / Math.pow(h / 100.0, 2);

        System.out.println("BMI: " + bmi);
    }
}