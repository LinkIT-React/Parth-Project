import java.lang.Math;
import java.util.Scanner;

public class rps {
    public static void main(String[] args){
        System.out.println("hello bunty Badmash");
        Scanner randomnum = new Scanner(System.in);
        int min = 1;
        int max = 3;

        int number = (int)( Math.random()*(max - min +1) + min);

        System.out.println("enter your choose: ");
        int usernum = randomnum.nextInt();
        if(usernum==1 && number == 2){
            System.out.println("You loose");
        }
        else if(usernum==2 && number == 3){
            System.out.println("You loose");
        }
        else if(usernum==1 && number == 3){
            System.out.println("You win");
        }
        else if(usernum==2 && number == 1){
            System.out.println("You win");
        }
        else if(usernum==3 && number == 2){
            System.out.println("You win");
        }
        else if(usernum==3 && number == 1){
            System.out.println("You loose");
        }
        else if (usernum == number) {
            System.out.println("tie is here");
        }


    }
}
