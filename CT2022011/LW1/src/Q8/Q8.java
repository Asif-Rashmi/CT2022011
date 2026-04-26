package Q8;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string with ! : ");
        String input = sc.nextLine();

        int index = input.indexOf('!');

        String part1 = input.substring(0, index).trim();
        String part2 = input.substring(index + 1).trim();

        System.out.println(part1);
        System.out.println(part2);
    }
}