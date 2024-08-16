public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setNameFromInput();
        user.setRockPaperScissors();

        RPCGenerator generator = new RPCGenerator();
        String compChoice = generator.rpcList();

        Game game = new Game();
        game.playGame(user, compChoice);
    }
}
