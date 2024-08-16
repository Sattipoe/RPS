import java.util.Locale;
import java.util.Objects;

public class Game {

    public void playGame(User user, String compChoice) {
        String userHand;


        while (true) {
            // Generate a new choice for the computer
            compChoice = RPCGenerator.rpcList();

            // Get user's choice
            userHand = user.getRockPaperScissors().toUpperCase(Locale.ROOT);

            System.out.println("Computer Chooses " + compChoice);
            System.out.println("You Chose " + userHand);

            // Ensure the comparison is consistent in case (e.g., all uppercase)
            if (Objects.equals(compChoice, userHand)) {
                System.out.println("It was a draw!");
                break; // Exit the loop if it's a draw
            } else if (Objects.equals(userHand, "ROCK") && Objects.equals(compChoice, "PAPER")) {
                System.out.println("You Lost");
            } else if (Objects.equals(userHand, "PAPER") && Objects.equals(compChoice, "SCISSORS")) {
                System.out.println("You Lost");
            } else if (Objects.equals(userHand, "SCISSORS") && Objects.equals(compChoice, "ROCK")) {
                System.out.println("You Lost");
            } else {
                System.out.println("You Win!");
            }

            // Prompt user to choose again if it was not a draw
            System.out.println("Run It Back!");
            user.setRockPaperScissors(); // Prompt user to choose again
        }
    }
}
