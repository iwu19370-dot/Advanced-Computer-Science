public class NPC{
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        boolean choice1 = RPSGame.validateChoice(choice);
        if (choice1 == true) {
            this.choice = choice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
            System.out.println("random choice");
        }
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}