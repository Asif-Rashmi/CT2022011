package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter Celsius: ");

        double c=input.nextDouble();

        Temperature t=new Temperature(c);

        System.out.println(
                "Fahrenheit: "
                        +t.toFahrenheit());
    }
}