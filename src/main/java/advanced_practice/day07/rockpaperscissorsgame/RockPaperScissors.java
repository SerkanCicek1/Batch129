package advanced_practice.day07.rockpaperscissorsgame;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        /*
        Define the game Rock-Paper-Scissors:
         -Get a guess from the player.
         -Compare with the computer's prediction.
              The first to reach 3 points wins.
              Golden Score to win by 3 margins, Silver Score to win by 2 margins,
              Bronze Score to win by 1 margin and Platinum score by 3 tries (gold and platinum score can be together)
         */
        Scanner input = new Scanner(System.in);
        int countOfPlayerWin = 0;
        int countOfComputerWin = 0;
        int counter = 0;

        while (countOfPlayerWin < 3 && countOfComputerWin < 3){
            counter++;
            System.out.println("Choose one: \nRock \nPaper \nScissors");
            String playerGuess = input.next().toLowerCase();

            if (!(playerGuess.equals("rock") || playerGuess.equals("paper") || playerGuess.equals("scissors"))){
                System.out.println("Enter a valid guess \n");
                counter--;
                continue;
            }

            String[] arr = {"Rock", "Paper", "Scissors"};
            String computerGuess = arr[(int) (Math.random() * 3)].toLowerCase();

            if (playerGuess.equals(computerGuess)){
                System.out.println("Draw! Score: " + countOfPlayerWin + "--" + countOfComputerWin);

            } else if (playerGuess.equals("rock") && computerGuess.equals("scissors") || playerGuess.equals("paper") &&
                    computerGuess.equals("rock") || playerGuess.equals("scissors") && computerGuess.equals("paper")){
                countOfPlayerWin++;
                System.out.println("You Won! Score: " + countOfPlayerWin + "--" + countOfComputerWin);

            } else {
                countOfComputerWin++;
                System.out.println("You Lost! Score: " + countOfPlayerWin + "--" + countOfComputerWin);
            }
        }
        System.out.println("===GAME OVER===");

        String score;

        if (countOfPlayerWin ==3 ){

            if (countOfComputerWin == 0){
                score = "Gold";
            } else if (countOfComputerWin == 1){
                score = "Silver";
            } else {
                score = "Bronze";
            }
            if (counter == 3){
                System.out.println("You won by Platin and " + score + " score!");

            } else System.out.println("You won by " + score + " score!");

        } else {

            if (countOfPlayerWin == 0){
                score = "Gold";
            } else if (countOfPlayerWin == 1){
                score = "Silver";
            } else {
                score = "Bronze";
            }
            if (counter == 3){
                System.out.println("Computer won by Platin and " + score + " score!");

            } else System.out.println("Computer won by " + score + " score!");
        }


    }

}
