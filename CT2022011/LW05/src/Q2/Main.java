package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];

        int count = 0;

        while(true){

            System.out.print("Enter Name (STOP to finish): ");
            String name = input.nextLine();

            if(name.equalsIgnoreCase("STOP"))
                break;

            System.out.print("Enter Type (c/d): ");
            char type = input.nextLine().charAt(0);

            if(type=='c'){

                Cat cat = new Cat();
                cat.setName(name);

                pets[count++] = cat;
            }
            else{

                Dog dog = new Dog();
                dog.setName(name);

                pets[count++] = dog;
            }
        }

        System.out.println("\nPet List");

        for(int i=0;i<count;i++){

            if(pets[i] instanceof Cat)
                System.out.println(pets[i].getName()+" - Cat");

            else
                System.out.println(pets[i].getName()+" - Dog");
        }
    }
}