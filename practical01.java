import java.util.Scanner;
class Sum
{
    int result=0;
    Sum(int a,int b){
        result =a+b;
    }
};

class Addition
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Numbers: ");
        int num1 = s.nextInt();

        System.out.print("Enter Second Numbers:");
        int num2 = s.nextInt();

        Sum addition = new Sum(num1,num2);
        System.out.print("Addition Of Numbers is: "+ addition.result);
    }
}
