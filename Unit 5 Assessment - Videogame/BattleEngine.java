// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;
import java.util.Random;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        if (monster.getHealth() + monster.getSpeed() + monster.getAttack() + monster.getDefense() > 250) {
            return false;
        } else if (monster.getHealth() < 0 || monster.getSpeed() < 0 ||monster.getAttack() < 0 || monster.getDefense() < 0) {
            return false;
        }
        return true;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        if (monster.getElement() == ElementType.FIRE || monster.getElement() == ElementType.WATER || monster.getElement() == ElementType.EARTH || monster.getElement() == ElementType.AIR) {
            return true;
        }
        monster.setElement(ElementType.FIRE);
        return false;
    }

    // to-do: correctStats
    // checks if stats are invalid 
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        if (monster.getHealth() < 0) {
            monster.setHealth(0);
        } 
        if (monster.getAttack() < 0) {
            monster.setAttack(0);
        } 
        if (monster.getDefense() < 0) {
            monster.setDefense(0);
        }
        if (monster.getSpeed() < 0) {
            monster.setSpeed(0);
        }
        while (monster.getHealth() + monster.getAttack() +
           monster.getDefense() + monster.getSpeed() > 250) {
            if (monster.getHealth() >= monster.getAttack() &&
                monster.getHealth() >= monster.getDefense() &&
                monster.getHealth() >= monster.getSpeed()) {
                monster.setHealth(monster.getHealth() - 1);
            } else if (monster.getAttack() >= monster.getDefense() &&
                    monster.getAttack() >= monster.getSpeed()) {
                monster.setAttack(monster.getAttack() - 1);
            } else if (monster.getDefense() >= monster.getSpeed()) {
                monster.setDefense(monster.getDefense() - 1);
            } else {
                monster.setSpeed(monster.getSpeed() - 1);
            }
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        Monster winner = null;
        if (monster1 == null || monster2 == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        if (validateStats(monster1) == false && validateStats(monster2) == false) {
            return null;
        }
        if (validateStats(monster1) == false) {
            return monster2;
        }
        if (validateStats(monster2) == false) {
            return monster1;
        }
        Random rng = new Random();
        int randomInt = rng.nextInt();
        displayStatus(monster1, monster2);
        if (monster1.getSpeed() > monster2.getSpeed()) {
            while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                monster1.attack(monster2);
                if (monster2.getHealth() <= 0) {
                    winner = monster1;
                }
                displayStatus(monster1, monster2);
                monster2.attack(monster1);
                if (monster1.getHealth() <= 0) {
                        winner = monster2;
                    }
                }
                displayStatus(monster1, monster2);
        } else if (monster2.getSpeed() > monster1.getSpeed()) {
            while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                monster2.attack(monster1);
                if (monster1.getHealth() <= 0) {
                    winner = monster2;
                }
                displayStatus(monster1, monster2);
                monster1.attack(monster2);
                if (monster2.getHealth() <= 0) {
                    winner = monster1;
                }
                displayStatus(monster1, monster2);
            }
        } else {
            if (randomInt % 2 == 0) {
                while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                    monster1.attack(monster2);
                    if (monster2.getHealth() <= 0) {
                        winner = monster1;
                    }
                    displayStatus(monster1, monster2);
                    monster2.attack(monster1);
                    if (monster1.getHealth() <= 0) {
                            winner = monster2;
                        }
                    displayStatus(monster1, monster2);
                }
            } else {
                while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
                    monster2.attack(monster1);
                    if (monster1.getHealth() <= 0) {
                        winner = monster2;
                    }
                    displayStatus(monster1, monster2);
                    monster1.attack(monster2);
                    if (monster2.getHealth() <= 0) {
                        winner = monster1;
                    }
                    displayStatus(monster1, monster2);
                }
            }
        }
        System.out.println(winner.victoryNoise());
        return winner;
    }

    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        if (monsters == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        Monster winner = monsters.get(0);
        for (int i = 1; i < monsters.size(); i++) {
            int healthForPreviousWinner = winner.getHealth();
            int healthForNewCompetitor = monsters.get(i).getHealth();
            Monster previousWinner = winner;
            winner = startBattle(winner, monsters.get(i));
            if (winner == previousWinner) {
                winner.setHealth(healthForPreviousWinner);
            } else {
                winner.setHealth(healthForNewCompetitor);
            }
        }
        return winner;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        if (monster == null || opponent == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }
        System.out.println(monster.getName() + ": " + monster.getHealth() + " vs " + opponent.getName() + ": " + opponent.getHealth());
    }

}