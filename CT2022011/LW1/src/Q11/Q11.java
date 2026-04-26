package Q11;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String full = sc.nextLine();

        String[] parts = full.split(" ");

        String first = parts[0];
        String middle = parts[1];
        String last = parts[2];

        System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");
    }
}