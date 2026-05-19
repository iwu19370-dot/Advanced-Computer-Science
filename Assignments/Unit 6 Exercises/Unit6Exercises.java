public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        } 
        if (n == 0) {
            return 1;
        }
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }

        return total;
    }

    public static int factorialRecursive(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1 || n == 0) {
            return 1; 
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        int total = 1;
        int previous = 0;
        for (int i = 1; i < n; i++) {
            total = total + previous;
            previous = total - previous;
        }
        return total;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        int total = 0;
        while (n > 0) {
            total = total + n % 10;
            n = n / 10;
        }
        return total;
    }

    public static int sumDigitsRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        if ((n / 10) < 1) {
            return n % 10;
        }
        return sumDigitsRecursive(n / 10) + sumDigitsRecursive(n % 10);
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                count++;
            }
        }
        return count;
    }

    public static int countXRecursive(String str) {
        str = str.toLowerCase();
        if (str.length() <= 0) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return 1 + countXRecursive(str.substring(0, str.length() - 1));
        } else {
            return countXRecursive(str.substring(0, str.length() - 1));
        }
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static String reverseStringRecursive(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() > 1) {
            return str.charAt(str.length() - 1) 
                + reverseStringRecursive(str.substring(0, str.length() - 1));
        } else {
            return "" + str.charAt(str.length() - 1);
        }
        
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        if (base < 0 || exponent < 0) {
            throw new IllegalArgumentException("not possible");
        }
        if (exponent == 0) {
            return 1;
        }
        int total = base;
        for (int i = 1; i < exponent; i++) {
            total = total * base;
        }
        return total;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int total = base;
        return total * power(base, exponent - 1);
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        if (str.length() > 2) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return str.charAt(0) == str.charAt(str.length() - 1);
        }
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        if (b == a) {
            return a;
        }
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        int total = 0;
        for (int i = 1; i <= bunnies; i++) {
            if (i % 2 == 0) {
                total = total + 3;
            } else {
                total = total + 2;
            }
        }
        return total;
    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies <= 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEarsRecursive(bunnies - 1);
        } else {
            return 2 + bunnyEarsRecursive(bunnies - 1);
        }
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return - 1; // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        if (low <= high) {
            int middle = low + (high - low) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key < arr[middle]) {
                high = middle - 1;
                return binarySearchRecursiveHelper(arr, key, low, high);
            } else {
                low = middle + 1;
                return binarySearchRecursiveHelper(arr, key, low, high);
            }
        }
        return -1;
    }

    // DO NOT EDIT! Work on the helper version above this method. 
    // This method is to be used for testing purposes only.
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1); // Element not found
    }


}
