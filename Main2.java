import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        //2:
        Scanner input=new Scanner(System.in);
        System.out.println("Choose from list by enter the number.\n1.rock\n2.paper\n3.scissors");
        int userNumb=input.nextInt();
        int comNum = (int)(Math.random()*3);
        System.out.println("Computer number: "+comNum);

        if (userNumb!=0&&userNumb!=1&&userNumb!=2) {
            System.out.println("false input number");

        } else if(userNumb==comNum) {
            System.out.println("Draw");
        } else if((userNumb==0 && comNum==2) ||
                (userNumb==2 && comNum==1) ||
                (userNumb==1 && comNum==0)) {
            System.out.println("user win, computer lose");
        } else {
            System.out.println("user lose, computer win");
        }

    }

    }

