import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Customer ID: \n");
        String id = Sc.next();
        System.out.print("Enter Customer  name: \n");
        String name = Sc.next();
        System.out.print("Enter Customer email Address: \n");
        String email = Sc.next();
        System.out.print("Enter Customer Contact Number: \n");
        String num = Sc.next();

        System.out.println("Customer Contact Number: " + id);
        System.out.println("Customer Contact Number: " + name);
        System.out.println("Customer Contact Number: " + email);
        System.out.println("Customer Contact Number: " + num);
    }


}
