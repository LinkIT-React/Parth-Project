import java.util.Scanner;
interface students
{
    int Sno = 31;
    String Sname = "Prasad";
    String Dept = "IT" ;
    void getValue();
}
class Department implements students
{
    int attendance;
    public void getAttendance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Attendance: ");
        attendance = sc.nextInt();
    }
    public void getValue()
    {
        System.out.println("Sno :" + Sno + "\tSname :" + Sname + "\tDepartment : " +
                Dept);
    }
}
class Exam extends Department
{
    public void calculateAttendance()
    {
        attendance = attendance;
    }
    public boolean eligible()
    {
        if(attendance < 60)
            return false;
        else
            return true;
    }
}
public class tae_1
{
    public static void main(String[] args)
    {
        Exam e = new Exam();
        e.getValue();
        e.getAttendance();
        e.calculateAttendance();
        System.out.println("Eligibility :" + e.eligible());
    }
}