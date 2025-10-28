public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (7 < cat.getMoodLevel() && cat.getMoodLevel() <= 10) {
            String happy = "Currently, " + cat.getName() + " is in a great mood./tPetting is appreciated.";
            return happy;
        }
        if (3 < cat.getMoodLevel() && cat.getMoodLevel() <= 7) {
            String ok = "Currently, " + cat.getName() + " is reminiscing of a past life./tPetting is acceptable.";
            return ok;
        } else {
            String angry = "Currently, " + cat.getName() + " is plotting revengeance./tPetting is extremely risky.";
            return angry;
        }
    }

    public static String generateCatChar(String catId) {
        int first = Integer.parseint(catId) / 1000;
        int second = (Integer.parseint(catId) /100) % 10;
        int third = (Integer.parseint(catId) / 10) % 10;
        int fourth = (Integer.parseint(catId) % 10);

        return ;
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            
        }
        return (int) (Math.random() * (high - low)) + low;
    }

    public static String validateCatId(String catId) {
        if (1000 <= Integer.parseint(catId) && Integer.parseint(catId) <= 9999) {
            return catId;
        } else {
            String s = "" + (int) ((Math.random() * 9000) + 1000);
            return s;
        }
    }

    public static int validateMoodLevel(Cat cat) {
        if (0 <= cat.getMoodLevel() && cat.getMoodLevel() <= 10) {
            return cat.getMoodLevel();
        } 
        if (cat.getMoodLevel() < 0) {
            return 0;
        } else {
            return 10;
        }
    }

    public static String bootUp(Cat cat) {
        return cat.toString;
    }

    public static String petString(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.getMoodLevel() =+ 1;
        } 
        if (cat.getMoodLevel() < 2) {
            cat.getisHungry() = true;
            cat.getMoodLevel() =- 1;
        }
        if
    }

    public static String cleanLitterBox(Cat cat) {
        
    }

    public static String feed(Cat cat) {
        
    }
}
