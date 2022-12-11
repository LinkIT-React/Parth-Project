import java.util.Scanner;

interface Student1
{
    public void studentData();
}
class College implements Student1
{
    Scanner s=new Scanner(System.in);
    public void studentData()
    {
        System.out.println("Enter Name: ");
        String n = s.nextLine();

        System.out.println("Enter Branch: ");
        String b = s.nextLine();

        System.out.println("Enter Roll Number: ");
        int r = s.nextInt();
        System.out.println("Name: "+n);
        System.out.println("Branch: "+b);
        System.out.println("Roll Number: "+r);
    }
}
public class practical_04
{
    public static void main(String[] args) {
        College c=new College();
        c.studentData();
    }
}
