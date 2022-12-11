import java.util.Scanner;

public class prac1_2
{
    public static void main(String[] args)
    {
        int fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number:");
        int a=s.nextInt();
        for (int i=1;i<=a;i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of given number is: "+fact);
    }
}
