package Q3;

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

            System.out.print("Enter Type (c for cat, d for dog): ");
            char type = input.nextLine().charAt(0);

            if (type == 'c') {

                Cat cat = new Cat();
                cat.setName(name);

                pets[count] = cat;
                count++;

            } else if (type == 'd') {

                Dog dog = new Dog();
                dog.setName(name);

                pets[count] = dog;
                count++;
            }
        }

        System.out.println("\nCats");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {
                System.out.println(pets[i].getName());
            }
        }

        System.out.println("\nDogs");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName());
            }
        }
    }
}