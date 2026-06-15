package Q6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        int choice;

        do{

            System.out.println("\n1.Add Cat");
            System.out.println("2.Add Dog");
            System.out.println("3.Remove Cat");
            System.out.println("4.Remove Dog");
            System.out.println("0.Quit");

            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){

                case 1:

                    Cat cat = new Cat();

                    System.out.print("Name: ");
                    cat.setName(input.nextLine());

                    System.out.print("Color: ");
                    cat.setCoatColor(input.nextLine());

                    cats.add(cat);

                    break;

                case 2:

                    Dog dog = new Dog();

                    System.out.print("Name: ");
                    dog.setName(input.nextLine());

                    System.out.print("Weight: ");
                    dog.setWeight(input.nextDouble());
                    input.nextLine();

                    dogs.add(dog);

                    break;

                case 3:

                    System.out.print("Cat Name: ");
                    String catName = input.nextLine();

                    cats.removeIf(c ->
                            c.getName().equalsIgnoreCase(catName));

                    break;

                case 4:

                    System.out.print("Dog Name: ");
                    String dogName = input.nextLine();

                    dogs.removeIf(d ->
                            d.getName().equalsIgnoreCase(dogName));

                    break;
            }

        }while(choice != 0);

        System.out.println("\nCats");

        for(Cat c : cats){

            System.out.println(
                    c.getName()+" "+
                            c.getCoatColor());
        }

        System.out.println("\nDogs");

        for(Dog d : dogs){

            System.out.println(
                    d.getName()+" "+
                            d.getWeight());
        }
    }
}