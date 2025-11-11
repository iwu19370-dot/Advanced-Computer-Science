import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Rock, Paper, or Scissors?");
        String choice = scan.nextLine();
        int i = 0;
        while (validateChoice(choice) == false && i < 3) {
            System.out.println("Rock, Paper, or Scissors?");
            choice = scan.nextLine();
            i++;
        }
        if (i == 3) {
            choice = generateRandomChoice();
        }
        setPlayerValues(name, choice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice() == opponent.getChoice()) {
            return false;
        }
        if (player.getChoice() == "rock" && opponent.getChoice() == "scissors") {
            return true;
        }
        if (player.getChoice() == "paper" && opponent.getChoice() == "rock") {
            return true;
        }
        if (player.getChoice() == "scissors" && opponent.getChoice() == "paper") {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (didPlayerWin() == true) {
            return player.getName() + "won!\nCongradulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" + player.getName() + " chose " + player.getChoice()
                + "\nOpponent chose paper.\n" + toString();
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateRandomChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int randomChoice = (int) (Math.random() * choices.length);
        return choices[randomChoice];
    }
}
