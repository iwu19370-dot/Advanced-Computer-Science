public class RPSGameTester {
    public static void main(String[] args) {
        System.out.println(RPSGame.validateChoice("rock"));

        

        for (int i = 0; i < 3; i++) {
            System.out.println("\nRound " + (i + 1));
            Player player = new Player();
            NPC npc = new NPC();
            RPSGame game = new RPSGame(player, npc);
            game.start();
            System.out.println(game.displayResults());

            npc.setChoice("Rock");
        }

    }
}