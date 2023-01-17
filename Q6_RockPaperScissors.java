import java.util.Random;
import java.util.Scanner;

public class Q6_RockPaperScissors {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissors

        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<Welcome to Rock Paper Scissors>>>>");
        System.out.println("Enter 0 for Rock , 1 for paper , 2 for scissors");
        int userinput = sc.nextInt();

        Random rand = new Random();
        int computerinput = rand.nextInt(3);

        if (userinput == computerinput) {
            System.out.println("Draw");
        }
        if(userinput >=3){
            System.out.println("Error!!");
        }

        else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0

                || userinput == 2 && computerinput == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer win!");
            sc.close();
        }

        if (computerinput == 0){
            System.out.println("Computer choice: Rock");
        }
        if(userinput >=3){
            System.out.println();
        }
         else  if (computerinput == 1){
            System.out.println("Computer choice: Paper");
        }
        else  if (computerinput == 2){
            System.out.println("Computer choice: Scissors");
        }
        


      
        


    }

}
