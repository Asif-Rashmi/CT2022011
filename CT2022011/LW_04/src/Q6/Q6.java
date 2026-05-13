package Q6;

public class Q6 {

    public static void main(String[] args) {

        for (int i = 10; i <= 49; i++) {
            System.out.print(i + " ");

            // New line after every 10 numbers
            if ((i - 9) % 10 == 0) {
                System.out.println();
            }
        }
    }
}