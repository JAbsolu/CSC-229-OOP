import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Print out game header and difficulty levels
        System.out.println("=========================================================");
        System.out.println("\n================= Number Guessing Game ==================");
        System.out.println("\n=========================================================");
        System.out.println("1: Easy | Natural numbers from 1 to 10");
        System.out.println("2: Medium | Real numbers from 1 to 10 with .50 threshold");
        System.out.println("3: Hard | Real numbers from 1 to 10 with .25 threshold");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Select a difficulty level (1, 2, or 3): ");
        //Get the user choice
        int choice = scanner.nextInt();
        
        //Determine which function to invoke base on level of difficulty
        switch (choice) {
            case 1:
                playEasy(scanner, random);
                break;
            case 2:
                playMediumAndHard(scanner, random, 0.5, "Medium");
                break;
            case 3:
                playMediumAndHard(scanner, random, 0.25, "Hard");
                break;
            default:
                System.out.println("Invalid choice. Please select a difficulty level between 1 and 3.");
        }
        //Close the scanner
        scanner.close();
    }
    
    //Below is the method for easy
    public static void playEasy(Scanner scanner, Random random) {
        int totalGuesses = 0;
        for (int i = 0; i < 3; i++) {
            int secret = random.nextInt(1, 10); // Generates a natural number from 1 to 10
            
            System.out.println("Game " + (i + 1) + " (Easy mode):");
            System.out.println("Guess a number between 1 and 10:");
            int guesses = playGame(scanner, secret); // Call the playgame function
            totalGuesses += guesses;
        }
        
        double averageGuesses = (double) totalGuesses / 3;
        System.out.println("Average number of guesses: " + String.format("%.2f", averageGuesses));
    }
    
    //Below is the method for medium and hard
    public static void playMediumAndHard(Scanner scanner, Random random, double errorThreshold, String mode) {
        int totalGuesses = 0;
        for (int i = 0; i < 3; i++) {
            double secret = random.nextDouble() * 10; // Generates a real number less than 10
            
            System.out.println("Game " + (i + 1) + " (" + mode + " mode):");
            System.out.println("Guess a number between 0 and 9:");
            int guesses = playGame(scanner, secret);
            totalGuesses += guesses;
        }
        
        double averageGuesses = (double) totalGuesses / 3;
        System.out.println("Average number of guesses: " + String.format("%.2f", averageGuesses));
    }
    
    public static int playGame(Scanner scanner, double secret) {
        int guesses = 0;
        while (true) {
            double guess = scanner.nextDouble();
            guesses++;
            
            if (guess == secret) {
                System.out.println("Congratulations! You guessed the number in " + guesses + " guesses.");
                break;
            } else {
                System.out.println("Wrong Guess. Try again.");
            }
        }
        return guesses;
    }
}
