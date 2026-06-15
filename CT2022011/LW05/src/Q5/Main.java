package Q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        int count = 0;

        while (true) {

            System.out.print("Enter Name (STOP to finish): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter Type (c/d): ");
            char type = input.nextLine().charAt(0);

            if (type == 'c') {

                Cat cat = new Cat();
                cat.setName(name);

                System.out.print("Enter Coat Color: ");
                cat.setCoatColor(input.nextLine());

                pets[count] = cat;
                count++;

            } else if (type == 'd') {

                Dog dog = new Dog();
                dog.setName(name);

                System.out.print("Enter Weight: ");
                dog.setWeight(input.nextDouble());
                input.nextLine(); // clear buffer

                pets[count] = dog;
                count++;
            }
        }

        // Create Dog array
        Dog[] dogs = new Dog[100];
        int dogCount = 0;

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {

                dogs[dogCount] = (Dog) pets[i];
                dogCount++;
            }
        }

        // Check if there are dogs
        if (dogCount == 0) {
            System.out.println("No dogs entered.");
            return;
        }

        double sum = 0;
        double min = dogs[0].getWeight();
        double max = dogs[0].getWeight();

        for (int i = 0; i < dogCount; i++) {

            double w = dogs[i].getWeight();

            sum += w;

            if (w < min) {
                min = w;
            }

            if (w > max) {
                max = w;
            }
        }

        double average = sum / dogCount;

        System.out.println("\nDog Weight Statistics");
        System.out.println("Average Weight = " + average);
        System.out.println("Minimum Weight = " + min);
        System.out.println("Maximum Weight = " + max);

        input.close();
    }
}