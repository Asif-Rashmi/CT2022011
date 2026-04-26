package Q10;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter odd-length word: ");
        String word = sc.nextLine();

        int middle = word.length() / 2;

        System.out.println(word.charAt(middle));
    }
}