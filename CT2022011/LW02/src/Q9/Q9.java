package Q9;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter P: ");
        double P = input.nextDouble();

        System.out.print("Enter R: ");
        double R = input.nextDouble();

        System.out.print("Enter N: ");
        int N = input.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);

        System.out.println("Final Amount: " + amount);
    }
}