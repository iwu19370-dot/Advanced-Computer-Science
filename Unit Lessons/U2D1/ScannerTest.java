import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your full government name?");

        // String governmentName = keyboard.next(); // grabs up to the space or new line
        String governmentName = keyboard.nextLine(); // grabs text up to the new Line
        System.out.println("Hello, " + governmentName + ". Nice to meet you!");

        System.out.println("What is your current age?");

        int age = keyboard.nextInt();
        if(age >= 18) {
            System.out.println("Cpngradulations, you can vote!");
        } else {
            System.out.println("Come back again soon!");
        }

        System.out.println("(true/false) You will vote to make mangos mandatory for breakfast every day.");
        boolean lovesMangos = keyboard.nextBoolean();
        while (lovesMangos == false) {
            System.out.println("Again... You VOTE to make mangos mandatory for breakfast every day. (true/false)");
            lovesMangos = keyboard.nextBoolean();
        }
        System.out.println("Great! Thank you for supporting big mango!");
        
        keyboard.close();
        }
    }

