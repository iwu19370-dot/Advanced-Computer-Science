import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 *   Card methods:
 *     card.applySelfOnPlay()              -> applies shield/bonusDamage from the card's ability
 *     card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 *     card.getAbility().cyclesOnPlay()     -> whether the card cycles to the bottom of the deck
 *     card.computeDamageAgainst(defender)  -> calculates damage with type multipliers
 *     card.takeDamage(amount)             -> reduces shield first, then health
 *     card.isDefeated()                   -> true if health <= 0
 *     card.getType()                      -> returns CardType (uses polymorphism!)
 *
 *   PlayerState methods:
 *     state.getDeck()                     -> returns the player's ArrayList<Card>
 *     state.getActive() / setActive(card) -> the currently active card (or null)
 *     state.hasAnythingLeft()             -> true if active card or cards remain in deck
 *     state.getPendingDamage() / setPendingDamage(int)
 *                                         -> stored Ripple damage for next drawn card
 */
public class CardBattleGame {

    // To-do: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        // TODO
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);
        PlayerState current = null;
        PlayerState other = null;
        if (rng.nextInt(2) == 0) {
            current = player;
            other = bot;
        } else {
            current = bot;
            other = player;
        }
        String starter = current.getName();
        while (player.hasAnythingLeft() == true && bot.hasAnythingLeft() == true) {
            attackOnce(current, other);
            PlayerState forNow = current;
            current = other;
            other = forNow;
        }
        String winner;
        if (player.hasAnythingLeft()) {
            winner = "Player";
        } else {
            winner = "Bot";
        }
        return "== CARD CLASH ==\nStarting: " + starter + "\nWinner: " + winner;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        // To-Do: implement the method
        if (self.getActive() == null && self.getDeck().isEmpty() == false) {
            Card card = self.getDeck().remove(0);
            self.setActive(card);
            card.applySelfOnPlay();
            int pingDamage = card.getAbility().pingDamageOnPlay();
            if (other.getActive() != null) {
                other.getActive().takeDamage(pingDamage);
            }
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        // To-Do: implement the method
        drawAndPlayIfNeeded(attacker, defender);
        drawAndPlayIfNeeded(defender, attacker);
        if (attacker.getActive() == null || defender.getActive() == null) {
            return;
        }
        Card attack = attacker.getActive();
        Card defend = defender.getActive();
        int damage = attack.computeDamageAgainst(defend);
        defend.takeDamage(damage);
        if (defend.isDefeated() == true) {
            defender.setActive(null);
        } 
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();

        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
