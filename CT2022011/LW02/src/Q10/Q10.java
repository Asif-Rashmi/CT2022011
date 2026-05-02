package Q10;
import java.util.Scanner;

public class Q10 {

    static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Loan Period (years): ");
        int loanPeriod = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment =
                (loanAmount * monthlyInterestRate) /
                        (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }
}