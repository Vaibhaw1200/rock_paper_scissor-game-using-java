import java.util.Scanner;
import java.util.Random;

public class rps_game {
    public static void main(String[] args) {
        Random ran=new Random();
        int num=ran.nextInt(0,3);
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter rock,paper,scissor." );
        System.out.println("For rock:'Press 0'" +
                " For paper:'Press 1'" +
                " For scissor:'Press 2'");
        int num1=inp.nextInt();

        if (num==0&&num1==0){
            System.out.println("Tie");
        }
        if (num==0&&num1==1){
            System.out.println("You win!!");
        }
        if (num==0&& num1==2){
            System.out.println("Computer wins!!");
        }
        if (num==1&&num1==1){
            System.out.println("Tie");
        }
        if (num==1&&num1==0){
            System.out.println("Computer wins!!");
        }
        if (num==1&&num1==2){
            System.out.println("You win");
        }
        if (num==2&&num1==2){
            System.out.println("Tie");
        }
        if (num==2&&num1==0){
            System.out.println("You win");
        }
        if (num==2&&num1==1){
            System.out.println("Computer wins");
        }

    }


}
