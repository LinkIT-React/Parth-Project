import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        System.out.println("bunty badmash");
        Scanner tax = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = tax.nextInt();

        switch (income){
            case 5:
                System.out.println("pay 5%");
                break;
            default:
                System.out.println("pay nothing");
        }
    }
}
