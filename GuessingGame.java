import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int minRange = 1;       // Minimum range value
        int maxRange = 100;     // Maximum range value
        
        Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ".");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts!");
            }
        } while (guess != randomNumber);
        
        scanner.close();
    }
}

