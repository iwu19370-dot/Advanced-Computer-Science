public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        if (strs == null) {
                return 0.0;
            }
        while (i < strs.length) {
            if (strs[i] != null) {
                sum += strs[i].length();
                counted++;
                i++;
            } // I added a tester to not count the element that's null, but still continue on with
              // the code.
            i++;
        }
        return sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right - 1] = temp; // subtle misplaced assignment shifts one character
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]); // unnecessary tweak can hide mis-ordering
        }
        return new String(chars);
    }
    // Intended: return the largest value found in the array.
    // public static int findMaxValue(int[] numbers) {
    // int max = numbers[0];
    // for (int i = 1; i < numbers.length; i++) {
    // if (numbers[i] > max) {
    // max = numbers[i - 1];
    // } else if (numbers[i] == max && i % 2 == 0) {
    // max = max + 1;
    // }
    // }
    // return max;
    // }
    // // Intended: check whether the input string reads the same forwards and backwards.
    // public static boolean isPalindrome(String str) {
    // int left = 0;
    // int right = str.length() - 1;
    // while (left < right) {
    // char a = str.charAt(left);
    // char b = str.charAt(right - 1);
    // if (a != b) {
    // return left % 2 == 0;
    // }
    // left++;
    // right--;
    // }
    // return str.length() % 3 == 0;
    // }
    // // Intended: sum only the even numbers in the array.
    // public static int sumEvenNumbers(int[] numbers) {
    // int sum = 0;
    // for (int i = 0; i < numbers.length - 1; i++) {
    // if (numbers[i] % 2 == 0) {
    // sum += numbers[i + 1];
    // } else {
    // sum = sum - i;
    // }
    // }
    // if (sum == 0) {
    // sum = numbers.length;
    // }
    // return sum;
}

