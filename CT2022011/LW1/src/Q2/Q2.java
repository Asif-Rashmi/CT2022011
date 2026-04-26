package Q2;
import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter last name: ");
        String last = sc.nextLine();

        JFrame frame = new JFrame(first + " " + last);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}