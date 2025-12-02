public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String total = "";
        if (array == null) {
            return "";
        }
        if (array.length == 0) {
            return "[]";
        }
        for (int i = 0; i < array.length - 1; i++) {
            total = total + array[i] + ", ";
        }
        total = total + array[array.length - 1];
        System.out.println("[" + total + "]");
        return "[" + total + "]";
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and
     * enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        String total = "";
        for (int i = 0; i < array.length - 1; i++) {
            total = total + array[i] + ", ";
        }
        total = total + array[array.length - 1];
        System.out.println("[" + total + "]");
        return "[" + total + "]";
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } 
        }
        return max;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one that
     * appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        String longest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].length() > longest.length()) {
                    longest = array[i];
                } 
            }
        }
        return longest;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }
        double total = 0;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                total = total + array[i].length();
                x = x + 1;
            } 
            if (x == 0) {
                return 0.0;
            }
        } 
        return total / x;
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the
     * frequency of a letter in the alphabet. The first element (index 0) represents
     * the frequency of the letter 'a', the second element (index 1) represents the
     * frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input
     *         string.
     */
    public static int[] countLetterFrequencies(String input) {
        if (input == null) {
            return new int[0];
        }
        input = input.toLowerCase();
        int[] array = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char k = input.charAt(i);
            if ((int) k > 96 && (int) k < 123) {
                array[(int) k - 97]++;
            }
        }
        return array;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by
     * one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            array[i] = array[i];
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        } 
        array[array.length - 1] = 0;
        return array;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] array1 = new int [array.length * 2];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of
     * each
     * String in the array.
     * For example, if the array contained: {"Hello", "my", "name", "is", "Larry"},
     * then this method would return an array with the contents:
     * {"#0 Hello", "#1 my", "#2 name", "#3 is", "#4 Larry"}.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added to
     *         each String
     */
    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            return new String[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i] = "#" + i + " " + array[i];
            }
        }
        return array;
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] array1 = new int[array.length];
        int k = 0;
        for (int i = array.length - 1; i > -1; i--) {
            array1[k] = array[i];
            k = k + 1;
        }
        return array1;
    }

}
