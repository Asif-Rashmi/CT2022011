package Q4;

public class Main {

    public static void main(String[] args) {

        Owner o=
                new Owner(
                        "John",
                        "0771234567");

        Bicycle b=
                new Bicycle(o);

        System.out.println(
                b.getOwner().getOwnerName());

        System.out.println(
                b.getOwner().getPhoneNo());
    }
}