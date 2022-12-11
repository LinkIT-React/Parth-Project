
import java.util.Scanner;
public class student {
    public static void main (String args[]){
        System.out.println("helllo bunty");

        Scanner marks = new Scanner(System.in);
        System.out.println("enter Maths marks");
        int m1 = marks.nextInt();
        System.out.println("enter English marks");
        int m2 = marks.nextInt();
        System.out.println("enter Marathi marks");
        int m3 = marks.nextInt();
        System.out.println("enter hindi marks");
        int m4 = marks.nextInt();
        System.out.println("enter History marks");
        int m5 = marks.nextInt();

        int sum = m1+m2+m3+m4+m5;

        float percentage = sum*100/500;
        System.out.println(percentage);
    }
}
