import java.util.Scanner;

interface Arts1
{
    public void cet();
}
interface Engineering1
{
    public void jee();
}
interface Medical1
{
    public void neet();
}
class Studentss implements Arts1,Engineering1,Medical1
{
    Scanner s=new Scanner(System.in);
    public void cet()
    {
        System.out.println("\t\tFOR  ARTS");
        System.out.println("Enter Percentile: ");
        float per=s.nextFloat();
        System.out.println("Your Percentile are: "+per);
        if(per>=70)
        {
            System.out.println("You are qualified for ARTS");
        }
        else
        {
            System.out.println("Better Luck Next Time!");
        }
    }
    public void jee()
    {
        System.out.println("\n\t\tFOR  ENGINEERING");
        System.out.println("Enter Percentile: ");
        float per=s.nextFloat();
        System.out.println("Your Percentile are: "+per);
        if(per>=80)
        {
            System.out.println("You are qualified for ENGINEERING");
        }
        else
        {
            System.out.println("Better Luck Next Time!");
        }
    }
    public void neet()
    {
        System.out.println("\n\t\tFOR  MEDICAL");
        System.out.println("Enter Percentile: ");
        int marks=s.nextInt();
        System.out.println("Your Percentile are: "+marks);
        if(marks>=520)
        {
            System.out.println("You are qualified for MEDICAL");
        }
        else
        {
            System.out.println("Better Luck Next Time!");
        }
    }
}
class Mul_Int_Interf
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        Studentss s1=new Studentss();
        s1.cet();
        s1.jee();
        s1.neet();
    }
}
