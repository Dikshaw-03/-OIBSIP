import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("number of attempts 6");
        int playerGuess;
        int trycount = 0;
        int choice;
        int score = 0;
        do {
            // for generating new random number everytime 
            int randomNumber = rand.nextInt(100) + 1;
            System.out.println(randomNumber);

            // for 6 attempts 
            do {

                System.out.println("Enter your Guess (1-100): ");

                playerGuess = scanner.nextInt();
                trycount++;

                if (playerGuess == randomNumber) {
                    System.out.println("correct! you win!");
                    System.out.println("it took you " + trycount + " tries!");
                    score++;

                } else if (randomNumber > playerGuess) {
                    System.out.println("Nope! The Number is Higher. Guess again");

                } else {
                    System.out.println("Nope! The number is lesser. Guess again");

                }
            } while ((randomNumber != playerGuess) && (trycount < 6));




            // if 6 attempts fail 
            if ((trycount == 6) && (randomNumber != playerGuess)) {
                System.out.println("sorry you lose");
                System.out.println("The correct Number is: " + randomNumber);
            }
            trycount = 0;



            System.out.println("do you want to continue? press 1 for YES press 0 for NO");
            choice = scanner.nextInt();
        } while (choice == 1);



        System.out.println("your score is: " + score);

        

        scanner.close();

    }
}
