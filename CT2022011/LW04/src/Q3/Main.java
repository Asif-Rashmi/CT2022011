package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.print("Inner radius: ");
        double ri=input.nextDouble();

        System.out.print("Outer radius: ");
        double ro=input.nextDouble();

        Circle inner=new Circle(ri);

        Circle outer=new Circle(ro);

        double area=
                outer.computeArea()
                        -inner.computeArea();

        System.out.println(
                "Shaded area="
                        +area);
    }
}