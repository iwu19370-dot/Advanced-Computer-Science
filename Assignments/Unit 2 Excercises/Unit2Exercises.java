public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        // to-do: implement this method
        if (day > 6 || day < 0) {
            return "";
        }
        if (day >= 1 && day <= 5) {
            if (vacation == false) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (vacation == false) {
                return "10:00";
            }
            return "off";
        }
    }

    public static boolean love6(int a, int b) {
        // to-do: implement this method
        if (a == 6 || b == 6) {
            return true;
        }
        if (a + b == 6) {
            return true;
        }
        if (a - b == 6 || b - a == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        // to-do: implement this method
        if (a == b && b == c) {
            if (a == 2) {
                return 10;
            } else {
                return 5;
            }
        }
        if (a != b && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        if (str.equals("")) {
            return "";
        }
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        }
        if (str.charAt(0) == 'f') {
            return "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }

    }

    public static String doubleChar(String str) {
        // to-do: implement this method
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            string = string + str.charAt(i);
            string = string + str.charAt(i);
        }
        return string;

    }

    public static int countHi(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count = count + 1;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        // to-do: implement this method
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                countCat = countCat + 1;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                countDog = countDog + 1;
            }
        }
        if (countCat == countDog) {
            return true;
        }
        return false;
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        String together = "";
        if (a.length() >= b.length()) {
            for (int i = 0; i < b.length(); i++) {
                together = together + a.charAt(i) + b.charAt(i);
            }
            String restOfA = a.substring(b.length(), a.length());
            together = together + restOfA;
        } else {
            for (int i = 0; i < a.length(); i++) {
                together = together + a.charAt(i) + b.charAt(i);
            }
            String restOfB = b.substring(a.length(), b.length());
            together = together + restOfB;
        }
        return together;

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        String end = "";
        String end2 = "";
        if (n < 0 || n > str.length()) {
            return "";
        }
        for (int i = str.length() - n; i < str.length(); i++) {
            end = end + str.charAt(i);
            end2 = end2 + str.charAt(i);
        }
        for (int i = 0; i < n - 1; i++) {
            end = end + end2;
        }
        return end;
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() >= b.length()) {
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) != a.charAt(a.length() - b.length() + i)) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(b.length() - a.length() + i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int countCode(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count = count + 1;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        int biggestNumber = nums[0];
        int smallestNumber = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= biggestNumber) {
                biggestNumber = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= smallestNumber) {
                smallestNumber = nums[i];
            }
        }
        return biggestNumber - smallestNumber;
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 13) {
                return sum;
            } else {
                sum = sum + nums[i];
            }

        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 3) {
                count = count + 1;
            }
        }
        if (nums[nums.length - 1] == 3) {
            count = count + 1;
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }

    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        int zeroCount = 0;
        int[] newIntWithZeroInFront = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount = zeroCount + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newIntWithZeroInFront[zeroCount] = nums[i];
                zeroCount++;
            }
        }
        for (int i = 0; i < newIntWithZeroInFront.length; i++) {
            System.out.print(newIntWithZeroInFront[i] + ",");
        }
        return newIntWithZeroInFront;
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (target == words[i]) {
                count = count + 1;
            }
        }
        String[] newString = new String[words.length - count];
        int newStringIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != target) {
                newString[newStringIndex] = words[i];
                newStringIndex++;
            }
        }
        return newString;
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        int firstHalfTotal = 0;
        for (int i = 0; i < scores.length / 2; i++) {
            firstHalfTotal = firstHalfTotal + scores[i];
        }
        int firstAverage = firstHalfTotal / (scores.length / 2);
        int secondHalfTotal = 0;
        for (int i = scores.length / 2; i < scores.length; i++) {
            secondHalfTotal = secondHalfTotal + scores[i];
        }
        int secondAverage = secondHalfTotal / (scores.length / 2);
        if (firstAverage > secondAverage) {
            return firstAverage;
        }
        return secondAverage;
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        int biggestNumber1 = 0;
        int biggestNumber2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= biggestNumber1 && a[i] % 10 == 0) {
                biggestNumber1 = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= biggestNumber2 && b[i] % 10 == 0) {
                biggestNumber2 = b[i];
            }
        }
        return biggestNumber1 + biggestNumber2;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        String string = "";
        if (str.length() >= 2) {
            for (int i = 0; i < 2; i++) {
                string = string + str.charAt(i);
            }
        } else {
            string = str;
            if (str.length() == 0) {
                return "**";
            } else {
                return string + "*";
            }
        }
        return string;
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        if (a == 0 || b == 0) {
            return 0.0;
        }
        if (a >= b) {
            return (double) a / b;
        } else {
            return (double) b / a;
        }
    }
}
