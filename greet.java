import java.util.Scanner;

public class greet {
    public static void main(String args[]){
        System.out.println("helllo bunty");

        Scanner name = new Scanner(System.in);
        System.out.println("What is your name? " );
        String str = name.nextLine();
        System.out.println("helllo Bhaya " +str);
    }
}
