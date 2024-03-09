import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args)  {
        Scanner scnr = new Scanner(System.in);
        Random generator = new Random();
        int secret = generator.nextInt();
        int maxTrials = 4;
    
        int guess;
        System.out.println("Enter a number between 0 and 10");
        guess = scnr.nextInt();

        int count = 1;
        while(count < maxTrials) {
            count++;
            System.out.println("Count: " + count);
            System.out.println("Enter a number between 0 and 10");
            guess = scnr.nextInt();

            if (guess == secret) {
                System.out.println("You win!!!!");
                System.out.println("Number is " + count);
                break;
            }

            if (count == maxTrials) {
                System.out.println("You lose!");
                break;
            }
        }
        
        scnr.close();
    }
    
}