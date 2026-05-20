package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");

        double f=input.nextDouble();

        Temperature t=new Temperature();

        t.setFahrenheit(f);

        System.out.println(
                "Celsius: "
                        +t.toCelsius());
    }
}