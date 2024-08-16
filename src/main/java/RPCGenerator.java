import java.util.ArrayList;
import java.util.Random;

public class RPCGenerator {
    static Random rand = new Random();

    public static String rpcList() {

        ArrayList<String> rPC = new ArrayList<>();
        rPC.add("ROCK");
        rPC.add("PAPER");
        rPC.add("SCISSORS");


        int randomIndex = rand.nextInt(3);

        String finalChoice = rPC.get(randomIndex);

        return finalChoice;
    }
}
