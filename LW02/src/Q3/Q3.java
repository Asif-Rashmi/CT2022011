package Q3;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double c = input.nextDouble();

        double f = (1.8 * c) + 32;

        System.out.println("Fahrenheit: " + f);
    }
}