import java.util.Scanner;

public class result {
    public static void main(String[] args){
        System.out.println("Hello Bunty Badmansh");
        Scanner marks = new Scanner (System.in);
        System.out.println("Enter your m1");
        int m1 = marks.nextInt();
        System.out.println("Enter your m2");
        int m2 = marks.nextInt();
        System.out.println("Enter your m3");
        int m3 = marks.nextInt();
        int sum = m1+m2+m3;
        int total = sum*100/300;
        System.out.println(total);
        if(m1 > 33 && m2 >33 && m3 >33 && sum> 40){
            System.out.println("Good to go");
        }else{
            System.out.println("You were Fail!");
        }


    }
}
