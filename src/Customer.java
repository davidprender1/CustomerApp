import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter Customer " + i + " id: \n");
            String id = Sc.next();
            System.out.print("Enter Customer " + i + " id:\n");
            String name = Sc.next();
            System.out.print("Enter Customer " + i + " email Address: \n");
            String email = Sc.next();
            System.out.print("Enter Customer " + i + " Contact number: \n");
            String num = Sc.next();


            System.out.println("Customer "+ i + " Contact Number: " + id);
            System.out.println("Customer "+ i +" Contact Number: " + name);
            System.out.println("Customer " + i +" Contact Number: " + email);
            System.out.println("Customer "+ i +" Contact Number: " + num);
        }


    }
}
