import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        // System.out.println(randomNumber);

        System.out.println("number of attempts 6");
        int playerGuess;
        int trycount = 0;
        do {
            System.out.println("Enter your Guess (1-100): ");

            playerGuess = scanner.nextInt();
            trycount++;

            if (playerGuess == randomNumber) {
                System.out.println("correct! you win!");
                System.out.println("it took you "+ trycount + " tries!");
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The Number is Higher. Guess again");

            } else {
                System.out.println("Nope! The number is lesser. Guess again");

            }
        } while ((randomNumber != playerGuess) && (trycount<6));

        if(trycount == 6){
            System.out.println("sorry you lose");
            System.out.println("The correct Number is: "+ randomNumber);
        }

        scanner.close();

    }
}