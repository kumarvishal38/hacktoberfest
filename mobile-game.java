import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've selected a number between " + min + " and " + max + ". Try to guess it.");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < min || userGuess > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
