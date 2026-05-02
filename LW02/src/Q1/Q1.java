package Q1;

public class Q1 {
    public static void main(String[] args) {

        double A = 2, B = 3, C = 4, X = 5, Y = 6, r = 7;

        double a = Math.sqrt(B * B + 4 * A * C);
        double b = Math.sqrt(X + 4 * Math.pow(Y, 3));
        double c = Math.cbrt(X * Y);
        double d = Math.PI * r * r;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Area = " + d);
    }
}