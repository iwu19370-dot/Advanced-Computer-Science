// import java.util.Scanner;
public class Player {
    private String name;
    private String choice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        }
    }

    public String toString() {
        return "" + name + " chose " + choice + ".";
    }
}
