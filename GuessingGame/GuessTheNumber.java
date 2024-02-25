package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        int randomNum = rand.nextInt(1,50);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess the Number between 1 to 100");
        boolean correctGuess = false;
    do {
        System.out.println("Enter your guess: ");
        int userGuess = sc.nextInt();
        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Please guess a number within the specified range.");
        } else {
            if (userGuess == randomNum) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNum);
                correctGuess  = true;
            } else if (userGuess < randomNum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    } while (!correctGuess);

    }
}


