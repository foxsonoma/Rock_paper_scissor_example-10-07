package Christopher;

import java.util.Arrays;
import java.util.Scanner;

public class rockPaperSicTwo {

    public static void main(String[] args) {

//sudo code
// take user input either rock, paper, scissors
// after player inputs selection randomly generate computer's play
// if statements for all 9 possible outcomes
// print result - win - draw - loss
// player selected this you selected this that's why result

// changes required
// 1. output must be pretty
// 2. modularize code only 3 ifs
// 3. capitization ruins this
// 4. must restart each time until "y" or "n"
// 5.
        int score_com = 0;
        int score_user = 0;

        String[] computerChoice = new String[3];
        computerChoice[0] = "rock";
        computerChoice[1] = "paper";
        computerChoice[2] = "scissors";

        Scanner sc = new Scanner(System.in);

        outerloop:
        while (true) {
            String userContine = null;
            boolean ok_userContine = false;


            innerloop:
            while (ok_userContine != true) {
                System.out.println("Do you want to play? Enter Y or N: ");
                userContine = sc.nextLine();
                userContine = userContine.toUpperCase();

                if (userContine.equals("Y")) {
                    ok_userContine = true;
                }

                if (userContine.equals("N")) {
                    System.out.println("BYE");
// ok_userContine = false;
                    break outerloop;
                }

            }

            System.out.println("Choose rock, paper, scissors: ");
            String userChoice = sc.nextLine();
            userChoice = userChoice.toLowerCase();

            int random1 = (int) (Math.random() * ((3)));
            String comp_selector = computerChoice[random1];

// ties
            if (userChoice.equals("rock") && comp_selector.equals("rock") ||
                    (userChoice.equals("paper") && comp_selector.equals("paper") ||
                            (userChoice.equals("scissors") && comp_selector.equals("scissors")))) {
                System.out.println("You selected [" + userChoice + "] and the computer selected [" + comp_selector + "] this is a tie..");
            }

// lose
            else if (userChoice.equals("rock") && comp_selector.equals("paper") ||
                    (userChoice.equals("paper") && comp_selector.equals("scissors") ||
                            (userChoice.equals("scissors") && comp_selector.equals("rock")))) {
                score_com++;
                System.out.println("You selected [" + userChoice + "] and the computer selected [" + comp_selector + "] you have lost..");

                if (score_com >= 2) {
                    System.out.println("You have lost the computer won. You won " + score_user + " the computer won " + score_com);
                    break;
                }

            }
// win
            else if (userChoice.equals("rock") && comp_selector.equals("scissors") ||
                    (userChoice.equals("paper") && comp_selector.equals("rock") ||
                            (userChoice.equals("scissors") && comp_selector.equals("paper")))) {
                score_user++;
                System.out.println("You selected [" + userChoice + "] and the computer selected [" + comp_selector + "] you have won!");

                if (score_user >= 2) {
                    System.out.println("You have won! The computer won " + score_com + " matches and you won " + score_user);
                    break;
                }
            }
            
        }
    }
}
