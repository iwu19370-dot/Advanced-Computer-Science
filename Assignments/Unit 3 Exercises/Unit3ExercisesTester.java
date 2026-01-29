import java.util.Arrays;
public class Unit3ExercisesTester {
    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testCalculateSumOfSquares();
        testGetNthFibonacci();
        testSortArrayDescending();
        testFindLongestWord();
        testCalculateInterest();
        testParsePositiveInteger();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
    }
    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }
    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: Null string
        try{
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
    }
    public static void testFindMaxValue() {
        // Test case - main case: An array only positive integers
        int[] testArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Expected 6: " + Unit3Exercises.findMaxValue(testArray));
        // Test case - edge case: An array containing both negative integers and zero
        testArray = new int[]{-1, 0, 1, 2, 3, 4};
        System.out.println("Expected 4 :" +Unit3Exercises.findMaxValue(testArray));
        // Test case - edge case: An array containing only negative integers
        testArray = new int[]{-1, -2, -3, -4, -5, -6};
        System.out.println("Expected -1: " +Unit3Exercises.findMaxValue(testArray));
        // Test case - edge case: A null array
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }
    public static void testIsPalindrome() {
        // Test case - main case: Test with a palindrome string (e.g., "racecar", "deed")
        String string = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(string));
        // Test case - edge case: Test with non-palindrome string (e.g., "hello", "world")
        string = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(string));
        // Test case - edge case: Test with a null string.
        string = null;
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(string));
        // Test case - edge case: Test with an empty string ("")
        string = "";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(string));
    }
    public static void testSumEvenNumbers() {
         // Test case - main case: Test with an array containing positive even and odd integers
         int[] testArray = {1, 2, 3, 4, 5, 6};
         System.out.println("Expected 12: " + Unit3Exercises.sumEvenNumbers(testArray));
         // Test case - edge case: Test with an array containing only negative even and odd integers
         testArray = new int[]{-1, -2, -3, -4, -5, -6};
         System.out.println("Expected -12: " + Unit3Exercises.sumEvenNumbers(testArray));
         // Test case - edge case: Test with an array containing both positive and negative even and odd integers
         testArray = new int[]{1, 2, -3, -4, 5, 6, -7, -8};
         System.out.println("Expected -4: " + Unit3Exercises.sumEvenNumbers(testArray));
         // Test case - edge case: Test with a null array.
         testArray = null;
         System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(testArray));
    }
    public static void testCalculateSumOfSquares() {
        // Test case - main case: Test with an array containing positive even and odd integers
        int[] testArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Expected 91: " + Unit3Exercises.calculateSumOfSquares(testArray));
        // Test case - edge case: Test with an array containing only negative even and odd integers
        testArray = new int[] {-1, -2, -3, -4, -5, -6};
        System.out.println("Expected 91: " + Unit3Exercises.calculateSumOfSquares(testArray));
    }
    public static void testGetNthFibonacci() {
        // Test case - main case: Select a number, calculate its expected Fibonacci value by hand, and verify the code produces the correct output. Test with at least 2 different numbers. Note that the code may not necessarily contain bugs here.
        int n = 5;
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(n));
        n = 7;
        System.out.println("Expected 13: " + Unit3Exercises.getNthFibonacci(n));
        // Test case - edge case: Since the parameter cannot be negative, throw a IllegalArgumentException with an appropriate message if a negative number is provided.
        try {
            n = -1;
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(n));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the integer was negative, as intended");
        }

    }
    public static void testSortArrayDescending() {
        // Test case - main case: Create an unsorted array, manually calculate the expected sorted order, and verify that the code produces the correct output.
        int[] testArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Expected [6, 5, 4, 3, 2, 1]: " + Arrays.toString(Unit3Exercises.sortArrayDescending(testArray)));
        // Test case - main case: Test with negative values—the code should handle them correctly.
        testArray = new int[] {-1, -2, -3, -4, -5, -6};
        System.out.println("Expected [-6, -5, -4, -3, -2, -1]: " + Arrays.toString(Unit3Exercises.sortArrayDescending(testArray)));
        // Test case - edge case: Consider what happens with a null array. Add appropriate exception handling with a descriptive error message.
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }
    public static void testFindLongestWord() {
        // Test case - main case: Write a test sentence, manually identify the longest word, and verify that the code produces the correct output. Test with at least 2 different sentences.
        String string = "I love my waterbottle";
        System.out.println("Expected waterbottle: " + Unit3Exercises.findLongestWord(string));
        string = "I am doing my homework";
        System.out.println("Expected homework: " + Unit3Exercises.findLongestWord(string));
        // Test case - main case: Test the requirement that when multiple words have the same longest length, the method returns the first occurrence.
        string = "I can see the toy";
        System.out.println("Expected can: " + Unit3Exercises.findLongestWord(string));
        // Test case - edge case: Handle null or empty input by throwing an appropriate exception with a descriptive message.
        try {
            string = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(string));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
        try {
            string = "";
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(string));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
    }
    public static void testCalculateInterest() {
        // Test case - main case: Choose appropriate parameters, manually calculate the expected value, and verify that the code produces the correct output. Test with at least 2 different sets of values.
        double principal = 100;
        double rate = 4.00;
        int years = 2;
        System.out.println("Expected 108.16: " + Unit3Exercises.calculateInterest(principal, rate, years));
        principal = 1000;
        rate = 10;
        years = 4;
        System.out.println("Expected 1464.1: " + Unit3Exercises.calculateInterest(principal, rate, years));
        // Test case - edge case: The principal amount cannot be negative.
        principal = -1000;
        rate = 5;
        years = 4;
        System.out.println("Expected 0.0: " + Unit3Exercises.calculateInterest(principal, rate, years));
        // Test case - edge case: The interest rate cannot be negative.
        principal = 100;
        rate = -10;
        years = 7;
        System.out.println("Expected 0.0: " + Unit3Exercises.calculateInterest(principal, rate, years));
        // Test case - edge case:  The number of years must be a positive integer.
        principal = 1000;
        rate = 8;
        years = -8;
        System.out.println("Expected 0.0: " + Unit3Exercises.calculateInterest(principal, rate, years));
    }
    public static void testParsePositiveInteger() {
        // Test case - main case: Converts a string to a positive number
        String string = "98";
        System.out.println("Expected exception 98: " + Unit3Exercises.parsePositiveInteger(string));
        // Test case - edge case: the string cannot be converted.
        try {
            string = "@$csdf)";
            System.out.println("Expected exception 1: " + Unit3Exercises.parsePositiveInteger(string));
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("The method threw an exception when the string was invalid, as intended");
        }
        try {
            string = null;
            System.out.println("Expected exception 1: " + Unit3Exercises.parsePositiveInteger(string));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was invalid, as intended");
        }
        // Test case - edge case: the string represents a negative number
        try {
            string = "-78";
            System.out.println("Expected exception 1: " + Unit3Exercises.findLongestWord(string));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was negative, as intended");
        }
    }
    public static void testGetArrayElement() {
        // Test case - main case: Finds the element at a specific index in an array.
        String[] testArray = {"i", "s", "a", "b", "e", "l", "l", "e"};
        int index = 3;
        System.out.println("Expected exception b: " + Unit3Exercises.getArrayElement(testArray, index));
        // Test case - edge case: the array isn't long enough.
        try {
            testArray = new String[] {"i", "s", "a"};
            System.out.println("Expected exception null: " + Unit3Exercises.getArrayElement(testArray, index));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the index was out of bounds, as intended");
        }
        // Test case - edge case: the array is null.
        try {
            testArray = null;
            System.out.println("Expected exception null: " + Unit3Exercises.getArrayElement(testArray, index));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the index was out of bounds, as intended");
        }
        // Test case - edge case: The index is negative.
        try {
            index = -5;
            System.out.println("Expected exception null: " + Unit3Exercises.getArrayElement(testArray, index));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the index was out of bounds, as intended");
        }
    }
    public static void testCalculateSquareRoot() {
        // Test case - main case: Calculates the square root of a positive integer.
        int number = 16;
        System.out.println("Expected exception 4.0: " + Unit3Exercises.calculateSquareRoot(number));
        // Test case - edge case: the number is negative
        try {
            number = -5;
            System.out.println("Expected exception " + Double.NaN + ": " + Unit3Exercises.calculateSquareRoot(number));
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Expected exception: Double.NaN");
        }
    }
    public static void testSumArrayElements() {
        // Test case - main case: Adds up all the emelents in the array
        int[] testArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Expected exception 21: " + Unit3Exercises.sumArrayElements(testArray));
        // // Test case - edge case: the array is null
        // testArray = null;
        // System.out.println("Expected exception 0: " + Unit3Exercises.sumArrayElements(testArray));
    }
    public static void testCalculatePower() {
        // Test case - main case: Calculates the number when the base and exponent are positive.
        double base = 2;
        int exponent = 3;
        System.out.println("Expected exception 8.0: " + Unit3Exercises.calculatePower(base, exponent));
        // Test case - edge case: the string represents a negative number
        base = 2;
        exponent = -3;
        System.out.println("Expected exception 1.0: " + Unit3Exercises.calculatePower(base, exponent));
    }
}
