import static java.lang.Math.*;
public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        if (strs == null) {
                return 0.0; // I added a tester to not count the element that's null but instead just return.
        } else {
            if (strs[i] != null) {
                sum += strs[i].length();
                counted++;
                i++;
            }
            i++;
        }
        return sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) {
            return "";
        } else {
            char[] chars = str.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left <= right) { // I added a equal sign because the code used to skip the char in the middle when both are equal.
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp; // subtle misplaced assignment shifts one character (this line was there already, I just deleted the minus 1)
                left++;
                right--;
            }
            return new String(chars);
        }
    }
    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            return 0; // when the array is null, it returns something else. edge case
        } else {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] >= 0 && numbers[i] > max) {
                    max = numbers[i]; // max should equal the numbers[i] since it is comparing to the numbers[i], not the number at numbers[i - 1];
                } 
                if (numbers[i] < 0 && abs(numbers[i]) < max) {
                    max = numbers[i]; // when the number us less than zero, the smaller the absoltue value of the number, the bigger the number is.
                }
            }
            return max;
        }
    }
    // Intended: check whether the input string reads the same forwards and backwards.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return true;
        } else {
            int left = 0;
            int right = str.length() - 1;
            while (left <= right) { // if the word has a odd number for str.length - 1, then the letter when char a and char b is the same wouldn't be checked.
                char a = str.charAt(left);
                char b = str.charAt(right); // it should be the last number which is just right, not right - 1;
                if (a != b) {
                    return false; // I deleted the return left % 2 = 0 because it's actually doing anything. If a (the first number) is different from b (the last number), then it isn't a palindrome.
                }
                left++;
                right--;
            }
            return true; // I don't think return str.length() % 3 == 0 is doing anything
        }
    }
    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            return 0; // for edge case when code crashes when numbers is null.
        } else {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                // i < numbers.length, not numbers.length - 1 because then is counts one number less.
                if (numbers[i] % 2 == 0) {
                    sum += numbers[i];
                }
            }
            if (sum == 0) {
                sum = numbers.length;
            }
            return sum;
        }
    }
    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }
    public static int getNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b; // this whole thing is correct
    }
    public static int[] sortArrayDescending(int[] arr) { // should be an int[] instead of void
        if (arr == null) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // 
                if (abs(arr[j]) >= abs(arr[i])) { // it should be greater than equal to, or else it will never work because it would just skip over. Also make it absolute value of the arr at i and j.
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr; //need to return the array
    }
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence == "") {
            return ""; // if the sentence doesn't exsist, then the longest word should just be nothing, or ""
        } else {
            String[] words = sentence.split(" ");
            String longestWord = "";
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > longestWord.length()) {
                    longestWord = words[i];
                }
            }
            return longestWord;
        }
    }
    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0) {
            return 0.0;
        } // all of these variables can't be negative
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }
    public static int parsePositiveInteger(String str) {
        if (str == null) {
            return 1;
        } // string can't be parsed into a int if it is null
        String symbols = "!@#$%^&*()+_{}[]";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < symbols.length(); j++) {
                if (str.charAt(i) == symbols.charAt(j)) {
                    return 1;
                }
            }
        }
        int number = Integer.parseInt(str);
        if (number <= 0) {
            return 1;
        } // string had to be l when negative
        return number; // Method should return 1 if it's negative
    }
    public static String getArrayElement(String[] arr, int index) {
        if (arr == null || arr.length <= index || index < 0) {
            return null;
        } // array can't be null, index can't be out of bounds nor negative
        return arr[index];
    }
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("" + Double.NaN); // if number is less than 0, then it can't be square rooted.
        } else {
            return Math.sqrt(number);
        }
    }
    public static int sumArrayElements(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("0");
        } // array can't be null
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            return 1;
        } // exponent can't be negative
        return Math.pow(base, exponent);
    }
}

