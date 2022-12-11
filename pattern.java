import java.util.Scanner;

public class pattern {
    public static void main (String[] args) {
        System.out.println("hello bunty badmash");
        Scanner even = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = even.nextInt();
int i;
        for(i =0; i <=number; i++){
//            System.out.println(i);
            if (i%2==0){
                System.out.println(i);
//                System.out.println(i+i);
                int sum = 0;
                 sum = sum +i;
                System.out.println(sum);
            }
        }
        System.out.println();
    }
}
