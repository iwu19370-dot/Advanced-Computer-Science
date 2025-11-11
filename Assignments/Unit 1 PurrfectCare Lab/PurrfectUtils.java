public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (7 < cat.getMoodLevel() && cat.getMoodLevel() <= 10) {
            String happy =
                    "Currently, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
            return happy;
        }
        if (3 < cat.getMoodLevel() && cat.getMoodLevel() <= 7) {
            String ok = "Currently, " + cat.getName()
                    + " is reminiscing of a past life.\nPetting is acceptable.";
            return ok;
        } else {
            String angry = "Currently, " + cat.getName()
                    + " is plotting revengeance.\nPetting is extremely risky.";
            return angry;
        }
    }

    public static char generateCatChar(String catId) {
        // int first = Integer.parseInt(catId) / 1000;
        // int second = (Integer.parseInt(catId) / 100) % 10;
        // int third = (Integer.parseInt(catId) / 10) % 10;
        // int fourth = (Integer.parseInt(catId) % 10);
        int sum = 0;
        for (int a = 0; a < catId.length(); a++) {
            sum = sum + Integer.parseInt("" + catId.charAt(a));
        }
        return (char) ((sum % 26) + 'A');
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int x = low;
            low = high;
            high = x;
        }
        return (int) (Math.random() * (high - low)) + low;
    }

    public static String validateCatId(String catId) {
        if (1000 <= Integer.parseInt(catId) && Integer.parseInt(catId) <= 9999) {
            return catId;
        } else {
            String s = "" + (int) ((Math.random() * 9000) + 1000);
            return s;
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (0 <= moodLevel && moodLevel <= 10) {
            return moodLevel;
        }
        if (moodLevel < 0) {
            return 0;
        } else {
            return 10;
        }
    }

    public static String bootUp(Cat cat) {
        return cat.toString();
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
        if (cat.getMoodLevel() < 2 && cat.isHungry() == true) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        }
        if (cat.getMoodLevel() < 2 && cat.isHungry() == false) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");;
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int a = generateRandomNumber(1, 3);
        cat.setMoodLevel(cat.getMoodLevel() - a);
        if (a == 1) {
            System.out.println("" + cat.getName() + " did not like that...");
        }
        if (a == 2) {
            System.out.println("" + cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        String n = "Cleaning the litter box...";
        System.out.println(n + "\nDone!\n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        String n = "Filling up " + cat.getName() + "'s bowl...";
        String h = "" + cat.getName() + "";
        System.out.println(n + "\nDone!\n" + h + "is eating...\n" + h + "is full!");
    }
}
