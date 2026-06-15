package Q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet[] pets = new Pet[100];

        int count = 0;

        while(true){

            System.out.print("Name (STOP to finish): ");
            String name = input.nextLine();

            if(name.equalsIgnoreCase("STOP"))
                break;

            System.out.print("Type (c/d): ");
            char type = input.nextLine().charAt(0);

            if(type=='c'){

                Cat cat = new Cat();

                cat.setName(name);

                System.out.print("Coat Color: ");
                cat.setCoatColor(input.nextLine());

                pets[count++] = cat;
            }
            else{

                Dog dog = new Dog();

                dog.setName(name);

                System.out.print("Weight: ");
                dog.setWeight(input.nextDouble());
                input.nextLine();

                pets[count++] = dog;
            }
        }

        for(int i=0;i<count;i++){

            if(pets[i] instanceof Cat){

                Cat c = (Cat)pets[i];

                System.out.println(
                        c.getName()+" Cat "+
                                c.getCoatColor()
                );
            }
            else{

                Dog d = (Dog)pets[i];

                System.out.println(
                        d.getName()+" Dog "+
                                d.getWeight()
                );
            }
        }
    }
}