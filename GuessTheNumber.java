import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a Random object to generate a random number
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        // Variable to keep track of the number of attempts
        int attempts = 0;
        // Variable to store the user's guess
        int userGuess = 0;
        // Start the game
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
        // Game loop
        while (userGuess != randomNumber) {
            // Prompt the user for a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            // Increase attempt count
            attempts++;
            // Check if the guess is too low, too high, or correct
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        // Close the scanner object to avoid memory leak
        scanner.close();
    }
}
