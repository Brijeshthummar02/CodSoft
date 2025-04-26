package Task_1;

public class OOPNumberGame {
    public static void main(String[] args) {
        NumberGame game = new NumberGame(1, 10, 3);
        game.start();
    }
}

// Output: when using Task_1.NumberGame(1, 100, 5) -->
// Guess the number between 1 and 100
//Attempt 1: 50
//Too low!
//Attempt 2: 70
//Too high!
//Attempt 3: 60
//Too low!
//Attempt 4: 68
//Too high!
//Attempt 5: 65
//Too high!
//Out of attempts! The number was: 64
//Play again? (yes/no):

// Output: when using Task_1.NumberGame(1, 50, 7) -->
//Guess the number between 1 and 50
//Attempt 1: 40
//Too low!
//Attempt 2: 55
//Too high!
//Attempt 3: 45
//Too high!
//Attempt 4: 42
//Too low!
//Attempt 5: 43
//Too low!
//Attempt 6: 44
//Correct! You won this round.
//Play again? (yes/no):

// Output: when using Task_1.NumberGame(1, 10, 3) -->
//Guess the number between 1 and 10
//Attempt 1: 5
//Too low!
//Attempt 2: 7
//Too low!
//Attempt 3: 9
//Too low!
//Out of attempts! The number was: 10
//Play again? (yes/no):
