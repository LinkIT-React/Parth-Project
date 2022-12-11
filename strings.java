import java.util.Scanner;

public class strings {
    public static void main (String [] args){
        System.out.println("helllo bunty");
        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your strings: ");
//        String name = sc.nextLine();
//        int count = name.length();
//        System.out.printf("your string length is: %d", count );
        System.out.println("Your first name: ");
        String firstname = sc.next();
        System.out.println("Your first Last: ");
        String lastname = sc.next();

        String fullname = firstname.concat( lastname).toUpperCase();
        System.out.printf("your full name is %s.", fullname);
    }
}
