import java.util.ArrayList;
import java.util.Scanner;

/*
 * DeckValidator — deck validation and building (students implement).
 *
 * USEFUL METHODS FOR YOUR IMPLEMENTATIONS:
 *
 * card.hasAbility() -> true if the card has a real ability (not NONE) card.getAbility() -> returns
 * the Ability interface reference card.getAbility().getId() -> returns "BASTION", "RIPPLE",
 * "CLEAVE", or "NONE" card.getType() -> returns the CardType enum (GRANITE, PARCHMENT, BLADE)
 * card.getstrengthength() -> returns the card's strengthength stat card.getHealth() -> returns the card's
 * health stat
 *
 * CardType.fromText("granite") -> returns CardType.GRANITE AbilityLibrary.fromText("bastion") ->
 * returns the BastionAbility instance
 *
 * createCard("name", type, strength, health, ability) -> creates the right subclass (Granite, Parchment, or
 * Blade) based on the CardType
 */
public class DeckValidator {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no more than 3 total ability cards in the deck.
    // HINT: loop through the deck, use card.hasAbility() to count how many
    // cards have a real ability, and return true if the count is <= 3.
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        // To-Do: implement the method
        int count = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).hasAbility() == true) {
                count++;
            }
        }
        if (count <= 3) {
            return true;
        }
        return false;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE).
    // HINT: loop through the deck, use card.getAbility().getId() to get
    // each ability's name, and check for duplicates.
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        // To-Do: implement the method
        int countForBastion = 0;
        int countForRipple = 0;
        int countForCleave = 0;
        for (int i = 0; i < deck.size() - 1; i++) {
            String id = deck.get(i).getAbility().getId();
            if (id.equals("BASTION")) {
                countForBastion++;
            }
            if (id.equals("RIPPLE")) {
                countForRipple++;
            }
            if (id.equals("CLEAVE")) {
                countForCleave++;
            }
        }
        if (countForBastion < 2 && countForRipple < 2 && countForCleave < 2) {
            return true;
        }
        return false;
    }

    // Rule: strengthength and health must be 1..5, and strengthength + health <= 6.
    // HINT: loop through the deck, use card.getstrengthength() and card.getHealth().
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        // To-Do: implement the method
        for (int i = 0; i < deck.size(); i++) {
            int strength = deck.get(i).getStrength();
            int health = deck.get(i).getHealth();
            if (strength + health > 6) {
                return false;
            }
            if (strength < 1 || strength > 5 || health < 1 || health > 5) {
                return false;
            }
        }
        return true;
    }

    // Returns true only if the deck is fully valid:
    // - deck has exactly 5 cards
    // - AND all checks above return true
    public static boolean isValidDeck(ArrayList<Card> deck) {
        // To-Do: implement the method
        if (deck.size() == 5 && 
            checkNoMoreThanThreeAbilityCards(deck) == true
            && checkNoDuplicateAbilities(deck) == true && 
            checkStatsInRange(deck) == true) {
            return true;
        }
        return false;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities (use AbilityLibrary.NONE).
    // Use the Granite, Parchment, and Blade subclasses directly,
    // or use the createCard() helper below.
    public static ArrayList<Card> buildDefaultDeck() {
        // To-Do: implement the method
        ArrayList<Card> deck = new ArrayList<Card>();
        for (int i = 0; i < 5; i++) {
            int choice = i % 3;
            if (choice == 0) {
                CardType type = CardType.GRANITE;
                deck.add(createCard("i", type, 3, 3, new AbilityNone()));
            } else if (choice == 1) {
                CardType type = CardType.PARCHMENT;
                deck.add(createCard("i", type, 3, 3, new AbilityNone()));
            } else {
                CardType type = CardType.BLADE;
                deck.add(createCard("i", type, 3, 3, new AbilityNone()));
            }
        }
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // 1. name (strengthing)
    // 2. type (granite / parchment / blade) -> use CardType.fromText()
    // 3. strengthength (int)
    // 4. health (int)
    // 5. ability (bastion / ripple / cleave / none) -> use
    // AbilityLibrary.fromText()
    //
    // Then use createCard() to build the right subclass from the parsed type.
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        // To-Do: implement the method
        ArrayList<Card> deck = new ArrayList<Card>();

        while (deck.size() < 5) {
            System.out.println("What's the card's name? (one word)");
            String answerName = sc.nextLine();
            System.out.println("Type granite, parchment, or blade");
            CardType cardType = CardType.fromText(sc.nextLine());
            System.out.println("What's the strength for the card? (1-5)");
            int strength = Integer.parseInt(sc.nextLine());
            System.out.println("What's the health for the card? (1-5)");
            int health = Integer.parseInt(sc.nextLine());
            System.out.println("What is the card's ability? (bastion, ripple, cleave, or none)");
            Ability ability = AbilityLibrary.fromText(sc.nextLine());
            Card newCard = createCard(answerName, cardType, strength, health, ability);
            deck.add(newCard);
            if(checkNoMoreThanThreeAbilityCards(deck) == false || checkNoDuplicateAbilities(deck) == false || checkStatsInRange(deck) == false) {
                System.out.println("Invalid card — try again.");
                deck.remove(deck.size() - 1);
            }
        }
        return deck;
    }

    // ----------------------------
    // Helper: create a Card subclass from a CardType
    // ----------------------------

    // This is a FACTORY METHOD — it decides which subclass to instantiate
    // based on the CardType enum value. The caller doesn't need to know
    // about the specific subclasses; they just pass in the type and get
    // back a Card reference.
    public static Card createCard(String name, CardType type, int strength, int health, Ability ability) {
        switch (type) {
            case GRANITE:
                return new CardGranite(name, strength, health, ability);
            case PARCHMENT:
                return new CardParchment(name, strength, health, ability);
            case BLADE:
                return new CardBlade(name, strength, health, ability);
            default:
                return null;
        }
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
