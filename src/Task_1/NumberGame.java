package Task_1;

import java.util.Random;
import java.util.Scanner;

class NumberGame {
    private final int min;
    private final int max;
    private final int maxAttempts;
    private int roundsWon;
    private int totalRounds;
    private final Scanner scanner;
    private final Random random;

    public NumberGame(int min, int max, int maxAttempts) {
        this.min = min;
        this.max = max;
        this.maxAttempts = maxAttempts;
        this.roundsWon = 0;
        this.totalRounds = 0;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void start() {
        String playAgain;

        do {
            playRound();
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        endGame();
    }

    private void playRound() {
        int number = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        boolean won = false;
        totalRounds++;

        System.out.println("\nGuess the number between " + min + " and " + max);

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You won this round.");
                roundsWon++;
                won = true;
                break;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!won) {
            System.out.println("Out of attempts! The number was: " + number);
        }
    }

    private void endGame() {
        System.out.println("\nGame Over!");
        System.out.println("Rounds Played: " + totalRounds + ", Rounds Won: " + roundsWon);
    }
}