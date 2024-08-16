import java.util.Scanner;

public class User {
    private  String name;
    private String rockPaperScissors;
    Scanner user_input = new Scanner(System.in);

    public void setNameFromInput() {
        System.out.println("Please Enter your name");
        this.name = user_input.next();

    }

    public void setRockPaperScissors(){
        System.out.println("Choose your weapon Rock, Paper, Scissors");
        this.rockPaperScissors = user_input.next().toUpperCase();
    }

    public String getName (){
        return name;
    }

    public String getRockPaperScissors() {
        return rockPaperScissors;
    }
}
