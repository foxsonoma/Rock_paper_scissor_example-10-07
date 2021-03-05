package Christopher;

import java.util.Locale;
import java.util.Scanner;

public class rockPaperScissor {

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


        String[] computerChoice = new String[3];
        computerChoice[0] = "rock";
        computerChoice[1] = "paper";
        computerChoice[2] = "scissors";

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to play? Enter Y or N: ");
            String userContine = sc.nextLine();
            userContine = userContine.toUpperCase();


            if (userContine.equals("N")) {
                System.out.println("BYE");
                break;
            }

            System.out.println("Choose rock, paper, scissors: ");
            String userChoice = sc.nextLine();
            userChoice = userChoice.toLowerCase();


            int random1 = (int) (Math.random() * ((3)));
            String comp_selector = computerChoice[random1];

            // ties
            if (userChoice.equals("rock") && comp_selector.equals("rock") ||
                    (userChoice.equals("paper") && comp_selector.equals("paper") ||
                            (userChoice.equals("scissors") && comp_selector.equals("scissor")))) {
                System.out.println("You selected [" + userChoice + "] and the computer selected [" + comp_selector + "] this is a tie..");
            }
            // lose
            if (userChoice.equals("rock") && comp_selector.equals("paper") ||
                    (userChoice.equals("paper") && comp_selector.equals("scissors") ||
                            (userChoice.equals("scissors") && comp_selector.equals("rock")))) {
                System.out.println("You selected [" + userChoice + "] and the computer selected [" + comp_selector + "] you have lost..");
            }
            // win
            if (userChoice.equals("rock") && comp_selector.equals("scissors") ||
                    (userChoice.equals("paper") && comp_selector.equals("rock") ||
                            (userChoice.equals("scissors") && comp_selector.equals("paper")))) {
                System.out.println("You selected [" + userChoice + "] and the computer selected [" + comp_selector + "] you have won!");
            }
        }
    }
}

// accounting for other entires

//        for (int i = 0; i < computerChoice.length; i++) {
//            if (userChoice.equals("rock") || (userChoice.equals("paper") || (userChoice.equals("scissors")))) {
//                    break;
//            }
//            else{
//
//            }
//                    }
//        System.out.println("Please try check spelling and enter rock, paper, scissors.");


//        if (userChoice.equals("rock") && computerChoice_selector.equals("paper")) {
//            System.out.println("You selected " + userChoice + " and the computer selected " + computerChoice_selector + " this is a win");
//        }
//        else{
//            System.out.println("You selected " + userChoice + " and the computer selected " + computerChoice_selector + " this is a lose");
//
//        }
//
//        if (userChoice.equals("paper") && computerChoice_selector.equals("rock")) {
//            System.out.println("You selected " + userChoice + " and the computer selected " + computerChoice_selector + " this is a win");
//        }
//        else {
//            System.out.println("You selected " + userChoice + " and the computer selected " + computerChoice_selector + " this is a lose");
//        }
//
//        if (userChoice.equals("scissors") && computerChoice_selector.equals("rock")) {
//            System.out.println("You selected " + userChoice + " and the computer selected " + computerChoice_selector + " this is a win");
//        }
//        else {
//            System.out.println("You selected " + userChoice + " and the computer selected " + computerChoice_selector + " this is a lose");
//        }


//            System.out.println("computer selected rock and you selected rock this is a draw");


//        if (userChoice.equals("rock") && computerChoice_selector.equals("rock")) {
//            System.out.println("computer selected rock and you selected rock this is a draw");
//        }
//        if (userChoice.equals("rock") && computerChoice_selector.equals("paper")) {
//            System.out.println("computer selected paper and you selected rock this is a lose");
//        }
//        if (userChoice.equals("rock") && computerChoice_selector.equals("scissors")) {
//            System.out.println("computer selected scissor and you selected rock this is a win");
//        }
//
//        if (userChoice.equals("paper") && computerChoice_selector.equals("rock")) {
//            System.out.println("computer selected rock and you selected paper this is a draw");
//        }
//        if (userChoice.equals("paper") && computerChoice_selector.equals("paper")) {
//            System.out.println("computer selected rock and you selected paper this is a lose");
//        }
//        if (userChoice.equals("paper") && computerChoice_selector.equals("scissors")) {
//            System.out.println("computer selected rock and you selected paper this is a win");
//        }
//
//        if (userChoice.equals("scissors") && computerChoice_selector.equals("rock")) {
//            System.out.println("computer selected rock and you selected scissors this is a draw");
//        }
//        if (userChoice.equals("scissors") && computerChoice_selector.equals("paper")) {
//            System.out.println("computer selected rock and you selected scissors this is a lose");
//        }
//        if (userChoice.equals("scissors") && computerChoice_selector.equals("scissors")) {
//            System.out.println("computer selected rock and you selected scissors this is a win");
//        }


//        if (computerChoice.equals("paper")) {
//                System.out.println("computer selected paper and you selected rock you lose");
//            } else {
//                System.out.println("computer selected scissors and you selected rock you win");
//            }
//
//            if (userChoice == "paper") {
//                if (computerChoice.equals("rock")) {
//                    System.out.println("computer selected rock and you selected paper you win");
//                } else if (computerChoice.equals("paper")) {
//
//                    System.out.println("computer selected paper and you selected paper this is a draw");
//                } else {
//                    System.out.println("computer selected scissors and you selected paper you lose");
//                }
//
//                if (userChoice == "scissors") {
//                    if (computerChoice.equals("rock"))
//                        System.out.println("computer selected rock and you selected scissors you lose");
//                } else if (computerChoice.equals("paper")) {
//
//                    System.out.println("computer selected paper and you selected scissors you win");
//                } else {
//                    System.out.println("computer selected scissors and you selected scissors this is a draw");
//                }
//            }
//        }
//    }
//}
